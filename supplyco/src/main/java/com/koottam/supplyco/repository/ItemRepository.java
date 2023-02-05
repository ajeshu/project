package com.koottam.supplyco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.koottam.supplyco.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

	@Query("SELECT stockCatName FROM StockCategoryEntity")
	List<String> getAllStCat();

	void deleteByitemId(Long id);
}