package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.SaleEntity;
import com.koottam.supplyco.repository.SaleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SaleService {

	@Autowired
	SaleRepository saleRepository;

	public List<String> getVendorName() {
		return saleRepository.getVendor();
	}

	public List<String> getCustomerName() {
		return saleRepository.getCustomer();
	}

	public List<SaleEntity> getSaleDetails() {
		return saleRepository.findAll();
	}

	public void saveSaleDetails(SaleEntity saleEntity) {
		saleRepository.save(saleEntity);
	}

	public void removeSale(Long id) {
		saleRepository.deleteBysaleId(id);
	}
}