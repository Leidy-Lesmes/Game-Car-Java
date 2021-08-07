package com.uptc.prg3.gameCar.viewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class JPanelGame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String BACK = "Resources/Images/spaCircuito1.jpg";
	public static final String CAR = "Resources/Images/car.png";
	public static final String FLAG = "Resources/Images/flagRacing.png";


	public JPanelGame() {
		this.setBackground(Color.BLACK);
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Toolkit t = Toolkit.getDefaultToolkit();
		
		Image imageBackground = t.getImage(BACK);
		g.drawImage(imageBackground, 0, 0, 1300, 800, this);
		
		Image imageCar = t.getImage(CAR);
		g.drawImage(imageCar, 700, 98, 100, 70, this);
		
		Image imageFlag = t.getImage(FLAG);
		g.drawImage(imageFlag, 310, 450, 100, 100, this);
		
	}

}
