package com.ktdsuniversity.edu.naver.mv.mv.vo;

import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;

/**
 * 영화 참여회사
 * 
 * @author User
 *
 */
public class PrdcPrtcptnCmpnVO extends CmpnVO {

//	private String cmpnId; CmpnVO에 있기 때문에 따로 선언 안하고  CmpnVO를 상속받으면 된다.
//	private String cmpnNm;  CmpnVO에 있기 때문에 따로 선언 안하고  CmpnVO를 상속받으면 된다.
	private String crcltnCd;

	public String getCrcltnCd() {
		return crcltnCd;
	}

	public void setCrcltnCd(String crcltnCd) {
		this.crcltnCd = crcltnCd;
	}

}
