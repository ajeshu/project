package com.koottam.supplyco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Long>{

	@Query("SELECT vName FROM VendorEntity")
	List<String> getVendorName();
	
	void deleteBystockId(Long id);
}