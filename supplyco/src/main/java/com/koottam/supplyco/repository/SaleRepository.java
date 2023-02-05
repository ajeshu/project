package com.koottam.supplyco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.SaleEntity;

public interface SaleRepository extends JpaRepository<SaleEntity, Long> {

	@Query("SELECT vName FROM VendorEntity")
	List<String> getVendor();

	@Query("SELECT customerName FROM CustomerEntity")
	List<String> getCustomer();

	void deleteBysaleId(Long id);
}