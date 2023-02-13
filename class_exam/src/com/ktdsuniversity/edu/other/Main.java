package com.ktdsuniversity.edu.other;

import com.ktdsuniversity.edu.member.MemberService;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.setUserName("아인");
		String userName = memberService.getUserName();
		System.out.println(userName);
		memberService.join();
//		memberService.login(); // private 에러발생
//		memberService.quit();  //memberService 가 defalt라서, 다른패키지 이기 때문에 오류가 나는거임!
	}
}
