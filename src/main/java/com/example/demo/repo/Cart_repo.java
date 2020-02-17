package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProvider;

@Repository
public interface Cart_repo extends JpaRepository<Cart, Integer> {

	 @Query(value ="SELECT c FROM Cart c WHERE c.user.userID = :keyword")
	 public List<Cart> getAllCartIteams(@Param("keyword") int userID);

	

}
