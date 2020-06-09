import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

public class searchMoviePanel extends JFrame {

		public searchMoviePanel() {
			
			super("Search Movie Form");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(900,150);
			//setVisible(true);
			getContentPane().setBackground(new Color(178, 34, 34));
			getContentPane().setForeground(new Color(0, 0, 0));
			
			final JLabel movieTitle = new JLabel("Movie's title :");
			movieTitle.setForeground(new Color(255, 255, 255));
			movieTitle.setBackground(new Color(178, 34, 34));
			movieTitle.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField movieTitleText = new JTextField(20);
			movieTitleText.setForeground(new Color(0,0,0));
			movieTitleText.setBackground(new Color(255, 255, 255));
			movieTitleText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JButton search = new JButton("Search");
			search.setForeground(new Color(0,0,0));
			search.setBackground(new Color(255, 255, 255));
			search.setFont(new Font("Montserrat", Font.BOLD, 20));
			
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
		 	add(search,gc);
		 	
		 	search.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JTable table = new JTable() ;
					 
					 try {
						 
						    String movie_title = movieTitleText.getText();
						 
							Class.forName("com.mysql.jdbc.Driver"); 
							Connection searchMovies = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
							String sql="SELECT movies.title AS Title,movies.genre AS Genre,movies.rating AS Rating,"
									+ "movies.imdb_rating AS IMDB_Rating,movies.dor AS Date_Of_Release,"
									+ "movies.rent_until AS Rent_Until,customers.fname AS First_Name,"
									+"customers.lname AS Last_Name FROM movies LEFT JOIN customers ON movies.customer_id = customers.customer_id where"
									+" movies.title LIKE ?";
				
							PreparedStatement movieStmt = searchMovies.prepareStatement(sql);
							movieStmt.setString(1,"%"+movie_title+"%");
							
							ResultSet resMovie = movieStmt.executeQuery();
							
							table.setModel(DbUtils.resultSetToTableModel(resMovie));
							JScrollPane tableContainer = new JScrollPane(table);
							tableContainer.setSize(900,100);
							tableContainer.setBackground(new Color(178, 34, 34));
							table.getTableHeader().setBackground(new Color(178, 34, 34));
							table.getTableHeader().setForeground(new Color(255, 255, 255));
							table.getTableHeader().setFont(new Font("Montserrat", Font.BOLD, 14));
							table.setOpaque(true);
							table.setFillsViewportHeight(true);
							table.setBackground(new Color(178, 34, 34));
							table.setForeground(new Color(255, 255, 255));
							table.setFont(new Font("Montserrat", Font.BOLD, 14));
							
							gc.anchor = GridBagConstraints.LINE_START;
							gc.gridx = 0;
							gc.gridy = 4;
						 	add(tableContainer,gc);
							
						}
						catch(Exception exc) {
							exc.printStackTrace();
						}

					
				}
			});
			
			
			
			
		}
}
