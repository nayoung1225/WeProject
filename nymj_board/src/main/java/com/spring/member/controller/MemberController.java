package com.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Class Name		: MemberController.java
 * @Description		: 회원관리 컨트롤러 클래스
 * @Date 			: 2024.06.19
 * @version 1.0
 */

@Controller
@RequestMapping( "/member" )
public class MemberController {

	/** 
	 * 기능		: 회원 로그인 기능
	 * @Date 	: 2024. 06. 19
	 * @author  : 진민지	 
	 */
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String loginView() {
		return "/views/login.jsp";
	}
	
}
