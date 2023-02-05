package com.koottam.supplyco.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock")
public class StockEntity {

	@Id
	@Column(name = "st_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stockId;

	@Column(name = "ve_name")
	private String vendorName;

	@Column(name = "st_invoice_no")
	private String stockInvoice;

	@Column(name = "st_date")
	private Date date;

	public StockEntity() {

	}

	public StockEntity(String vendorName, String stockInvoice, Date date) {

		this.vendorName = vendorName;
		this.stockInvoice = stockInvoice;
		this.date = date;
	}

	public long getStockId() {
		return stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getStockInvoice() {
		return stockInvoice;
	}

	public void setStockInvoice(String stockInvoice) {
		this.stockInvoice = stockInvoice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StockEntity [vendorName=" + vendorName + ", stockInvoice=" + stockInvoice + ", date=" + date + "]";
	}
}
