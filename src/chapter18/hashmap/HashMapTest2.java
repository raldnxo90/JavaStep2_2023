package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//Map<String integer> 생성 map
		Map <String, Integer>map = new HashMap<>();
		
		map.put("강창우", 100);
		map.put("백유기", 200);
		map.put("김우태", 300);
		map.put("정세나", 400);
		map.put("박수연", 500);
		map.put("박범근", 600);
		
		System.out.println("총 팀원의 수"+map.size());
		
		System.out.println("팀장의 학번 : "+map.get("강창우"));

		Set<String> keySet = map.keySet();
		Iterator<String> keyIteractor = keySet.iterator();
		while(keyIteractor.hasNext()) {
			String key = keyIteractor.next();
			Integer value = map.get(key);
			System.out.println(key+" "+value);
		}
		
		
		
		//팀원 데이터(성함, 학번) 저장
		//팀원의 인원
		//팀장의 학번을 알아내자
		//팀원의 모두 학번 출력
		
	}

}
