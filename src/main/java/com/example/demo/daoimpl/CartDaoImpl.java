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
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Component
public class CartDaoImpl implements CartDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public List<Cart> findCartItemsByUserId(User userData) {
		String sql = "select * FROM tbl_cart WHERE userID=? and active=?";
		
		// this.template.queryForList(sql,userData.getUserId(),userData.getActive());
		List<Cart> cartList = this.template.query(sql, new Object[] { userData.getUserId(), 1 }, new RowMapper<Cart>() {
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

	@Override
	public int addItemToCart(User user, ServiceMen serviceMen) {
		String sql = "INSERT INTO tbl_cart VALUES (?,?,?,?,?,?,?,?,?)";
		int val = this.template.update(sql,
				new Object[] { 0, serviceMen.getsMenFName(), serviceMen.getsMenLName(), serviceMen.getCategory(),
						serviceMen.getMobile(), serviceMen.getCity(), serviceMen.getsId(), user.getUserId(), "1" });
		return val;
	}

	@Override
	public int removeFromCart(int cartId) {
		String sql = "UPDATE tbl_cart SET active=? WHERE cartId=?";
		int val = this.template.update(sql, new Object[] { 0, cartId });
		return val;
	}

}
