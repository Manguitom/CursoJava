package vista;

public class Inicio {

	public static void main(String[] args) {
		// agregamos el marco, que a su vez contiene la lámina principal
		MarcoPrincipal marco = new MarcoPrincipal();
		marco.setVisible(true);

		MarcoEdicionBicis marcoedicion = new MarcoEdicionBicis();
		marcoedicion.setVisible(true);
		// agregamos el controlador para darle funcionamiento a las vistas
		// es necesario hacerlo con todas las vistas?
		// Controlador control = new Controlador(marco,marcoFormAutos);
		// controlador.control();
	}

}
