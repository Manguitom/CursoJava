package ProgramaUno;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MarcoPrincipal extends JFrame {
    public MarcoPrincipal() {// cuando llamo new se invoca al constructor en principio
        setResizable(true);
        setUndecorated(false);
        setTitle("Inicio");
        setBounds(500, 500, 600, 300); // x, y, horizontal, vertical
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // dispose(); sirve para cerrar la ventana
        LaminaPrincipal lamina = new LaminaPrincipal();
        add(lamina);
    }
}