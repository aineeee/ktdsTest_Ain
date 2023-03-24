package com.ktdsuniversity.edu.naver.mv.mv.vo;

import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
/**
 * 영화참여인
 * @author User
 *
 */
public class PrdcPrtcptnPplVO extends MvPplVO {

	/**
	 * 임무
	 */
	private String mssn;
	
	/**
	 * 담당역할명
	 */
	private String rspnbltRolNm;
	
	public String getMssn() {
		return mssn;
	}

	public void setMssn(String mssn) {
		this.mssn = mssn;
	}

	public String getRspnbltRolNm() {
		return rspnbltRolNm;
	}

	public void setRspnbltRolNm(String rspnbltRolNm) {
		this.rspnbltRolNm = rspnbltRolNm;
	}

	
}
