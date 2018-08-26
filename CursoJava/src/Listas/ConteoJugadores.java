package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConteoJugadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador("Miguel", "Angel", 21);
		Jugador j2 = new Jugador("Vincent", "Van Gogh", 45);
		Jugador j3 = new Jugador("Usain", "Bolt", 28);

		// declaro e inicializo la variable
		float promedioedad = 0;
		// inicializamos la lista de jugadores
		// se especifica el tipo de datos de elementos de la lista
		// entre (< y >) para evitar insertar otro de datos
		List<Jugador> listadejugadores = new ArrayList<Jugador>();

		// despues de crear la lista agregamos los items a la misma con el método add();
		listadejugadores.add(j1);
		listadejugadores.add(j2);
		listadejugadores.add(j3);

		/*
		 * recuperamos un seleccionador en nuestra lista, no usamos new porque ya existe
		 * en la misma, el Iterator siempre empieza en posición 0 (porque tiene base en
		 * 0 y no en 1, osea que la posición inicial va a ser siempre 0)
		 */
		Iterator<Jugador> seleccioncelda = listadejugadores.iterator();

		// vamos a usar un loop que se llama while para recorrer nuestra lista
		while (seleccioncelda.hasNext()) {
			// mientras haya un Next jugador sigue funcionando el loop
			Jugador revisar = seleccioncelda.next();
			// vamos sumando la edad de los jugadores a medida que pasa el loop
			// y lo dividimos por el tamaño de la lista (cantidad de jugadores) con el
			// método size()
			// el += es lo mismo que escribir: "promedioedad = promedio +"
			promedioedad += (double)revisar.getEdad() / listadejugadores.size();
			//el casteo (double) es porque cuando dividimos dos enteros el resultado lo castea
			//automáticamente a un número entero
			//también podria usar en vez de "Jugador revisar = ..." directamente:
			//promedioedad += seleccioncelda.next().getEdad() / listadejugadores.size();
			
		}
		
		//después del loop while escribo el resultado de promedioedad
		System.out.println("El promedio de edad es: " + promedioedad);
	}

}


