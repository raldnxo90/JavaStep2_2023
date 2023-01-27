package chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		//사용자가 원하는 객체를 생성
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getvalue());
		
		//정수, 실수, 문자
		//제네릭 타입의 객체는 기본자료형(int, double, float, char)인식 불가
		//그러므로 오토박싱하여 사용
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(200);
		System.out.println(v2.getvalue());
		
		GenEx<Double> v3 = new GenEx<Double>();
		v3.setValue(30.0);
		System.out.println(v3.getvalue());
		
		GenEx<Character> v4 = new GenEx<Character>();
		v4.setValue('김');
		System.out.println(v4.getvalue());
	}

}
