package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		//equals와 hashcode가 override된 String Type
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(new String("임정희"));
		hashset.add(new String("박현정"));
		hashset.add(new String("홍연희"));
		hashset.add(new String("강감찬"));
		
		System.out.println(hashset);//set은 중복X, 순서X
		hashset.add(new String("강감찬"));
		System.out.println(hashset);
	}

}
