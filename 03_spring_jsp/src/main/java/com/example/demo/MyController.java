package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller // controller + option+ space = import
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "jsp";
	}
	
	@RequestMapping("/test1")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/test2")
	public String test2(Model model) {
		// model 객체를 이용, 데이터 전달 (view -> data 전달)
		model.addAttribute("name","홍길동"); //name에 홍길동을 태워 보냄
		return "test/test2";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test3() {
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<>(); //ArrayList라는 클래스를 List 인터페이스에 넣음????
		
		list.add("이순신");
		list.add("홍길동");
		list.add("철수");
		
		mv.addObject("lists",list); // 첫단어가 lists??, list에 여러 값을 넣어서 mv에 넣음
		mv.setViewName("view/myview"); //mv에 있는 내용들을 view/myview로 경로 설정
		
		return mv;
	}

}
