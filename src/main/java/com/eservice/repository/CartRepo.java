package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eservice.model.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {

	@Query("select e from Cart e inner join e.user u inner join e.serviceMan s where u.id=:userId and s.id=:serviceProviderId and e.status=1")
	Cart findByUserIdAndServiceProviderId(@Param("userId") long userId,
			@Param("serviceProviderId") long serviceProviderId);

	public List<Cart> findByStatus(int status);

	@Modifying
	@Query("update Cart c set c.status=:status where c.id=:id")
	public int updateStatus(@Param("status") int status, @Param("id") long id);

	@Query("select e from Cart e inner join e.user u where u.id=:userId and e.status=:status")
	public List<Cart> findByStatusAndUserId(@Param("userId") long userId, @Param("status") int status);

}
