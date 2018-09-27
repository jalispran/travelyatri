package com.travelyatri.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "password")
public class Password {

	@Id
	private String userIdEncryp;
	private String passEncryp;
	public String getUserIdEncryp() {
		return userIdEncryp;
	}
	public void setUserIdEncryp(String userIdEncryp) {
		this.userIdEncryp = userIdEncryp;
	}
	public String getPassEncryp() {
		return passEncryp;
	}
	public void setPassEncryp(String passEncryp) {
		this.passEncryp = passEncryp;
	}
	@Override
	public String toString() {
		return "Password [userIdEncryp=" + userIdEncryp + ", passEncryp=" + passEncryp + "]";
	}
	
}
