package com.uptc.prg3.gameCar.model;



public class Car {
	
	public static final int SIZE = 10;
	public static final int RANGE_MOTION = 5;
	private int name;
	private int x; // cambiar por cte que tenga el punto inicial
	private int y;
	
	
	
	public Car(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveLeft() {
		if (x - RANGE_MOTION > 0) {
			x -= RANGE_MOTION;
		}
	}

	public void moveRight() {
		if (x + (SIZE) + (RANGE_MOTION * 4) < 1300) {
			x += RANGE_MOTION;
		}
	}
	
	
	public int getName() {
		return name;
	}
	public static int getSize() {
		return SIZE;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public static int getRangeMotion() {
		return RANGE_MOTION;
	} 
}