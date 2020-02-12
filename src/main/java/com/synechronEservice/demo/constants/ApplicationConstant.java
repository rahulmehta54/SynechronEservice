package com.synechronEservice.demo.constants;

import org.springframework.stereotype.Component;

@Component
public class ApplicationConstant {

	public static final String GET_VALID_USER_COUNT="select count(*) from Users where email_id=? and pass_word=?";
	public static final String GET_VALID_ADMIN_COUNT="select count(*) from Users where email_id=? and pass_word=? and role='admin'";
	public static final String GET_Provider_Detail="select * from service_provider where service_id=?";
}
