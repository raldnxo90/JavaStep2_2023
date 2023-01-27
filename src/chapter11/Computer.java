package chapter11;

//추상메소드가 하나라도 있다면 추상클래스
//추상클래스의 목적 - 오버라이딩, 상속
public abstract class Computer {

	// 추상 메소드 - 구현부(바디)가 없는 메소드
	public abstract void display();//하위클래스에서 구현해서 사용하라는 의미
	public abstract void typing();

	// 일반 메소드
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
