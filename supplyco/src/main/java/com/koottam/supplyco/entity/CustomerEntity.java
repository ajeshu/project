package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id")
	private long customerId;

	@Column(name = "c_cat_id")
	private long customerCategoryId;

	@Column(name = "addr_id")
	private long addressId;

	@Column(name = "cust_name")
	private String customerName;

	@Column(name = "cust_password")
	private String customerPassword;

	@Column(name = "cust_userType")
	private String customerType;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(long customerCategoryId, long addressId, String customerName, String customerPassword,
			String customerType) {
		this.customerCategoryId = customerCategoryId;
		this.addressId = addressId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerType = customerType;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getCustomerCategoryId() {
		return customerCategoryId;
	}

	public void setCustomerCategoryId(long customerCategoryId) {
		this.customerCategoryId = customerCategoryId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "CustomerEntity [ customerCategoryId=" + customerCategoryId + ", addressId=" + addressId
				+ ", customerName=" + customerName + ", customerPassword=" + customerPassword + ", customerType="
				+ customerType + "]";
	}

}