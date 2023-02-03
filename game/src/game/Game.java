package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		String str = "    값 값 값      ";
		// 문자열에서 좌우 공백 제거하기 .trim
		str = str.trim();
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		// 문자열에서 텍스트 변경하기 .replace / .replaceAll
		str = str.replace(" ", "_");
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = str.replaceAll("_", "-");
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[가-힣]", ""); // 한글만 골라서 공백으로 바꿔라. []는 범위 지정자
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[^가-힣]", ""); // 한글만 빼고 공백으로 바꿔라. []는 범위 지정자 ^는 이거빼고
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = "<html>HTML 문서를 작성합니다.</html>";
		str = str.replaceAll("[a-zA-Z]", ""); // 모든영어를 공백으로 바꿔라. []는 범위 지정자 ^는 이거빼고
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str = str.replaceAll("[0-9]", ""); // 모든 숫자를 공백으로 바꿔라. []는 범위 지정자 ^는 이거빼고
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str = str.replaceAll("[^0-9]", ""); // 숫자를 제외한 모든것들을 공백으로 바꿔라. []는 범위 지정자 ^는 이거빼고
		System.out.println("변경된 값은 [" + str + "] 입니다.");

		// 문자열에서 특정 단어로 시작하는지 확인하기 .indexOf

		str = "자전거";
		System.out.println("자 의 자리: " + str.indexOf("자"));
		System.out.println("전 의 자리: " + str.indexOf("전"));
		System.out.println("거 의 자리: " + str.indexOf("거"));
		System.out.println("기 의 자리: " + str.indexOf("기"));

		if (str.indexOf("자") == 0) {
			System.out.println("자전거는 \"자\"로 시작합니다.");
		}
		// 문자열에서 특정 단어로 시작하는지 확인하기 .startWith
		System.out.println("자전거가 \"자\"로 시작하나요? " + str.startsWith("자"));
		System.out.println("자전거가 \"전\"로 시작하나요? " + str.startsWith("전"));
		System.out.println("자전거가 \"거\"로 시작하나요? " + str.startsWith("거"));

		// 문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
		System.out.println(" ");
		System.out.println("----------------< index >----------------");

		str = "기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf)" + str.indexOf("기"));
		System.out.println("기러기 \"기\"의 자리는? (lastindexOf)" + str.lastIndexOf("기"));
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? " + (str.lastIndexOf("기") == str.length() - 1));
		// 문자열에서 특정 단어로 끝나는지 확인하기 .endsWith

		System.out.println(" ");
		System.out.println("----------------< endsWith >----------------");

		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("거"));
		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("중"));
		System.out.println("거중기는 \"거\"로 끝나나요? " + str.endsWith("기"));

		// 문자열에서 특정 단어 및 글자가 포함되어 있는지 확인하기 .indexOf
		System.out.println(" ");
		System.out.println("----------------< index >----------------");
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " + (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " + (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " + (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " + (str.indexOf("기") > -1));
		// 문자열에서 특정 단어 및 글자가 포함되어 있는지 확인하기 .contains
		System.out.println(" ");
		System.out.println("----------------< contains >----------------");
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? " + str.contains("자"));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? " + str.contains("전"));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? " + str.contains("거"));
		System.out.println("자전거에는 \"기\"가 포함되어 있나요? " + str.contains("기"));
		// 문자열에서 문자열 자르기 .substring(p)

		System.out.println(" ");
		System.out.println("----------------< substring >----------------");
		str = "2023-02-03";
		String day = str.substring(5);
		day = day.replace("-", "");
		System.out.println(day);

		System.out.println(" ");
		System.out.println("----------------< substring(p,p) >----------------");
		// 문자열에서 문자열 자르기 .substring(p,p)
		str = "2023-02-03 11:01:15"; // 내가자르려는 구간의 +1을 해야 내가원하는 구간이 나오도록 자를수 있다. 마지막은 항상 +1
		// 0123456789012345678
		String year = str.substring(0, 4);
		String hour = str.substring(11, 13);
		String minute = str.substring(14, 16);
		String second = str.substring(17, 19);
		System.out.println(year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

		System.out.println("");
		System.out.println("----------------< split >----------------");
		// 문자열에서 특정 단어 및 기호 등으로 자르기 .split
		str = "자전거, 거중기, 기러기"; // ,로 짜르면 배열이 만들어짐 0,1,2
		List<String> wordList = Arrays.asList(str.split(",")); // asList 사용하면 배열이 List로 바뀜.
		for (String word : wordList) {
			System.out.println(word.trim());
		}

		str = "2023-02-22 11:22:34";
		List<String> dateList = Arrays.asList(str.split("[- :]")); // -,공백,:
		for (String dateItem : dateList) {
			System.out.println(dateItem);
		}

		System.out.println("");
		System.out.println("----------------< https://www.google.co.kr >----------------");
		String url = "https://www.google.co.kr"; // https 추출 www 추출 google 추출 co 추출 kr추출 /먼저 크게 자르고 그 안에서 가져오면됨.
		// 012345678901234567890123
		System.out.println(url.indexOf("://"));

		String protocol = url.substring(0, url.indexOf("://"));
		System.out.println("protocol : " + protocol);

		String subDomain = url.substring(url.indexOf("://") + "://".length(), url.indexOf("."));
		System.out.println("Sub domain: " + subDomain);

		String domain = url.substring(url.indexOf(subDomain) + subDomain.length() + 1); // 길이만큼 더해야 .google 부터 나오고 한번더
																						// 1을 더하면 .이 없어짐
		domain = domain.substring(0, domain.indexOf(".")); // 0번째부터 시작해서 .의 자리까지 잘라라
		System.out.println("Domain : " + domain);

		String companyCode = url.substring(url.indexOf(domain) + domain.length() + 1); // url에서 domain이 시작되는 위치부터 잘라라
		companyCode = companyCode.substring(0, companyCode.indexOf("."));
		System.out.println("Company code : " + companyCode);

		String nationCode = url.substring(url.lastIndexOf(".") + 1);
		System.out.println("Nation code : " + nationCode);

		// ------------------<끝말잇기 게임>-------------------- //
		System.out.println(" ");
		System.out.println("------------------<끝말잇기 게임>--------------------");

		Scanner scan = new Scanner(System.in);
		List<String> wordList1 = new ArrayList<>(); //가장 마지막 글자를 뽑아서 다음단어에 넣어주기로 만들기.
		String startLetter = "";          

		System.out.println("★☆ 끝말잇기를 시작합니다. ☆★");
		while (true) {
			if (startLetter.equals("")) {
				System.out.println("시작 단어를 입력하세요.");
			} else {
				System.out.println("\"" + startLetter + "\" 로 시작하는 단어를 입력하세요.");
			}

			String word = scan.nextLine();
			word = word.trim();  //글자 좌우공백 제거 
			word = word.replace(" ", ""); //띄어쓰기 제거 

			if (word.length() < 3) {
				if (!word.startsWith(startLetter) || word.equals("포기")) {
					System.out.println("\"" + word + "\" 를 입력했습니다.");
					System.out.println("게임을 종료합니다.");
					break;

				}
				System.out.println("\"" + word + "\" 는" + word.length() + "글자입니다. 3글자 이상 입력해주세요.");

			} else if (!word.startsWith(startLetter) || word.equals("포기")) {
				System.out.println("\"" + word + "\" 를 입력했습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				wordList1.add(word);
				startLetter = word.substring(word.length() - 1);  //제일 끝글자 하나 가져오기
			}
		}
		System.out.println("입력한 단어들은");
		for (String word : wordList1) {
			System.out.println(word);
		}
		System.out.println("입니다.");
	}
}
