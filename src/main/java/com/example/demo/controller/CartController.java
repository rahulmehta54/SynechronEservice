package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.ServiceDaoJPA;
import com.example.demo.daoimpl.CartDaoImpl;
import com.example.demo.dto.Cart;
import com.example.demo.dto.ServiceMen;
import com.example.demo.dto.User;

@Controller
public class CartController {

	@Autowired
	private ServiceMen serviceMen;

	@Autowired
	private CartDaoImpl cartDaoImpl;

	@Autowired
	private ServiceDaoJPA serviceDaoJPA;

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

	/**
	 * Adding service men to cart 
	 * 
	 * @param sId
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/addToCart/{sId}")
	public String addToCart(@PathVariable("sId") int sId, Model model, HttpSession session) {
		User userData = (User) session.getAttribute("userSession");
		System.out.println("Cart Controller: /addToCart");
		System.out.println("session user data : " + userData);

		ServiceMen objServiceMen = serviceDaoJPA.findById(sId).get();
		System.out.println("ServiceMen Object By Id : ==========" + objServiceMen);

		int val = this.cartDaoImpl.addItemToCart(userData, objServiceMen);
		System.out.println("rows affected on adding:" + val);

		List<ServiceMen> allServiceMens = this.serviceDaoJPA.findAll();
		model.addAttribute("allServiceMens", allServiceMens);
		model.addAttribute("command", serviceMen);
		return "viewServiceMenUser";
	}

	/**
	 * Remove service men from the cart
	 * 
	 * @param cartId
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("/cart/remove/{cartId}")
	public String removeFromCart(@PathVariable("cartId") int cartId, Model model, HttpSession session) {
		int val = this.cartDaoImpl.removeFromCart(cartId);
		System.out.println("rows affected on updating cart:" + val);

		User userData = (User) session.getAttribute("userSession");
		System.out.println("session user data " + userData);
		List<Cart> cartItems = this.cartDaoImpl.findCartItemsByUserId(userData);
		model.addAttribute("allCartItems", cartItems);
		return "viewCart";
	}
}
