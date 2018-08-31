package vista;

import javax.swing.JFrame;

public class MarcoEdicionBicis extends JFrame {

	// la pongo private porque en la clase MarcoPrincipal está nombrada también como
	// lamina
	private LaminaEdicionBicis lamina;

	public MarcoEdicionBicis() {
		setResizable(true);
		setUndecorated(false);
		setTitle("Inicio");
		setSize(500, 250);
		setLocation(450, 150);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		lamina = new LaminaEdicionBicis();
		add(lamina);
	}

	public LaminaEdicionBicis getLamina() {
		return lamina;
	}

	public void setLamina(LaminaEdicionBicis lamina) {
		this.lamina = lamina;
	}
}
