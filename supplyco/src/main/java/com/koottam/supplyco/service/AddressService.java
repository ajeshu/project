package com.koottam.supplyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.repository.AddressRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	public void saveAddress(AddressEntity addressEntity) {
		try {
			addressRepository.save(addressEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/////////////////////
	public AddressEntity getAddressId() {

		List<AddressEntity> addressEntity = addressRepository.findAll();
		int lastIndex = addressEntity.size();
		return addressEntity.get(lastIndex - 1);

	}
	////////////////////////////
}