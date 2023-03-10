package com.ktdsuniversity.edu.naver.mv.ntn.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class NtnVO {
	
	@Column("NTN_ID")
	private int ntnId;

	@Column("NTN_ID")
	private String ntnNM;

	public int getNtnId() {
		return ntnId;
	}

	public void setNtnId(int ntnId) {
		this.ntnId = ntnId;
	}

	public String getNtnNM() {
		return ntnNM;
	}

	public void setNtnNM(String ntnNM) {
		this.ntnNM = ntnNM;
	}

	

}
