package com.eservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.model.Category;
import com.eservice.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private Category category;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ModelAndView modelAndView;

	@GetMapping("/category")
	public String getInit(Model model) {
		model.addAttribute("command", category);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		return "category";
	}

	@GetMapping("/addCategory")
	public String addCategory(Model model) {
		model.addAttribute("command", category);
		return "addCategory";
	}

	@PostMapping("/category")
	public ModelAndView addCategory(@ModelAttribute("command") Category category) {
		category.setStatus(1);
		categoryService.addCategory(category);
		modelAndView.addObject("categoryList", categoryService.findByStatus(1));
		modelAndView.setViewName("category");
		return modelAndView;
	}

	@GetMapping("updateCategory")
	public String updateCategory(Model model, @RequestParam("id") long categoryId, @RequestParam("name") String name) {
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("name", name);
		model.addAttribute("command", category);
		return "addCategory";
	}
	
	@GetMapping("deleteCategory")
	public String deleteCategory(Model model, @RequestParam("id") long categoryId) {
		categoryService.updateStatus(0, categoryId);
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("command", category);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		return "category";
	}

}
