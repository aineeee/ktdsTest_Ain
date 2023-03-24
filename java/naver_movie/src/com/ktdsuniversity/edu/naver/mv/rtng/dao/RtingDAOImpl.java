package com.ktdsuniversity.edu.naver.mv.rtng.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.rtng.vo.RtingVO;
import com.ktdsuniversity.edu.naver.mv.util.db.AbstractAutoDaoPoolSupport;

public class RtingDAOImpl extends AbstractAutoDaoPoolSupport<RtingVO> implements RtingDAO {

	@Override
	public int createRting(RtingVO rtingVO) {
		StringBuffer query = new StringBuffer();
		query.append("(false)append INSERT INTO MOVIE.RTING                                                   ");
		query.append(" (RTING_ID                                                                              ");
		query.append(", MV_ID                                                                                 ");
		query.append(", RTING                                                                                 ");
		query.append(", RTING_DTL                                                                             ");
		query.append(", RTING_WRTR                                                                            ");
		query.append(", RTING_WRT_T                                                                           ");
		query.append(", LK_CNT                                                                                ");
		query.append(", DSLK_CNT)                                                                             ");
		query.append(" VALUES('MR-'|| TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_RTING_PK.NEXTVAL,5,'0') ");
		query.append("         , ?                                                                            ");
		query.append("         , ?                                                                            ");
		query.append("         , ?                                                                            ");
		query.append("         , ?                                                                            ");
		query.append("         , SYSDATE                                                                      ");
		query.append("         , 0                                                                            ");
		query.append("         , 0)                                                                           ");
		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, rtingVO.getMvId());
			pstmt.setInt(2, rtingVO.getRting());
			pstmt.setString(3, rtingVO.getRtingDtl());
			pstmt.setString(4, rtingVO.getRtingWrtr());
			pstmt.setInt(5, rtingVO.getRtingWrtT());
			pstmt.setInt(6, rtingVO.getLkCnt());
			pstmt.setInt(7, rtingVO.getDslkCnt());

		});
	}

	@Override
	public List<RtingVO> readAllRting() {
		StringBuffer query = new StringBuffer();
		query.append("SELECT RTING_ID        ");
        query.append("	   , MV_ID             ");
        query.append("	   , RTING             ");
        query.append("     , RTING_DTL       ");
        query.append("     , RTING_WRTR      ");
        query.append("     , RTING_WRT_T     ");
        query.append("     , LK_CNT          ");
        query.append("     , DSLK_CNT        ");
        query.append("  FROM RTING;          ");
		return  super.select(query.toString(), null, RtingVO.class);
	}

	@Override
	public int updateRting(RtingVO rtingVO) {
		StringBuffer query = new StringBuffer();
		query.append(" UPDATE MOVIE.RTING                       ");
		query.append(" SET MV_ID = ? , RTING_DTL = ? ,     ");
		query.append(" WHERE RTING_ID = ?                       ");

		return super.insert(query.toString(), (pstmt) -> {
			pstmt.setString(1, rtingVO.getMvId());
			pstmt.setString(2, rtingVO.getRtingDtl());
			pstmt.setString(3, rtingVO.getRtingId());

		});
	}

	@Override
	public int deleteRting(String rtingId) {
		StringBuffer query = new StringBuffer();
		query.append(" DELETE           ");
		query.append(" FROM RTING          ");
		query.append(" WHERE RTING_ID = ?  ");
		return super.delete(query.toString(), (pstmt) -> {
			pstmt.setString(1, rtingId);
		});
	}

}
