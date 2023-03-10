package com.ktdsuniversity.edu.naver.mv.cmpn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmpn.dao.CmpnDAO;
import com.ktdsuniversity.edu.naver.mv.cmpn.dao.CmpnDAOImpl;
import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

public class CmpnServiceImpl implements CmpnService {
	private CmpnDAO cmpnDAO;

	public CmpnServiceImpl() {
		cmpnDAO = new CmpnDAOImpl();

	}

	@Override
	public boolean createCmpn(CmpnVO cmpnVO) {
		int insertCount = cmpnDAO.createCmpn(cmpnVO);
		return insertCount > 0;
	}

	@Override
	public List<CmpnVO> readAllCmpn() {
		return cmpnDAO.readAllCmpn();
	}

	@Override
	public boolean updateCmpn(CmpnVO cmpnVO) {
		return cmpnDAO.updateCmpn(cmpnVO) > 0;
	}

	@Override
	public boolean deleteCmpn(String cmpnId) {
		return cmpnDAO.deleteCmpn(cmpnId) > 0;
	}

}
