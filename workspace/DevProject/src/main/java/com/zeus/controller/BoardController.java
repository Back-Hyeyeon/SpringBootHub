package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/Board")
public class BoardController {

	@GetMapping(value = "/register")
	public String registerForm() {
		log.info("GET 방식 register");
		return "success";
	}
	@PostMapping(value ="/register")
	public String register() {
		log.info("POST 방식 register");
		return "success";
	}
	@GetMapping(value ="/modify")
	public String modifyForm() {
		log.info("GET 방식 modify");
		return "success";
	}
	@PostMapping(value ="/modify")
	public String modify() {
		log.info("POST 방식 modify");
		return "success";
	}
	@PostMapping(value ="/remove")
	public String remove() {
		log.info("POST 방식 remove");
		return "success";
	}
	@GetMapping(value ="/list")
	public String list() {
		log.info("GET 방식 list");
		return "success";
	}

}
