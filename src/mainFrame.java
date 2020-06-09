import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;


public class mainFrame extends JFrame{

	private static final long serialVersionUID = -8402791167740146586L;

	public mainFrame(String title) {
		
		super(title);
		
		setLayout(new BorderLayout());
		
		titlePanel title_panel = new titlePanel();
		mainFrameDetails detail = new mainFrameDetails();
		
		Container c = getContentPane();
		c.add(title_panel,BorderLayout.NORTH);
		c.add(detail,BorderLayout.CENTER);
	}
}
