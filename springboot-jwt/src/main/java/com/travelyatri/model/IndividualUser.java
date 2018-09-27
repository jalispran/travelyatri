package com.travelyatri.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "individualUser")
public class IndividualUser {

	@Id
	private BigInteger userId;
	
	private String title;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private BigInteger profilePicId;
	
	private String gender;
	
	private Date dateOfBirth;
	
	private String occupation;
	
	private String salarySlab;
	
	private BigInteger addressId;
	
	private BigInteger deviceID;
	
	private Double currentLat;
	
	private Double currentLong;
	
	private String NriYN;
	
	public IndividualUser() {
		NriYN = "N";
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigInteger getProfilePicId() {
		return profilePicId;
	}

	public void setProfilePicId(BigInteger profilePicId) {
		this.profilePicId = profilePicId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSalarySlab() {
		return salarySlab;
	}

	public void setSalarySlab(String salarySlab) {
		this.salarySlab = salarySlab;
	}

	public BigInteger getAddressId() {
		return addressId;
	}

	public void setAddressId(BigInteger addressId) {
		this.addressId = addressId;
	}

	public BigInteger getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(BigInteger deviceID) {
		this.deviceID = deviceID;
	}

	public Double getCurrentLat() {
		return currentLat;
	}

	public void setCurrentLat(Double currentLat) {
		this.currentLat = currentLat;
	}

	public Double getCurrentLong() {
		return currentLong;
	}

	public void setCurrentLong(Double currentLong) {
		this.currentLong = currentLong;
	}

	public String getNriYN() {
		return NriYN;
	}

	public void setNriYN(String nriYN) {
		NriYN = nriYN;
	}

	@Override
	public String toString() {
		return "IndividualUser [userId=" + userId + ", title=" + title + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", profilePicId=" + profilePicId + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", occupation=" + occupation + ", salarySlab=" + salarySlab
				+ ", addressId=" + addressId + ", deviceID=" + deviceID + ", currentLat=" + currentLat
				+ ", currentLong=" + currentLong + ", NriYN=" + NriYN + "]";
	}
	
	
}
