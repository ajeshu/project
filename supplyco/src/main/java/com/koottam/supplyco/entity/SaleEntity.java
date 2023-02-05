package com.koottam.supplyco.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sale")
public class SaleEntity {

	@Id
	@Column(name = "sale_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long saleId;

	@Column(name = "ve_name")
	private String veName;

	@Column(name = "cust_name")
	private String customerName;

	@Column(name = "sale_amount")
	private float saleAmount;

	@Column(name = "sale_qty")
	private int saleQuantity;

	@Column(name = "sale_date")
	private Date date;

	public SaleEntity() {

	}

	public SaleEntity(String veName, String customerName, float saleAmount, int saleQuantity, Date date) {
		this.veName = veName;
		this.customerName = customerName;
		this.saleAmount = saleAmount;
		this.saleQuantity = saleQuantity;
		this.date = date;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public String getVeName() {
		return veName;
	}

	public void setVeName(String veName) {
		this.veName = veName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(float saleAmount) {
		this.saleAmount = saleAmount;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SaleEntity [veName=" + veName + ", customerName=" + customerName + ", saleAmount=" + saleAmount
				+ ", saleQuantity=" + saleQuantity + ", date=" + date + "]";
	}
}
