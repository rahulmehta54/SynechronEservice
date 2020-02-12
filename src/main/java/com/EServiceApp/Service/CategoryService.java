package com.EServiceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EServiceApp.entity.Category;

import com.EServiceApp.repo.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;

	public Category addcategory(Category category) {

		return repo.saveAndFlush(category);

	}
	
	public List<Category> findByStatus(int i) {
		
		return repo.findByStatus(i);
	}

	
}
