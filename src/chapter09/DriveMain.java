package chapter09;

import chapter10.Bus;
import chapter10.Drive;
import chapter10.Taxi;
import chapter10.Vehicle;

public class DriveMain {

	public static void main(String[] args) {
		Drive drive = new Drive();
		drive.drive(new Bus());
		drive.drive(new Taxi());

		Vehicle bv = new Bus();

	}

}
