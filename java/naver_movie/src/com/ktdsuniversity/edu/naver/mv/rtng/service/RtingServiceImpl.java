package com.ktdsuniversity.edu.naver.mv.rtng.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.dao.RtingDAO;
import com.ktdsuniversity.edu.naver.mv.rtng.dao.RtingDAOImpl;
import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtingVO;

public class RtingServiceImpl implements RtingService {
	
	private RtingDAO rtingDAO;
	public RtingServiceImpl() {
		rtingDAO = new RtingDAOImpl();
	}

	@Override
	public boolean createRting(RtingVO rtingVO) {
		int insertCount = rtingDAO.createRting(rtingVO);
		return insertCount>0;
	}

	@Override
	public List<RtingVO> readAllRting() {
		return rtingDAO.readAllRting();
	}

	@Override
	public boolean updateRting(RtingVO rtingVO) {		
		return rtingDAO.updateRting(rtingVO) > 0;
	}

	@Override
	public boolean deleteRting(String rtingId) {
		return rtingDAO.deleteRting(rtingId) > 0;
	}

	
}
