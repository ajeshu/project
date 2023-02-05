package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.CustomerCategoryEntity;
import com.koottam.supplyco.repository.CustomerCategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerCategoryService {

	@Autowired
	CustomerCategoryRepository customerCategoryRepository;

	public void addCategory(CustomerCategoryEntity customerCategoryEntity) {
		customerCategoryRepository.save(customerCategoryEntity);
	}

	public List<CustomerCategoryEntity> getCategoryList() {
		return customerCategoryRepository.findAll();
	}

	public String getCategoryById(Long id) {
		CustomerCategoryEntity customerCategoryEntity = customerCategoryRepository.findBycustomerCatId(id);
		return customerCategoryEntity.getCustomerCatName();
	}

	public void editCategory(Long id, String name) {
		customerCategoryRepository.updateCategory(id, name);
	}

	public void deleteCategory(Long id) {
		customerCategoryRepository.deleteBycustomerCatId(id);
	}

}