package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.SalesPersonRepository;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;

@Controller 
@Setter
public class AdminController {
	@Autowired
	private SalesPersonRepository   repo;
	@Autowired
	private ModelAndView mdlview;
	@Autowired
	private SalesPerson  salesperson;
	@GetMapping(path="/addSaleperson")
	public String initForm(Model model) {
		model.addAttribute("command",salesperson);
		System.out.println("hello world");
		return "addsalesperson";
	}
	@ModelAttribute("categoryList")
	public List<String> getCategory() {
		List<String> categoryList  = new ArrayList<String>();
		categoryList .add("Carpenter");
		categoryList .add("Electrician");
		categoryList .add("Plumber");
		categoryList .add("Driver");
		return categoryList;
	}

	@PostMapping(path="/addSaleperson")
	private String onSubmit(@Valid @ModelAttribute("command") SalesPerson  salesperson) 
	{

		repo.save(salesperson);
		return "success";


	}
	
	@GetMapping(path="/deleteSaleperson")
	public ModelAndView deleteSaleperson() {
		List<SalesPerson> list=repo.findAll();
		
		
		List<Integer> idlist=new ArrayList<Integer>();
		mdlview.addObject("vendorlist",list);
		mdlview.addObject("idlist",idlist);
		mdlview.setViewName("editdelvendor");
		return mdlview;
	
	}
	@PostMapping(path="/deleteSaleperson")
	private String delete(@RequestParam("check")Long[] checkboxvalues) 
	{
	//	Integer[] selectedStudentIds = request.getParameterValues("selected");
  
   for (Long  check: checkboxvalues) {
	 //  repo.deleteById(integer);
	   System.out.println(check);
	   repo.deleteById(check);

}
   
		return "success";


	}
//	editemp/${vendor.id}
	   @RequestMapping(value="/editvendor/{id}")    
	    public String edit(@PathVariable Long id, Model m){    
	        SalesPerson vendor=repo.getOne(id);  
	        System.out.println(vendor+"============");
	        m.addAttribute("edditt",vendor);  
	        return "editvendor";    
	    }  
	   @PostMapping(value="/editandsavee")    
	    public String editandsave(@ModelAttribute("edditt") SalesPerson sp){  
		   System.out.println(sp.getId()+"In the end");
		   
		  repo.save(sp); 
	    //    repo.updateSalesPerson(sp.getId(),sp.getCategory(),sp.getCity(),sp.getExperience(),sp.getRate(),sp.getMobileNumber(),sp.getSalePersonName());
		  
		   
	        return "success";    
	    } 
	
	
	



}
