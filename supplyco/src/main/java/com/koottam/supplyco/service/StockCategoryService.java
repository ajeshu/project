package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.StockCategoryEntity;
import com.koottam.supplyco.repository.StockCategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StockCategoryService {

	@Autowired
	StockCategoryRepository stockCategoryRepository;

	public void saveStockCategory(StockCategoryEntity stockCategoryEntity) {
		try {
			stockCategoryRepository.save(stockCategoryEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<StockCategoryEntity> getAllCategory() {
		return stockCategoryRepository.findAll();
	}

	public void removeCategory(Long id) {
		stockCategoryRepository.deleteBystockCatId(id);
	}
}