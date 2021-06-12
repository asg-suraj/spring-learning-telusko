package com.suraj.springmvcboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	
	 public Alien() {
	
	 }
		
	

	@Id
	private int aId;
	private String aName;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "[aId=" + aId + ", aName=" + aName + "]";
	}
	public Alien(int aId, String aName) {
		this.aId = aId;
		this.aName = aName;
	}
	
	
	
	
}
