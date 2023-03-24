package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.PrdcPrtcptnCmpnVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class PrdcPrtcptnCmpnDAOImpl extends AbstractAutoDaoPoolSupport<MvVO> implements PrdcPrtcptnCmpnDAO {

	@Override
	public int createPrdcPrtcptnCmpn(MvVO mvVO) {
		String mvId = mvVO.getMvId();
		List<PrdcPrtcptnCmpnVO> cmpnList = mvVO.getCmpnList();
		
		int insertCount = 0;
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO PRDC_PRTCPTN_CMPN   ");
		query.append("(PRDC_PRTCPTN_CMPN_ID                ");
		query.append("   , MV_ID               ");
		query.append("   , CMPN_ID             ");
		query.append("   , CRCLTN_CD)          ");
		query.append("	VALUES                  ");
		query.append("	('MC-'                    ");
		query.append("	|| TO_CHAR(SYSDATE, 'YYYYMMDD') ");
		query.append("	||	'-'       ");
		query.append("	|| LPAD(SEQ_RPDC_PRTCPTN_CMPN_PK.NEXTVAL,5,'0')        ");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");

		
		for (PrdcPrtcptnCmpnVO cmpn : cmpnList) {
			insertCount += super.insert(query.toString(), (pstmt) -> {
				pstmt.setString(1, mvId);
				pstmt.setString(2, cmpn.getCmpnId());
				pstmt.setString(3, cmpn.getCrcltnCd());

			});
		}
		return insertCount;

	}

	@Override
	public int deletePrdcPrtcptnCmpn(String mvId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE          ");
		query.append(" FROM PRDC_PRTCPTN_CMPN     ");
		query.append(" WHERE MV_ID = ? ");
			return super.delete(query.toString(), (pstmt) -> {
				pstmt.setString(1, mvId);				
			});
		
	}

}
