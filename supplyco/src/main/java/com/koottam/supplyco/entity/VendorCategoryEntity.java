package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vendor_Category")
public class VendorCategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ve_cat_id")
	private long vendorCategoryId;

	@Column(name = "ve_cat_name")
	private String vendorCategoryName;

	public VendorCategoryEntity() {
		// TODO Auto-generated constructor stub
	}

	public VendorCategoryEntity(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
	}

	public long getVendorCategoryId() {
		return vendorCategoryId;
	}

	public void setVendorCategoryId(long vendorCategoryId) {
		this.vendorCategoryId = vendorCategoryId;
	}

	public String getVendorCategoryName() {
		return vendorCategoryName;
	}

	public void setVendorCategoryName(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
	}

	@Override
	public String toString() {
		return "VendorCategoryEntity [vendorCategoryId=" + vendorCategoryId + ", vendorCategoryName="
				+ vendorCategoryName + "]";
	}

}
