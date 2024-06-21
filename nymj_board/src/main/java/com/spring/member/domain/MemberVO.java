package com.spring.member.domain;

import java.util.Date;

public class MemberVO {

	private int memberSeq;		// 회원 번호
	private String memberNm;	// 회원 이름
	private String memberId;	// 회원 아이디
	private String memberNickNm;// 회원 닉네임
	private String memberPw;	// 회원 패스원드
	private Date memberBirth;	// 회원 생년월일
	private String memberAddr;	// 회원 주소
	private String memberPhone;	// 회원 휴대폰번호
	private String memberLevel; // 회원 등급 ex) 000 운영자 001 관리자 003 회원
	private String memberPwHint;// 회원 비밀번호 힌트
	private Date updtDate;		// 수정시간
	private Date regDate;		// 등록시간
	
	public MemberVO(int memberSeq, String memberNm, String memberId, String memberNickNm, String memberPw,
			Date memberBirth, String memberAddr, String memberPhone, String memberLevel, String memberPwHint,
			Date updtDate, Date regDate) {
		super();
		this.memberSeq = memberSeq;
		this.memberNm = memberNm;
		this.memberId = memberId;
		this.memberNickNm = memberNickNm;
		this.memberPw = memberPw;
		this.memberBirth = memberBirth;
		this.memberAddr = memberAddr;
		this.memberPhone = memberPhone;
		this.memberLevel = memberLevel;
		this.memberPwHint = memberPwHint;
		this.updtDate = updtDate;
		this.regDate = regDate;
	}
	
	
	
	
	
}
