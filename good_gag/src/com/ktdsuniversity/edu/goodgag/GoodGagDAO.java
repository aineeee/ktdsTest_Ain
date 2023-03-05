package com.ktdsuniversity.edu.goodgag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktdsuniversity.edu.goodgag.member.dao.MemberDAO;
import com.ktdsuniversity.edu.goodgag.member.dao.MemberDaoImpl;
import com.ktdsuniversity.edu.goodgag.member.vo.MemberVO;

public class GoodGagDAO {

	public static void printAllReplies() {
		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle.jdbc.driver 패키지에 있는 OracleDriver를 로딩해라.
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Database 연결
		Connection conn = null;
		PreparedStatement pstmt = null; // DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; // 쿼리의 실행결과를 받아오는 객체

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "BBS", "BBS1234");

			// 3. Query 작성
			StringBuffer query = new StringBuffer();
			query.append("SELECT REPLY_NO                                                ");
			query.append("     , ARTICLE_NO                                                      ");
			query.append("     , EMAIL                                                     ");
			query.append("     , REPLY                                                  ");
			query.append("     , TO_CHAR(REGIST_DATE, 'YYYY-MM-DD HH24:MI:SS') REGIST_DATE ");
			query.append("     , TO_CHAR(MODIFY_DATE, 'YYYY-MM-DD HH24:MI:SS') MODIFY_DATE                                                     ");
			query.append("     , PARENT_REPLY_NO                                                   ");
			query.append("   FROM REPLIES                                                  ");

			// 4. Query 실행
			pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();

