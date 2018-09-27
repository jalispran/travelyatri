package com.travelyatri.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.travelyatri.app.codes.Travelyatri;

@Entity
@Table(name = "userRole")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger userRoleId;
	private BigInteger userId;
	private String roleCode;
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(Travelyatri.RoleCode roleCode) {
		this.roleCode = roleCode.getCode();
	}
	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", roleCode=" + roleCode + "]";
	}
	
}
