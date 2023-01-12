package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		StaticFunction sf = new StaticFunction();
		System.out.println(sf.str2);
		String s = sf.getString();
		System.out.println(s);
		
		//static 메소드는 객체 없이 사용 가능(클래스명으로 접근 권장)
		String ss =  StaticFunction.getString();
		System.out.println(ss);
	}

}
