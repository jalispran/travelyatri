package com.travelyatri.app.codes;

public final class Travelyatri {
	
	private Travelyatri() {}
	
	public static enum CountryCode{
		INDIA("IN");

		private String code;
		private CountryCode(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}
	
	public static enum LanguageCode{
		ENGLISH("en");

		private String code;
		private LanguageCode(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}

	public static enum UserType{
		INDIVIDUAL("I"),
		ORGANIZATION("O");
		
		private String code;
		private UserType(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}
	
	public static enum Gender{
		MALE("M"),
		TRANSGENDER("T"),
		WHATEVER("N"),
		FEMALE("F");
		
		private String code;
		private Gender(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}
	
	public static enum RoleCode {
		INDIVIDUAL_USER("IU"),
		ADMIN("AD"),
		TRAVLEYATRI_MAKER("TM");
		
		private String code;
		private RoleCode(String code){
			this.code = code;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}
	
	public static enum EmailContext {
		VERIFICATION_EMAIL,
		WELCOME_EMAIL;
	}
}

