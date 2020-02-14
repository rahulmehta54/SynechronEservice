package com.eservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@PropertySource("classpath:statusSettings.properties")
@Component
public class StatusSetting {

	@Value("${delete}")
	private int deleteStatus;

	@Value("${save}")
	private int saveStatus;

	@Value("${userRole}")
	private long userRole;

}
