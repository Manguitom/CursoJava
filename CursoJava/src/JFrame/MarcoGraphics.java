package JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoGraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameLaminaNuevo marco = new FrameLaminaNuevo();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class FrameLaminaNuevo extends JFrame {
	public FrameLaminaNuevo() {
		setSize(500, 500);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Hola soy una ventana Superpoderosa");
		LaminaNueva lamina = new LaminaNueva();
		add(lamina);
	}
}

class LaminaNueva extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		setBackground(Color.WHITE.darker());

		// elijo con que color trabajo
		g2.setPaint(Color.RED.darker());

		// dibujar rectangulo
		double xing = 100;
		double ysup = 100;
		double anchura = 200;
		double altura = 150;

		Rectangle2D rectangulo = new Rectangle2D.Double(xing, ysup, anchura, altura);
		g2.setColor(getForeground());
		g2.fill(rectangulo);
		g2.setColor(SystemColor.desktop);

		// dibujar elipse inscrita
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.fill(elipse);

		// dibujar linea diagonal
		g2.draw(new Line2D.Double(xing, ysup, xing + anchura, ysup + altura));

		// dibujar un circulo con el mismo centro
		double xcentro = rectangulo.getCenterX();
		double ycentro = rectangulo.getCenterY();
		double radio = 150;

		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(xcentro, ycentro, xcentro + radio, ycentro + radio);
		g2.setColor(Color.WHITE);
		g2.draw(circulo);

		Graphics2D g3 = (Graphics2D) g;
		g2.setPaint(Color.WHITE.brighter());
		String texto = "Vainilla";
		g.drawString(texto, (int) xcentro, (int) ycentro);
	}
}