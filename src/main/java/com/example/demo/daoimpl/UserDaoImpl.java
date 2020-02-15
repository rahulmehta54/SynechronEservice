package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public List<User> loginUserData(User user) {
		String sql = "select * from tbl_user where email=? and password=?";
		List<User> userList = this.template.query(sql, new Object[] { user.getEmail(), user.getPassword() },
				new RowMapper<User>() {
					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User userObj = new User();
						userObj.setUserId(rs.getInt(1));
						userObj.setCpassword(rs.getString(2));
						userObj.setEmail(rs.getString(3));
						userObj.setfName(rs.getString(4));
						userObj.setlName(rs.getString(5));
						userObj.setMobile(rs.getString(6));
						userObj.setPassword(rs.getString(7));
						userObj.setUserType(rs.getInt(8));
						userObj.setActive(rs.getInt(9));
						return userObj;
					}
				});
		return userList;
	}
}
