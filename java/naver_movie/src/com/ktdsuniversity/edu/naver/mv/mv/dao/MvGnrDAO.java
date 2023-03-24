package com.ktdsuniversity.edu.naver.mv.mv.dao;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;

//영화 장르 등록
public interface MvGnrDAO {

	public int createMvGnr(MvVO mvVO);
	
	public int deleteMvGnr(String mvId);
	
}
