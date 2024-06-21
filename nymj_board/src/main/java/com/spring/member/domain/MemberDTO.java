package com.spring.member.domain;

import java.util.Date;

public class MemberDTO {
	
	private String memberNm;	// 회원 이름
	private String memberId;	// 회원 아이디
	private String memberPw;	// 회원 패스원드
	private Date memberBirth;	// 회원 생년월일
	private String memberAddr;	// 회원 주소
	private String memberPhone;	// 회원 휴대폰번호
	private String memberLevel; // 회원 등급 ex) 000 운영자 001 관리자 003 회원
	private String memberPwHint;// 회원 비밀번호 힌트
	private String updtDate;	// 수정시간
	private String regDate;		// 등록시간

	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getMemberPwHint() {
		return memberPwHint;
	}
	public void setMemberPwHint(String memberPwHint) {
		this.memberPwHint = memberPwHint;
	}
	public String getUpdtDate() {
		return updtDate;
	}
	public void setUpdtDate(String updtDate) {
		this.updtDate = updtDate;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
