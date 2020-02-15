package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eservice.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

	List<Cart> findByStatus(int status);

	
	
	@Modifying
	@Query("Update Cart c SET c.status=:status WHERE c.cartId=:cartId")
	public int updateStatus(@Param("status")int status, @Param("cartId")long cartId);

}
