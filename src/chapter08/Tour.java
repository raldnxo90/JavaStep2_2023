package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("인원을 입력하세요 > ");
		int num = scan.nextInt();
		Guide guide = new Guide(num);
		
		while(true) {
			for(int i=0;i<num;i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			System.out.print("성별을 입력하세요 : ");
			String gender = scan.next();
			guide.TourlistList(name, gender);
			System.out.println("--------------");
			}
			int n = 0;
			System.out.println("1.관광객 정보 | 2.목적지 정보 | 3.프로그램 종료");
			System.out.println("번호를 입력하세요");
			
			switch (n = scan.nextInt()) {
			case 1 :
				guide.Tourlist(1);
			
			case 2	:
				
			default:
				break;
			}
			
		}
	}
}