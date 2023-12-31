package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.domain.CodeGroup;
import com.project.service.CodeGroupService;

@Controller
@RequestMapping("/codegroup")
public class CodeCroupController {

	@Autowired
	private CodeGroupService service;

	// 등록페이지
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register(Model model) throws Exception {
		CodeGroup codeGroup = new CodeGroup();
		model.addAttribute(codeGroup);
	}

	// 등록 처리
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(CodeGroup codeGroup, RedirectAttributes rttr) throws Exception {

		service.register(codeGroup);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/codegroup/list";

	}

	// 목록 페이지
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}

	// 상세 페이지
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(String groupCode, Model model) throws Exception {
		model.addAttribute(service.read(groupCode));
	}

	// 수정 페이지
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(String groupCode, Model model) throws Exception {
		model.addAttribute(service.read(groupCode));
	}

	// 수정 처리
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(CodeGroup codeGroup, RedirectAttributes rttr) throws Exception {
		service.modify(codeGroup);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/codegroup/list";
	}
	// 삭제 처리
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(String groupCode, RedirectAttributes rttr) throws 
	Exception {
	service.remove(groupCode); 
	rttr.addFlashAttribute("msg", "SUCCESS");
	return "redirect:/codegroup/list";
	}
}
