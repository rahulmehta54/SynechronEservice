package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Cart;

public interface cartRepo extends JpaRepository<Cart, Integer> {


	@Query("select u from Users u join Cart c on u.userId=c.u.userId join ServiceProvider sp on c.s.sid=sp.sid where u.userId=:userId")
	public List<Cart> findByUseridAndSid(@Param("userId") int userId);

	@Query("select c from Cart c where c.u.userId=:userId")
	public List<Cart> findByUserId(@Param("userId") int userId);
}
