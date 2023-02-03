package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameTryCatch { // 경우에 따라 예외를 달리해서 던지기
	public static void checkWord(String word, String startLetter) {
		if (!word.startsWith(startLetter) || word.equals("포기")) {
			throw new WrongWordException();

		} else if (word.length() < 3) {			
			throw new InvalidWordException();
		}
	}

	public static void main(String[] args) {

		// ------------------<끝말잇기 게임>-------------------- //
		System.out.println(" ");
		System.out.println("------------------<끝말잇기 게임>--------------------");

		Scanner scan = new Scanner(System.in);
		List<String> wordList1 = new ArrayList<>(); // 가장 마지막 글자를 뽑아서 다음단어에 넣어주기로 만들기.
		String startLetter = "";

		System.out.println("★☆ 끝말잇기를 시작합니다. ☆★");
		while (true) {
			if (startLetter.equals("")) {
				System.out.println("시작 단어를 입력하세요.");
			} else {
				System.out.println("\"" + startLetter + "\" 로 시작하는 단어를 입력하세요.");
			}

			String word = scan.nextLine();
			word = word.trim(); // 글자 좌우공백 제거
			word = word.replace(" ", ""); // 띄어쓰기 제거

			try {
				checkWord(word, startLetter);
				wordList1.add(word);
				startLetter = word.substring(word.length() -1);
			} catch (InvalidWordException iwe) {
				System.out.println(word + "는 " + word.length() + "자리 단어입니다.");
				System.out.println("3자리 이상의 단어를 입려가세요.");

			} catch (WrongWordException wwe) {
				System.out.println(word + "을 입력했습니다. 게임을 종료합니다.");
				break;
			}
		}
		System.out.println("입력한 단어들은");
		for (String word : wordList1) {
			System.out.println(word);
		}
		System.out.println("입니다.");
	}
}
