package Listas;

import java.util.Stack;

public class ConteoJugadoresStack {

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Miguel", "Angel", 21);
		Jugador j2 = new Jugador("Vincent", "Van Gogh", 45);
		Jugador j3 = new Jugador("Usain", "Bolt", 28);
		
		Stack<Jugador> piladejugadores = new Stack<Jugador>();
		
		piladejugadores.push (j1);
		piladejugadores.push (j2);
		piladejugadores.push (j3);
		
		//el ! es NOT, o sea mientras piladejugadores NO esté empty seguimos el loop while
		while (!piladejugadores.empty()) {
		    // mostramos el nombre del jugador en pantalla
		    System.out.println (piladejugadores.pop().getNombrecompleto());
		}
	}
	
	
}
