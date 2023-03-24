package com.ktdsuniversity.edu.goodgag.member.dao;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public interface MemberDAO {

	public List<MemberVO> getAllMembers();

	// 회원가입
	public MemberVO getOneMember(String email, String password);

	// memberVO가 모든 정보를 가지고 있기 때문에 파라미터로 memberVO만 받으면 된다.
	public int createMember(MemberVO memberVO);

}
