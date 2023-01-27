package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		// 학생정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// 중복X
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김민주"), 85);
		map.put(new Student(3, "서주희"), 90);
		map.put(new Student(4, "하동길"), 98);

		// 저장된 총 Entry 수 출력
		System.out.println("총 Entry 수 : " + map.size());
		
		//하나씩 처리하는 방법
		Set<Student> keySet =map.keySet();
		Iterator<Student> keyiIterator =keySet.iterator();
		
		while(keyiIterator.hasNext()) {
			Student key = keyiIterator.next();
			System.out.println();
			Integer value = map.get(key);
			System.out.println("\t"+key+" :"+value);
		}
		System.out.println();
		
		
		
		Scanner scan = new Scanner(System.in);
		Student std;//선언
		int num;
		String name;
		
		while (true) {
			System.out.print("학생의 번호를 입력하세요 : ");
			num = scan.nextInt();
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			std = new Student(num, name);
			
			if (map.containsKey(std)) {
				
				if (map.get(num).equals(name)) {
				}
			}
		}

	}

}
