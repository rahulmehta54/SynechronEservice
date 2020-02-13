package com.eservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eservice.model.Category;
import com.eservice.repository.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	public List<Category> findbyStatus(int status) {
		return categoryRepo.findByStatus(status);
	}

	public Category addCategory(Category category) {
		return categoryRepo.saveAndFlush(category);
	}

	public Category findByName(String name, int status) {
		return categoryRepo.findByNameAndStatus(name, status);
	}

	@Transactional
	public int deleteByStatus(int status, long id) {
		return categoryRepo.updateStatus(status, id);
	}
}
