package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daos.ServiceProviderDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProviderInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserServiceProviderRelation;
import com.example.demo.repos.CartRepository;
import com.example.demo.repos.ServiceProviderRepository;
import com.example.demo.repos.UserServiceProviderRelationRepository;

@Controller
@SessionAttributes("serviceProviderSession")
public class ServiceProviderController {

	@Autowired
	private ServiceProviderRepository repo;
	
	@Autowired
	private UserServiceProviderRelationRepository repo1;
	
	@Autowired
	private CartRepository repo2;
	
	@Autowired
	private ServiceProviderInfo serviceProviderInfo ;
	
	@Autowired
	private ServiceProviderDao dao;
	
	@GetMapping(path = "/addServicemen")
	public String addServicemen(Model model)
	{
		//command has request scope
		model.addAttribute("command", serviceProviderInfo);
		return "addServicemen";
		
	}
	
	@PostMapping(path = "/addServiceProvider")
	public String addServiceProvider(@Valid @ModelAttribute("command") ServiceProviderInfo serviceProviderInfo)
	{
		
		System.out.println("data:"+serviceProviderInfo.getCategory());
		repo.save(serviceProviderInfo);
		
		return "success";
		
	}
	
	
	@GetMapping(path = "/editAndDeleteServicemen")
	public ModelAndView home() {
		
	    List<ServiceProviderInfo> listServicemen = dao.listAll();
	    ModelAndView mav = new ModelAndView("editAndDeleteServicemen");
	    mav.addObject("listServicemen", listServicemen);
	    return mav;
	}
	
	@GetMapping(path = "/viewAllServicemen")
	public ModelAndView viewAllServicemen(@RequestParam long id) {
		
	    List<ServiceProviderInfo> listServicemen = dao.listAll();
	    ModelAndView mav = new ModelAndView("bookOrAddToCart");
	    mav.addObject("id", id);
	    mav.addObject("listServicemen", listServicemen);
	    return mav;
	}
	 
	@GetMapping(path = "/edit")
	public ModelAndView editServiveProviderForm(@RequestParam long id) {
		System.out.println("inside edit 1");
		ModelAndView mav = new ModelAndView("edit_customer");
		System.out.println("serviceProvider.getServiceId(): "+id);
		ServiceProviderInfo serviceProviderInfo = dao.get(id);
		mav.addObject("serviceProviderInfo", serviceProviderInfo);
	
		return mav;
	}
	
	
	@GetMapping(path = "/addToCart")
	public ModelAndView addToCart(@RequestParam long id, @RequestParam long userId) {
		Date date = new Date();
		System.out.println("userId: "+userId);
		System.out.println("Id: "+id);
		System.out.println("inside add to cart");
		
		ModelAndView mav = new ModelAndView("savedInCart");
		mav.addObject("id", id);
		mav.addObject("userId", userId);
		
		Cart cart = new Cart();
		//repo2.save(cart);
		System.out.println("card :id: "+ cart.getCartId());
		cart.setServiceId(id);
		cart.setUserId(userId);
		repo2.insert(id, userId, cart.getCartId());
		System.out.println("saved...");
		    
		return mav;
	}
	
	@GetMapping(path = "/viewCart")
	public ModelAndView viewCart(@RequestParam long userId) {
		
		System.out.println("userId: "+userId);
		System.out.println("inside add to cart");
		
		List<ServiceProviderInfo> listServicemen = new ArrayList<>();
	
		List<Cart> serviceId = repo2.findByUserId(userId);
		Set<Cart> cartId  = new LinkedHashSet<>();
		
		//List<Cart> cartId = repo2.findAll();
		
		System.out.println("suze: "+serviceId.size());
		for(Cart serId :serviceId )
		{
			System.out.println("id: "+ serId.getServiceId());
			
			  Optional<ServiceProviderInfo> Servicemen = repo.findById(serId.getServiceId());
			  cartId.addAll(repo2.findByUserIdAndServiceId(userId,serId.getServiceId()));
			  System.out.println("info: "+Servicemen.get());
			  listServicemen.add(Servicemen.get());
			 
		} 
		System.out.println("size: "+cartId.size());
		for(Cart serId :cartId )
		{
			System.out.println("cardId: "+serId.getCartId());
			System.out.println("serviceId: "+serId.getServiceId());
			//listServicemen.add(serId.getCartId());
		}
		
		for(ServiceProviderInfo Servicemen: listServicemen) 
		{
			System.out.println("list data: "+Servicemen.getMobileNumber());
		}
		
		ModelAndView mav = new ModelAndView("viewCart");
		mav.addObject("cartId", cartId);
		mav.addObject("listServicemen", listServicemen);
		    
		return mav;
	}
	
	@PostMapping("/saveEditedData")
	public String saveCustomer(@ModelAttribute("command") ServiceProviderInfo serviceProviderInfo) {
		System.out.println("inside save ");
		System.out.println(serviceProviderInfo.getProviderName());
		System.out.println(serviceProviderInfo.getInspectionRate());
		repo.save(serviceProviderInfo);
	    return "success";
	}
	
	@GetMapping(path = "/delete")
	public String editCustomerForm(@RequestParam long id) {
		System.out.println("inside delete 1");
		dao.delete(id);
		return "success";
	}
	
	/*
	 * public ServiceProviderInfo get(Long id) { return repo.findById(id).get(); }
	 */
	
	@GetMapping("/SearchByCategoty")
	public ModelAndView searchByCategory(@ModelAttribute("command") ServiceProviderInfo serviceProviderInfo)
	{		
		ModelAndView mav = new ModelAndView("SearchByCategoty");   
		return mav;
		
	}	
	
	@GetMapping(path = "/SearchByCategotyName")
	public ModelAndView searchByCategoryName(@ModelAttribute("command") ServiceProviderInfo serviceProviderInfo)
	{
		
		System.out.println("data:"+serviceProviderInfo.getCategory());
		List<ServiceProviderInfo> Servicemen = repo.findByCategory(serviceProviderInfo.getCategory());
		ModelAndView mav = new ModelAndView("viewServiceProvidersByCategory");
		mav.addObject("Servicemen", Servicemen);
		    
		return mav;
		
	}
	
	@GetMapping("/SearchByCity")
	public ModelAndView searchByCity(@ModelAttribute("command") ServiceProviderInfo serviceProviderInfo)
	{		
		List<String> listCity = repo.findAllCities();
		System.out.println("distinct cities: "+ listCity.size());
		for(String c: listCity)
		{
			System.out.println("Cities: "+c);
		}
		ModelAndView mav = new ModelAndView("searchByCity");   
		mav.addObject("listCity", listCity);
		return mav;
		
	}
	
	@GetMapping(path = "/searchByCityName")
	public ModelAndView searchByCityName(@ModelAttribute("command") ServiceProviderInfo serviceProviderInfo)
	{
		
		System.out.println("data:"+serviceProviderInfo.getCity());
		List<ServiceProviderInfo> Servicemen = repo.findByCity(serviceProviderInfo.getCity());
		ModelAndView mav = new ModelAndView("viewServiceProvidersByCity");
		mav.addObject("Servicemen", Servicemen);
		    
		return mav;
		
	}
	
	@GetMapping("/deleteFromCart")
	public String deleteFromCart(@RequestParam long id) {
		
		repo2.deleteById(id);
	    return "success";
	}
	
}
