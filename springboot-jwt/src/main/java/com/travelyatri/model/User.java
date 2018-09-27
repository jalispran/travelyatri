package com.travelyatri.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.travelyatri.app.codes.Travelyatri;

/**
 * Created by nydiarra on 06/05/17.
 */
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger userId;

	private String username;
	
	private String unameVerifiedYN;
	
	private String emailId;
	
	private String emailVerifiedYN;;
	
	private String userType;
	
	private String name;
	
	private Float rating;
	
	private Integer votes;
	
	private String countryCode;
	
	private String languageCode;
	
	public User() {
		unameVerifiedYN = "N";
		emailVerifiedYN = "N";
		rating = 0.0F;
		votes = 0;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUnameVerifiedYN() {
		return unameVerifiedYN;
	}

	public void setUnameVerifiedYN(String unameVerifiedYN) {
		this.unameVerifiedYN = unameVerifiedYN;
	}

	public String getEmailVerifiedYN() {
		return emailVerifiedYN;
	}

	public void setEmailVerifiedYN(String emailVerifiedYN) {
		this.emailVerifiedYN = emailVerifiedYN;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(Travelyatri.UserType userType) {
		this.userType = userType.getCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", unameVerifiedYN=" + unameVerifiedYN
				+ ", emailId=" + emailId + ", emailVerifiedYN=" + emailVerifiedYN + ", userType=" + userType + ", name="
				+ name + ", rating=" + rating + ", countryCode=" + countryCode + ", languageCode=" + languageCode + "]";
	}

	
}