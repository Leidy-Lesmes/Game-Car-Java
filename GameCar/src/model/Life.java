package model;

public class Life {

	public static final int MAXIMUM_VALUE = 100; // EL MAYOR VALOR DE VIDA 
	public static final int VALUE = 10; // EL VALOR QUE TIENE RECOLECTAR UNA VIDA
	public static final int SIZE = 25;
	private int x;
	private int y;
	
	
	public Life(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public static int getMaximumValue() {
		return MAXIMUM_VALUE;
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