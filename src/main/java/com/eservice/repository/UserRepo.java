package com.eservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eservice.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public User findByEmailAndPassword(String email, String password);

}
