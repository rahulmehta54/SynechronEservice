package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserServiceProviderRelation;

@Repository
public interface UserServiceProviderRelationRepository extends JpaRepository<UserServiceProviderRelation, Long> {

}
