package com.travelyatri.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apCodeList")
public class CodeList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger keyId;

	private String codeListType;
	
	private String codeValue;
	
	private String codeDesc;

	public BigInteger getKeyId() {
		return keyId;
	}

	public void setKeyId(BigInteger keyId) {
		this.keyId = keyId;
	}

	public String getCodeListType() {
		return codeListType;
	}

	public void setCodeListType(String codeListType) {
		this.codeListType = codeListType;
	}

	public String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	@Override
	public String toString() {
		return "CodeList [keyId=" + keyId + ", codeListType=" + codeListType + ", codeValue=" + codeValue
				+ ", codeDesc=" + codeDesc + "]";
	}
	
}
