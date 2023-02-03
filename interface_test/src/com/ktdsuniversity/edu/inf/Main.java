package com.ktdsuniversity.edu.inf;

public class Main {

	public static void calculate(Calculator calculator) {
		if(calculator instanceof CalculatorNormalImpl) {
			System.out.println(calculator.sum(10, 20));
			System.out.println(calculator.minus(40, 3));
			
		}
	}
	public static void main(String[] args) {
		
		calculate(new CalculatorNormalImpl());
		calculate(new CalculatorRandomImpl());
		
			
//		//인터페이스명 변수명 = new 구현클래스명();
//		Calculator calculator1 = new CalculatorNormalImpl();
//		System.out.println(calculator1.sum(10, 20));
//		System.out.println(calculator1.minus(40, 3));
//		
//		Calculator calculator2 = new CalculatorNormalImpl();
//		System.out.println(calculator2.sum(10, 20));
//		System.out.println(calculator2.minus(40, 3));
	}
}
