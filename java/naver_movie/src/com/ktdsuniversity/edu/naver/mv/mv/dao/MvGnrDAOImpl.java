package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class MvGnrDAOImpl extends AbstractAutoDaoPoolSupport<GnrVO> implements MvGnrDAO {

	@Override
	public int createMvGnr(MvVO mvVO) {
		String mvId = mvVO.getMvId();
		List<GnrVO> gnrList = mvVO.getGnrList();

		int insertCount = 0;
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO MV_GNR   ");
		query.append(" (MV_ID               ");
		query.append(" ,GNR_ID)            ");
		query.append(" VALUES               ");
		query.append(" (?                  ");
		query.append("  ,?)                 ");

		//영화가 하나일 때 장르가 여러개일 수 있다. 몇개일지 모르기 때문에 쿼리를 계속 돌리면서 반복문
		//insert 되는 것 마다 다 더할 수 있도록 한다.
		for (GnrVO gnr : gnrList) {      
			insertCount += super.insert(query.toString(), (pstmt) -> {
				pstmt.setString(1, mvId);
				pstmt.setInt(2, gnr.getGnrId());

			});
		}

		return insertCount;
	}

	@Override
	public int deleteMvGnr(String mvId) {
	StringBuffer query = new StringBuffer();
	query.append(" DELETE          ");
	query.append(" FROM MV_GNR     ");
	query.append(" WHERE MV_ID = ? ");
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvId);
			
		});
	}

}
