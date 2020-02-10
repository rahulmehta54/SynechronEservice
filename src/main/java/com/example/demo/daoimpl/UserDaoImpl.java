package com.example.demo.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public int loginUser(User user) {
		int i = 0;
		String sql = "select * from tbl_user where email= ?  and password=?";
		List<Map<String, Object>> list = this.template.queryForList(sql, user.getEmail(), user.getPassword());
		if (list != null && list.size() == 1) {
		
		} 
		return i;
	}
}
