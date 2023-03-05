package com.ktdsuniversity.edu.goodgag;

import java.util.List;

import com.ktdsuniversity.edu.goodgag.article.service.ArticleService;
import com.ktdsuniversity.edu.goodgag.article.service.ArticleServiceImpl;
import com.ktdsuniversity.edu.goodgag.article.vo.ArticleVO;
import com.ktdsuniversity.edu.goodgag.member.service.MemberService;
import com.ktdsuniversity.edu.goodgag.member.service.MemberServiceImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public class GoodGagMain {

	public static void main(String[] args) {

//		System.out.println("사용자 계정 생성");
//		MemberDAO memberDAO = new MemberDaoImpl();
//		MemberVO memberVO = new MemberVO();
//		memberVO.setEmail("ssu11234@gmail.com");
//		memberVO.setNickname("딸기224");
//		memberVO.setPassword("12312333");
//		memberDAO.createMember(memberVO);
//		System.out.println("사용자 계정 생성 종료");

//		System.out.println("전체 사용자 정보 조회");
//		MemberService memberDao = new MemberServiceImpl();
//		List<MemberVO> _allMemberVO = memberDao.getAllMembers();
//		for (MemberVO eachMember : _allMemberVO) {
//			System.out.println("=================================");
//			System.out.println("Email : " + eachMember.getEmail());
//			System.out.println("NickName : " + eachMember.getNickname());
//			System.out.println("Verified_YN : " + eachMember.getVerified_yn());
//			System.out.println("PASSWORD : " + eachMember.getPassword());
//			System.out.println("JOIN DATE : " + eachMember.getJoin_date());
//			System.out.println("=================================");
//		}
//		System.out.println("전체 사용자 정보 조회 종료");

//		System.out.println("특정 사용자 정보 조회");
//		MemberService memberDao2 = new MemberServiceImpl();
//		MemberVO _OneMemberVO = memberDao2.getOneMember("ssu@gmail.com", "123123");
//		if (_OneMemberVO != null) {
//			System.out.println("=================================");
//			System.out.println("Email : " + _OneMemberVO.getEmail());
//			System.out.println("NickName : " + _OneMemberVO.getNickname());
//			System.out.println("Verified_YN : " + _OneMemberVO.getVerified_yn());
//			System.out.println("PASSWORD : " + _OneMemberVO.getPassword());
//			System.out.println("JOIN DATE : " + _OneMemberVO.getJoin_date());
//		}
//		System.out.println("특정 사용자 정보 조회 종료");

		// 게시글 작성 (articleDAO에 만듬)
		ArticleService articleService = new ArticleServiceImpl();
		
		
		
//		ArticleVO articleVO = new ArticleVO();
//		articleVO.setArticleNo("1");
//		articleVO.setEmail(_OneMemberVO.getEmail());
//		articleVO.setTitle("Java");
//		articleVO.setDescript("게시글 작성");
//		articleVO.setSource("201호 강의장");
//		articleVO.setNotiYn("N");
//		boolean isSuccess = articleService.createArticle(articleVO);
//		System.out.println(isSuccess);
//		System.out.println();

		// 게시글 목록 조회(댓글 개수 포함)(leftouter 사용)
		List<ArticleVO> articleList = articleService.getAllArticles();
		System.out.println("----- 게시글 목록 조회(댓글 개수 포함) 삭제 전 ------");
		for (ArticleVO eachArticle : articleList) {
			System.out.println(eachArticle.getTitle() + "\t" + eachArticle.getArticleNo() + "\t"
					+ eachArticle.getMemberVO().getNickname() + "\t" + eachArticle.getReplyList().size());
		}
		// 게시글 상세 조회(댓글 포함)
		// 게시글 수정
		// 댓글 작성

		// 댓글 수정
		// 게시글 삭제
//		articleService.deleteArticle("AR-20230305-00022");
//		
		
//		// 게시글 목록 조회(댓글 개수 포함)(leftouter 사용)
//		List<ArticleVO> articleList2 = articleService.getAllArticles();
//		System.out.println("----- 게시글 목록 조회(댓글 개수 포함) 삭제 후------");
//		for (ArticleVO eachArticle : articleList2) {
//			System.out.println(eachArticle.getTitle() + "\t" + eachArticle.getArticleNo() + "\t"
//					+ eachArticle.getMemberVO().getNickname() + "\t" + eachArticle.getReplyList().size());
//		}
		// 댓글 삭제
		
		// 게시글 좋아요
		articleService.likeDislikeArticle("ssu@gamil.com","AR-20230305-00023","L");
		System.out.println("-----게시글 전체 목록 조회-------");
		List<ArticleVO> articleList3 = articleService.selectAllLikeDislike("");
		for(ArticleVO eachArticleLike : articleList3) {
			System.out.println(" EMAIL : " + eachArticleLike.getEmail());
			System.out.println(" 게시물 번호 : " + eachArticleLike.getArticleNo());
			System.out.println(" 좋아요(L) 싫어요(D) : " + eachArticleLike.getType());
		}
			
//		}
		
		// 게시글 싫어요
		articleService.likeDislikeArticle("ssu@gamil.com","AR-20230305-00023","D");		
		System.out.println("-----게시글 전체 목록 조회-------");
		List<ArticleVO> articleList4 = articleService.selectAllLikeDislike("");
		for(ArticleVO eachArticleLike : articleList4) {
			System.out.println(" EMAIL : " + eachArticleLike.getEmail());
			System.out.println(" 게시물 번호 : " + eachArticleLike.getArticleNo());
			System.out.println(" 좋아요(L) 싫어요(D) : " + eachArticleLike.getType());
		}
		
		// 게시글 신고
		// 댓글 좋아요
		// 댓글 싫어요

	}

}
