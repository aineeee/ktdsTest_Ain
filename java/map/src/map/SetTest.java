package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {
	public static void main(String[] args) {
		//map에 어떤 key가 있는지 궁금할 때 set을 사용함.
		//set은 몇번 째 index 가져오는게 안됨. 집어넣는 것만 되고 가져오는 것 안됨.
		//set은 for-each, while로만 사용가능
		Set<String> strSet = new HashSet<>();
		
		//등록
		strSet.add("100");
		strSet.add("101");
		strSet.add("102");
		strSet.add("103");
		strSet.add("104");
		strSet.add("105");
		
//		for(String str:strSet) {
//			System.out.println(str);
//		}
		
		Iterator<String> iterStr = strSet.iterator(); //내가 직접 물어보는 반복문 //import 잘 보기
		while(iterStr.hasNext()) { 
			System.out.println(iterStr.next()); // //hasnext() 다음거 있니? next() 다음꺼 가져와
			System.out.println(iterStr.next());
			System.out.println(iterStr.next());
			System.out.println(iterStr.next());
			System.out.println(iterStr.next());
			
		}
		System.out.println(strSet.size());
	}
}
