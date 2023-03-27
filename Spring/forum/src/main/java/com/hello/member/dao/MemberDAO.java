package com.hello.member.dao;

import com.hello.member.vo.MemberVO;

public interface MemberDAO {
 /**
  * MyBatis 환경에서 DAO 메소드의 Parameter 규칙
  * 항상 하나의 파라미터만 전달해야 한다.
  * @param memberVO
  * @return
  */
	
	
	public int createNewMember(MemberVO memberVO);
	
	public int readCountMemberByEmail(String email);
	
	public MemberVO readOneMemberByEmailAndPassword(MemberVO memberVO);
}
