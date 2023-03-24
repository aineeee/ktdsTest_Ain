package javaAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List1 {
	
public static void main(String[] args) {
	
 List<Integer> scores = new ArrayList<>();
 scores.add(10);
 scores.add(11);
 scores.add(12);
 scores.add(13);
 scores.add(14);
 scores.add(15);
 
 
// scores.remove(0);
// scores.clear();
 
 int result = scores.get(0);
 result = scores.get(1);
 result = scores.get(2);
 result = scores.get(3);
 result = scores.get(4);
 result = scores.get(5);

 
 int scoreSize = scores.size();
 
 System.out.println(scoreSize);
 System.out.println(result);
 
 System.out.println(" ");
 
 // 1 ~ 45 사이의 랜덤 값 가져오기
 Random random = new Random();
// int randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
// randomNumber = random.nextInt(45) + 1;
// System.out.println(randomNumber);
	
 List<Integer> lotto = new ArrayList<>();
 int randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 randomNumber = random.nextInt(45) + 1;
 if(!lotto.contains(randomNumber)) {
	 lotto.add(randomNumber);
 }
 
 
 
 if(lotto.size()>0) {
 System.out.println(lotto.get(0));
 }
 if(lotto.size()>0) {
	 System.out.println(lotto.get(1));
	 }
 if(lotto.size()>0) {
	 System.out.println(lotto.get(2));
	 }
 if(lotto.size()>0) {
	 System.out.println(lotto.get(3));
	 }
 if(lotto.size()>0) {
	 System.out.println(lotto.get(4));
	 }
 if(lotto.size()>0) {
	 System.out.println(lotto.get(5));
	 }
 
 
 
		 
}

}
