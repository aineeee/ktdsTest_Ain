package com.ktdsuniversity.edu.controller;

import java.util.List;

import com.ktdsuniversity.edu.service.MemberService;
import com.ktdsuniversity.edu.service.MemberServiceImpl;
import com.ktdsuniversity.edu.service.SecondMemberServiceImpl;
import com.ktdsuniversity.edu.vo.MemberVO;

public class MemberController {

	public static void main(String[] args) {

		MemberService service = new SecondMemberServiceImpl();
	
		MemberVO member = new MemberVO();
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service.create(member);

		member = new MemberVO();
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service.create(member);

		member = new MemberVO();
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service.create(member);

		List<MemberVO> memberList = service.readAll();
		for (MemberVO eachMember : memberList) {
			System.out.println(eachMember.getId());
			System.out.println(eachMember.getPassword());
			System.out.println(eachMember.getReadNumber());
			System.out.println(eachMember.getPageNumber());

		}
		MemberVO oneMember = service.read(1);
		MemberVO oneMember2 = service.read("id3");
		System.out.println(" 8888888888888888888888888888888888 ");
		System.out.println(oneMember.getId());
		System.out.println(oneMember2.getId());
		
	}
}
