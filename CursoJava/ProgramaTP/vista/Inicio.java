package vista;

import javax.swing.JFrame;

import controlador.Controlador;

public class Inicio {

	public static void main(String[] args) {
		// siempre tengo que crear el marco y ocultarlo? o puedo crearlo en otros
		// momentos?
		// esto llevaría a llamar nuevamente al controlador?
		MarcoEdicionBicis marcoEdicion = new MarcoEdicionBicis();

		// agregamos el marco, que a su vez contiene la lámina principal
		MarcoPrincipal marcoPrincipal = new MarcoPrincipal();
		marcoPrincipal.setVisible(true);

		// agregamos el controlador para darle funcionamiento a las vistas, antes agrego
		// los getters y setters para
		// acceder a los distintos elementos de las clases creadas

		// es necesario hacerlo con todas las vistas al inicio del programa o a medida
		// que abrimos las distintas vistas?

		// primero agrego controlador para la vista principal
		Controlador control = new Controlador(marcoPrincipal, marcoEdicion);
		// me faltaba llamar al metodo/funcion Controlador() de la clase Controlador
		control.FuncionControl();
	}

}
