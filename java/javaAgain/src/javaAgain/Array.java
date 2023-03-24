package javaAgain;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
        int[] scores = new int[4];
        
		String[] arrayPractice = new String[5];
		
		double[] practice2 = new double[3];
		
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		scores[3] = 4;
		
		int scoress = scores[0]+scores[1]+scores[2]+scores[3];
		
		arrayPractice[0] = "가";
		arrayPractice[1] = "나";
		arrayPractice[2] = "다";
		arrayPractice[3] = "라";
		arrayPractice[4] = "마";
		
        String arrayPracticetotal = arrayPractice[0] + arrayPractice[1] + arrayPractice[2] + arrayPractice[3] + arrayPractice[4];
		
		practice2[0] = 10;
		practice2[1] = 10.9;
		practice2[2] = 10.8;		
		
		
		
		System.out.println(scores.length);
		System.out.println(scoress);
		System.out.println(arrayPractice.length);
		System.out.println(arrayPracticetotal);
	}
}
