package com.koottam.supplyco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koottam.supplyco.entity.StockCategoryEntity;

public interface StockCategoryRepository extends JpaRepository<StockCategoryEntity, Long> {

	void deleteBystockCatId(Long id);
}