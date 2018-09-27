package com.travelyatri.util;

import java.util.UUID;

public class SessionData {

	private UUID sessionId;

	private Double currentLat;

	private Double currentLong;

	public UUID getSessionId() {
		return sessionId;
	}

	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
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

	@Override
	public String toString() {
		return "SessionData [sessionId=" + sessionId + ", currentLat=" + currentLat + ", currentLong=" + currentLong
				+ "]";
	}

}
