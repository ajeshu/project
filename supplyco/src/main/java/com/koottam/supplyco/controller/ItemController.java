package com.koottam.supplyco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koottam.supplyco.entity.ItemEntity;
import com.koottam.supplyco.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("/viewItem")
	public String viewItem(Model model) {
		List<String> lists = itemService.getStCat();
		model.addAttribute("lists", lists);
		List<ItemEntity> list = itemService.getAllItems();
		model.addAttribute("list", list);
		return "AddItem";
	}

	@PostMapping("/addItem")
	public String addItem(@RequestParam String stockCategory, @RequestParam String itemName) {
		ItemEntity itemEntity = new ItemEntity(itemName, stockCategory);
		itemService.saveItem(itemEntity);
		return "redirect:/viewItem";
	}

	@GetMapping("/deleteItem/{itemId}")
	public String deleteItem(@PathVariable Long itemId) {
		itemService.removeItem(itemId);
		return "redirect:/viewItem";
	}
}
