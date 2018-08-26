package ProgramaUno;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MarcoAgregarModificar extends JFrame {
	public MarcoAgregarModificar() {
		setResizable(false);
		setUndecorated(false);
		setTitle("Agregar o modificar datos");
		setBounds(550, 550, 400, 250); // x, y, horizontal, vertical
		// setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		dispose(); // sirve para cerrar la ventana
		LaminaAgregarModificar laminaam = new LaminaAgregarModificar();
		add(laminaam);

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

}