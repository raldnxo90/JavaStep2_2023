package chapter10;

public class SuperSonicAirPlaneMain {

	public static void main(String[] args) {
		
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		sa.takeoff();
		sa.fly();
		sa.flyMode=SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SuperSonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}

}
