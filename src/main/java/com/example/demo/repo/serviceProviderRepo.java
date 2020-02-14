package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ServiceProvider;

@Repository
public interface serviceProviderRepo extends JpaRepository<ServiceProvider, Integer> {

	@Query(value = "SELECT sp FROM ServiceProvider sp WHERE sp.catagory LIKE '%' || :keyword || '%'"
            + " OR sp.city LIKE '%' || :keyword || '%'"
            + " OR sp.firstName LIKE '%' || :keyword || '%'")
     public List<ServiceProvider> search(@Param("keyword") String keyword);
}
