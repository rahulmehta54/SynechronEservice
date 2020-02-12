package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Serviceman;
@Repository
public interface ServicemanRepository extends JpaRepository<Serviceman, Long> {

}
