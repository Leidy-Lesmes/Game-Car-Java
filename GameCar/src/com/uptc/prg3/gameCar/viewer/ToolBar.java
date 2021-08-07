package com.uptc.prg3.gameCar.viewer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.uptc.prg3.gameCar.viewer.utilities.Utilities;

public class ToolBar extends JPanel {

	/**Buscar exposiciones matriciales
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String PLAY = "Resources/Images/play.png";
	public static final String PAUSE = "Resources/Images/pause.png";
	public static final String RELOAD = "Resources/Images/reload.png";
	public static final String MUSIC = "Resources/Images/music.png";
	public static final String EXIT = "Resources/Images/exit.png";
	public static final String HOME = "Resources/Images/home.png";
	public static final String PROFILE = "Resources/Images/profile.png";
	public static final String SHOP = "Resources/Images/shop.png";
	private JButton playButton, pauseButton, reloadButton, musicButton, exitButton, homeButton, profileButton, shopButton;
	
	public ToolBar() {
		this.setSize(50,800);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.initComponents();
		this.setBackground(Color.BLACK);
		this.setVisible(true);
	}
	
	public void initComponents() {
		homeButton = new JButton();
		this.add(Utilities.buttonImage(homeButton, new Dimension(50, 50), HOME));
		this.add(Utilities.space(new Dimension(50, 50)));
		profileButton = new JButton();
		this.add(Utilities.buttonImage(profileButton, new Dimension(50, 50), PROFILE));
		this.add(Utilities.space(new Dimension(50, 50)));
		shopButton = new JButton();
		this.add(Utilities.buttonImage(shopButton, new Dimension(50, 50), SHOP));
		this.add(Utilities.space(new Dimension(50, 50)));
		playButton = new JButton();
		this.add(Utilities.buttonImage(playButton, new Dimension(50, 50), PLAY));
		this.add(Utilities.space(new Dimension(50, 50)));
		pauseButton = new JButton();
		this.add(Utilities.buttonImage(pauseButton, new Dimension(50, 50), PAUSE));
		this.add(Utilities.space(new Dimension(50, 50)));
		reloadButton = new JButton();
		this.add(Utilities.buttonImage(reloadButton, new Dimension(50, 50), RELOAD));
		this.add(Utilities.space(new Dimension(50, 50)));
		musicButton = new JButton();
		this.add(Utilities.buttonImage(musicButton, new Dimension(50, 50), MUSIC));
		this.add(Utilities.space(new Dimension(50, 50)));
		exitButton = new JButton();
		this.add(Utilities.buttonImage(exitButton, new Dimension(50, 50), EXIT));
		
		
		
		
	}
}
