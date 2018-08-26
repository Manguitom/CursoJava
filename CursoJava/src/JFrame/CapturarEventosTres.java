package JFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CapturarEventosTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoTres marco = new MarcoEventoTres();
		marco.setVisible(true);
		marco.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// muestro mensaje de despedida
				JOptionPane msg = new JOptionPane("Nos vemos luego!", JOptionPane.WARNING_MESSAGE);
				final JDialog dlg = msg.createDialog("Atención");
				dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						dlg.setVisible(false);
					}
				}).start();
				dlg.setVisible(true);
				// salgo del sistema
				System.exit(0);
			};
		});		
	}

}

@SuppressWarnings("serial")
class MarcoEventoTres extends JFrame {
	public MarcoEventoTres() {
		setSize(500, 500);
		setLocation(300, 300);
		setResizable(true);
		setTitle("Chipi chipi");

	}
}
