package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.Setter;

@Repository
@Setter
public class ViewServiceMen implements ServiceMenDao {

	@Autowired
	private JdbcTemplate template;
	
	public List<Map<String, Object>> findAll() {
		String sql= "select * from servicemen";
		return this.template.queryForList(sql);
		
	}

}
