package model;

public class Car {
	
	public static final int SIZE = 10;
	public static final int RANGE_MOTION = 5;
	private int name;
	private int x;
	private int y;
	
	
	public Car(int name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
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