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

public class addRoomPanel extends JFrame {
	
	public addRoomPanel() {
		
		super("Add Room Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,150);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel roomCapacity = new JLabel("Room's capacity :");
		roomCapacity.setForeground(new Color(255, 255, 255));
		roomCapacity.setBackground(new Color(178, 34, 34));
		roomCapacity.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField roomCapacityText = new JTextField(20);
		roomCapacityText.setForeground(new Color(0,0,0));
		roomCapacityText.setBackground(new Color(255, 255, 255));
		roomCapacityText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton add = new JButton("Add the new room !!");
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
	 	add(roomCapacity,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
	 	add(roomCapacityText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(add,gc);
		
	 	add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String room_capacity = roomCapacityText.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection addRoomConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
					Statement addRoomStmt = addRoomConn.createStatement();
					String sql = "insert into cinema_room(capacity)"
								+" values('"+room_capacity+"');";
					
					int resRoom = addRoomStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
	 	
	 	
	}

}
