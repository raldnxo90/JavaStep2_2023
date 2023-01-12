package chapter08;

public class StaticFunction {

	String str1 = "일반 회원";
	static String str2 = "static 회원변수";
	
	public static String getString() {
		
		//staitic 메소드는 static 변수만 사용이 가능
		//str2 = "VIP";
		
		return str2;
	}
}
