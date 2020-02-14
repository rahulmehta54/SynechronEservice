package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

	@Query("select e from Order e inner join e.cart c inner join c.user u where u.id=:userId")
	public List<Order> findByUserId(@Param("userId") long userId);

	@Modifying
	@Query("update Order o set o.orderStatus=:status where o.id=:id")
	public int updateStatus(@Param("status") String status, @Param("id") long id);

}
