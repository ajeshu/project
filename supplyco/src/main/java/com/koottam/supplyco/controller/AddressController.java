package com.koottam.supplyco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.UserEntity;
import com.koottam.supplyco.service.AddressService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AddressController {
	long addId;
	@Autowired
	AddressService addressService;

	@GetMapping("/addressForm")
	public String address() {
		return "AddressForm";
	}

	@GetMapping("/custAddressForm")
	public String custAddress() {
		return "CustomerAddressForm";
	}

	@PostMapping("/addAddress")
	public String addAddress(@RequestParam String houseName, @RequestParam String street,
			@RequestParam String postOffice, @RequestParam String district, @RequestParam String state,
			@RequestParam String country, @RequestParam String pinCode) {
		AddressEntity addressEntity = new AddressEntity(houseName, street, postOffice, district, state, country,
				pinCode);

		addressService.saveAddress(addressEntity);
		// return "redirect:/showCategory";
		return "redirect:/getAid";

	}

	//////////////////////////////
	@GetMapping("/getAid")
	public String getId() {
		long addId = addressService.getAddressId().getAddrId();
		this.addId = addId;
		return "redirect:/showCategory";
	}
	///////////////////////////////////////////

	@PostMapping("/addCustAddress")
	public String addCustAddress(@RequestParam String houseName, @RequestParam String street,
			@RequestParam String postOffice, @RequestParam String district, @RequestParam String state,
			@RequestParam String country, @RequestParam String pinCode) {
		AddressEntity addressEntity = new AddressEntity(houseName, street, postOffice, district, state, country,
				pinCode);

		addressService.saveAddress(addressEntity);
		// return "redirect:/showCategory";
		return "redirect:/getAddid";

	}

	@GetMapping("/getAddid")
	public String getAId() {
		long addId = addressService.getAddressId().getAddrId();
		this.addId = addId;
		return "redirect:/showCustCategory";
	}

	@GetMapping("/goBackAdd")
	public String goBackAdd(Model model, HttpServletRequest request) {
		UserEntity user = (UserEntity) request.getSession().getAttribute("user");
		model.addAttribute("user", user);
		if (user.getUserType().equals("Admin")) {
			return "AdminHome";
		} else {
			return "BackOfficeHome";
		}
	}
}
