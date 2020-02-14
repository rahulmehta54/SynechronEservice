package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrderDao;
import com.example.demo.dto.Order;
import com.example.demo.dto.User;

@Component
public class OrderDaoImpl implements OrderDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public List<Order> findOrdersByUserId(User userData) {
		String sql = "select * FROM tbl_order WHERE userID=?";
		List<Order> orderList = this.template.query(sql, new Object[] { userData.getUserId() }, new RowMapper<Order>() {
			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order orderObj = new Order();
				orderObj.setOrderId(rs.getInt(1));
				orderObj.setCity(rs.getString(2));
				orderObj.setExperience(rs.getString(3));
				orderObj.setInspectionRates(rs.getString(4));
				orderObj.setMobile(rs.getString(5));
				orderObj.setPayAmount(rs.getString(6));
				orderObj.setPaymentMode(rs.getString(7));
				orderObj.setsId(rs.getInt(8));
				orderObj.setsMenFName(rs.getString(9));
				orderObj.setsMenLName(rs.getString(10));
				orderObj.setUserId(rs.getInt(11));
				return orderObj;
			}
		});
		return orderList;
	}

}
