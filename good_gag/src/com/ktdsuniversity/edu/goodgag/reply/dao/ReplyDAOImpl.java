package com.ktdsuniversity.edu.goodgag.reply.dao;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.reply.vo.ReplyVO;
import com.ktdsuniversity.edu.goodgag.utils.db.AbstractDaoSupport;

public class ReplyDAOImpl extends AbstractDaoSupport<ReplyVO> implements ReplyDAO {

	@Override
	public List<ReplyVO> getAllRepiles() {
		StringBuffer query = new StringBuffer();

		query.append("SELECT                    ");
		query.append("	REPLY_NO,               ");
		query.append("	ARTICLE_NO,             ");
		query.append("	EMAIL,                  ");
		query.append("	REPLY,                  ");
		query.append("	REGIST_DATE,            ");
		query.append("	MODIFY_DATE,            ");
		query.append("	PARENT_REPLY_NO         ");
		query.append("FROM                      ");
		query.append("	BBS.REPLIES             ");
		
		return select(query.toString(), (pstmt) -> {
		}, (rs) -> {
			ReplyVO _replyVO = new ReplyVO();
			_replyVO.setReplyNo(rs.getString("REPLY_NO"));
			_replyVO.setArticleNo(rs.getString("ARTICLE_NO"));
			_replyVO.setEmail(rs.getString("EMAIL"));
			_replyVO.setReply(rs.getString("REPLY"));
			_replyVO.setRegistDate(rs.getString("REGIST_DATE"));
			_replyVO.setModifyDate(rs.getString("MODIFY_DATE"));
			_replyVO.setParentReplyNo(rs.getString("PARENT_REPLY_NO"));

			return _replyVO;
		});
	}

	@Override
	public ReplyVO getOneReply(String replyNo) {
		StringBuffer query = new StringBuffer();

		query.append("SELECT                    ");
		query.append("	REPLY_NO,               ");
		query.append("	ARTICLE_NO,             ");
		query.append("	EMAIL,                  ");
		query.append("	REPLY,                  ");
		query.append("	REGIST_DATE,            ");
		query.append("	MODIFY_DATE,            ");
		query.append("	PARENT_REPLY_NO         ");
		query.append("FROM                      ");
		query.append("	BBS.REPLIES             ");
		query.append("WHERE 1=1                 ");
		query.append("	AND BBS.REPLY_NO = ?    ");
		
		return selectOne(query.toString(), (pstmt) -> {
			pstmt.setString(1, replyNo);
		}, (rs) -> {
			ReplyVO _replyVO = new ReplyVO();
			_replyVO.setReplyNo(rs.getString("REPLY_NO"));
			_replyVO.setArticleNo(rs.getString("ARTICLE_NO"));
			_replyVO.setEmail(rs.getString("EMAIL"));
			_replyVO.setReply(rs.getString("REPLY"));
			_replyVO.setRegistDate(rs.getString("REGIST_DATE"));
			_replyVO.setModifyDate(rs.getString("MODIFY_DATE"));
			_replyVO.setParentReplyNo(rs.getString("PARENT_REPLY_NO"));

			return _replyVO;
		});
	}

}
