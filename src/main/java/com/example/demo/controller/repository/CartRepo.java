package com.example.demo.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Cart;
import com.example.demo.entity.SalesPerson;

public interface CartRepo extends JpaRepository<Cart, Long> {

	
	  List<Cart> findByUserId(Long id);
	  
	/*
	 * @Query("delete from cart.saleperson cart where userid=:UserId and ") void
	 * deleteBySalepersonIdAndUserID(@Param("salepersonid")Long
	 * salepersonid,@Param("UserId")Long UserId);
	 */
	
	
	/*
	 * @Modifying
	 * 
	 * @Query("update cart set cart.user_saleperson=:salesPersonList where cart.userid=:userid"
	 * ) void deleteBySalepersonIdAndUserID(@Param("userid")Long
	 * userid,@Param("salesPersonList") List<SalesPerson> salesPersonList);
	 */
	 
	 
	

}
