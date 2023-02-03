package com.ktdsuniversity.edu.abs.ext;

/**
 * 추상클래스를 상속받아 구현한 클래스
 * @author User
 *
 */
public class SimpleCalculator extends Calculator {

	@Override
	public int sum(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	@Override
	public int minus(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

}
