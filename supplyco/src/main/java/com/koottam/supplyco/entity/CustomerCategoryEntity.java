package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_Category")
public class CustomerCategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_cat_id")
	private long customerCatId;

	@Column(name = "c_cat_name")
	private String customerCatName;

	public CustomerCategoryEntity() {
	}

	public CustomerCategoryEntity(String customerCatName) {

		this.customerCatName = customerCatName;
	}

	public long getCustomerCatId() {
		return customerCatId;
	}

	public void setCustomerCatId(long customerCatId) {
		this.customerCatId = customerCatId;
	}

	public String getCustomerCatName() {
		return customerCatName;
	}

	public void setCustomerCatName(String customerCatName) {
		this.customerCatName = customerCatName;
	}

	@Override
	public String toString() {
		return "CustomerCategoryEntity [customerCatId=" + customerCatId + ", customerCatName=" + customerCatName + "]";
	}
}
