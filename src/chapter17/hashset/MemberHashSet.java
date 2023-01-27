package chapter17.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashSet {

	// ArrayList 선언(arrayList)
	private HashSet<Member2> hashSet;

	// 생성자를 통한 LinkedList 객체 생성
	public MemberHashSet() {
		// heap 생성
		hashSet = new HashSet<Member2>();
	}

	// 저장 : arrayList에 add하는 메소드
	public void addMember(Member2 member2) {
		hashSet.add(member2);
	}

	// 삭제 : arrayList에 remove하는 메소드
	public boolean remveMember(int memberId) {
		Iterator<Member2> it = hashSet.iterator();

		while (it.hasNext()) {
			Member2 member2 = it.next();
			int tempId = member2.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member2);
				return true;
			} // if
		} // while
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	// 정보출력 메소드 : arrayList 출력하기
	public void showAllMember() {
		for (Member2 member2 : hashSet) {
			System.out.println(member2);
		}
		System.out.println();
	}
}