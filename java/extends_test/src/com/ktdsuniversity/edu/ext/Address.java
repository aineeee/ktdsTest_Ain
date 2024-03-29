package com.ktdsuniversity.edu.ext;

/**
 * 주소 관리 클래스
 * @author User
 *
 */
public class Address {

	private String name;
	private String phoneNumber;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //protected : 상속 해준 범위까지만 사용가능
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
