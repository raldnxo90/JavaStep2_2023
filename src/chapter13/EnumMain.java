package chapter13;

import java.util.Scanner;

public class EnumMain {

	public enum Item {
		Start, Pause, Exit
	} // 0 1 2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 [0: 게임시작, 1: 일시정지, 2: 게임종료] : ");
			int n = scan.nextInt();

			Item start = Item.Start;// Start에 있는 0이 넘어옴, 타입 Item
			Item pause = Item.Pause;// Start에 있는 1이 넘어옴
			Item Exit = Item.Exit;// Start에 있는 2가 넘어옴

			if (n == start.ordinal()) {// n == 0
				System.out.println("게임이 시작함");
			} else if (n == pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			} else {
				System.out.println("게임종료");
				return;
			}

		}//while
	}//main

}//class
