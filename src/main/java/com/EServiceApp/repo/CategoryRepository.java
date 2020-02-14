package com.EServiceApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Cart;
import com.EServiceApp.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	public List<Category> findByStatus(int status);

	
	@Modifying
	@Query("Update Category c SET c.status=:status WHERE c.cid=:cid")
	public int deleteById(@Param("status")int status, @Param("cid")long cid);


		
	
	
}
