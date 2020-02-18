package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
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
import com.example.demo.controller.repository.Finalcartrepo;
import com.example.demo.controller.repository.SalesPersonRepository;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.EndOrder;
import com.example.demo.entity.Finalcart;
import com.example.demo.entity.SalesPerson;
import com.example.demo.entity.User;

import lombok.Setter;

@Controller
@Setter
public class UserController {
	private  List<Long> cartlist;
	private  List<SalesPerson> SalesPerson;
	@Autowired
	private Finalcart finalcart;
	@Autowired
	private SalesPersonRepository repo;
	@Autowired
	private ModelAndView mdlview;

	@Autowired

	private SalesPerson salesperson;
	@Autowired
	private User user;

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

	// List<SalesPerson> spl=new ArrayList<>();








	@GetMapping(path = "/viewSalesperson")
	public ModelAndView initForm(Model model) {
		List<SalesPerson> salesPersonlist = new ArrayList<>();
		salesPersonlist = repo.findAll();
		System.out.println(salesPersonlist);
		// model.addAttribute("salesPersonlist",salesPersonlist);
		List<Long> idlist = new ArrayList<>();
		mdlview.addObject("salesPersonlist", salesPersonlist);
		mdlview.addObject("idlist", idlist);
		mdlview.setViewName("viewSalesperson");
		System.out.println("yoooooooooooo");
		//
		return mdlview;
		// return "viewSalesperson";
	}

	@PostMapping(path = "/addSalepersonTobuy")
	private ModelAndView addsaalePerson(@RequestParam("check") Long[] checkboxvalues, HttpSession request) {




		user = (User) request.getAttribute("user");


		// Integer[] selectedStudentIds = request.getParameterValues("selected");


		List<SalesPerson> salepersondummy=new ArrayList<>(); List<Cart>
		cartlist1=cartRepo.findByUserId(user.getId()); for (Cart cart : cartlist1) {
			for (SalesPerson sp : cart.getSalesPersonList()) { salepersondummy.add(sp);
			System.out.println( sp); System.out.println("===========hello===========");

			}

		} SalesPerson=salepersondummy;







		/////////////////////////////////////////////////
		System.out.println("aaagyaaaa");

		List<Long> list = Arrays.asList(checkboxvalues);

		List<SalesPerson> salesPersonlist = repo.findAllById(list);

		if(SalesPerson==null) {
			SalesPerson = salesPersonlist;
			cart.setUserId(user.getId());
			cart.setSalesPersonList(salesPersonlist);


			List<Long> idlist = new ArrayList<>();
			mdlview.addObject("salesPersonlist",SalesPerson); 
			cartlist = list; 


			cart.setUserId(user.getId());
			cart.setSalesPersonList(SalesPerson);
			cartRepo.save(cart);
			mdlview.addObject("idlist", idlist);
			mdlview.setViewName("delfromcart");

			return mdlview;





		}else
			if(SalesPerson.containsAll(salesPersonlist)) {
				List<Long> idlist = new ArrayList<>();
				mdlview.addObject("salesPersonlist",SalesPerson); 
				cartlist = list; 
				mdlview.addObject("idlist", idlist);
				mdlview.setViewName("delfromcart");

				return mdlview;


			}

			else {
				SalesPerson.addAll(salesPersonlist);


				List<SalesPerson> withoutDupes = SalesPerson.stream()
						.distinct()
						.collect(Collectors.toList());
				SalesPerson=withoutDupes;
				mdlview.addObject("salesPersonlist",SalesPerson); 
				cartlist = list; 
				//	  cartRepo.update(user.getId(),SalesPerson);

				cart.setUserId(user.getId());
				cart.setSalesPersonList(SalesPerson);
				cartRepo.save(cart);
				List<Long> idlist = new ArrayList<>();
				mdlview.addObject("idlist", idlist);
				mdlview.setViewName("delfromcart");
				return mdlview;




			}



		////




		/*
		 * cart.setUserId(user.getId()); cart.setSalesPersonList(salesPersonlist); for
		 * (Long check : checkboxvalues) { // repo.deleteById(integer);
		 * System.out.println(check); // repo.deleteById(check); // String
		 * s=Long.toString(check); Finalcart finalcart = new Finalcart();
		 * finalcart.setUserId(user.getId()); finalcart.setSalespersonid(check);
		 * 
		 * finalcartRepo.save(finalcart);
		 * 
		 * }
		 * 
		 * String concatinatedString =
		 * list.stream().map(String::valueOf).collect(Collectors.joining(","));
		 * System.out.println(concatinatedString);
		 * System.out.println(request.getAttribute("user"));
		 * cart.setSalesperson(concatinatedString);
		 * 
		 * cartRepo.save(cart); ///// List<SalesPerson> saleperson=new ArrayList<>();
		 * List<Cart> list1=cartRepo.findByUserId(user.getId()); for (Cart cart : list1)
		 * { for (SalesPerson sp : cart.getSalesPersonList()) { saleperson.add(sp);
		 * System.out.println( sp); System.out.println("===========hello===========");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * SalesPerson=saleperson;
		 */


		/////////////////////



		/*
		 * List<Long> idlist = new ArrayList<>(); mdlview.addObject("salesPersonlist",
		 * saleperson); cartlist = list; mdlview.addObject("idlist", idlist);
		 * mdlview.setViewName("delfromcart");
		 * 
		 * return mdlview;
		 */

	}

