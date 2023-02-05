package com.koottam.supplyco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.koottam.supplyco.entity.VendorCategoryEntity;

public interface VendorCategoryRepository extends JpaRepository<VendorCategoryEntity, Long> {

	VendorCategoryEntity findByvendorCategoryId(long vendorCategoryId);

	@Modifying
	@Query("UPDATE VendorCategoryEntity v SET v.vendorCategoryName =:name WHERE v.vendorCategoryId = :id")
	void updateCategory(@Param("id") Long id, @Param("name") String name);

	void deleteByvendorCategoryId(Long id);

}