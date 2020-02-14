package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ServiceMenDao;
import com.example.demo.dto.ServiceMen;

@Component
public class ServiceMenDaoImpl implements ServiceMenDao {

	@Autowired
	public JdbcTemplate template;

	@Override
	public int editServiceMen(ServiceMen serviceMen) {
		int i = 0;
		String sql = "UPDATE tbl_user SET category=?,city=?,experience=?,inspectionRates=?,mobile=?,sMenFName=?,sMenLName=? WHERE userId=?";
		int val = this.template.queryForObject(sql,
				new Object[] { serviceMen.getCategory(), serviceMen.getCity(), serviceMen.getExperience(),
						serviceMen.getInspectionRates(), serviceMen.getMobile(), serviceMen.getsMenFName(),
						serviceMen.getsMenLName(), serviceMen.getsId() },
				Integer.class);

		if (val == 1) {
			i = 1;
		}
		return i;
	}

	@Override
	public List<ServiceMen> filteredServiceMens(ServiceMen serviceMen) {
		String sql = "select * FROM tbl_servicemen WHERE city=? and category=?";
		List<ServiceMen> filteredServiceMensList = this.template.query(sql,
				new Object[] { serviceMen.getCity(), serviceMen.getCategory() }, new RowMapper<ServiceMen>() {
					@Override
					public ServiceMen mapRow(ResultSet rs, int rowNum) throws SQLException {
						ServiceMen sObj = new ServiceMen();
						sObj.setsId(rs.getInt(1));
						sObj.setCategory(rs.getString(2));
						sObj.setCity(rs.getString(3));
						sObj.setExperience(rs.getString(4));
						sObj.setInspectionRates(rs.getString(5));
						sObj.setMobile(rs.getString(6));
						sObj.setPayAmount(rs.getString(7));
						sObj.setPaymentMode(rs.getString(8));
						sObj.setsMenFName(rs.getString(9));
						sObj.setsMenLName(rs.getString(10));
						sObj.setActive(rs.getInt(11));
						return sObj;
					}
				});

//		String sql = "select * FROM tbl_servicemen WHERE city=? and category=?";
//		List<ServiceMen> filteredServiceMensList = this.template.queryForList(sql,
//				new Object[] { serviceMen.getCity(), serviceMen.getCategory() }, ServiceMen.class);
		return filteredServiceMensList;
	}
}
