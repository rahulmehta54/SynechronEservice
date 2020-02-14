package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eservice.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{
	
	public List<Category> findByStatus(int status);

	@Modifying
	@Query("Update Category c SET c.status=:status WHERE c.categoryId=:categoryId")
	public int updateStatus(@Param("status")int status, @Param("categoryId")long categoryId);
	
}
