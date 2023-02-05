package com.koottam.supplyco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

	@Query("SELECT customerCatName FROM CustomerCategoryEntity")
	List<String> getCategoryName();

	@Query("SELECT customerCatId FROM CustomerCategoryEntity c WHERE c.customerCatName = :name")
	Long findBycustomerCatName(String name);

	@Query("FROM AddressEntity a WHERE a.addrId = :id")
	List<AddressEntity> getAddress(long id);

	CustomerEntity findBycustomerId(Long customerId);

	@Modifying
	@Query("UPDATE CustomerEntity c SET c.customerName =:name, c.customerPassword =:pass WHERE c.customerId = :id")
	void updateCustomer(String name, String pass, Long id);

	public void deleteBycustomerId(Long id);

}
