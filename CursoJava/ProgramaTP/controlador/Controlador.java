package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.MarcoEdicionBicis;
import vista.MarcoPrincipal;

public class Controlador {

	// estoy declarando variables de este tipo de clase y le pongo nombres? no
	// entiendo bien esto
	public MarcoPrincipal marcoPrincipal;
	public MarcoEdicionBicis marcoEdicion;

	// por qué las pone private?
	// creo las variables de ActionListener antes de usarlas
	public ActionListener accionBotonAgregar;
	public ActionListener accionBotonModificar;
	public ActionListener accionBotonEliminar;

	// constructor de la clase controlador, para llamar a una instancia de la misma
	// con determinados parámetros?
	// creo un constructor cuando llamo a el marco principal y otro cuando llamo al
	// marco edición de bicis
	public Controlador(MarcoPrincipal marcoPrincipal, MarcoEdicionBicis marcoEdicion) {
		this.marcoPrincipal = marcoPrincipal;
		this.marcoEdicion = marcoEdicion;
	}

	// no entiendo porqué creo este método sin retorno (void), es una función de la
	// clase Controlador
	public void FuncionControl() {
		// vamos a agregarles funciones a los botones del MarcoPrincipal Agregar,
		// modificar y eliminar
		// para eso tengo que crear el actionListener
		accionBotonAgregar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// Mostrar formulario
				marcoEdicion.setVisible(true);
				// vaciar los campos
			}
		};
		marcoPrincipal.getLamina().getBotonAgregar().addActionListener(accionBotonAgregar);

		// action listener para botón modifica
		accionBotonModificar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// antes de mostrar el marco debería cargar los datos en los campos

				// Mostrar formulario
				marcoEdicion.setVisible(true);
			}
		};
		marcoPrincipal.getLamina().getBotonModificar().addActionListener(accionBotonModificar);

		accionBotonEliminar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// eliminar registro

			}
		};
		marcoPrincipal.getLamina().getBotonEliminar().addActionListener(accionBotonEliminar);

		// el boton aceptar debería verificar si el id ya existe y actualizar los
		// cambios

		// el botón cancelar no hace nada, limpia y oculta la ventana
	}
}
