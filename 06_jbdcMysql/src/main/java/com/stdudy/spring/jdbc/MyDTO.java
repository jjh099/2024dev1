package com.stdudy.spring.jdbc;

import lombok.Data;

//DAO가 데이터베이스에서 정보를 찾아 DTO에 담아가져옴 	get
//정보가 담긴 DTO를 DAO한테 주면 DAO가 데이터베이스에 저장함 add
//DAO가 정보를 찾고 DTO에 담고, DAO가 DTO를 전달해줌
//DTO = 정보를 담는 상자
//DAO = 정보를 가져오거나 저장하는 로봇??
//Controller = 쟤네한테 일 시키는 애

// get,set 자동으로 만들어짐, lombok이 있어야 가능
@Data
public class MyDTO {
//	public Number getId() {
//		return id;
//	}
//	public void setId(Number id) {
//		this.id = id;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
	
	// MyDTO라는 상자에 id, writer, title, content 정보를 담을 수 있음
	Number id;
	String writer;
	String title;
	String content;


}
