package com.hello.reply.vo;

import com.hello.member.vo.MemberVO;

/**
 * REPLY
 */
public class ReplyVO {

	/**
	 * 
	 */
	private int replyId;

	/**
	 * 
	 */
	private int topicId;

	/**
	 * 
	 */
	private String reply;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private String crtDt;

	/**
	 * 
	 */
	private String mdfyDt;

	/**
	 * 
	 */
	private int prntReptlyId;

	private MemberVO memberVO;
	private int depth;

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public int getReplyId() {
		return this.replyId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getTopicId() {
		return this.topicId;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReply() {
		return this.reply;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setCrtDt(String crtDt) {
		this.crtDt = crtDt;
	}

	public String getCrtDt() {
		return this.crtDt;
	}

	public void setMdfyDt(String mdfyDt) {
		this.mdfyDt = mdfyDt;
	}

	public String getMdfyDt() {
		return this.mdfyDt;
	}

	public void setPrntReptlyId(int prntReptlyId) {
		this.prntReptlyId = prntReptlyId;
	}

	public int getPrntReptlyId() {
		return this.prntReptlyId;
	}

}