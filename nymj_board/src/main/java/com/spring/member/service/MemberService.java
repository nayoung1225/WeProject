package com.spring.member.service;

import org.springframework.stereotype.Service;

import com.spring.member.domain.MemberDTO;

@Service
public interface MemberService {

	void login(MemberDTO memberDTO);

}
