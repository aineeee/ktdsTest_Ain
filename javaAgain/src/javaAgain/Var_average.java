package javaAgain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Var_average {

	public static void main(String[] args) {
//		int math = 100;
//		int phy = 88;
//		int english = 99;
//		int programming = 98;

		// 배열을 이용하여 평균 구하기
		double[] average = new double[4];
		average[0] = 93.3;
		average[1] = 88.5;
		average[2] = 99.2;
		average[3] = 98.9;

		double total = (double)(average[0] + average[1] + average[2] + average[3]) / 4;
		
		for (int i = 0; i < average.length; i++) {
			
			System.out.println(average[i] + "");
		}
		
		System.out.println("------------FOR문------------");

		if (total >= 90) {
			System.out.println("A");
		} else if (total >= 80) {
			System.out.println("B");
		} else if (total >= 70) {
			System.out.println("C");
		} else if (total >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("------------------------");
		// List를 이용하여 평균 구하기
		List<Integer> average2 = new ArrayList<>();

		average2.add(100);
		average2.add(88);
		average2.add(99);
		average2.add(98);

		double total2 = (average2.get(0) + average2.get(1) + average2.get(2) + average2.get(3)) / 4;
		System.out.println(total2);

		if (total2 >= 90) {
			System.out.println("A");
		} else if (total2 >= 80) {
			System.out.println("B");
		} else if (total2 >= 70) {
			System.out.println("C");
		} else if (total2 >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		System.out.println("------------------------");

		// Map을 이용하여 평균구하기
		Map<String, Integer> average3 = new HashMap<String, Integer>();

		average3.put("math", 100);
		average3.put("phy", 88);
		average3.put("english", 99);
		average3.put("programming", 98);

		double total3 = average3.get("math") + average3.get("phy") + average3.get("english")
				+ average3.get("programming");

		System.out.println(total3 / 4);

		System.out.println("------------------------");

		int age = 18;

		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년입니다.");
		}

		System.out.println("------------------------");

		boolean a = false;
		if (!a) {
			System.out.println("출력");
		} else {
			System.out.println("미출력");
		}

		System.out.println("------------------------");

		boolean b = true;
		if (!b) {
			System.out.println("출력");
		} else {
			System.out.println("미출력");
		}

		System.out.println("------------------------");

		double averageA;
		averageA = 99.9;
		if (averageA >= 90) {
			System.out.println("A");
		} else if (averageA >= 80) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

		System.out.println("--------------------------");
		double avg = 99.9;
		int late = 0;
		int noCheck = 0;

		boolean result = (late + noCheck == 0) && (avg > 90);
		if (result) {
			System.out.println("A학점 입니다.");
		} else {
			System.out.println("A학점이 아닙니다.");
		}

		System.out.println("---------------------------------");
		int money = 20000;
		int myAge = 50;

		boolean result2 = (money >= 18000) && (myAge >= 12);
		if (result2) {
			System.out.println("관람 가능");
		} else {
			System.out.println("관람 불가능");
		}

		System.out.println("-----------------------------------");
		double hakjum;
		hakjum = 99;
		String grade = "F";

		if ((hakjum >= 95) && (hakjum <= 100)) {
			grade = "A+";
		} else if ((hakjum >= 90) && (hakjum <= 94)) {
			grade = "A";
		} else if ((hakjum >= 85) && (hakjum <= 89)) {
			grade = "B+";
		} else if ((hakjum >= 80) && (hakjum <= 84)) {
			grade = "B";
		} else if ((hakjum >= 70) && (hakjum <= 79)) {
			grade = "C";
		} else if ((hakjum >= 60) && (hakjum <= 69)) {
			grade = "D";
		} else if (hakjum < 60) {
			grade = "F";
		}
		System.out.println(grade);

		System.out.println("---------------------------------");
		for (int i = 0; i < 3; i++) {
			int age2 = 29;
			if (age2 >= 19) {
				System.out.println("성인입니다.");
			} else {
				System.out.println("미성년입니다.");
			}


		}

		
		System.out.println("-------------------------------");
		for(int i=0; i<100; i++)
			if(i%5==0 && i>1) {
			System.out.print(i);
			}
			else {
			System.out.print(" ");
			}
		
		System.out.println(" ");
		
		for(int i=0; i<100; i++)
			if(i%2==0) {
				System.out.print("짝수입니다.");
			}
			else if(i%2==1 ) {
				System.out.print("홀수입니다.");
			}
		
		System.out.println(" ");
		
		int[] array1 = new int [50];
		Random random = new Random();
		for(int i=0; i<array1.length; i++) {
		
			array1[i] = random.nextInt(50);
		}
		for(int i=0; i<array1.length; i++) {
			if( array1[i]%3 == 0 && array1[i] > 0)
			System.out.println(array1[i]);
		}
		
	}

}
