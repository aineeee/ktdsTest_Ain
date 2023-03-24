package com.ktdsuniversity.edu.abs.ext;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new SimpleCalculator();
		System.out.println(calc.calculate("+", 10, 40)); // 연산을 직접 한게 아니라 호출만 해줌.
		System.out.println(calc.calculate("-", 10, 40));
		
	}
	
	
}
