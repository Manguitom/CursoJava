package modelo;

public class Bicis {

	protected Long id;
	protected String marca;
	protected String modelo;
	protected Integer ano;
	protected String rodado;
	protected Double precio;
	protected Boolean estaFuncionando;

	public Bicis() {
	}

	public Bicis(Long id, String marca, String modelo, Integer ano, String rodado, Double precio,
			Boolean estaFuncionando) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.rodado = rodado;
		this.rodado = rodado;
		this.precio = precio;
		this.estaFuncionando = estaFuncionando;
	}
}
