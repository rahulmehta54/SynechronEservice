package com.example.demo.controllers;

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
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Users;
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

	 @GetMapping(path="/addbookServicetoCart/{sid}")
	 public String addtoCart(@PathVariable("sid") int sid,HttpSession session,Model m) 
	 {
		 u=(Users)session.getAttribute("userSession");
		 Optional<Users> uolist =uImpl.getUserbyId(u);
		 u = uolist.get();
		 
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
			List<Cart> clist=spImpl.getordersbyUserId(u.getUserId());
			System.out.println("joinQuery: "+clist.size());
			m.addAttribute("cartInfo", sp);
			return "viewbookService";
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
}
