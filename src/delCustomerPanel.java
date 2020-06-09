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

public class delCustomerPanel extends JFrame {
	public delCustomerPanel() {

		super("Delete customer form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,200);
		//setVisible(true);
		getContentPane().setBackground(new Color(178, 34, 34));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		final JLabel firstName = new JLabel("Customer's first name :");
		firstName.setForeground(new Color(255, 255, 255));
		firstName.setBackground(new Color(178, 34, 34));
		firstName.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField firstNameText = new JTextField(20);
		firstNameText.setForeground(new Color(0,0,0));
		firstNameText.setBackground(new Color(255, 255, 255));
		firstNameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel lastName = new JLabel("Customer's name :");
		lastName.setForeground(new Color(255, 255, 255));
		lastName.setBackground(new Color(178, 34, 34));
		lastName.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField lastNameText = new JTextField(20);
		lastNameText.setForeground(new Color(0,0,0));
		lastNameText.setBackground(new Color(255, 255, 255));
		lastNameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel passw = new JLabel("Customer's password :");
		passw.setForeground(new Color(255, 255, 255));
		passw.setBackground(new Color(178, 34, 34));
		passw.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField passwText = new JTextField(20);
		passwText.setForeground(new Color(0, 0, 0));
		passwText.setBackground(new Color(255, 255, 255));
		passwText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton delete = new JButton("Delete the customer !!");
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
	 	add(firstName,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
	 	add(firstNameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(lastName,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 1;
	 	add(lastNameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 2;
	 	add(passw,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
	 	add(passwText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(delete,gc);
	 	
	 	delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String first_name = firstNameText.getText();
				String last_name = lastNameText.getText();
				String passwo = passwText.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection delCustomerConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
					Statement delCustomerStmt = delCustomerConn.createStatement();
					String sql = "delete from customers where fname='"+first_name+"' and lname='"+last_name+"' and passw='"+passwo+"'";
					
					int resCust = delCustomerStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
	}
}
