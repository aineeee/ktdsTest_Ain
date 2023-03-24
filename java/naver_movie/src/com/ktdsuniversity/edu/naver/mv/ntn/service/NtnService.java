package com.ktdsuniversity.edu.naver.mv.ntn.service;

import java.util.List;

import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public interface NtnService {

	/**
	 * GNR 테이블과 연동하기 위한 DAO
	 * @author User
	 *
	 */
	//생성(Create ~~~)
		/**
		 * 새로운 장르를 생성한다.
		 * @param NtnVO (새로운 장르의 정보)
		 * @return 새로 등록된 장르의 수
		 */
		public boolean createNtn(NtnVO ntnVO);
		
	//조회(read~~~~)
		/**
		 * NTN테이블에 등록된 모든 정보를 조회한다.
		 * @return GNR 테이블의 모든 정보
		 */
		public List<NtnVO> readAllNtn();
		
	//수정(update~~~~)
		/**
		 * NTN 테이블에 등록되 장르데이터를 변경한다.
		 * @param ntnVO (ntnId: 변경대상 id, ntnNm: 장르의 새로운 이름)
		 * @return 변경된 결과
		 */
		public boolean updateNtn(NtnVO ntnVO);
		
	//삭제(delete~~~~)
		/**
		 * GNR 테이블에 등록된 장르데이터를 삭제한다.
		 * @param NtnId (삭제대상id)
		 * @returnt 삭제된 결과
		 */
		public boolean deleteNtn(int ntnID);
	}

