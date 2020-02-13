package com.example.demo.daos;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;
import com.example.demo.repos.UserInfoRepository;


@Repository
public class UserDao {
	
	@Autowired
	private UserInfoRepository repo;
	
	public List<UserInfo> listAll() {
        return (List<UserInfo>) repo.findAll();
    }

	
	/*
	 * @Autowired private UserInfoRepository repo;
	 * 
	 * public List<UserInfo> listAll() { return (List<UserInfo>) repo.findAll(); }
	 */
	/*
	 * public Collection<UserInfo> checkAdmin(@Valid UserInfo userInfo) {
	 * 
	 * return repo.findUsers(userInfo); }
	 */
	

	
}
