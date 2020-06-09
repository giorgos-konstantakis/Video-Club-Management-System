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

public class updateRoomPanel extends JFrame {
	
	public updateRoomPanel() {
		
		super("Update Room Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,200);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel roomRecords = new JLabel("Room's records");
		roomRecords.setForeground(new Color(255, 255, 255));
		roomRecords.setBackground(new Color(178, 34, 34));
		roomRecords.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel roomNumber = new JLabel("Room's number :");
		roomNumber.setForeground(new Color(255, 255, 255));
		roomNumber.setBackground(new Color(178, 34, 34));
		roomNumber.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField roomNumberText = new JTextField(20);
		roomNumberText.setForeground(new Color(0,0,0));
		roomNumberText.setBackground(new Color(255, 255, 255));
		roomNumberText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel newRoomRecords = new JLabel("New room's records");
		newRoomRecords.setForeground(new Color(255, 255, 255));
		newRoomRecords.setBackground(new Color(178, 34, 34));
		newRoomRecords.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel roomCapacity = new JLabel("Room's new capacity :");
		roomCapacity.setForeground(new Color(255, 255, 255));
		roomCapacity.setBackground(new Color(178, 34, 34));
		roomCapacity.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField roomCapacityText = new JTextField(20);
		roomCapacityText.setForeground(new Color(0,0,0));
		roomCapacityText.setBackground(new Color(255, 255, 255));
		roomCapacityText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton update = new JButton("Update the room");
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
	 	add(roomRecords,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(roomNumber,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 1;
	 	add(roomNumberText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 2;
	 	add(newRoomRecords,gc);
		
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(roomCapacity,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 3;
	 	add(roomCapacityText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 4;
	 	add(update,gc);
		
	 	update.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String room_number = roomNumberText.getText();
				String room_capacity = roomCapacityText.getText();

				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection addRoomConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","password");
					Statement addRoomStmt = addRoomConn.createStatement();
					String sql = "UPDATE cinema_room SET cinema_room.capacity='"+room_capacity+"' "
								+" WHERE room_id='"+room_number+"'";
					
					int resRoom = addRoomStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
		
	}

}
