package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	
	 	@Modifying
	 	@Transactional
	    @Query(value = "insert into Cart (serviceId,userId,cartId) VALUES (:id,:userId,:cartId)", nativeQuery = true)
	    void insert(@Param("id") Long id, @Param("userId") Long userId,@Param("cartId") long cartId);

		List<Long> findServiceIdByUserId(long userId);

		List<Cart> findAllByUserId(long userId);

		List<Cart> findByUserId(long userId);

		List<Cart> findByUserIdAndServiceId(long userId, long serviceId);


		
}
