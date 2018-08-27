package vista;

import javax.swing.JFrame;

public class MarcoPrincipal extends JFrame {
	public MarcoPrincipal() {
		setResizable(true);
		setUndecorated(false);
		setTitle("Inicio");
		setSize(600, 300);
		setLocation(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
	}
}
