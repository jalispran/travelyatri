package com.travelyatri.util;

import java.math.BigInteger;
import java.util.Date;

import com.travelyatri.app.codes.Travelyatri;
import com.travelyatri.exception.InvalidInputFormatException;
import com.travelyatri.model.Device;
import com.travelyatri.model.User;

/**
 * @author Pranjal
 *
 */
public class Input {

	private SessionData sData;
	private User user;
	private Device device;
	private BigInteger deviceId;
	private String state;
	private String mobileNumber;
	private String password;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String countryCode;
	private String languageCode;
	private Date dob;
	private String gender;
	private String occupation;
	private String salarySlab;
	
	public SessionData getsData() {
		if(sData != null)
			return sData;
		else throw new InvalidInputFormatException("please provide sData");
	}
  
	public void setsData(SessionData sData) {
		this.sData = sData;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Device getDevice() {
		if(device != null)
			return device;
		throw new InvalidInputFormatException("Please provide device details");
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public BigInteger getDeviceId() {
		if(deviceId != null)
			return deviceId;
		throw new InvalidInputFormatException("Please provide deviceId"); 
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public String getState() {
		return state;
	}

	public String getMobileNumber() {
		if(mobileNumber != null)
			return mobileNumber;
		throw new InvalidInputFormatException("Please provide mobileNumber");
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		if(password != null)
			return password;
		throw new InvalidInputFormatException("Please provide password");
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		if(firstName != null)
			return firstName;
		throw new InvalidInputFormatException("Please provide firstName");
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

	public String getEmailId() {
		if(emailId != null)
			return emailId;
		throw new InvalidInputFormatException("Please provide emailId");
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountryCode() {
		if(countryCode != null)
			return countryCode;
		else return Travelyatri.CountryCode.INDIA.getCode();
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguageCode() {
		if(languageCode != null)
			return languageCode;
		else return Travelyatri.LanguageCode.ENGLISH.getCode();
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Input [sData=" + sData + ", device=" + device + "]";
	}
	
}
