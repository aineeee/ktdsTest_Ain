package com.ktdsuniversity.edu.method;

public class Main {
public static void main(String[] args) {
	Calc calc = new Calc();
	calc.sum(0);
	calc.sum(0L);
	calc.sum(0,0);
	calc.sum(0,0,0);
	
	Welcome welcome = new Welcome();
	String greeting = welcome.greeting();
	System.out.println(greeting);
	
	greeting = welcome.greeting("아꿍");	
	System.out.println(greeting);
	
	greeting = welcome.greeting("아꿍", "안녕?");
	System.out.println(greeting);
	
	greeting = welcome.greeting("아꿍", "아깽");
	System.out.println(greeting);
	
	greeting = welcome.greeting("아꿍", "아깽", "아뚱");  //가변인자로 실행됨. 3개 변수 받는 메소드는 따로 만들어두지 않았기 때문에 ... 이 실행됨~!
	System.out.println(greeting);
	
	//배열 파라미터 Case1
//	greeting = welcome.greetings(new String[] {"아꿍", "아깽", "아뚱"}); //배열 파라미터를 넘길 떄 
//	System.out.println(greeting);

}
}
