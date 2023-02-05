package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.VendorCategoryEntity;
import com.koottam.supplyco.repository.VendorCategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VendorCategoryService {

	@Autowired
	VendorCategoryRepository vendorCategoryRepository;

	public void savevendorCategory(VendorCategoryEntity vendorCategoryEntity) {
		try {
			vendorCategoryRepository.save(vendorCategoryEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<VendorCategoryEntity> getAllVendorCategory() {

		List<VendorCategoryEntity> list = vendorCategoryRepository.findAll();
		return list;

	}

	public String getCategoryById(Long vendorCategoryId) {
		VendorCategoryEntity category = vendorCategoryRepository.findByvendorCategoryId(vendorCategoryId);
		return category.getVendorCategoryName();
	}

	public void editVeCategory(Long id, String name) {
		try {
			vendorCategoryRepository.updateCategory(id, name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void removeVeCategory(Long id) {
		vendorCategoryRepository.deleteById(id);
	}
}