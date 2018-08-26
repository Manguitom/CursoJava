package JFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoImagen {

	public static void main(String[] args) {
		MarcoCentrado marco = new MarcoCentrado();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}
}

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = mipantalla.getScreenSize();
		int ancho = tamano.width;
		int altura = tamano.height;

		setSize(ancho / 2, altura / 2);
		setLocation(ancho / 4, altura / 4);

		Image icono = mipantalla.getImage("src/oompa.jpeg");
		setIconImage(icono);
		
	}
}