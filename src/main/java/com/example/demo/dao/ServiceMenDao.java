package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ServiceMen;

@Repository
public interface ServiceMenDao {
	int editServiceMen(ServiceMen serviceMen);
}
