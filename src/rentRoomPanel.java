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

public class rentRoomPanel extends JFrame {
	
	public rentRoomPanel() {
		
		super("Rent room Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,400);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel customerRecords = new JLabel("Customer's records");
		customerRecords.setForeground(new Color(255, 255, 255));
		customerRecords.setBackground(new Color(178, 34, 34));
		customerRecords.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel customerFirstName = new JLabel("Customer's first name :");
		customerFirstName.setForeground(new Color(255, 255, 255));
		customerFirstName.setBackground(new Color(178, 34, 34));
		customerFirstName.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField customerFirstNameText = new JTextField(20);
		customerFirstNameText.setForeground(new Color(0,0,0));
		customerFirstNameText.setBackground(new Color(255, 255, 255));
		customerFirstNameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel customerLastName = new JLabel("Customer's last name :");
		customerLastName.setForeground(new Color(255, 255, 255));
		customerLastName.setBackground(new Color(178, 34, 34));
		customerLastName.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField customerLastNameText = new JTextField(20);
		customerLastNameText.setForeground(new Color(0,0,0));
		customerLastNameText.setBackground(new Color(255, 255, 255));
		customerLastNameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel customerSurname = new JLabel("Customer's surname :");
		customerSurname.setForeground(new Color(255, 255, 255));
		customerSurname.setBackground(new Color(178, 34, 34));
		customerSurname.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField customerSurnameText = new JTextField(20);
		customerSurnameText.setForeground(new Color(0,0,0));
		customerSurnameText.setBackground(new Color(255, 255, 255));
		customerSurnameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
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
		
		final JLabel rentFor = new JLabel("Room is rented for :");
		rentFor.setForeground(new Color(255, 255, 255));
		rentFor.setBackground(new Color(178, 34, 34));
		rentFor.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField rentForText = new JTextField(20);
		rentForText.setForeground(new Color(0,0,0));
		rentForText.setBackground(new Color(255, 255, 255));
		rentForText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton rentButton = new JButton("Rent the room");
		rentButton.setForeground(new Color(0,0,0));
		rentButton.setBackground(new Color(255, 255, 255));
		rentButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		setLayout(new GridBagLayout());
	    GridBagConstraints gc = new GridBagConstraints();
			
		gc.weightx = 0.1;
		gc.weighty = 0.1;
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
	 	add(customerRecords,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(customerFirstName,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 1;
	 	add(customerFirstNameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 2;
	 	add(customerLastName,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
	 	add(customerLastNameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(customerSurname,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 3;
	 	add(customerSurnameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 4;
	 	add(roomRecords,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 5;
	 	add(roomNumber,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 5;
	 	add(roomNumberText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 6;
	 	add(rentFor,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 6;
	 	add(rentForText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 7;
	 	add(rentButton,gc);
		
	 	rentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String customer_first = customerFirstNameText.getText();
				String customer_last = customerLastNameText.getText();
				String customer_surname = customerSurnameText.getText();
				String room_number = roomNumberText.getText();
				String room_rent_for = rentForText.getText();
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection rentRoomConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
					Statement rentRoomStmt = rentRoomConn.createStatement();
					String sql = "UPDATE cinema_room SET cinema_room.customer_id=(SELECT customer_id FROM customers WHERE"
								+ " customers.fname='"+customer_first+"' AND customers.lname='"+customer_last+"'"
								+ " AND customers.username='"+customer_surname+"'),rent_for='"+room_rent_for+"'"
								+ " WHERE cinema_room.room_id='"+room_number+"'";
					
					int resMovie = rentRoomStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
	 	
	 	
		
	}

}
