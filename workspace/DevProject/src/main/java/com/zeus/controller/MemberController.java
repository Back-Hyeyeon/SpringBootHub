package com.zeus.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zeus.domain.Member;
import com.zeus.domain.Members;

import lombok.extern.java.Log;

@Log
@Controller
public class MemberController {

	
	//파일 업로드Ajax  uploadAjax"
	@PostMapping(value = "/uploadAjax", produces = "text/plain;charset-UTF-8")
	public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception{
		String originalFilename = file.getOriginalFilename();
		
		log.info("OriginalFilename : "+originalFilename);
		ResponseEntity<String> entity = new ResponseEntity<String>("UPLOADSUCCESS : FileName. " + originalFilename,HttpStatus.OK);
		return entity;
	}
	
	
	//Model로 학습
	@GetMapping(value = "/model03")
	public String model03(Model model) {
		log.info("model03");
		
		String[] carArray = {"saab","audi"};
		
		List<String> carList = new ArrayList<String>();
		carList.add("saab");
		carList.add("audi");
		
		String[] hobbyArray = {"Music","Movie"};
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		model.addAttribute("carArray",carArray);
		model.addAttribute("carList",carList);
		model.addAttribute("hobbyArray",hobbyArray);
		model.addAttribute("hobbyList",hobbyList);
		
		
		return "model03";
	}
	//@ModelAttribute 애너테이션
	@GetMapping(value = "/registerModelForm")
	public String registerModelForm() {
		log.info("registerModelForm");
		
		return "registerModelForm";
	}
	@PostMapping(value = "/registerModelForm01")
	public String registerModelForm01(@ModelAttribute("userId") String userId) {
		log.info("registerModelForm01");
		//@ModelAttribute("userId")을 적지 않으면 값이 넘어가지 않는다.
		//값이 넘어간다.
		//그냥 자바빈과 모델을 사용해라
		return "registerModelForm01";
	}
	
//	// 1.SpringForm 스프링폼 (기본 로직)
//	@GetMapping(value = "/registerSpringForm")
//	public String registerSpringForm(Model model) {
//		log.info("registerSpringForm");
//		//모델을 써야 화면이 보인다. 안쓰면 500 나옴
//		//modelAttribute="member"에 나오는 변수의 이름을 같이 해라.
//		model.addAttribute("member", new Member());
//		return "registerSpringForm";
//	}
//	// 2.action="register" register 화면으로 넘어가는 것을 만든다. 
//	@PostMapping(value = "/register")
//	public String register(@Validated Member member, BindingResult result) {
//		log.info("register");
////		model.addAttribute("member", member);
//		//registerSpringForm 화면의 action="register" 으로 가는 화면
//		//Member에 @NotBlank 점검해주고 싶은 곳에 써주기
//		//BindingResult result 점검 검사 @Validated 꼭 써줘야 한다. 점검 검사
//		if(result.hasErrors() ==  true){
//			
//			return "registerSpringForm";
//		}
//		return "register";
//	}
	
	//여러 개의 체크박스 요소
	// 1.SpringForm 스프링폼 (기본 로직)
	@GetMapping(value = "/registerSpringFormCheckboxes01")
	public String registerSpringForm(Model model) {
		log.info("registerSpringFormCheckboxes01");
		Map<String,String> hobbyMap = new HashMap<String,String>();
		hobbyMap.put("01", "게임");
		hobbyMap.put("02", "운동");
		hobbyMap.put("03", "여행");
		
		model.addAttribute("hobbyMap",hobbyMap);
		model.addAttribute("member",new Member());
		
		
		model.addAttribute("member", new Member());
		return "registerSpringFormCheckboxes01";
	}
	// 2.action="register" register 화면으로 넘어가는 것을 만든다. 
	@PostMapping(value = "/register")
	public String register( Member member) {
		log.info("register");
		List<String> hobbyList = member.getHobbyList();
		for(String data:hobbyList) {
			log.info("hobbyList = " +data);
			
		}
		
		return "success";
	}
	
	
	
	
	
	
	@GetMapping(value = "/registerForm")
	public String registerForm() {
		log.info("registerForm");
		
		return "registerForm";
	}
	@GetMapping(value = "/register/{userId}")
	public String registerByPath(@PathVariable("userId") String userId) {
		log.info("registerByPath : /register/{userId}");
		
		log.info("userId : "+ userId);
		return "success";
	}
	
	@GetMapping(value = "/register/{userId}/{coin}")
	public String registerByPath(@PathVariable("userId") String userId, @PathVariable("coin") int coin) {
		log.info("registerByPath : /register/{userId}/{coin}");
		
		log.info("userId : "+ userId);
		log.info("coin : "+ coin);
		return "success";
	}
	@PostMapping(value = "/register01")
	public String register01(String userId) {
		log.info("register01 : userId");
		
		log.info("userId : "+ userId);
		return "success";
	}
	@PostMapping(value = "/register02")
	public String register02(@RequestParam("userId") String username) {
		log.info("register02 : userId");
		
		log.info("userId : "+ username);
		return "success";
	}
	@PostMapping(value = "/registerbeans01")
	public String registerbeans01(Members members) {
		log.info("registerbeans01 : Members members");
		
		log.info("userId : "+ members.getUserId());
		log.info("Password : "+ members.getPassword());
		log.info("UserName : "+ members.getUserName());
		log.info("Coin : "+ members.getCoin());
		return "success";
	}
	@PostMapping(value = "/registerbeans02")
	public String registerbeans024(Members members,int coin) {
		log.info("registerbeans02 : Members members,int coin)");
		
		log.info("userId : "+ members.getUserId());
		log.info("Password : "+ members.getPassword());
		log.info("UserName : "+ members.getUserName());
		log.info("Coin : "+ members.getCoin());
		return "success";
	}
	@PostMapping(value = "/registerdate")
	public String registerdate(Members members) {
		log.info("registerdate : Members-@DateTimeFormat(pattern = \"yyyy/mm/dd\")");
		
		log.info("userId : " + members.getUserId());
		log.info("passwod : " +members.getPassword());
		log.info("Date : " + members.getDateOfBorth());
		return "success";
	}

	
}
