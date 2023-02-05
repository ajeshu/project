package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Item")
public class ItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "it_id")
	private Long itemId;

	@Column(name = "it_name")
	private String itemName;

	@Column(name = "s_cat_name")
	private String stockCatName;

	public ItemEntity() {

	}

	public ItemEntity(String itemName, String stockCatName) {
		this.itemName = itemName;
		this.stockCatName = stockCatName;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStockCatName() {
		return stockCatName;
	}

	public void setStockCatName(String stockCatName) {
		this.stockCatName = stockCatName;
	}

	@Override
	public String toString() {
		return "ItemEntity [itemName=" + itemName + ", stockCatName=" + stockCatName + "]";
	}

}
