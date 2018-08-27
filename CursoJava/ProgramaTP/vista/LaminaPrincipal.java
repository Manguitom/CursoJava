package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class LaminaPrincipal extends JPanel {

	private JButton botonAgregar;
	private JButton botonModificar;
	private JButton botonEliminar;

	public LaminaPrincipal() {
		setLayout(new BorderLayout(20, 20));
		// seccion titulo
		JLabel titulo = new JLabel("Bicyshop Bicicletería", JLabel.CENTER);
		add(titulo, BorderLayout.NORTH);

		// seccion tabla, faltan los datos que va a llevar la tabla, ya tengo las columnas
		String[] nombresColumnas = { "Id", "Marca", "Modelo", "Año", "Rodado", "Precio", "Funcionando?" };
		DefaultTableModel modelotabla = new DefaultTableModel(null, nombresColumnas);
		JTable tabla = new JTable(modelotabla) {
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane tablaConScroll = new JScrollPane(tabla);
		add(tablaConScroll, BorderLayout.CENTER);

		// seccion botones
		botonAgregar = new JButton("Agregar");
		botonModificar = new JButton("Modificar");
		botonEliminar = new JButton("Eliminar");

		// faltan los action listener de los botones
		JPanel botonesinferior = new JPanel();
		botonesinferior.add(botonAgregar);
		botonesinferior.add(botonModificar);
		botonesinferior.add(botonEliminar);
		add(botonesinferior, BorderLayout.SOUTH);
	}
}
