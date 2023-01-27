package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("인원을 입력하세요 > ");
		int num = scan.nextInt();
		Guide guide = new Guide(num);
		guide.TourlistList(num);

		outer: while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.관광객 정보 | 2.목적지 변경 | 3.프로그램 종료");
			System.out.println("---------------------------------------------");
			System.out.print("번호를 입력하세요 : ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				guide.Tourlist(num);
				break;

			case 2:
				guide.TourlistChange();
				break;

			case 3:
				System.out.println("프로그램을 종료합니다");
				break outer;

			}

		}
	}
}