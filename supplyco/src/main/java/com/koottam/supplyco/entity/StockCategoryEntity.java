package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock_Category")
public class StockCategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_cat_id")
	private long stockCatId;

	@Column(name = "s_cat_name")
	private String stockCatName;

	public StockCategoryEntity() {
	}

	public StockCategoryEntity(String stockCatName) {
		this.stockCatName = stockCatName;
	}

	public long getStockCatId() {
		return stockCatId;
	}

	public void setStockCatId(long stockCatId) {
		this.stockCatId = stockCatId;
	}

	public String getStockCatName() {
		return stockCatName;
	}

	public void setStockCatName(String stockCatName) {
		this.stockCatName = stockCatName;
	}

	@Override
	public String toString() {
		return "StockCategoryEntity [stockCatName=" + stockCatName + "]";
	}

}
