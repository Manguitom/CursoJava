package ProgramaUno;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class LaminaPrincipal extends JPanel {

	private JButton botonAgregar;
	private JButton botonModificar;
	private JButton botonEliminar;

	public LaminaPrincipal() {
		setLayout(new BorderLayout(10, 10));
		JLabel titulo = new JLabel("Bicyshop Bicicletería", JLabel.CENTER);
		add(titulo, BorderLayout.NORTH);

		// agregar tabla!

		// creo un array con los datos de la tabla, más adelante se toman de la base de datos
		Object[][] data = { { "Fuji", "Aloha", "27.5", "2009" }, { "Fuji", "Aloha 2.0", "27.5", "2009" },
				{ "Fuji", "Aloha 3.0", "27.5", "2010" }, { "Fuji", "Aloha 4.0", "27.5", "2015" },
				{ "Specialized", "Tarmac", "27.5", "2004" }, { "Specialized", "Tarmac 2.0", "27.5", "2005" },
				{ "Specialized", "Tarmac 3.0", "27.5", "2006" }, { "Specialized", "Tarmac Elite", "27.5", "2018" },
				{ "Pinarello", "Vertex", "27.5", "2019" }, { "Pinarello", "Sesto Elemento", "27.5", "2016" },
				{ "Pinarello", "Vertex", "27.5", Integer.valueOf(2009) },
				{ "Pinarello", "Dogma", "27.5", Integer.valueOf(2019) },
				{ "Pinarello", "Dogma F10", "27.5", Integer.valueOf(2019) },
				{ "Pinarello", "Dogma F101 Giro D'Italia", "27.5", Integer.valueOf(2019) }, };

		// creo un array con los nombres de las columnas, para agregar como parámetro a
		// DefaultTableModel
		String[] columnNames = { "Marca", "Modelo", "Rodado", "Año" };

		// primero importo el modelo de tabla
		DefaultTableModel modelotabla = new DefaultTableModel(data, columnNames);

		// despues agrego la tabla con ese modelo
		JTable tablita = new JTable(modelotabla) {

			// con este corchete deshabilitamos la edición
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};

		// esto es para tener una scrollbar en la tabla
		JScrollPane scrollpane = new JScrollPane(tablita);

		// habilitamos la seleción deshabilitada por defecto para elegir columnas y
		// celdas
		tablita.setCellSelectionEnabled(true);
		tablita.setRowSelectionAllowed(true);

		// agregamos la bendita tabla, que antes se convirtió en un scrollpane
		add(scrollpane, BorderLayout.CENTER);

		// agregar botones de abajo de todo
		botonAgregar = new JButton("Agregar");
		botonModificar = new JButton("Modificar");
		botonEliminar = new JButton("Eliminar");

		// les agrego los trigger para reaccionar al apretar
		botonAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        MarcoAgregarModificar marcoagrega = new MarcoAgregarModificar();
		        marcoagrega.setVisible(true);
			}
		});
		botonModificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        MarcoAgregarModificar marcoagrega = new MarcoAgregarModificar();
		        marcoagrega.setVisible(true);
			}
		});
		botonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// showConfirmDialog devolverá Un entero que representa la opción seleccionada
				int seleccion = JOptionPane.showConfirmDialog(null, "Esta seguro de borrar esta entrada?", "Atención",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
				if (seleccion == JOptionPane.OK_OPTION) {
					System.out.println("Se borró la entrada");
					//como escribo aca que el dialogo se borre? O es por defecto que despues de la accion se borre?
				}
				if (seleccion == JOptionPane.CANCEL_OPTION) {
					System.out.println("Se canceló la operación");

				}
			}
		});

		// este es un nuevo JPanel / Lámina para posicionar los botones al SOUTH,
		// como se rige por el relleno "Flow" me los acomoda acorde al tamaño de la
		// ventana (probar resize a la ventana)
		JPanel botonesinferior = new JPanel();
		botonesinferior.add(botonAgregar);
		botonesinferior.add(botonModificar);
		botonesinferior.add(botonEliminar);
		add(botonesinferior, BorderLayout.SOUTH);
	}
}
