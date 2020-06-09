import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main {	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame_1 = new mainFrame("Eight Video Club Management System");
				frame_1.setSize(900,200);
				frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame_1.setVisible(true);
				frame_1.setResizable(false);
				frame_1.getContentPane().setBackground(new Color(178, 34, 34));
				frame_1.getContentPane().setForeground(new Color(0, 0, 0));
				
			}
		});

	}
}
