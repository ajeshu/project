package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.CustomerEntity;
import com.koottam.supplyco.entity.UserEntity;
import com.koottam.supplyco.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	AddressController addressController;

	@GetMapping("/showCustCategory")
	public String getVendorCategoryName(Model model) {
		List<String> list = customerService.getCustCatName();
		model.addAttribute("list", list);
		return "AddCustomer";
	}

	@PostMapping("/addCustomer")
	public String AddCustomer(@RequestParam String categoryName, @RequestParam String customerName,
			@RequestParam String customerPassword, @RequestParam String customerType, HttpServletRequest request,
			Model model) {
		long addrId = addressController.addId;
		long catId = customerService.getCustCatId(categoryName);
		CustomerEntity customerEntity = new CustomerEntity(catId, addrId, customerName, customerPassword, customerType);
		customerService.saveCustomer(customerEntity);
		UserEntity user = (UserEntity) request.getSession().getAttribute("user");
		model.addAttribute("user", user);
		if (user.getUserType().equals("Admin")) {
			return "AdminHome";
		} else {
			return "BackOfficeHome";
		}

	}

	@GetMapping("/viewCustomer")
	public String viewCustomer(Model model) {
		List<CustomerEntity> list = customerService.showCustomer();
		model.addAttribute("list", list);
		return "ViewCustomer";
	}

	@GetMapping("/getCustomerAddress/{addressId}")
	public String getCustAddress(@PathVariable Long addressId, Model model) {
		List<AddressEntity> list = customerService.fetchCustAddress(addressId);
		model.addAttribute("list", list);
		return "ViewAddress";
	}

	@GetMapping("/getCustomer/{customerId}")
	public String findVendor(@PathVariable long customerId, Model model) {
		CustomerEntity customerEntity = customerService.fetchCustomer(customerId);
		model.addAttribute("customerEntity", customerEntity);
		return "EditCustomer";
	}

	@PostMapping("/editCustomer")
	public String editCustomer(@RequestParam Long customerId, @RequestParam String customerName,
			@RequestParam String password) {
		customerService.editCustDetails(customerId, customerName, password);
		return "redirect:/viewCustomer";

	}

	@GetMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable long customerId) {
		customerService.removeCustomer(customerId);
		return "redirect:/viewCustomer";
	}
}
