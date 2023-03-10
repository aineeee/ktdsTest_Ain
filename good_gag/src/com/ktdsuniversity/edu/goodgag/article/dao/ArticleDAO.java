package com.ktdsuniversity.edu.goodgag.article.dao;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.article.vo.ArticleVO;

public interface ArticleDAO {

	/*
	 * 게시글의 새로운 PK값을 조회한다.
	 * @return 게시글의 PK값 (AR-날짜-시퀀스)
	 */
	public String createNewArticleNo();	
	/*
	 * 모든 게시글의 목록을 조회한다.
	 * @return 게시글 목록
	 */
	public int createArticle(ArticleVO articleVO);
	public List<ArticleVO> getAllArticles();
	
	public int deleteArticle(String articleNo);
	
	public int likeDislikeArticle(String email, String articleNo, String likeDislike);
	
	public List<ArticleVO> selectAllLikeDislike(String articleNO);
	
	
}
