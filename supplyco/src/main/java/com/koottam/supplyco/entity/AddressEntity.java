package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addr_id")
	private long addrId;

	@Column(name = "addr_House_Name")
	private String houseName;

	@Column(name = "addr_Street")
	private String street;
	
	@Column(name = "addr_PostOffice")
	private String postoffice;

	@Column(name = "addr_District")
	private String district;

	@Column(name = "addr_State")
	private String state;
	
	@Column(name = "addr_Country")
	private String country;
	
	@Column(name = "Pin_Code")
	private String pinCode;
	
	public AddressEntity () {
		
	}
	public AddressEntity(String houseName, String street, String postOffice, String district, String state, String country, String pinCode) {
		this.houseName= houseName;
		this.street= street;
		this.postoffice= postOffice;
		this.district= district;
		this.state= state;
		this.country= country;
		this.pinCode= pinCode;
	}

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostoffice() {
		return postoffice;
	}

	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "AddressEntity [houseName=" + houseName + ", street=" + street + ", postoffice="
				+ postoffice + ", district=" + district + ", state=" + state + ", country=" + country + ", pinCode="
				+ pinCode + "]";
	}




}
