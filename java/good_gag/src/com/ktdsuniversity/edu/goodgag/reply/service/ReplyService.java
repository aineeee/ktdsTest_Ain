package com.ktdsuniversity.edu.goodgag.reply.service;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.reply.vo.ReplyVO;



public interface ReplyService {

	/*
	 * 새로운 댓글을 등록한다.
	 * (게시글의 ID를 발급 받아서
	 * setReplyNo에 할당한다)
	 * @param ReplyVO
	 * @return 등록 결과
	 */
	public boolean createReply(ReplyVO replyVO);
	/**
	 * 모든 댓글의 목록을 조회한다.
	 * @return 댓글 목록
	 */
	public List<ReplyVO> getAllReplies();
	
	
}
