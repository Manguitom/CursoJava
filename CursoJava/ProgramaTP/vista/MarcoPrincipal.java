package vista;

import javax.swing.JFrame;

public class MarcoPrincipal extends JFrame {
	
	//no se porque me pide que haya una variable que declare estos campos/datos/objetos para hacer setter y getter
	private LaminaPrincipal lamina;
	
	public MarcoPrincipal() {
		setResizable(true);
		setUndecorated(false);
		setTitle("Inicio");
		setSize(750, 350);
		setLocation(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lamina = new LaminaPrincipal();
		add(lamina);
	}

	public LaminaPrincipal getLamina() {
		return lamina;
	}

	public void setLamina(LaminaPrincipal lamina) {
		this.lamina = lamina;
	}
}
