package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import chapter09.People;

public class PersonManager2 {

	ArrayList<Person> personL = new ArrayList<Person>();

	public void manager() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.회원가입|2.회원탈퇴|3.회원정보|4.종료");
			System.out.print("항목 입력 : ");
			int num = scan.nextInt();
			Person person = new Person();
			switch (num) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				System.out.print("나이를 입력하세요: ");
				int age = scan.nextInt();
				System.out.print("전화번호를 입력하세요 : ");
				String tel = scan.next();
				person.setName(name);
				person.setAge(age);
				person.setTel(tel);
				personL.add(person);
				break;
			case 2:
				System.out.print("탈퇴할 회원의 이름을 입력하세요. ");
				name = scan.next();

				for (int i = 0; i < personL.size(); i++) {
					if (personL.get(i).equals(name)) {
						personL.remove(i);
					} else if ((i + 1) == personL.size()) {
						System.out.println("회원목록에 없는 이름입니다.");
					}
				}

			default:
				break;
			}
		}

	}

}
