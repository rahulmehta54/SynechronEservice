package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.ServiceProvider;
import com.example.demo.repo.serviceProviderRepo;
import com.example.demo.services.serviceProviderImpl;
@Controller
public class serviceProviderController {
	
	@Autowired
	ServiceProvider sp;
	
	@Autowired
	serviceProviderImpl spServ;
	
	
	
	
	@GetMapping(path="/addService")
	public String addService() {
		return "addService";
	}
	
	
	  @GetMapping(path="/adminOperation") 
	  public String adminOperation() 
	  { 
		  return "adminOperation";
	  }
	 
 
	 @PostMapping(path="/RegisterServicebyAdmin")
	 public String regService(@Valid @ModelAttribute("command") ServiceProvider srvp, BindingResult result)
	 {
		 System.out.println("serviceProviderName: " +srvp.getFirstName());
		 System.out.println("num "+srvp.getContactNum());
		 sp = spServ.addService(srvp);
		 
		 if(sp!=null)
		 {
			 System.out.println("serviceProviderName: " +sp.getFirstName());
			 System.out.println("success");
			 return "adminOperation";
		 }
		 else
			 return "failure";
		 
	 }
	 
	 @GetMapping(path="/viewServices")
		public String viewServices(Model model) {
		 	List<ServiceProvider> slist=spServ.viewService();
		 	System.out.println("list size: " +slist.size());
		 	model.addAttribute("servList", slist);
			return "viewServices";
		} 
	 //fetch data to edit
	 @GetMapping("/editService/{sid}")
		public String editService(@PathVariable("sid") int sid, Model mm) {
		
		 Optional<ServiceProvider> olist= spServ.getServbyId(sid);
		 sp = olist.get();
		 System.out.println("sp"+sp.getCity());
		 mm.addAttribute("spObj",sp);
		return "editService";
		}
		
	//data edited and saved
	 @PostMapping(path="/editService/adminOperation/{sid}")
	 public String updateService(@PathVariable("sid") int sid,@ModelAttribute("command") ServiceProvider srvp, Model m) {
		 System.out.println("inside put"+sid);
		 spServ.updateService(srvp);
		
			 m.addAttribute("success", "Service updated successfully");		
			 return "adminOperation";
		
	 }
	 
	 
	 //to delete data
	 @GetMapping("/deleteService/{sid}")
	 public String deleteService(@PathVariable("sid") int sid, Model mm) {
		 spServ.deleteService(sid);
		 mm.addAttribute("success","Service deleted successfully!");
		 return "viewServices";
	 }
	

}
