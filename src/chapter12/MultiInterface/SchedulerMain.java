package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scheduler scheduler = null;
		int ascii;
		char select;
		
	/*
		//문자를 아스키코드로 형변환
	    //방법1
	    //charAt(0) : 문자(char) 또는 문자열(String) => ASCII 즉 int
		//char input=scan.next().charAt(0); 
		//System.in.read() : 콘솔에 입력받기 모든 이력값을 아스키코드값
		//int ch=System.in.read(); //아스키코드값
		//방법2
		String mun = scan.nextLine();
		int ch = mun.charAt(0); //charAt(0):String -> ACSII(int)
		//객체를 생성
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else if (ch == 'S' || ch == 's') {
			System.out.println("업무를 종료합니다.");
			break;
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			continue; //무시
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
   }*/
		
		while (true) {
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");

			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//charAt(0); : 문자 또는 문자열 => int
			ascii = scan.next().charAt(0);
			select = (char) ascii;

			if (select == 'L' || select == 'l') {
				scheduler = new LeastJob();
				
				System.out.println();
			} else if (select == 'R' || select == 'r') {
				scheduler = new RoundRobin();
				
				System.out.println();
			} else if (select == 'P' || select == 'p') {
				scheduler = new PriorityAllocation();
				
				System.out.println();
			} else if (select == 'S' || select == 's') {
				System.out.println("상담 종료");
				break;
				
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			System.out.println("-----------------------------");

		}//while

	}//main
	
}//class
