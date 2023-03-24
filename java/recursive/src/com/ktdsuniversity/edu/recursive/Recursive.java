package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {

	public void recursive() {

		System.out.println("실행중....");
		recursive(); // recursive에서 recursive를 또 호출 (재귀호출)
		// 계층구조만들기: 파일을 읽어서 그 하위 폴더를 보여줌
	}

	public void readFile(File file) {

		File[] fileList = file.listFiles();

		for (File file2 : fileList) {
			System.out.println(file2.getAbsolutePath());
			if (file2.isDirectory()) {
				readFile(file2);
//				File[] fileList2 = file2.listFiles();
//				for (File file3 : fileList2) {
//					System.out.println(file3.getAbsolutePath()); //getName도 가능

			}
		}
	}

	public static void main(String[] args) {
		Recursive recursive = new Recursive();

		recursive.readFile(new File("C:\\Devs"));
	}

}
