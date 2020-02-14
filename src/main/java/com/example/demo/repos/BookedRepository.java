package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Booked;
import com.example.demo.entity.Cart;

@Repository
public interface BookedRepository extends JpaRepository<Booked, Long> {

	@Modifying
 	@Transactional
    @Query(value = "insert into Booked (bookedId,serviceId,userId) VALUES (:bookedId,:serviceId,:userId)", nativeQuery = true)
    void insert(@Param("bookedId") Long bookedId, @Param("serviceId") Long serviceId,@Param("userId") long userId);

	List<Booked> findByUserId(long userId);

	List<Booked>  findByUserIdAndServiceId(long userId, long serviceId);
}
