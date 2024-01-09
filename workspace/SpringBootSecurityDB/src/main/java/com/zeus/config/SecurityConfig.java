package com.zeus.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.project.common.secuity.CustomAccessDeniedHandler;
import com.project.common.secuity.CustomLoginSuccessHandler;
import com.project.common.secuity.CustomNoOpPasswordEncoder;
import com.project.common.secuity.CustomUserDetailsService;

import lombok.extern.java.Log;

@Log
@Configuration
@EnableWebSecurity
public class SecurityConfig
//extends WebSecurityConfiguration
{
	@Autowired
	DataSource dataSource;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	log.info("security config ...");
	// csrf 토큰 비활성화
	http.csrf().disable();
	// URI 패턴으로 접근 제한을 설정한다.
	http.authorizeRequests().requestMatchers("/board/list").permitAll();
	http.authorizeRequests().requestMatchers("/board/register").hasRole("MEMBER");;
	http.authorizeRequests().requestMatchers("/notice/list").permitAll();
	http.authorizeRequests().requestMatchers("/notice/register").hasRole("ADMIN");
	// 개발자가 정의한 로그인 페이지의 URI를 지정한다.
	// 로그인 성공 후 처리를 담당하는 처리자로 지정한다.
	http.formLogin().loginPage("/login").successHandler(createAuthenticationSuccessHandler());
	// 로그아웃 처리를 위한 URI를 지정하고, 로그아웃한 후에 세션을 무효화 한다. 
	http.logout().logoutUrl("/logout").invalidateHttpSession(true);
	// 등록한 CustomAccessDeniedHandler를 접근 거부 처리자로 지정한다.
	http.exceptionHandling().accessDeniedHandler(createAccessDeniedHandler
	());
	return http.build();
	}

	// @Autowired 를 진행하지 말 것
	protected void configure(AuthenticationManagerBuilder auth) throws 
	Exception {
		auth.userDetailsService(createUserDetailsService()).passwordEncoder(createPasswordEncoder());
		}

	// 스프링 시큐리티의 UserDetailsService를 구현한 클래스를 빈으로 등록한다.
	@Bean
	public UserDetailsService createUserDetailsService() {
		return new CustomUserDetailsService();
	}

	// 사용자가 정의한 비번 암호화 처리기를 빈으로 등록한다.
	@Bean
	public PasswordEncoder createPasswordEncoder() {
		return new CustomNoOpPasswordEncoder();
	}

	// CustomLoginSuccessHandler를 빈으로 등록한다.
	@Bean
	public AuthenticationSuccessHandler createAuthenticationSuccessHandler() {
		return new CustomLoginSuccessHandler();
	}

	// CustomAccessDeniedHandler를 빈으로 등록한다.
	@Bean
	public AccessDeniedHandler createAccessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}
}
