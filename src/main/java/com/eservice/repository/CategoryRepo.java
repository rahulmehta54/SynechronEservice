package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

	public List<Category> findByStatus(int status);

	public Category findByNameAndStatus(String name, int status);

	@Modifying
	@Query("update Category c set c.status=:status where c.id=:id")
	public int updateStatus(@Param("status") int status, @Param("id") long id);
}
