package JFrame;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoLamina {

	public static void main(String[] args) {
		FrameLamina marco = new FrameLamina();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class FrameLamina extends JFrame {
	public FrameLamina() {
		setSize(300, 300);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Hola soy una ventana Superpoderosa");
		Lamina lamina = new Lamina();
		add(lamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Pepe Sardina", 110, 100);
		g.drawRect(100, 100, 100, 100);
		g.drawLine(200, 200, 100, 100);
		g.drawLine(100, 200, 200, 100);
		g.drawLine(100, 100, 150, 50);
		g.drawLine(150, 50, 200, 100);
	}
}