package com.uptc.prg3.gameCar.model;

public class Mine {

	public static final int VALUE = 15;
	public static final int SIZE = 10;
	private int x;
	private int y;
	
	public Mine(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public static int getValue() {
		return VALUE;
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
	
	
}