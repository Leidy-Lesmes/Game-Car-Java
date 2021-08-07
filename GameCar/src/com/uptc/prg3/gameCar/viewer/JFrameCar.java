package com.uptc.prg3.gameCar.viewer;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class JFrameCar extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelGame jPanelGame;
	private ToolBar toolBar;
	private TittlePanel tittlePanel;
	
	public JFrameCar() {
		 this.setSize(1400, 920);
	        this.setTitle("Car");
	        this.setResizable(false);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        tittlePanel  = new TittlePanel();
	        toolBar = new ToolBar();
	        jPanelGame = new JPanelGame();
	        this.add(tittlePanel, BorderLayout.NORTH);
	        this.add(jPanelGame, BorderLayout.CENTER);
	        this.add(toolBar, BorderLayout.WEST);
	        this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameCar();
	}
}