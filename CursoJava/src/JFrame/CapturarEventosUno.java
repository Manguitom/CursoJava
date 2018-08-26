package JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CapturarEventosUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoUno marco = new MarcoEventoUno();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEventoUno extends JFrame {
	public MarcoEventoUno() {
		setSize(500, 500);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Chiqui bum chiqui bum bum");

		LaminaEventoUno laminauno = new LaminaEventoUno();
		add(laminauno);

	}
}

class LaminaEventoUno extends JPanel implements ActionListener {
	private JButton botonAmarillo;
	private JButton botonAzul;
	private JButton botonRojo;

	public LaminaEventoUno() {
		botonAmarillo = new JButton("Amarillo Patito");
		botonAzul = new JButton("Azulino Mar");
		botonRojo = new JButton("Rojo Canario");

		botonAmarillo.addActionListener(this);
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		// añado botones al panel
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
	}

	// class AccionColor implements ActionListener {
	// private Color colorDeFondo;

	// public AccionColor(Color c) {
	// colorDeFondo = c;
	// }

	public void actionPerformed(ActionEvent e) {
		// averiguo origen del evento
		Object origen = e.getSource();
		// se especifica el color de fondo de la lamina
		if (origen == botonAmarillo)
			setBackground(Color.YELLOW);
		else if (origen == botonAzul)
			setBackground(Color.BLUE);
		else if (origen == botonRojo)
			setBackground(Color.RED);
	}

	// public void actionPerformed(ActionEvent e) {
	// setBackground(colorDeFondo);
	// }
	// }

	// void hacerBoton(String nombre, Color colorDeFondo) {

	// // Creamos boton
	// JButton boton = new JButton(nombre);
	// // Añadimos botón a lámina
	// add(boton);
	// // Añadimos listener
	// boton.addActionListener(new ActionListener() {
	// @Override
	// public void actionPerformed(ActionEvent e) {
	// // se especifica el color de fondo de la lamina
	// setBackground(colorDeFondo);
	// }
	// });
	// }
}