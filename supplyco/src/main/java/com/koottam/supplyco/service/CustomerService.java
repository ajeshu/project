package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.CustomerEntity;
import com.koottam.supplyco.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<String> getCustCatName() {
		return customerRepository.getCategoryName();
	}

	public Long getCustCatId(String categoryName) {
		long customerCategoryId = customerRepository.findBycustomerCatName(categoryName);
		return customerCategoryId;
	}

	public void saveCustomer(CustomerEntity customerEntity) {

		try {
			customerRepository.save(customerEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<CustomerEntity> showCustomer() {
		return customerRepository.findAll();

	}

	public List<AddressEntity> fetchCustAddress(Long id) {
		return customerRepository.getAddress(id);
	}

	public CustomerEntity fetchCustomer(long customerId) {
		return customerRepository.findBycustomerId(customerId);
	}

	public void editCustDetails(Long id, String name, String pass) {
		customerRepository.updateCustomer(name, pass, id);
		;
	}

	public void removeCustomer(Long id) {
		customerRepository.deleteBycustomerId(id);
	}

}