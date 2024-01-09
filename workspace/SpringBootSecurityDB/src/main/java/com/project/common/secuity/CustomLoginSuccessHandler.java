package com.project.common.secuity;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.java.Log;

@Log
public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
	HttpServletResponse response, Authentication auth)
	throws IOException, ServletException {
		//로그인하는 사용자정보를 제공
		User customUser = (User) auth.getPrincipal(); 
		log.info("onAuthenticationSuccess = " + customUser.getUsername());
		super.onAuthenticationSuccess(request, response, auth);

	}
	
}
