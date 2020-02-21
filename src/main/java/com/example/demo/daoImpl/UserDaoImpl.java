package com.example.demo.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	public User user;

	@Autowired
	public JdbcTemplate template;

	@Override
	public int loginUser(User user) {
		// TODO Auto-generated method stub
		// 0- Not found
		// 1- admin
		// 2-User

		int i = 0;

		String sql = "select count(*) from user where email=? and password=?";
		int count = this.template.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() },
				Integer.class);

		System.out.println("===============count============" + count);
		if (count == 1) {
			String query = "select userType from user where email=? and password=?";

			int userType = this.template.queryForObject(query, new Object[] { user.getEmail(), user.getPassword() },
					Integer.class);
			System.out.println("---------usertype--------" + userType);
			if (userType == 1) {
				i = 1;
			} else if (userType == 2) {

				i = 2;
			}
		}

		return i;
	}

	

	public User getDataofUser(User user) {
		String sql = "select id from user where email=? and password=?";
		int id = this.template.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() }, Integer.class);
		User userdata = new User();
		userdata.setId(id);
		return userdata;

	}





	
	

	
}
