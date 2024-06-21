package com.spring.board.domain;

import java.util.Date;

/**
 * 민지 개발
 */
public class BoardVO {
	
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
	
	public BoardVO(int boardSeq, String boardId, String title, String content, String writer, String categoryId,
			String secretYn, String boardPw, int viewCount, Date updtDate, Date regDate) {
		super();
		this.boardSeq = boardSeq;
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.categoryId = categoryId;
		this.secretYn = secretYn;
		this.boardPw = boardPw;
		this.viewCount = viewCount;
		this.updtDate = updtDate;
		this.regDate = regDate;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
