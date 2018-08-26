package JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoFuente {

	public static void main(String[] args) {
		FrameTexto marco = new FrameTexto();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FrameTexto extends JFrame {
	public FrameTexto() {
		setSize(300, 300);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Hola soy una ventana Superpoderosa");
		LaminaConTexto lamina = new LaminaConTexto();
		add(lamina);
	}
}

class LaminaConTexto extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font fuente = new Font("Sans Serif", Font.BOLD, 20);
		g2.setFont(fuente);
		g2.setColor(Color.PINK);

		String nombre = "Las Chicas Superpoderosas";

		// ejemplo con los bounds dibujados
		// https://stackoverflow.com/questions/368295/how-to-get-real-string-height-in-java
		// medimos el tamaño del mensaje "impreso" en pantalla
		FontRenderContext contexto = g2.getFontRenderContext();
		Rectangle2D limites = fuente.getStringBounds(nombre, contexto);

		// obtenemos posicion
		double x = (getWidth() - limites.getWidth()) / 2;
		double y = (getHeight() - limites.getHeight()) / 2;

		g2.drawString(nombre, (int) x, (int) y);

	}
}