package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.StockEntity;
import com.koottam.supplyco.repository.StockRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StockService {

	@Autowired
	StockRepository stockRepository;

	public void saveStock(StockEntity stockEntity) {
		stockRepository.save(stockEntity);
	}

	public List<String> getVendor() {
		return stockRepository.getVendorName();
	}

	public List<StockEntity> getStockDetails() {
		return stockRepository.findAll();
	}

	public void removeStock(Long id) {
		stockRepository.deleteBystockId(id);
	}
}