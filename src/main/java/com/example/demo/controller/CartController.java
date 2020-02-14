package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.daoimpl.CartDaoImpl;
import com.example.demo.dto.Cart;
import com.example.demo.dto.User;

@Controller
public class CartController {

	@Autowired
	private Cart cart;

	@Autowired
	private CartDaoImpl cartDaoImpl;

	/**
	 * Get All Cart Items By User Id
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/viewCart")
	public String viewCartForm(Model model, HttpSession session) {
		User userData = (User) session.getAttribute("userSession");
		System.out.println("session user data " + userData);
		List<Cart> cartItems = this.cartDaoImpl.findCartItemsByUserId(userData);
		model.addAttribute("allCartItems", cartItems);
		return "viewCart";
	}

}
