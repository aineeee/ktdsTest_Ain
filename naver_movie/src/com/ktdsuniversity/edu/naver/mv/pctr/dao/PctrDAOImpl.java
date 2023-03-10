package com.ktdsuniversity.edu.naver.mv.pctr.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.pctr.vo.PctrVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class PctrDAOImpl extends AbstractAutoDaoPoolSupport<PctrVO> implements PctrDAO {

	@Override
	public int createPctr(PctrVO pctrVO) {
		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO PCTL                                                      ");
		query.append("   (PCTR_ID                                                                        ");
		query.append("    , MV_ID                                                                        ");
		query.append("    , TP                                                                           ");
		query.append("    , THBNL_PCTR                                                                   ");
		query.append("    , ORGNL_PCTR)                                                                  ");
		query.append("   VALUES                                                                          ");
		query.append("   ('PT-'|| TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_PCTL_PK.NEXTVAL,5,'0') ");
		query.append("    ,  ?                                                                           ");
		query.append("    ,  ?                                                                           ");
		query.append("    ,  ?                                                                           ");
		query.append("    ,  ?");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, pctrVO.getPctrId());
			pstmt.setString(2, pctrVO.getTp());
			pstmt.setString(3, pctrVO.getThbnlPctr());
			pstmt.setString(3, pctrVO.getOrgnlPctr());

		});
	}

	@Override
	public List<PctrVO> readAllPctr() {
		StringBuffer query = new StringBuffer();
		query.append("SELECT PCTR_ID   ");
		query.append("     , MV_ID     ");
		query.append("     , TP        ");
		query.append("     , THBNL_PCTR");
		query.append("     , ORGNL_PCTR");
		query.append("FROM PCTL;       ");
		return super.select(query.toString(), null, PctrVO.class);
	}

	@Override
	public int updatePctr(PctrVO pctrVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE MOVIE.PCTL                                        ");
		query.append(" SET MV_ID = ? , TP = ? , THBNL_PCTR = ? , ORGNL_PCTR = ? ");
		query.append(" WHERE PCTR_ID = ?                                        ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, pctrVO.getMvId());
			pstmt.setString(2, pctrVO.getTp());
			pstmt.setString(3, pctrVO.getThbnlPctr());
			pstmt.setString(4, pctrVO.getOrgnlPctr());
			pstmt.setString(5, pctrVO.getPctrId());
		});
	}

	@Override
	public int deletePctr(String pctrId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE           ");
		query.append(" FROM PCTL          ");
		query.append(" WHERE PCTR_ID = ?  ");
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, pctrId);
		});
	}

}
