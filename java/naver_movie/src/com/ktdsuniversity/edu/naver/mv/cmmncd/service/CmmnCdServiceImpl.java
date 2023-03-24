package com.ktdsuniversity.edu.naver.mv.cmmncd.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.dao.CmmnCdDAO;
import com.ktdsuniversity.edu.naver.mv.cmmncd.dao.CmmnCdDAOImpl;
import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;

public class CmmnCdServiceImpl implements CmmnCdService {

	private CmmnCdDAO cmmnCdDAO;
	
	public CmmnCdServiceImpl() {
		cmmnCdDAO = new CmmnCdDAOImpl();
		
	}

	@Override
	public boolean createCmmncd(CmmnCdVO cmmnCdVO) {
		int insertCount = cmmnCdDAO.createCmmncd(cmmnCdVO);
		return insertCount > 0;
	}

	@Override
	public List<CmmnCdVO> readAllCmmnCd() {
		return cmmnCdDAO.readAllCmmnCd();
	}

	@Override
	public boolean updateCmmnCd(CmmnCdVO cmmnCdVO) {
		return cmmnCdDAO.updateCmmnCd(cmmnCdVO) > 0;
	}

	@Override
	public boolean deleteCmmnCd(String cmmnCdId) {
		return cmmnCdDAO.deleteCmmnCd(cmmnCdId) > 0;
	}
}
