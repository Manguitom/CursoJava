package ProgramaUno;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LaminaAgregarModificar extends JPanel {

	private JButton botonAceptar;
	private JButton botonCancelar;

	public LaminaAgregarModificar() {
		// hago el borderlayout y ubico titulo al norte
		setLayout(new BorderLayout(10, 10));
		JLabel lema_superior = new JLabel("Editar Bicicleta", JLabel.CENTER);
		add(lema_superior, BorderLayout.NORTH);

		// coloco los textbox y combobox en el centro
		JTextField campoMarca = new JTextField("Marca", 30);
		JTextField campoModelo = new JTextField("Modelo", 30);
		JTextField campoRodado = new JTextField("Rodado", 30);

		// se crea un combobox y se agregan los nombre de los tipos de letras
		//me gustaria que estuviera centrado como en el ejemplo cada label a la izq y textbox a la derecha
		JComboBox<String> comboAnos = new JComboBox<String>();
		comboAnos.setEditable(false);
		comboAnos.addItem("2001");
		comboAnos.addItem("2002");
		comboAnos.addItem("2003");
		comboAnos.addItem("2004");
		comboAnos.addItem("2005");

		// se agrega el combo a una lamina situada en el borde centro
		JPanel laminaCombo = new JPanel();
		laminaCombo.add(new JLabel("Marca:"));
		laminaCombo.add(campoMarca);
		laminaCombo.add(new JLabel("Modelo:"));
		laminaCombo.add(campoModelo);
		laminaCombo.add(new JLabel("Rodado:"));
		laminaCombo.add(campoRodado);
		laminaCombo.add(new JLabel("A�o:"));
		laminaCombo.add(comboAnos);
		add(laminaCombo, BorderLayout.CENTER);
		
		//botones aceptar cancelar
		botonAceptar = new JButton("Aceptar");
		botonCancelar = new JButton("Cancelar");
		
		//acciones de los botones
		botonAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//no puedo hacer que funcione esto:
				//MarcoAgregarModificar.dispose();		
				System.out.println("MarcoAgregarModificar Cerrado");	
			}
		});
		
		botonCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//panel inferior para botones y los agrego
		JPanel botonesinferior = new JPanel();
		botonesinferior.add(botonAceptar);
		botonesinferior.add(botonCancelar);
		add(botonesinferior, BorderLayout.SOUTH);
	}
}
