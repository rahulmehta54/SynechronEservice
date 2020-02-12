package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.Inspection;
@Repository
public interface InspectionRepository extends JpaRepository<Inspection, Long> {

}
