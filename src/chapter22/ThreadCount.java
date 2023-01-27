package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;

	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {

		System.out.println("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		ThreadCount tc = new ThreadCount(num);
		// 스레드 객체 및 실행
		Thread t = new Thread(tc);
		t.start();

	}

	@Override
	public void run() {
		for (int i = n; i >= 0; i--) {
			System.out.println(i);

			try {
				System.out.println();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("종료");
	}

}
