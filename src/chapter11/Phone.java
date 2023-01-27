package chapter11;

public abstract class Phone {

	public String owner;
	//상속 시 부모의 생성자를 사용해야 함
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}//추상메소드가 없으면 생성자 메소드를 반드시 오버로딩
