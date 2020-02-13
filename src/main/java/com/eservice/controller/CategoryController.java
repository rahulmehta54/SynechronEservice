package com.eservice.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Category;
import com.eservice.model.User;
import com.eservice.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private Category category;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private StatusSetting statusSetting;

	@GetMapping("/category")
	public ModelAndView category(HttpSession session) {
		modelAndView.setViewName("category");
		modelAndView.addObject("errorMessage", "");
		modelAndView.addObject("refresh", false);
		User existingUser = new User();
		existingUser = (User) session.getAttribute("userData");
		if (existingUser != null) {
			modelAndView.addObject("adminStatus", existingUser.getRole().getId());
		}
		System.out.println("existingUser=" + existingUser);

		modelAndView.addObject("list", categoryService.findbyStatus(statusSetting.getSaveStatus()));
		modelAndView.addObject("command", category);
		return modelAndView;
	}

	@PostMapping("/addCategory")
	public ModelAndView addCategory(@Valid @ModelAttribute("command") Category category, BindingResult result) {

		modelAndView.addObject("errorMessage", "");
		modelAndView.addObject("refresh", false);
		try {

			if (category != null) {
				Category newCategory = new Category();

				Category catByName = new Category();
				catByName = categoryService.findByName(category.getName(), statusSetting.getSaveStatus());

				// check categoryExists or not
				if (catByName == null) {
					category.setStatus(1);
					newCategory = categoryService.addCategory(category);

					if (newCategory != null) {

						System.out.println("refresh");

						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("category");
					} else {
						modelAndView.setViewName("category");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}

				} else if (catByName != null && catByName.getId() == category.getId()) {
					category.setStatus(1);
					newCategory = categoryService.addCategory(category);

					if (newCategory != null) {
						modelAndView.addObject("refresh", true);
						modelAndView.setViewName("category");
					} else {
						modelAndView.setViewName("category");
						modelAndView.addObject("errorMessage", "Failed. Please try again.");
					}
				} else {
					modelAndView.addObject("errorMessage", "Category name already exists.");
				}

			} else {
				modelAndView.addObject("errorMessage", "Category Name can not be empty.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("category");
			modelAndView.addObject("errorMessage", "Something went wrong. Please try again.");
		}

		return modelAndView;
	}

	@GetMapping("/deleteById/{id}")
	public ResponseEntity<Response> deleteById(@PathVariable("id") long id) {
		try {
			if (id == 0) {
				return new ResponseEntity<Response>(new Response("category Id can not be null."), HttpStatus.OK);
			} else {
				int a = categoryService.deleteByStatus(statusSetting.getDeleteStatus(), id);
				if (a == 1) {
					return new ResponseEntity<Response>(new Response("success"), HttpStatus.OK);
				} else {
					return new ResponseEntity<Response>(new Response("failed"), HttpStatus.OK);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response("failed"), HttpStatus.OK);
		}
	}

}
