//falta poner texto encima

package JFrame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoConImagen {

	public static void main(String[] args) {
		MarcoLaminita marco = new MarcoLaminita();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoLaminita extends JFrame {
	public MarcoLaminita() {
		setSize(550, 750);
		setLocation(250, 200);
		setResizable(true);
		setTitle("Hola soy una ventana Superpoderosa");
		LaminaConImagen lam = new LaminaConImagen();
		add(lam);

	}
}

class LaminaConImagen extends JPanel {
	private Image imagen;

	// constructor de la lamina
	public LaminaConImagen() {
		File input = new File("src/powerpuff.png");
		try {
			imagen = ImageIO.read(input);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se puede encontrar la imagen");

		}
	}

	// el triangulo verde es porque estoy sobreescribiendo el paintComponent
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Dibujo imagen
		g.drawImage(imagen, 0, 0, null);
		int ancho = imagen.getWidth(this);
		int alto = imagen.getHeight(this);

		// Copio imagen
		for (int i = 0; i * ancho <= getWidth(); i++)
			for (int j = 0; j * alto <= getHeight(); j++)
				if (i + j > 0)
					g.copyArea(0, 0, ancho, alto, i * ancho, j * alto);

	}
}
