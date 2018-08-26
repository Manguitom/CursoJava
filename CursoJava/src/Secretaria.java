
public class Secretaria extends Empleado {

	public double aumento;

	public Secretaria(double sueldo, double aumento, String nombre, String apellido) {
		super.setSueldo(sueldo);
		this.aumento = aumento;	
		super.setNombre(nombre);
		super.setApellido(apellido);
	}

	public double calcularSueldo() {
		return super.getSueldo() * aumento;
	}
}
