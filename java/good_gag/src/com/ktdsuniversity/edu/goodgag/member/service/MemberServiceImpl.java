package com.ktdsuniversity.edu.goodgag.member.service;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDaoImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;

	public MemberServiceImpl() {
		memberDAO = new MemberDaoImpl();

	}
	
	@Override
	public List<MemberVO> getAllMembers() {
		return memberDAO.getAllMembers();
	}

	@Override
	public MemberVO getOneMember(String email, String password) {
		return memberDAO.getOneMember(email, password);
	}

	@Override
	public int createMember(MemberVO memberVO) {
		return memberDAO.createMember(memberVO);
	}

}
