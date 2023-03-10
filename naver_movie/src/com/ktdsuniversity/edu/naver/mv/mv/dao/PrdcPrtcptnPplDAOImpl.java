package com.ktdsuniversity.edu.naver.mv.mv.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.PrdcPrtcptnPplVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class PrdcPrtcptnPplDAOImpl extends AbstractAutoDaoPoolSupport<MvVO> implements PrdcPrtcptnPplDAO {

	@Override
	public int createPrdcPrtcptnPpl(MvVO mvVO) {
		String mvId = mvVO.getMvId();
		List<PrdcPrtcptnPplVO> mvPplList = mvVO.getMvPplList();

		int insertCount = 0;
		StringBuffer query = new StringBuffer();

		query.append(" INSERT INTO PRDC_PRTCPTN_PPL");
		query.append(" ,PRDC_PRTCPTN_ID           ");
		query.append(" , MV_ID                    ");
		query.append(" , MV_PPL_ID                ");
		query.append(" , MSSN                     ");
		query.append(" , RSPNBLT_ROL_NM)          ");
		query.append("	VALUES('MP-'|| TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_RPDC_PRTCPTN_CMPN_PK.NEXTVAL,5,'0') ");
		query.append(" ,?, ?, ?, ?) ");

		for (PrdcPrtcptnPplVO prdcprtcptnppl : mvPplList) {
			insertCount += super.insert(query.toString(), (pstmt) -> {
				pstmt.setString(1, mvId);
				pstmt.setString(2, prdcprtcptnppl.getMvPplId());
				pstmt.setString(3, prdcprtcptnppl.getMssn());
				pstmt.setString(4, prdcprtcptnppl.getRspnbltRolNm());

			});
		}
		return insertCount;
	}

	@Override
	public int deletePrdcPrtcptnPpl(String mvId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE          ");
		query.append(" FROM PRDC_PRTCPTN_PPL     ");
		query.append(" WHERE MV_ID = ? ");
			return super.delete(query.toString(), (pstmt) -> {
				pstmt.setString(1, mvId);				
			});
		
	}

}
