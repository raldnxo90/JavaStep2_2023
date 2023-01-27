package chapter14.Clone;

public class ExitMain {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				// System.exit(i); //메인 메소드 나감
				break;// for문 탈출
			}
		}
		System.out.println("종료코드");
	}

}// main
