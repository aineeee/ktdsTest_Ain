package com.ktdsuniversity.edu.naver.mv.rtng.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtingVO;

public interface RtingDAO {

	public int createRting(RtingVO rtingVO);
	
	public List<RtingVO> readAllRting();
	
	public int updateRting (RtingVO rtingVO);
	
	public int deleteRting (String rtingId);
	
}
