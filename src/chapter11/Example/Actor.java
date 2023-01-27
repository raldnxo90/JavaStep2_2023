package chapter11.Example;

import java.util.Scanner;

public class Actor {

	public static void main(String[] args) {

		String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" }, { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
				{ "[이병헌]", "지아이조", "레드", "광해" } };

		int cnt = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("검색할 배우를 입력하세요. > ");
		String name = scan.next();
		
		for(int i=0;i<actor.length;i++) {
			if(name == actor[i][0]) {
				for(int j=0;j<actor[0].length;j++)
				System.out.println(actor[i][j]);
			}
		}
		
		/*
		switch (name) {
		case "송강호":
			for (cnt = 0; cnt < actor[0].length; cnt++) {
				System.out.println(actor[0][cnt]);
			}
			break;

		case "김수현":
			for (cnt = 0; cnt < actor[1].length; cnt++) {
				System.out.println(actor[1][cnt]);
			}
			break;

		case "이병헌":
			for (cnt = 0; cnt < actor[2].length; cnt++) {
				System.out.println(actor[2][cnt]);
			}
			break;

		default:
			System.out.println("해당하는 배우를 찾을 수 없습니다");
			break;

		}
	*/
	}
}
