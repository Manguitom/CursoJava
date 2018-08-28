package vista;

import javax.swing.JFrame;

public class MarcoEdicionBicis extends JFrame {
	public MarcoEdicionBicis() {
		setResizable(true);
		setUndecorated(false);
		setTitle("Inicio");
		setSize(500, 250);
		setLocation(450, 150);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		LaminaEdicionBicis lamina = new LaminaEdicionBicis();
		add(lamina);
	}
}
