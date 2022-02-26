package com.javaoops;

public class MotoBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
        MotorBike suzki = new MotorBike();
		ducati.start();
		ducati.setSpeed(80);
		
		char c3 ='\u00A2';
		System.out.println(c3);
       System.out.println(suzki.getSpeed());
	}

}
