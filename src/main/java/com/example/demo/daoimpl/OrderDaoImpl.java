package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrderDao;
import com.example.demo.dto.Cart;
import com.example.demo.dto.Order;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Component
public class OrderDaoImpl implements OrderDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public List<Order> findOrdersByUserId(User userData) {
		String sql = "select * FROM tbl_order WHERE userID=? and active=?";
		List<Order> orderList = this.template.query(sql, new Object[] { userData.getUserId(), 1 },
				new RowMapper<Order>() {
					@Override
					public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
						Order orderObj = new Order();
						orderObj.setOrderId(rs.getInt(1));
						orderObj.setsMenFName(rs.getString(2));
						orderObj.setsMenLName(rs.getString(3));
						orderObj.setCategory(rs.getString(4));
						orderObj.setMobile(rs.getString(5));
						orderObj.setCity(rs.getString(6));
						orderObj.setExperience(rs.getString(7));
						orderObj.setInspectionRates(rs.getString(8));
						orderObj.setPayAmount(rs.getString(9));
						orderObj.setPaymentMode(rs.getString(10));
						orderObj.setsId(rs.getInt(11));
						orderObj.setUserId(rs.getInt(12));
						orderObj.setActive(rs.getInt(13));
						return orderObj;
					}
				});
		return orderList;
	}

	@Override
	public int addOrder(User user, ServiceMen serviceMen) {
		String sql = "INSERT INTO tbl_order VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int val = this.template.update(sql,
				new Object[] { 0, serviceMen.getsMenFName(), serviceMen.getsMenLName(), serviceMen.getCategory(),
						serviceMen.getMobile(), serviceMen.getCity(), serviceMen.getExperience(),
						serviceMen.getInspectionRates(), serviceMen.getPayAmount(), serviceMen.getPaymentMode(),
						serviceMen.getsId(), user.getUserId(), "1" });
		return val;
	}

	@Override
	public int cancelOrder(int orderId) {
		String sql = "UPDATE tbl_order SET active=? WHERE orderId=?";
		int val = this.template.update(sql, new Object[] { 0, orderId });
		return val;
	}

	@Override
	public Order getServiceMenDataInOder(ServiceMen objSerMen) {
		Order order = new Order(0, objSerMen.getsMenFName(), objSerMen.getsMenLName(), objSerMen.getCategory(),
				objSerMen.getMobile(), objSerMen.getCity(), objSerMen.getExperience(), objSerMen.getInspectionRates(),
				objSerMen.getPayAmount(), objSerMen.getPaymentMode(), 0, objSerMen.getsId(), 1);
		return order;
	}
}
