package com.ktdsuniversity.edu.goodgag.reply.dao;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.reply.vo.ReplyVO;

public interface ReplyDAO {

	
	// 전체 답글 조회
	public List<ReplyVO> getAllRepiles();
	
	// 답글 한개 조회
	public ReplyVO getOneReply(String replyNo);

}
