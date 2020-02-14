package com.eservice.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eservice.config.Response;
import com.eservice.config.StatusSetting;
import com.eservice.model.Cart;
import com.eservice.model.Order;
import com.eservice.model.Payment;
import com.eservice.model.User;
import com.eservice.service.CartService;
import com.eservice.service.OrderService;
import com.eservice.service.PaymentService;
import com.eservice.service.ServiceManService;

@Controller
public class PaymentController {

	@Autowired
	private CartService cartService;

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private Payment payment;

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private StatusSetting statusSetting;

	@Autowired
	private ServiceManService serviceManService;

	@Autowired
	private OrderService orderService;

	@GetMapping("/payment")
	public ModelAndView payment(@RequestParam("cartId") long cartId) {
		try {
			modelAndView.setViewName("payment");
			modelAndView.addObject("command", payment);

			System.out.println("cartId=" + cartService.findById(cartId).getId());
			modelAndView.addObject("id", cartService.findById(cartId).getId());
			modelAndView.addObject("cart", cartService.findById(cartId));
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
			return modelAndView;
		}
	}

	@PostMapping("/addPayment")
	public ModelAndView addPayment(@ModelAttribute("command") Payment payment, HttpSession session) {

		System.out.println("payment=" + payment);

		try {
			if (payment != null) {

				Cart cart = new Cart();
				cart = cartService.findById(payment.getCartId());
				payment.setCart(cart);

				System.out.println("payment=" + cart.getServiceMan().getId());

				Payment newPayment = new Payment();

				Date date = new Date();

				payment.setPaymentDate(date);
				newPayment = paymentService.addPayment(payment);

				int cartUpdate = cartService.updateStatus(statusSetting.getDeleteStatus(), cart.getId());
				int serviceManStatus = serviceManService.updateBookingStatus(statusSetting.getSaveStatus(),
						cart.getServiceMan().getId());

				System.out.println("cartUpdate=" + cartUpdate);
				System.err.println("serviceStatus=" + serviceManStatus);

				if (newPayment != null) {

					if (cartUpdate == 1 && serviceManStatus == 1) {
						modelAndView.addObject("errorMessage", "");
						modelAndView.setViewName("paymentList");

						User userExists = new User();
						userExists = (User) session.getAttribute("userData");

						if (userExists != null) {

							Order order = new Order();
							order.setCart(cart);
							order.setOrderStatus("Pending");
							order.setOrderDate(new Date());
							orderService.addOrder(order);

							modelAndView.addObject("list", paymentService.findByUser(userExists.getId()));
						}

					} else {
						modelAndView.addObject("errorMessage", "Failed to update in cart");
						modelAndView.setViewName("payment");
						modelAndView.addObject("list", paymentService.findAll());
					}

				} else {
					modelAndView.setViewName("payment");
					modelAndView.addObject("errorMessage", "Failed. Please try again");
				}

			} else {
				modelAndView.setViewName("payment");
				modelAndView.addObject("errorMessage", "Failed. Please try again");
			}
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("payment");
			modelAndView.addObject("errorMessage", "Failed. Please try again");
		}
		return modelAndView;
	}

	@GetMapping("/paymentList")
	public ModelAndView paymentList(HttpSession session) {

		modelAndView.setViewName("paymentList");
		User userExists = new User();
		userExists = (User) session.getAttribute("userData");

		if (userExists != null) {
			modelAndView.addObject("list", paymentService.findByUser(userExists.getId()));
		}

		return modelAndView;
	}

}
