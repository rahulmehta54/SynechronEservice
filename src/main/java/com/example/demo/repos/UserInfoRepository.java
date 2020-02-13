package com.example.demo.repos;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	Collection<UserInfo> findByUserNameAndPassword(String userName, String password);

	/*
	 * @Query("SELECT u FROM userinfo u WHERE u.userName = ? and u.password = ?")
	 * Collection<UserInfo> findUsers(@Valid UserInfo userInfo);
	 * 
	 * void findByUserNameAndPassword(String userName, String password);
	 */
	
}
