package chapter11;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("시동을 킵니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	//탬플릿 메소드(재정의 안되게 구현)
	public final void run() {

		turnOn();
		drive();
		stop();
		turnOff();
	}	
}

							
