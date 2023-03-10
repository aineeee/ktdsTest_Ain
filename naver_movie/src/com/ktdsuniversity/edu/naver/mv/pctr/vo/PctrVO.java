package com.ktdsuniversity.edu.naver.mv.pctr.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class PctrVO {
	
	@Column("RCTR_ID")
	private String pctrId;
	@Column("MV_ID")
	private String mvId;
	@Column("TP")
	private String tp;
	@Column("THBNL_PCTR")
	private String thbnlPctr;
	@Column("ORGNL_PCTR")
	private String orgnlPctr;
	
	
	public String getPctrId() {
		return pctrId;
	}
	public void setPctrId(String pctrId) {
		this.pctrId = pctrId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getThbnlPctr() {
		return thbnlPctr;
	}
	public void setThbnlPctr(String thbnlPctr) {
		this.thbnlPctr = thbnlPctr;
	}
	public String getOrgnlPctr() {
		return orgnlPctr;
	}
	public void setOrgnlPctr(String orgnlPctr) {
		this.orgnlPctr = orgnlPctr;
	}
	
}
