package com.ktdsuniversity.edu.naver.mv.mvppl.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class MvPplDAOImpl extends AbstractAutoDaoPoolSupport<MvPplVO> implements MvPplDAO {

	@Override
	public int createMvPpl(MvPplVO mvPplVO) {
		StringBuffer query = new StringBuffer();
		query.append("  INSERT INTO MV_PPL   ");
		query.append("  (MV_PPL_ID           ");
		query.append(" , PRFL_PCTR           ");
		query.append(" , NM                  ");
		query.append(" , PL_NM)              ");
		query.append("  VALUES               ");
		query.append(" ('MV-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_MV_PK.NEXTVAL,5,0)");
		query.append(" ,  ?                  ");
		query.append(" ,  ?                  ");
		query.append(" ,  ?                  ");
		query.append(" )                     ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvPplVO.getPrflPctr());
			pstmt.setString(2, mvPplVO.getNm());
			pstmt.setString(3, mvPplVO.getPlNm());
		});
	}

	@Override
	public List<MvPplVO> readAllMvPpl() {
		return null;
	}

	@Override
	public int updateMvPpl(MvPplVO mvPplVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE MV_PPL              ");
		query.append(" SET PRFL_PCTR = ?,  NM = ?,  PL_NM= ?");
		query.append(" WHERE MV_PPL_ID = ?              ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvPplVO.getPrflPctr());
			pstmt.setString(2, mvPplVO.getNm());
			pstmt.setString(3, mvPplVO.getPlNm());
			pstmt.setString(4, mvPplVO.getMvPplId());
		});
	}

	@Override
	public int deleteMvPpl(String mvPplId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE           ");
		query.append(" FROM MV_PPL          ");
		query.append(" WHERE MV_PPL_ID = ?  ");
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, mvPplId);
		});
	}

}
