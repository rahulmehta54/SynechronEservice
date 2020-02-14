package com.EServiceApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

	
	List<Cart> findByStatus(int status);
	

	@Modifying
	@Query("Update Cart c SET c.status=:status WHERE c.cartid=:cartid")
	public int deleteById(@Param("status")int status, @Param("cartid")long cartid);

	
}
