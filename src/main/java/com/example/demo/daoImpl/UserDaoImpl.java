package com.example.demo.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int loginUser(User user) {
		// 0 - not found
		// 1 - admin
		// 2 - user

		int i = 0;

		String sql = "select count(*) from user_table where email=? and password=?";
		int count = this.jdbcTemplate.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() },
				Integer.class);

		if (count == 1) {
			String query = "select userType from user_table where email=? and password=?";
			int userType = this.jdbcTemplate.queryForObject(query, new Object[] { user.getEmail(), user.getPassword() },
					Integer.class);

			if (userType == 1) {
				i = 1;
			} else if (userType == 2) {
				i = 2;
			}

		}

		return i;
	}

	/*
	 * public User getDataOfUSer(User user) { String sql =
	 * "select * from user_table where email=? and password=?"; User user1 =
	 * this.jdbcTemplate.queryForObject(sql, new Object[] { user.getEmail(),
	 * user.getPassword() }, User.class); return user1; }
	 */

	public User getDataOfUser(User user) {
		String sql = "select User_Id from user_table where email=? and password=?";
		int id = this.jdbcTemplate.queryForObject(sql, new Object[] { user.getEmail(), user.getPassword() },
				Integer.class);
		User userdata = new User();
		userdata.setUser_Id(id);
		return userdata;
	}
}
