package model;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Car> cars;
	private int coinPurse;
	private ArrayList<Life> lifes;
	
	public Store(ArrayList<Car> cars, int coinPurse, ArrayList<Life> lifes) {
		super();
		this.coinPurse = coinPurse;
	}

	public void buys() {
		// compra de carro
		//verificar si las monedas son suficientes para realizar una compra
		//en caso de que si restar
	}
	
	public void updateCar() {
		
	}
	
	public void updateCoins() {
		
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public int getCoinPurse() {
		return coinPurse;
	}

	public ArrayList<Life> getLifes() {
		return lifes;
	}
	
	
}