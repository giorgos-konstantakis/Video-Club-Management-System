import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class delRoomPanel extends JFrame {
	
	public delRoomPanel() {
		
		super("Delete room form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,150);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel roomNumber = new JLabel("Room's number :");
		roomNumber.setForeground(new Color(255, 255, 255));
		roomNumber.setBackground(new Color(178, 34, 34));
		roomNumber.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField roomNumberText = new JTextField(20);
		roomNumberText.setForeground(new Color(0,0,0));
		roomNumberText.setBackground(new Color(255, 255, 255));
		roomNumberText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton delete = new JButton("Delete the room !!");
		delete.setForeground(new Color(0,0,0));
		delete.setBackground(new Color(255, 255, 255));
		delete.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		setLayout(new GridBagLayout());
	    GridBagConstraints gc = new GridBagConstraints();
			
		gc.weightx = 0.1;
		gc.weighty = 0.1;
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
	 	add(roomNumber,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
	 	add(roomNumberText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(delete,gc);
	 	
	 	delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String room_number = roomNumberText.getText();
				int rn = Integer.parseInt(room_number);
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection delRoomConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","password");
					String sql = "delete from cinema_room where room_id=?";
					PreparedStatement delRoomStmt = delRoomConn.prepareStatement(sql);
					delRoomStmt.setInt(1,rn);
					int roomRes = delRoomStmt.executeUpdate();
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
		
	}

}
