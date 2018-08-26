
public class Empleado {
	private static String nombreEmpresa = "Sancor";
	private final String COLORBANDERA = "celeste";
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldo;

	public Empleado() {
	}

	public Empleado(String nombre, String apellido, int edad, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;

	}

	public String devolverEmpresa() {
		return nombreEmpresa;
	}

	public double calcularSueldo() {
		return sueldo;
	}

	public double calcularSueldo(double aumento) {
		return sueldo * aumento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// funcion get & set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public static void setNombreEmpresa(String nombreEmpresa) {
		Empleado.nombreEmpresa = nombreEmpresa;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCOLORBANDERA() {
		return COLORBANDERA;
	}

}