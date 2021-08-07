package com.uptc.prg3.gameCar.model;

public class Obstacle {

	public static final int VALUE = 5;
	public static final int SLEEP = 0;
	private int x;
	private int y;
	
	public Obstacle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getValue() {
		return VALUE;
	}

	public static int getSleep() {
		return SLEEP;
	} 
	
}