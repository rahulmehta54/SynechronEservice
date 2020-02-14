package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CartDao;
import com.example.demo.dto.Cart;
import com.example.demo.dto.User;

@Component
public class CartDaoImpl implements CartDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public List<Cart> findCartItemsByUserId(User userData) {
		String sql = "select * FROM tbl_cart WHERE userID=?";
		List<Cart> cartList = this.template.query(sql, new Object[] { userData.getUserId() }, new RowMapper<Cart>() {
			@Override
			public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cart cartObj = new Cart();
				cartObj.setCartId(rs.getInt(1));
				cartObj.setfName(rs.getString(2));
				cartObj.setlName(rs.getString(3));
				cartObj.setCategory(rs.getString(4));
				cartObj.setMobile(rs.getString(5));
				cartObj.setCity(rs.getString(6));
				cartObj.setsId(rs.getInt(7));
				cartObj.setUserId(rs.getInt(8));
				cartObj.setActive(rs.getInt(9));
				return cartObj;
			}
		});
		return cartList;
	}

}
