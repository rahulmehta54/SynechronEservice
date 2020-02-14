package com.eservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Category;
import com.eservice.repository.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;

	public Category addCategory(Category category) {
		return categoryRepo.saveAndFlush(category);
	}	
	
	public List<Category> findByStatus(int status){
		return categoryRepo.findByStatus(status);
	}
	
	@Transactional
	public int updateStatus(int status, long categoryId) {
		return categoryRepo.updateStatus(status, categoryId);
	}
	
	
}