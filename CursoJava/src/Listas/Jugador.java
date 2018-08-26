package Listas;

public class Jugador {
	private String nombre;
	private String apellido;
	private int edad;

	public Jugador(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// este m�todo lo agrego para poder obtener el valor edad para determinada
	// instancia de la funci�n
	// como vemos la llamo despu�s del punto, por ejemplo "j.getEdad()"
	public int getEdad() {
		return edad;
	}

	// este metodo getNombrecompleto lo creo para el ejemplo de un Stack (que se
	// rige por FIFO, osea
	// first in first out)
	public String getNombrecompleto() {
		return nombre + " " + apellido;

	}
}
