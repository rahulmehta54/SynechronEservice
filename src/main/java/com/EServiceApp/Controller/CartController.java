package com.EServiceApp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EServiceApp.Service.CartService;
import com.EServiceApp.Service.ServicemanService;
import com.EServiceApp.entity.Cart;
import com.EServiceApp.entity.User;

@Controller
public class CartController {

	@Autowired
	private ModelAndView mdlview;

	@Autowired
	private Cart cart;

	@Autowired
	private CartService cartservice;

	@Autowired
	private ServicemanService servicemanservice;

	@Autowired
	private User user;

	/**********************************************
	 * add to cart
	 ************************************************************/

	@GetMapping(path = "/addToCart")
	public ModelAndView addToCart(Model model, @RequestParam("sid") long sid, HttpSession session) {
		user = (User) session.getAttribute("usersession");
		cart.setStatus(1);
		cart.setServiceman(servicemanservice.findById(sid));
		cart.setUser(user);
		cartservice.addToCart(cart);
		mdlview.addObject("sid", sid);
		//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa"+user.getUserId());
		mdlview.addObject("cartList", cartservice.findByStatus(1));

		mdlview.setViewName("viewCart");

		return mdlview;

	}

	/**********************************************
	 * delete cart
	 ************************************************************/
	@GetMapping(path = "/deleteCart")
	public String deleteCart(Model model, @RequestParam("cartid") long cartid) {
		cartservice.deleteById(0, cartid);
		//model.addAttribute("sid", sid);
		
		model.addAttribute("command", cart);
		model.addAttribute("cartList",cartservice.findByStatus(1));
		return "viewCart";

	}
}
	

	  
	 