package com.ktdsuniversity.edu.ext;

public class Friends extends Address {  //extends 상속받을 클래스명  //Address 가 부모, Friends 가 자식.

	private String bitrhDay;

	public String getBitrhDay() {
		return bitrhDay;
	}

	public void setBitrhDay(String bitrhDay) {
		this.bitrhDay = bitrhDay;
	}
	
	@Override
		public String getAddress() {
			return "내 친구 주소는" + super.getAddress();
		}
	
	@Override
		public String getName() {
			return "내 친구 이름은" + super.getName();
		}
	
	@Override
		public String getPhoneNumber() {
			return "내 친구 전화번호는 " +  super.getPhoneNumber();
		}
}