package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.StockCategoryEntity;
import com.koottam.supplyco.service.StockCategoryService;

@Controller
public class StockCategoryController {

	@Autowired
	StockCategoryService stockCategoryService;

	@GetMapping("/viewStockCategory")
	public String viewStockCategory(Model model) {
		List<StockCategoryEntity> list = stockCategoryService.getAllCategory();
		model.addAttribute("list", list);
		return "AddStockCategory";
	}

	@PostMapping("/addStockCategory")
	public String addStockCategory(@RequestParam String stockCategoryName) {
		StockCategoryEntity stockCategoryEntity = new StockCategoryEntity(stockCategoryName);
		stockCategoryService.saveStockCategory(stockCategoryEntity);
		return "redirect:/viewStockCategory";
	}

	@GetMapping("/deleteStockCategory/{stockCatId}")
	public String deleteCategory(@PathVariable Long stockCatId) {
		stockCategoryService.removeCategory(stockCatId);
		return "redirect:/viewStockCategory";

	}
}