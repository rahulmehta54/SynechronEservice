package com.eservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
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

}
