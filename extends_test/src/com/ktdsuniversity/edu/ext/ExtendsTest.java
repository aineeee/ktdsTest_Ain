package com.ktdsuniversity.edu.ext;

public class ExtendsTest {
	/**
	 * 
	 * @param address
	 */
	public static void print(Address address) {
		System.out.println(address.getName());
		System.out.println(address.getPhoneNumber());
		System.out.println(address.getAddress());
		
		if(address instanceof Friends) {
			Friends friend = (Friends) address;
			System.out.println(friend.getBitrhDay());
		}
	}

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setName("");
		
		Friends friend = new Friends();
		friend.setName("채아인");
		friend.setBitrhDay("1994-10-25");
		print(friend);
				
	}
}
