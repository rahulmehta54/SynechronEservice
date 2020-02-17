package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;
import com.example.demo.services.serviceProviderImpl;

@Controller
public class BookingController {
	@Autowired ServiceProvider sp;
	
	@Autowired Users u;
	 
	
	 
	@Autowired serviceProviderImpl spServ;
	/* 
	 * @GetMapping("/addbookService/{sid}") public String
	 * viewBookedService(@PathVariable("sid") int sid, Model mm,HttpSession session)
	 * { u = (Users) session.getAttribute("userSession");
	 * System.out.println("user session " +u.getUserId());
	 * System.out.println("sp id " +sid); Optional<ServiceProvider> olist=
	 * spServ.getServbyId(sid); sp = olist.get();
	 * 
	 * spBook.set spServ.addBooking(sid,u.getUserId());
	 * 
	 * mm.addAttribute("spObj",sp); return "viewbookService"; }
	 */
	
	
	  @GetMapping("/BookingOrder/{cartListbyUserId}") 
	  public String addtoBooking(Model mm,HttpSession session)
	  {
		  u=(Users)session.getAttribute("userSession");
			 List<Cart> clist=spServ.viewCarbyId(u.getUserId());
			 mm.addAttribute("cartListbyUserId",clist);
			 return "redirect:/viewbookService";
	  }
	 
}
