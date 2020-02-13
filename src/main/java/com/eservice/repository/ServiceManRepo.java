package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.ServiceMan;

@Repository
public interface ServiceManRepo extends JpaRepository<ServiceMan, Long> {

	List<ServiceMan> findByStatus(int status);

	ServiceMan findByEmailId(String emailId);

	@Modifying
	@Query("update ServiceMan c set c.status=:status where c.id=:id")
	public int updateStatus(@Param("status") int status, @Param("id") long id);
}
