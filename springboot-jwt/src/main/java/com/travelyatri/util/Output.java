package com.travelyatri.util;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.travelyatri.app.codes.TravelyatriResponseCode;

public class Output {
	
	private SessionData sData;
	private String responseCode;
	private String message;
	
	@JsonIgnore
	private boolean success;
	private Map<String, Object> data = new HashMap<>();
	
	public Output() {
		this.success = false;
	}
	
	public Output(SessionData sData) {
		this.sData = sData;
		this.success = false;
		if(this.sData.getSessionId() == null)
			this.sData.setSessionId(UUID.randomUUID());
	}
	
	public SessionData getsData() {
		return sData;
	}


	public void setsData(SessionData sData) {
		this.sData = sData;
	}

	public String getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(TravelyatriResponseCode responseCode) {
		if(TravelyatriResponseCode.OK.equals(responseCode))
			this.success = true;
		this.responseCode = responseCode.getCode();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	public void setData(String key, Object value) {
		this.data.put(key, value);
	}

	public boolean isSuccess() {
		return success;
	}
	
}
