package com.ktdsuniversity.edu.market;

public class Main {

	
	public static void main(String[] args) {
		Buyer buyer = new Buyer("아깽", 5_000_000, 0);
		
	   Seller seller = new Seller("아꿍", 10_000_000,10);
	   
	   buyer.buy(seller, 5);
	
	}
}
