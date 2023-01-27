package chapter17.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter17.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member(30,"홍길동"));
		set.add(new Member(30,"홍길동")); //set은 중복을 허용하지 않아 저장되면 안된다/ 그러나 new로 객체가 생성되기 때문에 물리적으로 주소 생성
		
		System.out.println("총 객체수 : "+set.size());
	}

}
