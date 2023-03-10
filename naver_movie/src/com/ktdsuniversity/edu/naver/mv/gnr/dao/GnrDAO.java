package com.ktdsuniversity.edu.naver.mv.gnr.dao;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
/**
 * GNR 테이블과 연동하기 위한 DAO
 * @author User
 *
 */
public interface GnrDAO {
//생성(Create ~~~)
	/**
	 * 새로운 장르를 생성한다.
	 * @param gnrVO (새로운 장르의 정보)
	 * @return 새로 등록된 장르의 수
	 */
	public int createGnr(GnrVO gnrVO);
	
//조회(read~~~~)
	/**
	 * GNR테이블에 등록된 모든 정보를 조회한다.
	 * @return GNR 테이블의 모든 정보
	 */
	public List<GnrVO> readAllGnr();
	
//수정(update~~~~)
	/**
	 * GNR 테이블에 등록되 장르데이터를 변경한다.
	 * @param gnrVO (gnrId: 변경대상 id, gnrNm: 장르의 새로운 이름)
	 * @return 변경된 장르의 수
	 */
	public int updateGnr(GnrVO gnrVO);
	
//삭제(delete~~~~)
	/**
	 * GNR 테이블에 등록된 장르데이터를 삭제한다.
	 * @param gnrId (삭제대상id)
	 * @returnt 삭제된 장르의 수
	 */
	public int deleteGnr(int gnrId);
	
	
}
