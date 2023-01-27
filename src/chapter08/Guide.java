package chapter08;

import java.util.Scanner;

public class Guide {

	Guest[] guest;
	Scanner scan = new Scanner(System.in);

	// 생성자 초기화
	public Guide(int n) {
		guest = new Guest[n];// 관광객 수만큼 메모리 확보

		// 객체 생성
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
		}
	}

	public void TourlistList(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			guest[i].setName(name);

			System.out.print("성별을 입력하세요 : ");
			String gender = scan.next();
			guest[i].setGender(gender);
			
			System.out.println("------------------------");

		}

	}//여행객 정보 입력 메소드

	public void Tourlist(int i) {
		for (i = 0; i < guest.length; i++) {
			System.out.println(
					"이름 : " + guest[i].getName() + "| 성별 : " + guest[i].getGender() + "| 목적지 : " + guest[i].Point);
			
		}System.out.println("---------------------------------------------");

	}//여행객 정보 출력 메소드

	public void TourlistChange() {
		String point;
		for (int i = 0; i < guest.length; i++) {
			System.out.print(guest[i].getName() + "님의 목적지를 입력하세요 : ");
			point = scan.next();
			 guest[i].Point = point;
		}
		System.out.println("---------------------------------------------");
	}//목적지 변경 메소드

}