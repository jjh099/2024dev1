package com.stdudy.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// DAO가 데이터베이스에서 정보를 찾아 DTO에 담아가져옴 	get
// 정보가 담긴 DTO를 DAO한테 주면 DAO가 데이터베이스에 저장함 add
// DAO가 정보를 찾고 DTO에 담고, DAO가 DTO를 전달해줌
// DTO = 정보를 담는 상자
// DAO = 정보를 가져오거나 저장하는 로봇??
// Controller = 쟤네한테 일 시키는 애

@Controller
public class MyController {
	
	// MyDAO를 연결해줌
	@Autowired
	private MyDAO listDao;
	
	@RequestMapping("/")
	// 
	public @ResponseBody String root() {
		return "jbdc";
	}
	
	@RequestMapping("/list")
	// Model = 정보를 담아 웹 페이지로 전달하는 것
	public String index(Model model) {
		
		// listDao한테 정보를 가져오게 하고 그 정보를 lists라는 이름으로 데이터베이스에 추가 ?
		model.addAttribute("lists",listDao.list());
		return "index";
		
	}
	

}
