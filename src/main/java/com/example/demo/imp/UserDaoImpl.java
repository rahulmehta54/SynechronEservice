package com.example.demo.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;


@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public int loginUser(User user) {
		//0 - Not found
		//1 - admin
		//2 - user
		
		int i = 0;
		String sql = "select count(*) from tbl_user where email=? and password=?";
		/*
		 * List<Map<String, Object>> list = this.template.queryForList(sql,
		 * user.getEmail(), user.getPassword()); if (list != null && list.size() == 1) {
		 * 
		 * }
		 */

		int val = this.template.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() },
				Integer.class);

		if (val == 1) {
			String sqlQuery = "select userType from tbl_user where email=? and password=?";
		}else {
			
		}

		System.out.println("==========" + val + "===========");
		return i;
	}