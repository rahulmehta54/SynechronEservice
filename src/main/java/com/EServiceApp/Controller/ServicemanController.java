package com.EServiceApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EServiceApp.Service.AddressService;
import com.EServiceApp.Service.CategoryService;
import com.EServiceApp.Service.CityService;
import com.EServiceApp.Service.ServicemanService;
import com.EServiceApp.Service.StateService;
import com.EServiceApp.entity.Address;
import com.EServiceApp.entity.Category;
import com.EServiceApp.entity.Serviceman;

@Controller
public class ServicemanController {

	@Autowired
	private ModelAndView mdlview;

	@Autowired
	private ServicemanService servicemanServ;

	@Autowired
	private Serviceman serviceman;

	@Autowired
	private Address address;

	@Autowired
	private Category category;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private CityService cityService;

	@Autowired
	private StateService stateService;

	/**********************************************
	 * Add Serviceman
	 ************************************************************/

	@GetMapping(path = "/addServiceman")
	public String addServiceman(Model model) {
		model.addAttribute("command", serviceman);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		// model.addAttribute("AddressList", addressService.findAll());
		model.addAttribute("cityList", cityService.findAll());
		model.addAttribute("stateList", stateService.findAll());
		model.addAttribute("serviceMan", serviceman);

		return "addServiceman";
	}

	@PostMapping(path = "/addServiceman")
	public String addServiceman(@ModelAttribute("command") Serviceman serviceman) {

		System.out.println("city" + serviceman.getsAddress().getCity());
		System.out.println("city" + serviceman.getsAddress().getState());

		serviceman.getsAddress().setCity(cityService.findById(serviceman.getsAddress().getCity().getId()));
		serviceman.getsAddress().setState(stateService.findById(serviceman.getsAddress().getState().getId()));
		serviceman.setStatus(1);
		serviceman.setsAddress(addressService.saveAddress(serviceman.getsAddress()));

		servicemanServ.addServiceman(serviceman);

		return "dashboard";
	}

	/**********************************************
	 * view serviceman
	 ************************************************************/

	@GetMapping("/viewServiceman")
	public ModelAndView viewCategory() {
		mdlview.setViewName("viewServiceman");
		mdlview.addObject("servicemanList", servicemanServ.findByStatus(1));
		System.out.println("list------------------------------" + servicemanServ.findByStatus(1).get(0).getsEmail());
		return mdlview;
	}
	
	
	/**********************************************
	 * view serviceman for user
	 ************************************************************/

	@GetMapping("/viewServiceman2")
	public ModelAndView viewCategory2() {
		mdlview.setViewName("viewServiceman2");
		mdlview.addObject("servicemanList", servicemanServ.findByStatus(1));
		System.out.println("list------------------------------" + servicemanServ.findByStatus(1).get(0).getsEmail());
		return mdlview;
	}

	/**********************************************
	 * update serviceman
	 ************************************************************/

	@GetMapping(path = "/updateServiceman")
	public String updatecategory(Model model, @RequestParam("sid") long sid) {

		serviceman = servicemanServ.findById(sid);
		System.out.println("address=" + serviceman.getsAddress());

		model.addAttribute("serviceMan", serviceman);

		model.addAttribute("command", serviceman);
		model.addAttribute("categoryList", categoryService.findByStatus(1));
		// model.addAttribute("AddressList", addressService.findAll());
		model.addAttribute("cityList", cityService.findAll());
		model.addAttribute("stateList", stateService.findAll());

		return "addServiceman";

	}

	/**********************************************
	 * delete serviceman
	 ************************************************************/

	@GetMapping(path = "deleteServiceman")
	public String deleteServiceman(Model model, @RequestParam("sid") long sid) {
		servicemanServ.deleteById(0, sid);
		model.addAttribute("sid", sid);
		model.addAttribute("command", serviceman);
		model.addAttribute("servicemanList", servicemanServ.findByStatus(1));
		return "viewServiceman";

	}

}
