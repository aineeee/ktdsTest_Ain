package com.ktdsuniversity.edu.abs.ext;

/**
 * 추상 클래스
 * @author User
 *
 */
public abstract class Calculator {

	public int calculate(String calcType, int numberOne, int numberTwo) {
		if (calcType.equals("+")) {
			return sum(numberOne, numberTwo);
		}
		else if (calcType.equals("-")) {
			return minus(numberOne, numberTwo);
			
		}
		return 0;
	}
	
	protected abstract int sum(int numberOne, int numberTwo);
	protected abstract int minus(int numberOne, int numberTwo);
	
}
