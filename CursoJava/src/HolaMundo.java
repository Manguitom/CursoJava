public class HolaMundo {

	public static void main(String[] args) {

		 Empleado e1 = new Empleado("Pepe", "Remate", 25, 20300);
		 String nombre = e1.devolverEmpresa();
		 String nombreEmpleado = e1.getNombre()+" "+e1.getApellido();
		 System.out.println(nombreEmpleado + " trabaja en " + nombre);
		 System.out.println("Tiene un sueldo de "+e1.calcularSueldo(2));

		 
		 
		Empleado secretaria = new Secretaria(150.0, 2.0, "Maria", "Pepona");
//		Empleado gerente = new Gerente(200, 2);
		double sueldosecretaria = secretaria.calcularSueldo();
		String nombresecretaria = secretaria.getNombre();
		String apellidosecretaria = secretaria.getApellido();
		String nyasecretaria = nombresecretaria+" "+apellidosecretaria;
		System.out.println("La Secretaria "+nyasecretaria+" tiene un sueldo de: "+sueldosecretaria);

	}

}
