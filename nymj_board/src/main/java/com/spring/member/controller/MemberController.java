package com.spring.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.main.HomeController;

/**
 * @Class Name		: MemberController.java
 * @Description		: 회원관리 컨트롤러 클래스
 * @Date 			: 2024.06.19
 * @version 1.0
 */

@Controller
@RequestMapping( "/member" )
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/** 
	 * 기능		: 회원 로그인 기능
	 * @Date 	: 2024. 06. 19
	 * @author  : 진민지	 
	 */
	@RequestMapping(value= "/login")
	public String loginView() {
		
		logger.info("login!");
		return "login";
	}
	
}
