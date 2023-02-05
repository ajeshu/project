package com.koottam.supplyco.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.SaleEntity;
import com.koottam.supplyco.service.SaleService;

@Controller
public class SaleController {

	@Autowired
	SaleService saleService;

	@GetMapping("/addSale")
	public String addSale(Model model) {
		List<String> list = saleService.getVendorName();
		model.addAttribute("list", list);
		List<String> lists = saleService.getCustomerName();
		model.addAttribute("lists", lists);
		return "AddSale";
	}

	@PostMapping("/saveSale")
	public String saveSale(@RequestParam String vendorName, @RequestParam String customerName,
			@RequestParam float saleAmount, @RequestParam int saleQuantity, @RequestParam Date date) {
		SaleEntity saleEntity = new SaleEntity(vendorName, customerName, saleAmount, saleQuantity, date);
		saleService.saveSaleDetails(saleEntity);
		return "redirect:/viewSale";
	}

	@GetMapping("/viewSale")
	public String viewSale(Model model) {
		List<SaleEntity> list = saleService.getSaleDetails();
		model.addAttribute("list", list);
		return "ViewSale";
	}

	@GetMapping("/deleteSale/{saleId}")
	public String deleteSale(@PathVariable Long saleId) {
		saleService.removeSale(saleId);
		return "redirect:/viewSale";
	}
}
