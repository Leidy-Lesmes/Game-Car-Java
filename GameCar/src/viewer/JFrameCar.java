package viewer;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class JFrameCar extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanelGame jPanelGame;
	
	public JFrameCar() {
		 this.setSize(1300, 800);
	        this.setTitle("Car");
	        this.setResizable(false);
	        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);

	        jPanelGame = new JPanelGame();
	        this.add(jPanelGame, BorderLayout.CENTER);

	        this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new JFrameCar();
	}

}
