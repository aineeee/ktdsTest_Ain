package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>(); //object : 어떤 형태이든 사용가능
		map.put("Java", 100);
		map.put("C", 90);
		map.put("C#", 80);
		map.put("Python", 70);
		//map.put("Languages", new ArrayList<>());
		
		Set<String> keys = map.keySet(); //set타입 key를 반환시킴
		for (String key: keys) {
			System.out.println(key + " => " + map.get(key));
		}

		System.out.println("Java\t" + map.get("Java"));
		System.out.println("C\t" + map.get("C"));
		System.out.println("C#\t" + map.get("C#"));
		System.out.println("Python\t" + map.get("Python"));
		//System.out.println("Langeages\t" + map.get("Languages"));
		System.out.println("Scala\t" + map.get("Scala")); //null을 가지고 데이터가 있는지 없는지 판단 가능
		
		// !은 not의 의미이다.
		// ! true == false
		// ! false == true
		if(!map.containsKey("Python"))  {
			map.put("Python", 100);
		}		
		System.out.println("Python\t" + map.get("Python"));
		
		//삭제
		map.remove("C#");
		System.out.println("C#\t" + map.get("C#"));
		
		//몇개인지
		System.out.println(map.size()); // map에 들어있는 개수를 가져옴.
		
		Map<Integer, List<String>> matrix = new HashMap<>(); //key 는 integer, value는 List String 쓰겠다.
		}

}
