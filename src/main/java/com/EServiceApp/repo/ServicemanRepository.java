package com.EServiceApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Serviceman;

@Repository
public interface ServicemanRepository extends JpaRepository<Serviceman, Long> {

	List<Serviceman> findByStatus(int i);
	
	@Modifying
	@Query("update Serviceman s SET s.status=:status where s.sid=:sid")
	public int updateById(@Param("status") int status, @Param("sid") long sid);

}