			// 5. Query 결과 받아서 출력하기
			while (rs.next()) {
				// rs.get~~~("컬럼명"); => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String replyNo = rs.getString("REPLY_NO");
				String articleNo = rs.getString("ARTICLE_NO");
				String email = rs.getString("EMAIL");
				String reply = rs.getString("REPLY");
				String registDate = rs.getString("REGIST_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");				
				String parentReplyNo = rs.getString("PARENT_REPLY_NO");

				System.out.println(replyNo + "\t" + articleNo + "\t" + email + "\t" + reply + "\t" + registDate + "\t"
						+ modifyDate + "\t" + parentReplyNo);
			}

		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			// 6. DB 연결 해제하기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqle) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException sqle) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sqle) {
				}
			}
		}
	}

	public static void printAllArticles() {
		// 1. Oracle Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle.jdbc.driver 패키지에 있는 OracleDriver를 로딩해라.
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Database 연결
		Connection conn = null;
		PreparedStatement pstmt = null; // DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; // 쿼리의 실행결과를 받아오는 객체

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "BBS", "BBS1234");

			// 3. Query 작성
			StringBuffer query = new StringBuffer();
			query.append("SELECT ARTICLE_NO                                                ");
			query.append("     , EMAIL                                                     ");
			query.append("     , TITLE                                                     ");
			query.append("     , DESCRIPT                                                  ");
			query.append("     , TO_CHAR(REGIST_DATE, 'YYYY-MM-DD HH24:MI:SS') REGIST_DATE ");
			query.append("     , SOURCE                                                    ");
			query.append("     , NOTI_YN                                                   ");
			query.append("   FROM ARTICLE                                                  ");

			// 4. Query 실행
			pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();

			// 5. Query 결과 받아서 출력하기
			while (rs.next()) {
				// rs.get~~~("컬럼명"); => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String articleNo = rs.getString("ARTICLE_NO");
				String email = rs.getString("EMAIL");
				String title = rs.getString("TITLE");
				String descript = rs.getString("DESCRIPT");
				String registDate = rs.getString("REGIST_DATE");
				String source = rs.getString("SOURCE");
				String notiYn = rs.getString("NOTI_YN");

				System.out.println(articleNo + "\t" + email + "\t" + title + "\t" + descript + "\t" + registDate + "\t"
						+ source + "\t" + notiYn);
			}

		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			// 6. DB 연결 해제하기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqle) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException sqle) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sqle) {
				}
			}
		}
	}
	
	public static void printOneMembers(String pEmail, String pPassword) {

		// 1. Oracle Driver Loading
		// oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Oracle DB에 연결
		// jdbc:oracle:thin:@localhost:1521:XE < DB연결 URL임
		Connection conn = null;
		PreparedStatement pstmt = null; // DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; // 쿼리의 실행결과를 받아오는 객체

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "BBS", "BBS1234");

			// 3. Query 작성
			// 여러 줄의 String을 작성할 때, 사용할 수 있는 객체
			StringBuffer query = new StringBuffer();
			query.append(" SELECT EMAIL");
			query.append("   , NICKNAME"); // 쿼리가 붙어나오는 문제를 방지하기 위해 앞뒤로 띄어쓰기를 해줌
			query.append("   , VERIFIED_YN");
			query.append("   , PASSWORD");
			query.append("   , TO_CHAR(JOIN_DATE, 'YYYY-MM-DD HH24:MI:SS') JOIN_DATE ");
			query.append("   FROM MEMBER");
			query.append("  WHERE EMAIL = ? ");
			query.append("  AND PASSWORD = ? ");
			

			// 3-1. 쿼리 실행하기
			pstmt = conn.prepareStatement(query.toString());
			
			// 3-2. 쿼리 파라미터 바인딩하기
			pstmt.setString(1, pEmail); // 제일 첫 번째 나오는 ? 한테 값을 바인딩해라. 바인딩 값은 1부터 시작
			pstmt.setString(2, pPassword);
			
			rs = pstmt.executeQuery(); // 이게 resultset을 리턴해줌. resultset을 받기 위해 위에 만들어줘야함.

			// 4. Query 결과 받아오기
			// ResultSet
			// rs.next() ==> Cursor를 한 칸 아래로 내린다.
			while (rs.next()) {
				// rs.get~~~("컬럼명"); => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String email = rs.getString("EMAIL");
				String nickName = rs.getString("NICKNAME");
				String verifiedYn = rs.getString("VERIFIED_YN");
				String password = rs.getString("PASSWORD");
				String joinDate = rs.getString("JOIN_DATE");

				System.out.println(email + "\t" + nickName + "\t" + verifiedYn + "\t" + password + "\t" + joinDate);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			// 5. DB 연결 해제
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqle) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException sqle) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sqle) {
				}
			}
		}

	}
	
	public static void printAllMembers() {

		// 1. Oracle Driver Loading
		// oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		// 2. Oracle DB에 연결
		// jdbc:oracle:thin:@localhost:1521:XE < DB연결 URL임
		Connection conn = null;
		PreparedStatement pstmt = null; // DB에게 쿼리를 실행요청 하는 객체
		ResultSet rs = null; // 쿼리의 실행결과를 받아오는 객체

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "BBS", "BBS1234");

			// 3. Query 작성
			// 여러 줄의 String을 작성할 때, 사용할 수 있는 객체
			StringBuffer query = new StringBuffer();
			query.append(" SELECT EMAIL");
			query.append("   , NICKNAME"); // 쿼리가 붙어나오는 문제를 방지하기 위해 앞뒤로 띄어쓰기를 해줌
			query.append("   , VERIFIED_YN");
			query.append("   , PASSWORD");
			query.append("   , TO_CHAR(JOIN_DATE, 'YYYY-MM-DD HH24:MI:SS') JOIN_DATE ");
			query.append("   FROM MEMBER");

			// 3-1. 쿼리 실행하기
			pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery(); // 이게 resultset을 리턴해줌. resultset을 받기 위해 위에 만들어줘야함.

			// 4. Query 결과 받아오기
			// ResultSet
			// rs.next() ==> Cursor를 한 칸 아래로 내린다.
			while (rs.next()) {
				// rs.get~~~("컬럼명"); => Cursor가 가리키는 ROW의 COLUMN 데이터를 받아온다.
				String email = rs.getString("EMAIL");
				String nickName = rs.getString("NICKNAME");
				String verifiedYn = rs.getString("VERIFIED_YN");
				String password = rs.getString("PASSWORD");
				String joinDate = rs.getString("JOIN_DATE");

				System.out.println(email + "\t" + nickName + "\t" + verifiedYn + "\t" + password + "\t" + joinDate);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			// 5. DB 연결 해제
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqle) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException sqle) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sqle) {
				}
			}
		}

	}

	public static void main(String[] args) {
	//	printAllMembers();
    //	printAllArticles();
	//	printAllReplies();
	//	printOneMembers("a@gamil.com","passwordismerong");   // 이메일과 패스워드가 둘다 맞는것만 출력됨
	//	printOneMembers("b@gamil.com" , "passwordismerong");
	//	printOneMembers("c@gamil.com" , "passwordismerong");
	
	MemberDAO memberDAO = new MemberDaoImpl();
	List<MemberVO> allMemberList = memberDAO.getAllMembers();
	MemberVO member = memberDAO.getOneMember("a@gamil.com", "passwordismerong");
	
	for(MemberVO eachMember : allMemberList) {
		System.out.println(eachMember.getEmail());
		System.out.println(eachMember.getNickname());
		System.out.println(eachMember.getVerified_yn());
		System.out.println(eachMember.getPassword());
		System.out.println(eachMember.getJoin_date());
				
	}
	
	}

}
