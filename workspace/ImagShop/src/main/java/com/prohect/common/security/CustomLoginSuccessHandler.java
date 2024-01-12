package com.prohect.common.security;

import java.io.IOException;
import java.util.Date;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.project.common.security.domain.CustomUser;
import com.project.domain.Member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.java.Log;

@Log
public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		// 로그인한 사용자의 정보를 제공한다
		CustomUser customUser = (CustomUser) auth.getPrincipal();
		Member member = customUser.getMember();

		log.info("/login 을 스틸 중...");
		log.info("Userid = " + member.getUserId());
		log.info("##onAuthenticationSuccess : " + customUser.getUsername());
		log.info("로그인 성공"+ new Date() );
		super.onAuthenticationSuccess(request, response, auth);
	}

}
