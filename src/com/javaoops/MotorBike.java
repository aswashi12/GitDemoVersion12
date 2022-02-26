package com.javaoops;

public class MotorBike {
	private int speed;

	public MotorBike() {
		this(5);
	}

	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}

	public void start() {

	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;

	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);

	}

}