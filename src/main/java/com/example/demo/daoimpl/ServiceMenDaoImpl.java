package com.example.demo.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ServiceMenDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

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
		List<ServiceMen> filteredServiceMensList = this.template.queryForList(sql,
				new Object[] { serviceMen.getCity(), serviceMen.getCategory() }, ServiceMen.class);
		return filteredServiceMensList;
	}
}
