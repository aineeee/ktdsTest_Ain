package com.ktdsuniversity.edu.inf;


public class CalculatorNormalImpl 
implements Calculator {

	@Override
	public int sum(int numberOne, int numberTwo) {  // Calcualtor 내가 구현하고 싶은 인터페이스의 이름
		return numberOne + numberTwo;
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	} 
	
	
	public int devide(int numberOne, int numberTwo) {
		return numberOne /  numberTwo;
	} 

	
//	@Override //인터페이스의 값을 재정의 했다. 있어도 되고 없어도 되지만, 없으면 성능 상 문제가 생김. 
//	public int sum (int numberOne, int numberTwo) {
//		return numberOne + numberTwo;
//	}
//
//	@Override
//	public int minus (int numberOne, int numberTwo) {
//		return numberOne - numberTwo;
//	} 
//	
//	
//	public int devide(int numberOne, int numberTwo) {
//		return numberOne / numberTwo;
//	}
		
	}
