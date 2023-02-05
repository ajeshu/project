package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.CustomerCategoryEntity;
import com.koottam.supplyco.service.CustomerCategoryService;

@Controller
public class CustomerCategoryController {

	@Autowired
	CustomerCategoryService customerCategoryService;

	@GetMapping("/customerCategory")
	public String viewCategory(Model model) {
		List<CustomerCategoryEntity> list = customerCategoryService.getCategoryList();
		model.addAttribute("list", list);
		return "CustomerCategory";
	}

	@PostMapping("/addCustomerCategory")
	public String addCustomerCategory(@RequestParam String customerCategoryName) {
		CustomerCategoryEntity customerCategoryEntity = new CustomerCategoryEntity(customerCategoryName);
		customerCategoryService.addCategory(customerCategoryEntity);
		return "redirect:/customerCategory";
	}

	@GetMapping("/getCusCategoryName/{customerCatId}")
	public String getCustCategoryName(@PathVariable long customerCatId, Model model) {
		String categoryName = customerCategoryService.getCategoryById(customerCatId);
		model.addAttribute("categoryId", customerCatId);
		model.addAttribute("categoryName", categoryName);
		return "EditCustomerCategory";

	}

	@PostMapping("/editCustomerCategory")
	public String editCustCategory(@RequestParam Long categoryId, @RequestParam String categoryName) {
		customerCategoryService.editCategory(categoryId, categoryName);
		return "redirect:/customerCategory";

	}

	@GetMapping("deleteCustomerCategory/{customerCatId}")
	public String deleteCustCategory(@PathVariable Long customerCatId) {
		customerCategoryService.deleteCategory(customerCatId);
		return "redirect:/customerCategory";
	}
}