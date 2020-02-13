package com.eservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.object.EisOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Cart;
import com.eservice.model.ServiceMan;
import com.eservice.model.User;
import com.eservice.service.CartService;
import com.eservice.service.ServiceManService;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ServiceManService serviceManService;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private StatusSetting statusSetting;

	@GetMapping("/addToCart/{id}")
	public ResponseEntity<Response> addToCart(@PathVariable("id") long id, HttpSession session) {

		try {
			User existingUser = new User();
			existingUser = (User) session.getAttribute("userData");

			if (existingUser != null) {
				Cart cart = new Cart();

				ServiceMan man = new ServiceMan();
				man = serviceManService.findById(id);

				cart.setServiceMan(man);
				cart.setUser(existingUser);
				cart.setStatus(1);

				Cart newCart = new Cart();

				if (cartService.findbyUserIdAndServiceProviderId(existingUser.getId(), man.getId()) != null) {
					return new ResponseEntity<Response>(new Response("Service Provider already exist into cart"),
							HttpStatus.OK);

				} else {
					newCart = cartService.addToCart(cart);
					if (newCart != null) {

						return new ResponseEntity<Response>(new Response("success"), HttpStatus.OK);

					} else {
						return new ResponseEntity<Response>(
								new Response("Failed to add service provider to cart. Please try again"),
								HttpStatus.OK);
					}

				}

			} else {
				return new ResponseEntity<Response>(new Response("Please Log in"), HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(new Response("Failed. Please try again"), HttpStatus.OK);
		}

	}

	@GetMapping("/showCart")
	public ModelAndView showCart(HttpSession session) {
		modelAndView.setViewName("cart");

		User existingUser = new User();
		existingUser = (User) session.getAttribute("userData");
		if (existingUser != null) {
			modelAndView.addObject("adminStatus", existingUser.getRole().getId());
			modelAndView.addObject("list", cartService.findByStatus(statusSetting.getSaveStatus()));
		}

		return modelAndView;
	}

}
