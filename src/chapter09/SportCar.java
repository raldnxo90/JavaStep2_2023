package chapter09;

public class SportCar extends Car {
	/*
	public void stop() {
		System.out.println("스포츠카가 멈춥니다");
		speed = 0;
	}*/
	
	public void speedUp() {
		speed+=10;
		System.out.println("현재 스피드는 "+speed);
	}
	
	public static void main(String[] args) {
		SportCar ac = new SportCar();
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();
	}

}
