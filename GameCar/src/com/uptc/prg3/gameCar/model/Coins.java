package com.uptc.prg3.gameCar.model;

public class Coins {
	
	public static final int VALUE = 10;
	public static final int SIZE = 25;
	private int x;
	private int y;
	
	public Coins(int x, int y) {
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