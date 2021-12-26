package com.oppsexample3;

public class UseClass {

	static Car getSoneCar(int a) {
		if (a == 0) {
			return new SportsCar();

		} else if (a == 1) {
			return new RecoveryCar();
		} else {
			return new Car();
		}

	}

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		c.park();
		c.stop();

		SportsCar sc = new SportsCar();
		sc.drive();
		sc.park();
		sc.stop();
		sc.race();
		sc.skid();

		RecoveryCar rc = new RecoveryCar();
		rc.drive();
		rc.Park();
		rc.stop();
		rc.tow();

		Car csc = new SportsCar();
		csc.drive();
		csc.stop();

		Car crc = new RecoveryCar();
		crc.drive();
		crc.park();
//		crc.t

		Car cc = getSoneCar(0);  //
		cc.drive();
	}
}
