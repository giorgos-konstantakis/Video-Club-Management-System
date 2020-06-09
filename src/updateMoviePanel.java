import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class updateMoviePanel extends JFrame {
	
	public updateMoviePanel() {
		
		super("Update Movie Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,400);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel movieRecords = new JLabel("Movie's records");
		movieRecords.setForeground(new Color(255, 255, 255));
		movieRecords.setBackground(new Color(178, 34, 34));
		movieRecords.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel movieTitleSelect = new JLabel("Movie's title :");
		movieTitleSelect.setForeground(new Color(255, 255, 255));
		movieTitleSelect.setBackground(new Color(178, 34, 34));
		movieTitleSelect.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField movieTitleSelectText = new JTextField(20);
		movieTitleSelectText.setForeground(new Color(0,0,0));
		movieTitleSelectText.setBackground(new Color(255, 255, 255));
		movieTitleSelectText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel newMovieRecords = new JLabel("New movie's records");
		newMovieRecords.setForeground(new Color(255, 255, 255));
		newMovieRecords.setBackground(new Color(178, 34, 34));
		newMovieRecords.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel movieTitle = new JLabel("Movies's new title :");
		movieTitle.setForeground(new Color(255, 255, 255));
		movieTitle.setBackground(new Color(178, 34, 34));
		movieTitle.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField movieTitleText = new JTextField(20);
		movieTitleText.setForeground(new Color(0,0,0));
		movieTitleText.setBackground(new Color(255, 255, 255));
		movieTitleText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel movieGenre = new JLabel("New movie's genre :");
		movieGenre.setForeground(new Color(255, 255, 255));
		movieGenre.setBackground(new Color(178, 34, 34));
		movieGenre.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField movieGenreText = new JTextField(20);
		movieGenreText.setForeground(new Color(0,0,0));
		movieGenreText.setBackground(new Color(255, 255, 255));
		movieGenreText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel movieRating = new JLabel("New movie's rating :");
		movieRating.setForeground(new Color(255, 255, 255));
		movieRating.setBackground(new Color(178, 34, 34));
		movieRating.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField movieRatingText = new JTextField(20);
		movieRatingText.setForeground(new Color(0, 0, 0));
		movieRatingText.setBackground(new Color(255, 255, 255));
		movieRatingText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel imdbRating = new JLabel("New movie's imdb rating :");
		imdbRating.setForeground(new Color(255, 255, 255));
		imdbRating.setBackground(new Color(178, 34, 34));
		imdbRating.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField imdbRatingText = new JTextField(20);
		imdbRatingText.setForeground(new Color(0, 0, 0));
		imdbRatingText.setBackground(new Color(255, 255, 255));
		imdbRatingText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel DoR = new JLabel("New movie's date of release :");
		DoR.setForeground(new Color(255, 255, 255));
		DoR.setBackground(new Color(178, 34, 34));
		DoR.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField DoRText = new JTextField(20);
		DoRText.setForeground(new Color(0, 0, 0));
		DoRText.setBackground(new Color(255, 255, 255));
		DoRText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton update = new JButton("Update the movie");
		update.setForeground(new Color(0,0,0));
		update.setBackground(new Color(255, 255, 255));
		update.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		setLayout(new GridBagLayout());
	    GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 0.1;
		gc.weighty = 0.1;
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
	 	add(movieRecords,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(movieTitleSelect,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 1;
	 	add(movieTitleSelectText,gc);
	 	
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 2;
	 	add(newMovieRecords,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(movieTitle,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 3;
	 	add(movieTitleText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 4;
	 	add(movieGenre,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 4;
	 	add(movieGenreText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 5;
	 	add(movieRating,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 5;
	 	add(movieRatingText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 6;
	 	add(imdbRating,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 6;
	 	add(imdbRatingText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 7;
	 	add(DoR,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 7;
	 	add(DoRText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 8;
	 	add(update,gc);
		
	 	update.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String movie_title_select = movieTitleSelectText.getText();
				String movie_title = movieTitleText.getText();
				String movie_genre = movieGenreText.getText();
				String movie_rating = movieRatingText.getText();
				String imdb_rating = imdbRatingText.getText();
				String DOR = DoRText.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection addMovieConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
					Statement addMovieStmt = addMovieConn.createStatement();
					String sql = "UPDATE movies SET title='"+movie_title+"',genre='"+movie_genre+"',rating='"+movie_rating+"',imdb_rating='"+imdb_rating+"',"
								+"dor='"+DOR+"' WHERE title='"+movie_title_select+"'";
					
					int resMovie = addMovieStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
		
	}

}
