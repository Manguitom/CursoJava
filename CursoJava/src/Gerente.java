
public class Gerente extends Empleado {

	public double aumento;
	
	public Gerente(double sueldo, double aumento) {
		super.setSueldo(sueldo);
		this.aumento = aumento;

	}

	public double calcularSueldo() {
		return super.getSueldo() * aumento;
	}
	
}
