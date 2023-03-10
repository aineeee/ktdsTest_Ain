package com.ktdsuniversity.edu.naver.mv.rtng.vo;

import com.ktdsuniversity.edu.naver.mv.util.db.Column;
import com.ktdsuniversity.edu.naver.mv.util.db.UseColumn;

@UseColumn
public class RtingVO {

	@Column("RTING_ID")
	private String rtingId;
	
	@Column("MV_ID")
	private String mvId;
	
	@Column("RTING")
	private int rting;
	
	@Column("RTING_DTL")
	private String rtingDtl;
	
	@Column("RTING_WRTR")
	private String rtingWrtr;
	
	@Column("RTING_WRT_T")
	private int rtingWrtT;
	
	@Column("LK_CNT")
	private int lkCnt;
	
	@Column("DSLK_CNT")
	private int dslkCnt;
	
	public String getRtingId() {
		return rtingId;
	}

	public void setRtingId(String rtingId) {
		this.rtingId = rtingId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public int getRting() {
		return rting;
	}

	public void setRting(int rting) {
		this.rting = rting;
	}

	public String getRtingDtl() {
		return rtingDtl;
	}

	public void setRtingDtl(String rtingDtl) {
		this.rtingDtl = rtingDtl;
	}

	public String getRtingWrtr() {
		return rtingWrtr;
	}

	public void setRtingWrtr(String rtingWrtr) {
		this.rtingWrtr = rtingWrtr;
	}

	public int getRtingWrtT() {
		return rtingWrtT;
	}

	public void setRtingWrtT(int rtingWrtT) {
		this.rtingWrtT = rtingWrtT;
	}

	public int getLkCnt() {
		return lkCnt;
	}

	public void setLkCnt(int lkCnt) {
		this.lkCnt = lkCnt;
	}

	public int getDslkCnt() {
		return dslkCnt;
	}

	public void setDslkCnt(int dslkCnt) {
		this.dslkCnt = dslkCnt;
	}

	
}
