package com.spring.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.main.HomeController;
import com.spring.member.domain.MemberDTO;
import com.spring.member.service.MemberService;

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
	
	private MemberService memberService;
	
	/** 
	 * 기능		: 회원 로그인 화면
	 * @Date 	: 2024. 06. 19
	 * @author  : 진민지	 
	 */
	@RequestMapping(value= "/loginView")
	public String loginView() {
		
		logger.info("loginView!");
		return "login";
	}
	

	/** 
	 * 기능		: 회원 로그인 화면
	 * @Date 	: 2024. 08. 06
	 * @author  : 진민지	 
	 */
	@RequestMapping(value= "/login")
	public String login(MemberDTO memberDTO) {
		
		memberService.login(memberDTO);
		
		logger.info("login!");
		return "login";
	}
	 
	
}
