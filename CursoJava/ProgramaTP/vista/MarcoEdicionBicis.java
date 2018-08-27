package vista;

import javax.swing.JFrame;

public class MarcoEdicionBicis extends JFrame {
	public MarcoEdicionBicis() {
		setResizable(true);
		setUndecorated(false);
		setTitle("Inicio");
		setSize(600, 300);
		setLocation(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaEdicionBicis lamina = new LaminaEdicionBicis();
		add(lamina);
	}
}
