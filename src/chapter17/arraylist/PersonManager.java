package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	Scanner scan = new Scanner(System.in);
	Person p;

	public void personMgr() {
		int select;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종   료");
			System.out.print("5. 항목선택 : ");

			select = scan.nextInt();
			// if, switch

			switch (select) {
			case 1: // 정보추가
				System.out.println("회원정보를 입력하세요.");
				System.out.print("이름 : ");
				String name = scan.next();

				System.out.print("나이 : ");
				int age = scan.nextInt();

				System.out.print("전화번호 : ");
				String tel = scan.next();

				personArr.add(new Person(name, age, tel));
				break;

			case 2:
				System.out.println("삭제할 회원의 이름을 입력하세요.");
				System.out.print("이름 : ");
				name = scan.next();
				for (int i = 0 + 1; i < personArr.size(); i++) {
					if (name.equals(personArr.get(i).getName())) {
						personArr.remove(i);
						System.out.println("회원정보가 삭제되었습니다.");
					} else
						System.out.println("회원이 존재하지 않습니다.");
				}
				break;
			case 3:
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println(personArr.get(i).toString());
				}
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			}

		}

	}
}
