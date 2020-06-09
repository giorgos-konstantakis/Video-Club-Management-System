import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class titlePanel extends JPanel {
		
	public titlePanel(){
		
		setLayout(null);
		
		setPreferredSize( new Dimension( 400, 50 ) );
		setBackground(new Color(178, 34, 34)); //51
		
		final JLabel titleLabel = new JLabel("EIGHT VIDEO CLUB");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("Montserrat", Font.BOLD, 40));
		titleLabel.setBounds(30, 2 ,500, 30);
		add(titleLabel);
		
		final JLabel phone = new JLabel("Contact number: +30 698 600 7332");
		phone.setForeground(new Color(255, 255, 255));
		phone.setFont(new Font("Montserrat", Font.BOLD, 13));
		phone.setBounds(600, 30 ,300, 30);
		add(phone);
	}
}
