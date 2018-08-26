package JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CapturarEventosDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoDos marco = new MarcoEventoDos();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEventoDos extends JFrame {
	public MarcoEventoDos() {
		setSize(500, 500);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Chiqui bum chiqui bum bum");

		LaminaEventoDos laminauno = new LaminaEventoDos();
		add(laminauno);
	}
}

class LaminaEventoDos extends JPanel {

	// constructor de la lamina
	public LaminaEventoDos() {
		JButton botonAmarillo = new JButton("Amarillo");
		// JButton botonAzul = new JButton(new ImageIcon("noexisto.png"));
		JButton botonAzul = new JButton("Chubipapilla");
		JButton botonRojo = new JButton("Rojo");

		// AccionColor accionAmarillo = new AccionColor(Color.YELLOW, this);
		AccionColorDos accionAmarillo = new AccionColorDos(Color.YELLOW, this);
		AccionColorDos accionAzul = new AccionColorDos(Color.BLUE, this);
		AccionColorDos accionRojo = new AccionColorDos(Color.RED, this);

		botonAmarillo.addActionListener(accionAmarillo);
		botonAzul.addActionListener(accionAzul);
		botonRojo.addActionListener(accionRojo);

		setLayout(new BorderLayout());
		add(botonAmarillo, BorderLayout.NORTH);
		add(botonAzul, BorderLayout.EAST);
		add(botonRojo, BorderLayout.WEST);

	}

}

class AccionColorDos implements ActionListener {
	// este es un atributo de la clase
	private Color colorDeFondo;
	private LaminaEventoDos lamina;

	public AccionColorDos(Color c, LaminaEventoDos lamina) {
		// public AccionColor(Color c) {
		colorDeFondo = c;
		this.lamina = lamina;
	}

	public void actionPerformed(ActionEvent e) {
		// se especifica el color de la lamina
		this.lamina.setBackground(colorDeFondo);
		// setBackground(colorDeFondo);
	}
}