package com.example.demo.daoimpl;

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
		// 0 - Not found
		// 1 - admin
		// 2 - user

		int i = 0;
		String sql = "select count(*) from tbl_user where email=? and password=?";
		int count = this.template.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() },
				Integer.class);
//		System.out.println("==========Count :" + count + "===========");
		if (count == 1) {
			String query = "select userType from tbl_user where email=? and password=?";
			int userType = this.template.queryForObject(query, new Object[] { user.getEmail(), user.getPassword() },
					Integer.class);
//			System.out.println("==========UserType :" + userType + "===========");
			if (userType == 1) {
				i = 1;
			} else if (userType == 2) {
				i = 2;
			}
		}
		return i;
	}
}
