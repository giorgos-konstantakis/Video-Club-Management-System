import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class add_del_movie extends JPanel {
	public add_del_movie() {
		 setLayout(null);
		 setPreferredSize( new Dimension( 900, 150 ) );
		 setBackground(new Color(178, 34, 34)); //51
		
		 final JButton addMovies = new JButton("Add a new movie");
		 addMovies.setForeground(new Color(255, 255, 255));
		 addMovies.setBackground(new Color(178, 34, 34));//255
		 addMovies.setFont(new Font("Montserrat", Font.BOLD, 20));		 
		 
		 final JButton deleteMovies = new JButton("Delete a movie");
		 deleteMovies.setForeground(new Color(255, 255, 255));
		 deleteMovies.setBackground(new Color(178, 34, 34));//255
		 deleteMovies.setFont(new Font("Montserrat", Font.BOLD, 20));

		 final JButton searchMovieButton = new JButton("Search");
		 searchMovieButton.setForeground(new Color(255, 255, 255));
		 searchMovieButton.setBackground(new Color(178, 34, 34));
		 searchMovieButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton updateMovieButton = new JButton("Update");
		 updateMovieButton.setForeground(new Color(255, 255, 255));
		 updateMovieButton.setBackground(new Color(178, 34, 34));
		 updateMovieButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton rentMovieCustomer = new JButton("Rent Movie");
		 rentMovieCustomer.setForeground(new Color(255, 255, 255));
		 rentMovieCustomer.setBackground(new Color(178, 34, 34));
		 rentMovieCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton unrentMovieCustomer = new JButton("Unrent Movie");
		 unrentMovieCustomer.setForeground(new Color(255, 255, 255));
		 unrentMovieCustomer.setBackground(new Color(178, 34, 34));
		 unrentMovieCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));

		 setLayout(new GridBagLayout());
		 GridBagConstraints gc = new GridBagConstraints();
			
		 gc.weightx = 1;
		 gc.weighty = 1;
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 0;
	 	 add(addMovies,gc);
		
	 	 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 0;
		 add(deleteMovies,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 1;
		 add(searchMovieButton,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 1;
		 add(updateMovieButton,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 2;
		 add(rentMovieCustomer,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 2;
		 add(unrentMovieCustomer,gc);
		 
		 addMovies.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					addMoviePanel movieAdd = new addMoviePanel();
					movieAdd.setVisible(true);
				}
			});
		 
		 deleteMovies.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					delMoviePanel movieDel = new delMoviePanel();
					movieDel.setVisible(true);
				}
			});
		 
		 searchMovieButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					searchMoviePanel movieSearch = new searchMoviePanel();
					movieSearch.setVisible(true);
				}
			});
		 
		 updateMovieButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					updateMoviePanel movieUpdate = new updateMoviePanel();
					movieUpdate.setVisible(true);
				}
			});
		 
		 rentMovieCustomer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					rentMoviePanel movieRent = new rentMoviePanel();
					movieRent.setVisible(true);
				}
			});
		 
		 unrentMovieCustomer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					unrentMoviePanel movieUnrent = new unrentMoviePanel();
					movieUnrent.setVisible(true);
				}
			});
		 
	}
}
