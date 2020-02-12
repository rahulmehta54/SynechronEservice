package com.EServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EServiceApp.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserNameAndPassword(String username, String password);
}
