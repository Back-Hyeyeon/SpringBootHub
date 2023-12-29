package com.zeus.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeus.domain.Board;

import lombok.extern.java.Log;

@Log
@Controller
public class HomeController {

	
	@GetMapping(value = "/home") 
	public String home() {
	log.info("GET 방식 home");
	return "home";
	}
	
	@RequestMapping(value = "/ajaxHome", method = RequestMethod.GET) 
	public String ajaxHome() {
		log.info("GET 방식 /ajaxHome");
		return "ajaxHome";
	}
	
	@PutMapping(value = "/board/{boardNo}") 
	public ResponseEntity<String> boardModify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		log.info("Put [board 수정 완] boardNo : " + boardNo+"toString : "+board.toString());
		ResponseEntity<String> ntity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return ntity;
	}
	
	@GetMapping(value = "/board/{boardNo}") 
	public ResponseEntity<Board> boardSelect(@PathVariable("boardNo") int boardNo) {
		log.info("가져오다 select [board select 완] boardNo : " + boardNo);
		Board board = new Board();
		board.setBoardNo(boardNo);
		board.setTitle("Die");
		board.setContent("언젠가");
		board.setWriter("한아름");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> ntity = new ResponseEntity<Board>(board, HttpStatus.OK);
		return ntity;
	}
	//FileUpLoad 파일 업로드 페이지로 간다.
	@GetMapping(value = "/registerAjaxFileUpForm")
	public String registerAjaxFileUpForm() {
		log.info("registerAjaxFileUpForm");
		return "registerAjaxFileUpForm";
	}

	
	
}
