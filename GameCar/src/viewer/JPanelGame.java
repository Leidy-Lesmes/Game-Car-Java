package viewer;

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
	public static final String back = "Resources/Images/gameBackground.jpg";

	 public void paint (Graphics g)
	    {
	        super.paint(g);
	        Toolkit t = Toolkit.getDefaultToolkit ();
	        Image imagen = t.getImage (back);
	        g.drawImage(imagen, 0, 0, 1100, 600, Color.BLACK, this);
	    }
}
