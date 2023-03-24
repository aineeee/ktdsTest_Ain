package com.ktdsuniversity.edu.method;

public class Welcome {
	
	public String greetings(String[] message) {
		String welcomeMessage = "";
		for (String msg : message) {
			welcomeMessage += msg + "님, ";
		}
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}

	public String greeting(String... message) { // ...를 사용하면 원하는 만큼 데이터를 넣을 수 있으며, String 배열로 전달된다.
		String welcomeMessage = "";
		for (String msg : message) {
			welcomeMessage += msg + "님, ";
		}
		welcomeMessage += "안녕하세요?";
		return welcomeMessage;
	}

	public String greeting() {
		return "안녕하세요?";
	}

	public String greeting(String name) {
		return name + "님, 안녕하세요?";
	}

	public String greeting(String name, String message) {
		return name + "님, " + message;
	}

}
