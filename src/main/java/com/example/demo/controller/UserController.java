package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.repository.CartRepo;
import com.example.demo.controller.repository.EndOrderRepo;
import com.example.demo.controller.repository.FinalOrderRepo;
import com.example.demo.controller.repository.Finalcartrepo;
import com.example.demo.controller.repository.OrderRepo;
import com.example.demo.controller.repository.SalesPersonRepository;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.EndOrder;
import com.example.demo.entity.FinalOrder;
import com.example.demo.entity.Finalcart;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;

@Controller 
@Setter
public class UserController {
	private static List<Long> cartlist;
	private static List<SalesPerson> SalesPerson;
	@Autowired
	private Finalcart   finalcart;
	@Autowired
	private SalesPersonRepository   repo;
	@Autowired
	private ModelAndView mdlview;
	private OrderRepo orderRepo;
	@Autowired
	
	private SalesPerson  salesperson;
	@Autowired
	private User user;
	@Autowired
	private FinalOrder finalorder;
	@Autowired
	private FinalOrderRepo finalorderrepo;
	@Autowired
	private Finalcartrepo finalcartRepo;
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private Cart cart;
	@Autowired
	private EndOrderRepo endOrderRepo;
	@Autowired
	private EndOrder endOrder;
	
    //   List<SalesPerson> spl=new ArrayList<>();
	@GetMapping(path="/viewSalesperson")
	public ModelAndView initForm(Model model) {
		List<SalesPerson > salesPersonlist=new ArrayList<>();
		salesPersonlist=repo.findAll();
		System.out.println(salesPersonlist);
		//model.addAttribute("salesPersonlist",salesPersonlist);
		List<Long> idlist=new ArrayList<>();
		mdlview.addObject("salesPersonlist",salesPersonlist);
		mdlview.addObject("idlist",idlist);
		mdlview.setViewName("viewSalesperson");
		System.out.println("yoooooooooooo");
		//
		return mdlview;
		//return "viewSalesperson";
	}

	@PostMapping(path="/addSalepersonTobuy")
	private ModelAndView  addsaalePerson(@RequestParam("check")Long[] checkboxvalues,HttpSession request) { 

		// Integer[] selectedStudentIds = request.getParameterValues("selected");
		System.out.println("aaagyaaaa");
    
				List<Long> list=Arrays.asList(checkboxvalues);
				List<SalesPerson> salesPersonlist=repo.findAllById(list);
				SalesPerson=salesPersonlist;
				  user=(User)request.getAttribute("user");
				     cart.setUserId(user.getId());
		for (Long check: checkboxvalues) { // repo.deleteById(integer);
			System.out.println(check); // repo.deleteById(check);
           // String s=Long.toString(check);
			Finalcart finalcart=new Finalcart();
			finalcart.setUserId(user.getId());
			finalcart.setSalespersonid(check);
		
			finalcartRepo.save(finalcart);

		}
		
		String concatinatedString=list.stream().map(String::valueOf)
		        .collect(Collectors.joining(","));
		System.out.println(concatinatedString);
		System.out.println(request.getAttribute("user"));
      cart.setSalesperson(concatinatedString);
    
     cartRepo.save(cart);
      List<Long> idlist=new ArrayList<>();
      mdlview.addObject("salesPersonlist",salesPersonlist);
         cartlist=list;
		mdlview.addObject("idlist",idlist);
		mdlview.setViewName("delfromcart");

return mdlview;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping(path="/delfromcart")
	public String deleteSaleperson() {
		/*
		 * List<SalesPerson> list=repo.findAll();
		 * 
		 * 
		 * List<Integer> idlist=new ArrayList<Integer>();
		 * mdlview.addObject("vendorlist",list); mdlview.addObject("idlist",idlist);
		 * mdlview.setViewName("editdelvendor");
		 */
		return "success";
	
	}
	/*
	 * @PostMapping(path="/deleteSaleperson") private String
	 * delete(@RequestParam("check")Long[] checkboxvalues) { // Integer[]
	 * selectedStudentIds = request.getParameterValues("selected");
	 * 
	 * for (Long check: checkboxvalues) { // repo.deleteById(integer);
	 * System.out.println(check); repo.deleteById(check);
	 * 
	 * }
	 * 
	 * return "success";
	 * 
	 * 
	 * }
	 */
	
	@GetMapping(path="/placeorder")
	private String order(HttpSession request) {
		
		  System.out.println("aillaaaa"); 
		  String concatinatedString=cartlist.stream().map(String::valueOf)
		  .collect(Collectors.joining(","));
               FinalOrder finalorder=new FinalOrder();
		  user=(User)request.getAttribute("user");
		LocalTime dateandtime=java.time.LocalTime.now();
		Double sum=0.0;
		for (SalesPerson sp :SalesPerson) {
			sum=sum+sp.getRate();
			
		}
		
		LocalDateTime localDateTime = LocalDateTime.now();
		EndOrder endOrder=new EndOrder();
		  endOrder.setCustomerId(user.getId());
		  endOrder.setSaleperson(concatinatedString);
		  endOrder.setDate(localDateTime);
		  endOrder.setTotal(sum);
		  
		 endOrderRepo.save(endOrder);
		 
		
		return "ordersuccessful";
	}
	@GetMapping(path="/previousorder")
	private String previousorder(HttpSession request) {
		
	
		  user=(User)request.getAttribute("user");
		 List<EndOrder> endorder= endOrderRepo.findAllByCustomerId(user.getId());
		 System.out.println(endorder);
	/*	  endOrder.setCustomerId(user.getId());
		  endOrder.setSaleperson(concatinatedString);
		 endOrderRepo.save(endOrder);*/
		 
		
		return "previousorder";
	}

	private void findAllByCustomerId(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	@GetMapping(path="/userdashboard")
	private String returnhome() {
		return "userdashboard";
		
	}
	
	

}
