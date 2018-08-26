package ProgramaUno;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Inicio {
    public static void main(String[] args) {
        MarcoPrincipal marcoinicio = new MarcoPrincipal();
        //el .setVisible lo tuve que poner acá para que funcionara
        marcoinicio.setVisible(true);
        marcoinicio.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // salgo del sistema
                System.exit(0);
            };
        });
    }
}