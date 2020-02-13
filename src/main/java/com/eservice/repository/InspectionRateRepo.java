package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.Category;
import com.eservice.model.InspectionRate;

@Repository
public interface InspectionRateRepo extends JpaRepository<InspectionRate, Long> {

	public List<InspectionRate> findByStatus(int sttaus);

	public InspectionRate findByServiceNameAndStatus(String name, int status);

	@Modifying
	@Query("update InspectionRate c set c.status=:status where c.id=:id")
	public int updateStatus(@Param("status") int status, @Param("id") long id);
}
