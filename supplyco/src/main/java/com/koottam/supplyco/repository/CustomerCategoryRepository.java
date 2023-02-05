package com.koottam.supplyco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.CustomerCategoryEntity;

public interface CustomerCategoryRepository extends JpaRepository<CustomerCategoryEntity, Long> {
	public CustomerCategoryEntity findBycustomerCatId(Long id);

	@Modifying
	@Query("UPDATE CustomerCategoryEntity c SET c.customerCatName =:name WHERE c.customerCatId = :id")
	void updateCategory(Long id, String name);

	void deleteBycustomerCatId(Long id);

}