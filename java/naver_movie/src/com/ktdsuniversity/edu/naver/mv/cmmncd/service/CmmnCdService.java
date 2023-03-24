package com.ktdsuniversity.edu.naver.mv.cmmncd.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;

public interface CmmnCdService {
	
	public boolean createCmmncd(CmmnCdVO cmmnCd);
	
	public List<CmmnCdVO> readAllCmmnCd();
	
	public boolean updateCmmnCd(CmmnCdVO cmmnCdVO);
	
	public boolean deleteCmmnCd(String cmmnCdId);

}
