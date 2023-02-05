package com.koottam.supplyco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.AddressEntity;
import com.koottam.supplyco.entity.VendorEntity;

public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

	@Query("SELECT vendorCategoryName FROM VendorCategoryEntity")
	List<String> getCategoryName();

	@Query("SELECT vendorCategoryId FROM VendorCategoryEntity v WHERE v.vendorCategoryName = :name")
	Long findByvendorCategoryName(String name);

	@Query("FROM AddressEntity a WHERE a.addrId = :id")
	List<AddressEntity> fetchAddress(long id);

	VendorEntity findByvId(Long vId);

	@Modifying
	@Query("UPDATE VendorEntity v SET v.vName =:name, v.vPass =:pass WHERE v.vId = :id")
	void updateVendor(String name, String pass, Long id);

	public void deleteByvId(Long id);
}