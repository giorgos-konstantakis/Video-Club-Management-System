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

public class delMoviePanel extends JFrame {
	
		public delMoviePanel() {
			
			super("Delete movie form");
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
			
			final JButton delMovie = new JButton("Delete the movie !!");
			delMovie.setForeground(new Color(0,0,0));
			delMovie.setBackground(new Color(255, 255, 255));
			delMovie.setFont(new Font("Montserrat", Font.BOLD, 20));
			
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
		 	add(delMovie,gc);
			
		 	delMovie.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String movie_title = movieTitleText.getText();
					
					try {
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection delMovieConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
						Statement delMovieStmt = delMovieConn.createStatement();
						String sql = "delete from movies where title='"+movie_title+"'";
						
						int resMovie = delMovieStmt.executeUpdate(sql);
						}
						
					catch(Exception exc) {
						exc.printStackTrace();
					}

					
				}
			});
			
			
			
		}
}
