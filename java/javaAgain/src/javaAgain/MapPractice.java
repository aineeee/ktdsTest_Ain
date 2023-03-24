package javaAgain;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
 public static void main(String[] args) {
	
	 Map<String, Integer> scores = new HashMap<String, Integer>();
	 scores.put("Java", 100);
	 scores.put("C", 90);
	 scores.put("C#", 97);
	 scores.put("Python", 93);
	 
	 
	 scores.put("Java", 80);
	 scores.remove("C");
	 scores.clear();
	 
	 System.out.println(scores);
	 
	 System.out.println(scores.size());
	 
	 int javaScore = scores.get("Java");
	 System.out.println(javaScore);
	 	 
}
	
}
