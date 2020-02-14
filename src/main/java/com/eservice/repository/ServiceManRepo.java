package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eservice.model.ServiceMan;

public interface ServiceManRepo extends JpaRepository<ServiceMan, Long>{
	
	public List<ServiceMan> findByStatus(int status);
	
	@Modifying
	@Query("Update ServiceMan c SET c.status=:status WHERE c.serviceId=:serviceId")
	public int updateStatus(@Param("status")int status, @Param("serviceId")long serviceId);

}