	/*
	 * @PostMapping(path="/delfromcart") public ModelAndView
	 * deleteSaleperson(@RequestParam("check")Long[] checkboxvalues) {
	 * System.out.println("======for cart===del");
	 * 
	 * 
	 * for (Long check: checkboxvalues) { // repo.deleteById(integer);
	 * for(SalesPerson sp : SalesPerson) { if(sp.getId()==check) {
	 * SalesPerson.remove(sp); }
	 * 
	 * }
	 * 
	 * // finalcartRepo.deleteBySalespersonid(check);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * mdlview.addObject("salesPersonlist",SalesPerson);
	 * mdlview.setViewName("delfromcart"); return mdlview;
	 * 
	 * }
	 */



	@PostMapping(path="/delfromcart") private String
	delete(@RequestParam("check")Long[] checkboxvalues,HttpSession request) { //
		user = (User) request.getAttribute("user");
		System.out.println("====before==="); System.out.println(SalesPerson);
		System.out.println(checkboxvalues); 
		Iterator<SalesPerson> iterator= SalesPerson.iterator();
		for (Long long1 : checkboxvalues) {
			while(iterator.hasNext()){ 
				if(iterator.next().getId().equals(long1)) {

				
					iterator.remove(); }

			} }
		cart.setSalesPersonList(SalesPerson);
		cart.setUserId(user.getId());
		cartRepo.save(cart);
			return "success";


	}



	@GetMapping(path = "/placeorder")
	private String order(HttpSession request) {

		System.out.println("aillaaaa");
		String concatinatedString = cartlist.stream().map(String::valueOf).collect(Collectors.joining(","));

		user = (User) request.getAttribute("user");
		LocalTime dateandtime = java.time.LocalTime.now();
		Double sum = 0.0;
		for (SalesPerson sp : SalesPerson) {
			sum = sum + sp.getRate();

		}

		LocalDateTime localDateTime = LocalDateTime.now();
		EndOrder endOrder = new EndOrder();
		endOrder.setCustomerId(user.getId());

		endOrder.setDate(localDateTime);
		endOrder.setTotal(sum);
		endOrder.setSalesPersonList(SalesPerson);

		endOrderRepo.save(endOrder);

		return "ordersuccessful";
	}

	@GetMapping(path = "/previousorder")
	private String previousorder(HttpSession request) {

		user = (User) request.getAttribute("user");
		List<EndOrder> endorder = endOrderRepo.findAllByCustomerId(user.getId());
		System.out.println(endorder);
		/*
		 * endOrder.setCustomerId(user.getId());
		 * endOrder.setSaleperson(concatinatedString); endOrderRepo.save(endOrder);
		 */

		return "previousorder";
	}

	private void findAllByCustomerId(Long id) {
		// TODO Auto-generated method stub

	}

	@GetMapping(path = "/userdashboard")
	private String returnhome() {
		return "userdashboard";

	}

	@GetMapping(path = "/viewCart")
	public ModelAndView viewCart(HttpSession request) {
		user = (User) request.getAttribute("user"); 
		List<SalesPerson> saleperson=new ArrayList<>();
		List<Cart> list=cartRepo.findByUserId(user.getId()); 
		for (Cart cart : list) {
			for (SalesPerson sp : cart.getSalesPersonList()) {
				saleperson.add(sp);
				System.out.println( sp);
				System.out.println("===========hello===========");

			}

		}
		mdlview.addObject("salesPersonlist",saleperson);
		mdlview.setViewName("delfromcart");

		return mdlview;



	}


}
