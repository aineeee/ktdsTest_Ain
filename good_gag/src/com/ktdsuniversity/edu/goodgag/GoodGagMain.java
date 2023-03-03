package com.ktdsuniversity.edu.goodgag;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.article.dao.ArticleDAOImpl;
import com.ktdsuniversity.edu.goodgag.article.service.ArticleService;
import com.ktdsuniversity.edu.goodgag.article.service.ArticleServiceImpl;
import com.ktdsuniversity.edu.goodgag.article.vo.ArticleVO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDaoImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public class GoodGagMain {

	public static void main(String[] args) {

		MemberDAO memberDAO = new MemberDaoImpl();
		MemberVO memberVO = new MemberVO();
		memberVO.setEmail("ssu@gmail.com");
		memberVO.setNickname("딸기");
		memberVO.setPassword("123123");
		memberDAO.createMember(memberVO);

		// 게시글 작성 (articleDAO에 만듬)
		// AricleDAO articleDAO = new ArticleDAOImpl();
		ArticleService articleService = new ArticleServiceImpl();
		ArticleVO articleVO = new ArticleVO();
		articleVO.setEmail(memberVO.getEmail());
		articleVO.setTitle("Java");
		articleVO.setDescript("Java에서 등록함");
		articleVO.setSource("201호 강의장");
		articleVO.getNotiYn();
		boolean isSuccess = articleService.createArticle(articleVO);
		System.out.println(isSuccess);
		System.out.println();

		// 게시글 목록 조회(댓글 개수 포함)(leftouter 사용)
		List<ArticleVO> articleList = articleService.getAllArticles();
		for (ArticleVO eachArticle : articleList) {
			System.out.println("===================================");
			System.out.println(eachArticle.getTitle());
			System.out.println(eachArticle.getArticleNo());
			System.out.println(eachArticle.getMemberVO().getNickname());
			System.out.println(eachArticle.getReplyList().size());
		}
		// 게시글 상세 조회(댓글 포함)
		// 게시글 수정
		// 댓글 작성
		
		// 댓글 수정
		// 게시글 삭제
		// 댓글 삭제
		// 게시글 좋아요
		// 게시글 싫어요
		// 게시글 신고
		// 댓글 좋아요
		// 댓글 싫어요

	}

}
