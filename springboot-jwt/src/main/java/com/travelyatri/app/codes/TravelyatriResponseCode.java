package com.travelyatri.app.codes;

public enum TravelyatriResponseCode {
	OK ("00"),
	ERR_APLCN("01"),
	INVALID_RESP("99");
	
	private String code;
	
	private TravelyatriResponseCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public static TravelyatriResponseCode findByCode(final String code) {
		if(OK.getCode().equals(code))
			return OK;
		
		else if(ERR_APLCN.getCode().equals(code))
			return ERR_APLCN;
		
		else return INVALID_RESP;
	}
}
