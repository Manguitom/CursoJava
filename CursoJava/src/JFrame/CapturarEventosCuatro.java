package JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CapturarEventosCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// estaría bueno hacer una ventana que modifique su tamaño apretando las
		// flechitas
		MarcoEventoCuatro marco = new MarcoEventoCuatro();
		marco.setVisible(true);
		marco.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// salgo del sistema
				System.exit(0);
			};
		});
	}
}

class MarcoEventoCuatro extends JFrame {
	public MarcoEventoCuatro() {
		setSize(500, 500);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Chipi chipi");

		LaminaBotonesCuatro laminacuatro = new LaminaBotonesCuatro();
		add(laminacuatro);
	}
}

class LaminaBotonesCuatro extends JPanel implements ActionListener {
	private JButton botonAmarillo;

	public LaminaBotonesCuatro() {
		setLayout(new BorderLayout(20, 20));
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");

		botonAmarillo.addActionListener(this);

		// add(botonAmarillo, BorderLayout.NORTH);
		add(botonRojo, BorderLayout.CENTER);

		JPanel contenedor = new JPanel();
		contenedor.add(botonAmarillo);
		add(contenedor, BorderLayout.NORTH);

		JPanel contenedor2 = new JPanel();
		contenedor2.add(botonAzul);
		add(contenedor2, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		Object origen = e.getSource();
		if (origen == botonAmarillo)
			setBackground(Color.YELLOW);
	}
}