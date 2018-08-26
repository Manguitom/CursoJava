package JFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame; //me ahorro de escribir la ruta completa a JFrame

public class MarcoSencillo { // no puede haber dos clases publicas dentro del mismo archivo
	
	public static void main(String[] args) { // es el metodo con el que arranca el programa
		Marco marco = new Marco(); // instanciación del objeto Marco()
		//for (int i = 0; i<5; i++) {
		//	Marco i = new Marco();
		//}
	}
	//esto es un ejemplo de un try catch
	public void read(String nombrefichero) {
        InputStream in = null;
		try {
			in = new FileInputStream(nombrefichero);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			while ((in.read()) != -1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//termina ejemplo de try catch
}

class Marco extends JFrame {
	public Marco() {// cuando llamo new se invoca al constructor en principio
		setBounds(300, 300, 300, 300); //x, y, horizontal, vertical
		setResizable(true);
		setTitle("Hola soy una Ventana Mágica");
		setUndecorated(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //el programa sigue corriendo, se oculta la ventana
		//dispose(); sirve para cerrar la ventana
	}
}