package com.ktdsuniversity.edu.naver.mv.rtng.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtingVO;

public interface RtingService {

public boolean createRting(RtingVO rtingVO);
	
	public List<RtingVO> readAllRting();
	
	public boolean updateRting (RtingVO rtingVO);
	
	public boolean deleteRting (String rtingId);
}
