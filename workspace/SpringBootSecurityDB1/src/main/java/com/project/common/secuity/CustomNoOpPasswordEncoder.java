package com.project.common.secuity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.java.Log;

//사용자가 입력한 페스워드와 데이터베이스에서 가져온 암호화 된 패스워드를 비교
@Log
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

	private final PasswordEncoder passwordEncoder;
	 public CustomNoOpPasswordEncoder() {
	 this.passwordEncoder = new BCryptPasswordEncoder();
	 }
	@Override
	public String encode(CharSequence rawPassword) {
	log.info("before encode :" + rawPassword);
	return passwordEncoder.encode(rawPassword);
	}
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
	log.info("matches: " + rawPassword + ":" + encodedPassword);
	return passwordEncoder.matches(rawPassword, encodedPassword); 
	}

}
