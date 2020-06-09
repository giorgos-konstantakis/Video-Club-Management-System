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

public class addMoviePanel extends JFrame {
	
		public addMoviePanel() {
			
			super("Add Movie Form");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(900,400);
			//setVisible(true);
			getContentPane().setBackground(new Color(178, 34, 34));
			getContentPane().setForeground(new Color(0, 0, 0));
			
			
			final JLabel movieTitle = new JLabel("Movies's title :");
			movieTitle.setForeground(new Color(255, 255, 255));
			movieTitle.setBackground(new Color(178, 34, 34));
			movieTitle.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField movieTitleText = new JTextField(20);
			movieTitleText.setForeground(new Color(0,0,0));
			movieTitleText.setBackground(new Color(255, 255, 255));
			movieTitleText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel movieGenre = new JLabel("Movies's genre :");
			movieGenre.setForeground(new Color(255, 255, 255));
			movieGenre.setBackground(new Color(178, 34, 34));
			movieGenre.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField movieGenreText = new JTextField(20);
			movieGenreText.setForeground(new Color(0,0,0));
			movieGenreText.setBackground(new Color(255, 255, 255));
			movieGenreText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel movieRating = new JLabel("Movies's rating :");
			movieRating.setForeground(new Color(255, 255, 255));
			movieRating.setBackground(new Color(178, 34, 34));
			movieRating.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField movieRatingText = new JTextField(20);
			movieRatingText.setForeground(new Color(0,0,0));
			movieRatingText.setBackground(new Color(255, 255, 255));
			movieRatingText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel imdbRating = new JLabel("Movies's imdb rating :");
			imdbRating.setForeground(new Color(255, 255, 255));
			imdbRating.setBackground(new Color(178, 34, 34));
			imdbRating.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField imdbRatingText = new JTextField(20);
			imdbRatingText.setForeground(new Color(0,0,0));
			imdbRatingText.setBackground(new Color(255, 255, 255));
			imdbRatingText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel movieDor = new JLabel("Movies's date of release :");
			movieDor.setForeground(new Color(255, 255, 255));
			movieDor.setBackground(new Color(178, 34, 34));
			movieDor.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField movieDorText = new JTextField(20);
			movieDorText.setForeground(new Color(0,0,0));
			movieDorText.setBackground(new Color(255, 255, 255));
			movieDorText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JButton add = new JButton("Add the new movie !!");
			add.setForeground(new Color(0,0,0));
			add.setBackground(new Color(255, 255, 255));
			add.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			setLayout(new GridBagLayout());
		    GridBagConstraints gc = new GridBagConstraints();
				
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 0;
		 	add(movieTitle,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 0;
		 	add(movieTitleText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 1;
		 	add(movieGenre,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 1;
		 	add(movieGenreText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 2;
		 	add(movieRating,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 2;
		 	add(movieRatingText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 3;
		 	add(imdbRating,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 3;
		 	add(imdbRatingText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 4;
		 	add(movieDor,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 4;
		 	add(movieDorText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 5;
		 	add(add,gc);
			
		 	add.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String movie_title = movieTitleText.getText();
					String movie_genre = movieGenreText.getText();
					String movie_rating = movieRatingText.getText();
					String imdb_rating = imdbRatingText.getText();
					String movie_dor = movieDorText.getText();
					
					try {
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection addMovieConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","password");
						Statement addMovieStmt = addMovieConn.createStatement();
						String sql = "insert into movies(title,genre,rating,imdb_rating,dor)"
									+" values('"+movie_title+"','"+movie_genre+"','"+movie_rating+"','"+imdb_rating+"','"+movie_dor+"');";
						
						int resMovie = addMovieStmt.executeUpdate(sql);
						}
						
					catch(Exception exc) {
						exc.printStackTrace();
					}

					
				}
			});
			
			
			
			
		}
}
