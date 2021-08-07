package com.uptc.prg3.gameCar.viewer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.uptc.prg3.gameCar.viewer.utilities.Utilities;

public class TittlePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String TITTLE = "Resources/Images/tittleGame.png";
	public static final String BACK = "Resources/Images/backgroundTittlePanel1.jpg";
	public JLabel imageTittle;
	
	public TittlePanel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 1));
		this.initComponents();
		this.setBackground(Color.BLACK);
		this.setVisible(true);
	}

	private void initComponents() {
		imageTittle = new JLabel();
		this.add(Utilities.image(imageTittle, TITTLE, new Dimension(130, 100)));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Toolkit t = Toolkit.getDefaultToolkit();
		Image imageBackground = t.getImage(BACK);
		g.drawImage(imageBackground, 0, 0, 1400, 100, this);
		Image imageCar = t.getImage(TITTLE);//635
		g.drawImage(imageCar, 200, 3, 130, 100, this);
		
	}

}
