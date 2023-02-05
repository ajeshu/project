package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.ItemEntity;
import com.koottam.supplyco.repository.ItemRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	public List<String> getStCat() {
		return itemRepository.getAllStCat();
	}

	public List<ItemEntity> getAllItems() {
		return itemRepository.findAll();
	}

	public void saveItem(ItemEntity itemEntity) {
		itemRepository.save(itemEntity);
	}

	public void removeItem(Long id) {
		itemRepository.deleteByitemId(id);
	}
}