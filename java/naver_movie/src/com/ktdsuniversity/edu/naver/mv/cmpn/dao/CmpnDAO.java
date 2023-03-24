package com.ktdsuniversity.edu.naver.mv.cmpn.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;

public interface CmpnDAO {
	
		//생성(Create ~~~)
			
			public int createCmpn(CmpnVO cmpnVO);
			
		//조회(read~~~~)
		
			public List<CmpnVO> readAllCmpn();
			
		//수정(update~~~~)
			
			public int updateCmpn(CmpnVO cmpnVO);
			
		//삭제(delete~~~~)
			
			public int deleteCmpn(String cmpnId);
			
	
	
}
