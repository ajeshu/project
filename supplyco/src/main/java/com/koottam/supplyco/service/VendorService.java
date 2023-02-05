package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.VendorEntity;
import com.koottam.supplyco.repository.VendorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VendorService {

	@Autowired
	VendorRepository vendorRepository;

	public List<String> getVeCatName() {
		return vendorRepository.getCategoryName();
	}

	public Long getCatId(String categoryName) {
		long vendorCategoryId = vendorRepository.findByvendorCategoryName(categoryName);
		return vendorCategoryId;
	}

	public void saveVendor(VendorEntity vendorEntity) {
		try {
			vendorRepository.save(vendorEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<VendorEntity> showVendor() {
		return vendorRepository.findAll();

	}

	public List<AddressEntity> getAddress(long addId) {
		return vendorRepository.fetchAddress(addId);
	}

	public VendorEntity fetchVendor(long vId) {
		return vendorRepository.findByvId(vId);
	}

	public void editVDetails(Long id, String name, String pass) {
		vendorRepository.updateVendor(name, pass, id);
	}

	public void removeVendor(Long id) {
		vendorRepository.deleteByvId(id);
	}

}