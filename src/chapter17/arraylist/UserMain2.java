package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain2 {

	public static void main(String[] args) {

		ArrayList<UserInfo> user = new ArrayList<UserInfo>();
		Scanner scan = new Scanner(System.in);
		
		outer : while(true) {
			UserInfo ui = new UserInfo();
			System.out.print("아이디를 입력하라 : ");
			ui.setId(scan.next());
			
			for(int i =0;i<user.size();i++) {
				if(ui.getId().equals(user.get(i).getId())) {
					System.out.print("아이디가 중복되었다 : ");
					continue outer;
				}
			}
			System.out.print("패스워드를 입력하세요 : ");
			Scanner scan2 = new Scanner(System.in);
			ui.setPwd(scan2.nextInt());
		}
		
		
		
		
		
		
	}

}
