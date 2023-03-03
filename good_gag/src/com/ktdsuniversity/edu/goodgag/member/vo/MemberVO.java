package com.ktdsuniversity.edu.goodgag.member.vo;

public class MemberVO {

	private String email;
	private String nickname;
	private String verified_yn;
	private String password;
	private String join_date;
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getVerified_yn() {
		return verified_yn;
	}
	public void setVerified_yn(String verified_yn) {
		this.verified_yn = verified_yn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
}
