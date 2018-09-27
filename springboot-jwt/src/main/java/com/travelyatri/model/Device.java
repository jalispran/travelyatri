package com.travelyatri.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger deviceId;
	
	private String osName;
	
	private String versionNo;

	private String fcmId;
	
	private String modelNameNo;

	private String imeiNumber;

	public BigInteger getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getFcmId() {
		return fcmId;
	}

	public void setFcmId(String fcmId) {
		this.fcmId = fcmId;
	}

	public String getModelNameNo() {
		return modelNameNo;
	}

	public void setModelNameNo(String modelNameNo) {
		this.modelNameNo = modelNameNo;
	}

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNUmber) {
		this.imeiNumber = imeiNUmber;
	}

	@Override
	public String toString() {
		return "Device [osName=" + osName + ", versionNo=" + versionNo + ", fcmId=" + fcmId + ", modelNameNo="
				+ modelNameNo + ", imeiNUmber=" + imeiNumber + "]";
	}
	
}

