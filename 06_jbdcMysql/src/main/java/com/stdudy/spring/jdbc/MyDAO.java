package com.stdudy.spring.jdbc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // 빈을 자동으로 주입해주는 것
import org.springframework.jdbc.core.BeanPropertyRowMapper; // 정보를 담을 수 있는 도구 
import org.springframework.jdbc.core.JdbcTemplate; // 데이터베이스에 정보를 요청하거나 저장할 수 있는 것
import org.springframework.stereotype.Repository; //컴퓨터한테 DTO라고 알려주는 것

//DAO가 데이터베이스에서 정보를 찾아 DTO에 담아가져옴 	get
//정보가 담긴 DTO를 DAO한테 주면 DAO가 데이터베이스에 저장함 add
//DAO가 정보를 찾고 DTO에 담고, DAO가 DTO를 전달해줌
//DTO = 정보를 담는 상자
//DAO = 정보를 가져오거나 저장하는 로봇??
//Controller = 쟤네한테 일 시키는 애

@Repository
public class MyDAO {
	// 빈 = 도구 상자 ?? 예시 : jdbcTemplate
	// @Autowired = 빈을 자동으로 주입해줌
	@Autowired
	private JdbcTemplate jdbcTemplate; // 데이터베이스에 정보를 요청하거나 저장할 수 있는 것
	
	// 정보를 가져오는 방법을 알려줌 ??
	public List<MyDTO> list() {
		
		//mybbs1에 있는 모든 정보를 가져오라고 데이터베이스에 전달..??
		String query = "select * from mybbs1"; 
		
		// jdbcTemplate.query = 데이터베이스에서 정보를 가져와서,
		//	(MyDTO.class) = 그 정보를 MyDTO에 담고, 
		//	List<MyDTO> list = MyDTO를 list에 담음
		List<MyDTO> list = jdbcTemplate.query(
				
				// query = 위에서 가져온 mybbs1에 모든 정보
				// new BeanPropertyRowMapper<> = 정보를 MyDTO에 담아주는 도구, 정보를 담을 수 있는 도구 
				query, new BeanPropertyRowMapper<>(MyDTO.class)
				);
		
		// list 반환
			return list;
		}
	

}
