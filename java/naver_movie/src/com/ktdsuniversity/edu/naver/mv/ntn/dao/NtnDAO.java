package com.ktdsuniversity.edu.naver.mv.ntn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public interface NtnDAO {

	
	//생성
	public int createNtn(NtnVO ntnVO);
	    
	//조회
	public List<NtnVO> readAllNtn();
	
	//수정
	public int updateNtn(NtnVO ntnVO);
	
	//삭제
	public int deleteNtn(int ntnId);
	
}
