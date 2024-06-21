package com.spring.board.domain;

import java.util.Date;

public class BoardDTO {
	
	private int boardSeq;		//게시글 번호
	private String boardId;		//게시글 아이디
	private String title; 		//게시글 제목
	private String content; 	//게시글 내용
	private String writer; 		//작성자
	private String categoryId;	//카테고리 아이디
	private String secretYn;  	//비밀글 여부
	private String boardPw; 	//게시글 비밀번호
	private int viewCount; 		//조회수
	private Date updtDate; 		//수정시간
	private Date regDate; 		//등록시간
	
	public int getBoardSeq() {
		return boardSeq;
	}
	
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	
	public String getBoardId() {
		return boardId;
	}
	
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getSecretYn() {
		return secretYn;
	}
	
	public void setSecretYn(String secretYn) {
		this.secretYn = secretYn;
	}
	
	public String getBoardPw() {
		return boardPw;
	}
	
	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
	}
	
	public int getViewCount() {
		return viewCount;
	}
	
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	public Date getUpdtDate() {
		return updtDate;
	}
	
	public void setUpdtDate(Date updtDate) {
		this.updtDate = updtDate;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
