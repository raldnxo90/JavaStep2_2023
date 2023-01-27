package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		// 팀원 들의 정보
		Member memKang = new Member(1000, "김창우");
		Member memBeak = new Member(2000, "백유기");
		Member memPark = new Member(3000, "박범근");
		Member memPark2 = new Member(4000, "박수연");
		Member memjeng = new Member(5000, "정세나");
		Member memKim = new Member(6000, "김우태");
		// 회원가입
		memberArrayList.addMember(memKang);
		memberArrayList.addMember(memBeak);
		memberArrayList.addMember(memPark);
		memberArrayList.addMember(memPark2);
		memberArrayList.addMember(memjeng);
		memberArrayList.addMember(memKim);

		memberArrayList.showAllMember();

		// 회원탈퇴

		memberArrayList.removeMember(memKang.getMemberId());
		memberArrayList.showAllMember();
	}

}
