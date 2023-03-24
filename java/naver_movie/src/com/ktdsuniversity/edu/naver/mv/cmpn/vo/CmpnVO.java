package com.ktdsuniversity.edu.naver.mv.cmpn.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class CmpnVO {

	@Column("CMPN_ID")
	private String cmpnId;
	
	@Column("CMPN_NM")
	private String cmpnNm;
	
	
	public String getCmpnId() {
		return cmpnId;
	}
	public void setCmpnId(String cmpnId) {
		this.cmpnId = cmpnId;
	}
	public String getCmpnNm() {
		return cmpnNm;
	}
	public void setCmpnNm(String cmpnNm) {
		this.cmpnNm = cmpnNm;
	}
	
	
}
