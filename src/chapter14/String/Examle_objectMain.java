package chapter14.String;

public class Examle_objectMain {

	public static void main(String[] args) {
		Examle_object v1 = new Examle_object();
		v1.setValue("Test");// String이지만 이미 Object가 상속되어 있으므로 자동 형변환이 이루어짐

		System.out.println(v1.getValue());

		// 정수(int)로 인자값을 대입

		Examle_object v2 = new Examle_object();
		v2.setValue(100);//AutoBoxing 기본자료형 int => 객체(Object)
		System.out.println(v2.getValue());
		
		int i = (int)v2.getValue(); //AutoBoxing
		System.out.println(i+2);
		
	}
}