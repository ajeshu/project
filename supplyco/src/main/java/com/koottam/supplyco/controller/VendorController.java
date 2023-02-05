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
import com.koottam.supplyco.entity.UserEntity;
import com.koottam.supplyco.entity.VendorEntity;
import com.koottam.supplyco.service.VendorService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class VendorController {

	@Autowired
	VendorService vendorService;

	@Autowired
	AddressController addressController;

	@PostMapping("/addVendor")
	public String AddVendor(@RequestParam String categoryName, @RequestParam String vendorName,
			@RequestParam String vendorPassword, @RequestParam String vendorType, HttpServletRequest request,
			Model model) {
		long addrId = addressController.addId;
		long catId = vendorService.getCatId(categoryName);
		VendorEntity vendorEntity = new VendorEntity(addrId, catId, vendorName, vendorPassword, vendorType);
		vendorService.saveVendor(vendorEntity);
		UserEntity user = (UserEntity) request.getSession().getAttribute("user");
		model.addAttribute("user", user);
		if (user.getUserType().equals("Admin")) {
			return "AdminHome";
		} else {
			return "BackOfficeHome";
		}

	}

	@GetMapping("/showCategory")
	public String getVendorCategoryName(Model model) {
		List<String> list = vendorService.getVeCatName();
		model.addAttribute("list", list);
		return "AddVendor";
	}

	@GetMapping("/viewVendor")
	public String viewVendors(Model model) {
		List<VendorEntity> list = vendorService.showVendor();
		model.addAttribute("list", list);
		return "ViewVendor";
	}

	@GetMapping("/getAddress/{addId}")
	public String getVendorAdd(@PathVariable long addId, Model model) {
		List<AddressEntity> list = vendorService.getAddress(addId);
		model.addAttribute("list", list);
		return "ViewAddress";
	}

	@GetMapping("/getVendor/{vId}")
	public String findVendor(@PathVariable long vId, Model model) {
		VendorEntity vendorEntity = vendorService.fetchVendor(vId);
		model.addAttribute("vendorEntity", vendorEntity);
		return "EditVendor";
	}

	@PostMapping("/editVendor")
	public String editVendor(@RequestParam Long vendorId, @RequestParam String vendorName,
			@RequestParam String password) {
		vendorService.editVDetails(vendorId, vendorName, password);
		return "redirect:/viewVendor";

	}

	@GetMapping("/deleteVendor/{vId}")
	public String deleteVendor(@PathVariable long vId) {
		vendorService.removeVendor(vId);
		return "redirect:/viewVendor";
	}

}