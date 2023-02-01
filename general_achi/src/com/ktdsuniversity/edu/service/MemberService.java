package com.ktdsuniversity.edu.service;

import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public interface MemberService {
	public boolean create(MemberVO memberVO); // 성공,실패 여부를 돌려주기 위해 boolean 타입을 사용함.
	

	public List<MemberVO> readAll();

	public MemberVO read(String id);
	public MemberVO read(int index);
}
