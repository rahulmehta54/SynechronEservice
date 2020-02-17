package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Cart;
import com.example.demo.entity.OrderBooked;
import com.example.demo.entity.Payment;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;
import com.example.demo.repo.BookingRepository;
import com.example.demo.services.serviceProviderImpl;
import com.example.demo.services.userServiceImpl;


@Controller
public class cartController {
	
	@Autowired
	Cart c;
	
	@Autowired
	ServiceProvider sp;
	
	@Autowired
	Users u;
	
	@Autowired
	serviceProviderImpl spImpl;
	
	@Autowired
	userServiceImpl uImpl;
	
	@Autowired
	OrderBooked ob;
	
	

	 @GetMapping(path="/addbookServicetoCart/{sid}")
	 public String addtoCart(@PathVariable("sid") int sid,HttpSession session,Model m) 
	 {
		 System.out.println("in addbookServicetoCart controller");
		 u=(Users)session.getAttribute("userSession");
		 Optional<Users> uolist =uImpl.getUserbyId(u);
		 u = uolist.get();
		 System.out.println(sid);
//		   Cart ci=new Cart();
		 Optional<ServiceProvider> oslist = spImpl.getServbyId(sid);
		 sp = oslist.get();
		 
		 c.setS(sp);
		 c.setU(u);
		 c.setCartId(0);
		 System.out.println("cart id "+c.getCartId());
		c= spImpl.savetoCart(c);
		if(c!=null)
		{
			m.addAttribute("success", "added to cart!!");
			//List<Cart> clist=spImpl.getordersbyUserId(u.getUserId());
			//System.out.println("joinQuery: "+clist.size());
			//m.addAttribute("cartInfo", sp);
			return "success";
		}
		else
			m.addAttribute("fail", "Something went wrong!!");
			return "userOperation";
	 }
	 
	 @GetMapping(path="/viewbookService")
	 public String viewbookService()
	 {
		 return "viewbookService";
	 }
	 
	 //but how to get service provider details
	 @GetMapping(path="/viewCart")
	 public String viewCartbyId(Model m,HttpSession session)
	 {
		 u=(Users)session.getAttribute("userSession");
		 List<Cart> clist=spImpl.viewCarbyId(u.getUserId());
		 
		 m.addAttribute("cartListbyUserId",clist);
		return "viewCart";
	 }
	 
	 @GetMapping("/deleteCart/{cartId}")
	 public String deleteCart(@PathVariable("cartId") int cartId, Model mm,HttpSession session) {
		 spImpl.deleteCart(cartId);
		 u=(Users)session.getAttribute("userSession");
		 List<Cart> clist=spImpl.viewCarbyId(u.getUserId());
		 mm.addAttribute("success","cart deleted successfully!");
		 mm.addAttribute("cartListbyUserId",clist);
		 return "redirect:/viewCart";
	 }
	 
	 @GetMapping("/payment/{total}")
	 public String payment(@PathVariable("total") String total, Model mm)
	 {
		 
		 mm.addAttribute("totalAmt", total);
		 return "payment";
	 }
	 
	 @PostMapping("/payment")
	 public String pay(@ModelAttribute("command") Payment p  ,HttpSession session,Model mm)
	 {
		 System.out.println("hello");
		 System.out.println(p.getPayMode());
		 u=(Users)session.getAttribute("userSession");
		 p.setU(u);
		// DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	     Date date = new Date();
	     p.setDate(date);
	     p=spImpl.savePay(p);
	     
	     ob.setP(p);
	     ob = spImpl.saveBooking(ob);
	     if(ob!=null)
	    	 mm.addAttribute("success", "Booking done successfully!!");
	     else
	    	 mm.addAttribute("success", "Something went wrong!!");
	    // System.out.println(dateFormat.format(date));
		 return "viewbookService";
	 }
}
