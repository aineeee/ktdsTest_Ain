package com.ktdsuniversity.edu.member;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.setUserName("아인");
		String userName = memberService.getUserName();
		System.out.println(userName);
		memberService.join();
//		memberService.login(); // private 에러발생
		memberService.quit();
	}
}
