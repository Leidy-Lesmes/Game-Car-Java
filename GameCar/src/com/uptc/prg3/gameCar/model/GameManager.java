package com.uptc.prg3.gameCar.model;

import java.util.ArrayList;

public class GameManager {

	private Car car;
	private ArrayList<Mine> mines;
	private ArrayList<Life> lifes;
	
	
	public GameManager() {
		// TODO Auto-generated constructor stub
	}


	public Car getCar() {
		return car;
	}


	public ArrayList<Mine> getMines() {
		return mines;
	}


	public ArrayList<Life> getLifes() {
		return lifes;
	}
}