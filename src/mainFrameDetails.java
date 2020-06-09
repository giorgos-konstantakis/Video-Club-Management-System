import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class mainFrameDetails extends JPanel {
	
	public mainFrameDetails() {
		
		setPreferredSize( new Dimension( 900, 30 ) );
		setBackground(new Color(178, 34, 34)); //51
		
		final JButton viewCustomers = new JButton("View Customers");
		viewCustomers.setForeground(new Color(255, 255, 255));//255
		viewCustomers.setBackground(new Color(178, 34, 34));//255
		viewCustomers.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton viewMovies = new JButton("View movies");
		viewMovies.setForeground(new Color(255, 255, 255));//255
		viewMovies.setBackground(new Color(178, 34, 34));//255
		viewMovies.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton viewRooms = new JButton("View cinema rooms");
		viewRooms.setForeground(new Color(255, 255, 255));//255
		viewRooms.setBackground(new Color(178, 34, 34));//255
		viewRooms.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 5;
		gc.weighty = 5;
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(viewCustomers,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(viewMovies,gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		add(viewRooms,gc);
		
		viewCustomers.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CustomerFrame customerframe = new CustomerFrame();
				customerframe.setVisible(true);
			}
		});
		
		viewMovies.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MoviesFrame moviesframe = new MoviesFrame();
				moviesframe.setVisible(true);
			}
		});
		
		viewRooms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RoomsFrame roomsframe = new RoomsFrame();
				roomsframe.setVisible(true);
			}
		});
		
	}

}
