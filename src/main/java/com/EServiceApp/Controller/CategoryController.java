package com.EServiceApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.EServiceApp.Service.CategoryService;
import com.EServiceApp.entity.Category;


@Controller
public class CategoryController {

	@Autowired
	private ModelAndView mdlview;
	
	@Autowired
	CategoryService categoryService;

	
	@Autowired
	private Category category;
	
	

/**********************************************User category************************************************************/
	
	@GetMapping(path = "/category")
	public String addcategory(Model model) {
		model.addAttribute("command", category);
		return "addCategory";
	}

	@PostMapping(path = "/addCategory")
	public String addcategory(@ModelAttribute("command") Category category) {
		category.setStatus(1);
		
		categoryService.addcategory(category);
	
		return "dashboard";
	}


/**********************************************view category************************************************************/

	@GetMapping("/viewCategory")
	public ModelAndView viewCategory() {
		mdlview.setViewName("viewCategory");
		mdlview.addObject("CategoryList",categoryService.findByStatus(1));
		return mdlview;
	}

/**********************************************update category************************************************************/

	@GetMapping(path = "/updateCategory/{id}/{name}")
	public String updatecategory(Model model,@PathVariable("id") long cid, @PathVariable("name") String name ) {
		model.addAttribute("id", cid);
		model.addAttribute("name", name);
		
		return "updateCategory";
	}

	
	


}
