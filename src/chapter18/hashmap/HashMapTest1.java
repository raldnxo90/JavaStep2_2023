package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		
		System.out.println("총 Entry 수"+map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		
		//객체 키 모두 받기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIteractor = keySet.iterator();
		while(keyIteractor.hasNext()) {
			String key=keyIteractor.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		
		//Set<String> keySet = map.keySet(); //map.keySet() : map의 키 값만 출력/map.entrySet() : map의 키와 값 모두 출력
		
		
		
		
		
		
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 Entry 수"+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" "+value);
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
