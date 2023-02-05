package com.koottam.supplyco.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendor")
public class VendorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ve_id")
	private long vId;
	
	@Column(name = "add_id")
	private long addId;
	
	@Column(name = "ve_cat_id")
	private long catId;
	
	@Column(name = "ve_name")
	private String vName;
	
	@Column(name = "ve_pass")
	private String vPass;
	
	@Column(name = "ve_usertype")
	private String vType;
	
	public VendorEntity() {
		
	}

	public VendorEntity(long addId, long catId, String vName, String vPass, String vType) {
		this.addId = addId;
		this.catId = catId;
		this.vName = vName;
		this.vPass = vPass;
		this.vType = vType;
	}
	
	public long getvId() {
		return vId;
	}

	public void setvId(long vId) {
		this.vId = vId;
	}

	public long getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public long getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvPass() {
		return vPass;
	}

	public void setvPass(String vPass) {
		this.vPass = vPass;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}



	@Override
	public String toString() {
		return "VendorEntity [vId=" + vId + ", addId=" + addId + ", catId=" + catId + ", vName=" + vName + ", vPass="
				+ vPass + ", vType=" + vType + "]";
	}


}
