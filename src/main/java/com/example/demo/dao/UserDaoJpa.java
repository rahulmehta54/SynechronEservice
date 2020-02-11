package com.example.demo.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.User;

public interface UserDaoJpa extends JpaRepositoryImplementation<User, Integer> {

}
