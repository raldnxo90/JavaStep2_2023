package chapter12;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = 9999999;
	
	int add(int num1, int num2);
	int substaract(int num1, int num2);
	int times(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); // private method
		
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
	
	//인터페이스 요소
	/*
	-추상메소드 : body(구현부)가 없는 메소드로 무조건 재정의가 필요
	-자바8부터 제공
	-디폴트 메소드: 기본 수행문을 가질 수 있는 메소드이며 재정의를 할 수 있다.
	-정적(static)메소드 : 객체 생성과 관계없이 인터페이스 타입(클래스명)으로 사용 가능
	-private 메소드 : 인터페이스를 구현한 클래스에서 사용가능하고 재정의 할 수 없음
	                 즉 인테페이스(현재의 클래스)에서만 사용하기 위함
	 */
}
