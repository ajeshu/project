package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.VendorCategoryEntity;
import com.koottam.supplyco.service.VendorCategoryService;

@Controller
public class VendorCategoryController {

	@Autowired
	VendorCategoryService vendorCategoryService;

	@PostMapping("/addVendorCategory")
	public String addVendorCategory(@RequestParam String vendorCategoryName) {
		VendorCategoryEntity vendorCategoryEntity = new VendorCategoryEntity(vendorCategoryName);
		vendorCategoryService.savevendorCategory(vendorCategoryEntity);
		return "redirect:/vendorCategory";
	}

	@GetMapping("/vendorCategory")
	public String getVendorCategory(Model model) {
		List<VendorCategoryEntity> list = vendorCategoryService.getAllVendorCategory();
		model.addAttribute("list", list);
		return "VendorCategory";

	}

	@PostMapping("/editVendorCategory")
	public String editVeCategory(@RequestParam Long categoryId, @RequestParam String categoryName) {
		vendorCategoryService.editVeCategory(categoryId, categoryName);
		return "redirect:/vendorCategory";

	}

	@GetMapping("/getCategoryName/{vendorCategoryId}")
	public String getCategoryName(@PathVariable long vendorCategoryId, Model model) {
		String categoryName = vendorCategoryService.getCategoryById(vendorCategoryId);
		model.addAttribute("categoryId", vendorCategoryId);
		model.addAttribute("categoryName", categoryName);
		return "EditVendorCategory";

	}

	@GetMapping("/deleteVendorCategory/{vendorCategoryId}")
	public String deleteVeCategory(@PathVariable long vendorCategoryId) {
		vendorCategoryService.removeVeCategory(vendorCategoryId);
		return "redirect:/vendorCategory";

	}
}