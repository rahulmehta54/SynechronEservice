package com.example.demo.controllers;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Service.CartService_Imple;
import com.example.demo.Service.ServiceProvider_ServiceImpl;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.entity.Cart;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.User;
import com.example.demo.repo.Cart_repo;

@Controller
public class OrderController {
	@Autowired
	UserServiceImpl service;
	@Autowired
	ServiceProvider_ServiceImpl servImp;
	@Autowired
	CartService_Imple cart_serImple;
	
	
	@GetMapping(value = "{serviceId}")
	public String buy(@PathVariable("serviceId") int serviceId, HttpSession session,@ModelAttribute("cartEntry") ServiceProvider sp,Model mdel ) 
	{

		    Cart newCart = new Cart();

	   		List<ServiceProvider> cart = new ArrayList<ServiceProvider>();
	   		cart.add(servImp.getServiceProviderByID(serviceId));
			session.setAttribute("cart", cart);
			newCart.setSp(sp);
			User userFromSession=  (User) session.getAttribute("userSession");
			newCart.setUser(userFromSession);
			Cart addedToCart = cart_serImple.addToCart(newCart);
			
			if(addedToCart != null)
			{
				mdel.addAttribute("msgForCartAddOperation","Added to Cart...!!!");
			}
			else
			{
				mdel.addAttribute("msgForCartAddOperation","Oops..!! Unable to Add to cart, please try again");
			}
	        //session.setAttribute("cart", cart);
			return "UserOperations";
			
	}
	
	@GetMapping("/cart")
	public String cartView(HttpSession session,Model m,@ModelAttribute("cartEntry") ServiceProvider sp)
	{
		System.out.println("I am inside the cartview methpod - ");
		return "cart";
	}
	
	@GetMapping("/viewCart")
	public String viewMyCart(HttpSession session,Model m)
	{
		User userFromSession=  (User) session.getAttribute("userSession");
		List<Cart> listOfItemsFromCart = cart_serImple.GetAllItemsFromCart(userFromSession.getUserID());
		
		m.addAttribute("cartValue",listOfItemsFromCart);  
		return "viewCart";
	}
	
}
