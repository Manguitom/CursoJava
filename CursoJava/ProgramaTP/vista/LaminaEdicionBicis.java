package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.time.Year;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LaminaEdicionBicis extends JPanel {

	private JButton botonAceptar;
	private JButton botonCancelar;

	public LaminaEdicionBicis() {
		// hago el borderlayout y ubico titulo al norte
		setLayout(new BorderLayout(10, 10));
		JLabel lema_superior = new JLabel("Editar Bicicleta", JLabel.CENTER);
		add(lema_superior, BorderLayout.NORTH);

		// coloco los textbox y combobox en el centro
		JTextField campoMarca = new JTextField("Marca", 30);
		JTextField campoModelo = new JTextField("Modelo", 30);
		JTextField campoRodado = new JTextField("Rodado", 30);

		// se crea un combobox y se agregan los nombre de los tipos de letras
		// me gustaria que estuviera centrado como en el ejemplo cada label a la izq y
		// textbox a la derecha
		JComboBox<String> comboAnos = new JComboBox<String>();
		comboAnos.setEditable(false);

		// hago for loop para completar desde el 1900 al año actual
		// este metodo para conseguir año es antiguo, prefiero usar el nuevo
		// java.time.Year
		// pero, porqué tengo que obtener el valor así?
		// porque no puedo declarar el start del loop for antes?
		// Calendar now = Calendar.getInstance();
		int anoActual = Year.now().getValue();
		for (int start = 1900; start <= anoActual; start++) {
			// System.out.println(start);
			comboAnos.addItem(String.valueOf(start));
		}

		// botón radio de si está funcionando
		// este boolean lo uso con el dao recuperado
		// boolean seleccionado = tamanio == TAMFUENTE;
		JPanel laminaBotonesRadio = new JPanel();
		JRadioButton botonRadioSi = new JRadioButton("Si");
		JRadioButton botonRadioNo = new JRadioButton("No");

		// este grupo sirve para hacer la selección a uno u a otro
		ButtonGroup grupoBotonesRadio = new ButtonGroup();
		grupoBotonesRadio.add(botonRadioSi);
		grupoBotonesRadio.add(botonRadioNo);

		// agregamos los botones si/no a la lámina
		laminaBotonesRadio.add(botonRadioSi);
		laminaBotonesRadio.add(botonRadioNo);

		// se agrega el combo a una lamina organizada con gridlayout en vez de
		// flowlayout situada en el borde centro
		JPanel laminaCombo = new JPanel();
		GridLayout experimentLayout = new GridLayout(5, 2);
		laminaCombo.setLayout(experimentLayout);
		laminaCombo.add(new JLabel("Marca:"));
		laminaCombo.add(campoMarca);
		laminaCombo.add(new JLabel("Modelo:"));
		laminaCombo.add(campoModelo);
		laminaCombo.add(new JLabel("Rodado:"));
		laminaCombo.add(campoRodado);
		laminaCombo.add(new JLabel("Año:"));
		laminaCombo.add(comboAnos);
		laminaCombo.add(new JLabel("Funciona:"));
		laminaCombo.add(laminaBotonesRadio);
		add(laminaCombo, BorderLayout.CENTER);

		// botones aceptar cancelar
		botonAceptar = new JButton("Aceptar");
		botonCancelar = new JButton("Cancelar");

		// faltan los listener de los botones

		// panel inferior para botones y los agrego
		JPanel botonesinferior = new JPanel();
		botonesinferior.add(botonAceptar);
		botonesinferior.add(botonCancelar);
		add(botonesinferior, BorderLayout.SOUTH);
	}
}
