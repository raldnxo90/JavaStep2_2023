package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
		
	}
	//오버라이딩 불가능 - final
	public final void stop() {
		System.out.println("자동차가 멈춥니다");
		speed = 0;
}
}