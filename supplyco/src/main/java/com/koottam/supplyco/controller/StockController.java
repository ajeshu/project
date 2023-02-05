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

import com.koottam.supplyco.entity.StockEntity;
import com.koottam.supplyco.service.StockService;

@Controller
public class StockController {

	@Autowired
	StockService stockService;

	@PostMapping("/addStock")
	public String addStock(@RequestParam String vendorName, @RequestParam String invoiceNo, @RequestParam Date date) {
		StockEntity stockEntity = new StockEntity(vendorName, invoiceNo, date);
		stockService.saveStock(stockEntity);
		return "redirect:/viewStock";

	}

	@GetMapping("/viewStock")
	public String viewStock(Model model) {
		List<String> lists = stockService.getVendor();
		model.addAttribute("lists", lists);
		List<StockEntity> list = stockService.getStockDetails();
		model.addAttribute("list", list);
		return "AddStock";
	}

	@GetMapping("/deleteStock/{stockId}")
	public String deleteStock(@PathVariable Long stockId) {
		stockService.removeStock(stockId);
		return "redirect:/viewStock";
	}

}