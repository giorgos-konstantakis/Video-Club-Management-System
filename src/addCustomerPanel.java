import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addCustomerPanel extends JFrame {
	
	public addCustomerPanel() {
		
		super("Add Customer Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,600);
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
		
		final JLabel DoB = new JLabel("Customer's date of birth :");
		DoB.setForeground(new Color(255, 255, 255));
		DoB.setBackground(new Color(178, 34, 34));
		DoB.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField DoBText = new JTextField(20);
		DoBText.setForeground(new Color(0, 0, 0));
		DoBText.setBackground(new Color(255, 255, 255));
		DoBText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel homeAdress = new JLabel("Customer's home adress :");
		homeAdress.setForeground(new Color(255, 255, 255));
		homeAdress.setBackground(new Color(178, 34, 34));
		homeAdress.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField homeAdressText = new JTextField(20);
		homeAdressText.setForeground(new Color(0, 0, 0));
		homeAdressText.setBackground(new Color(255, 255, 255));
		homeAdressText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel surname = new JLabel("Customer's surname :");
		surname.setForeground(new Color(255, 255, 255));
		surname.setBackground(new Color(178, 34, 34));
		surname.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField surnameText = new JTextField(20);
		surnameText.setForeground(new Color(0, 0, 0));
		surnameText.setBackground(new Color(255, 255, 255));
		surnameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel passw = new JLabel("Customer's password :");
		passw.setForeground(new Color(255, 255, 255));
		passw.setBackground(new Color(178, 34, 34));
		passw.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField passwText = new JTextField(20);
		passwText.setForeground(new Color(0, 0, 0));
		passwText.setBackground(new Color(255, 255, 255));
		passwText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel mail = new JLabel("Customer's mail :");
		mail.setForeground(new Color(255, 255, 255));
		mail.setBackground(new Color(178, 34, 34));
		mail.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField mailText = new JTextField(20);
		mailText.setForeground(new Color(0, 0, 0));
		mailText.setBackground(new Color(255, 255, 255));
		mailText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel phone = new JLabel("Customer's phone number :");
		phone.setForeground(new Color(255, 255, 255));
		phone.setBackground(new Color(178, 34, 34));
		phone.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField phoneText = new JTextField(20);
		phoneText.setForeground(new Color(0, 0, 0));
		phoneText.setBackground(new Color(255, 255, 255));
		phoneText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JButton add = new JButton("Add the new customer !!");
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
	 	add(DoB,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
	 	add(DoBText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(homeAdress,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 3;
	 	add(homeAdressText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 4;
	 	add(surname,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 4;
	 	add(surnameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 5;
	 	add(passw,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 5;
	 	add(passwText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 6;
	 	add(mail,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 6;
	 	add(mailText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 7;
	 	add(phone,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 7;
	 	add(phoneText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 8;
	 	add(add,gc);
		
	 	add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String first_name = firstNameText.getText();
				String last_name = lastNameText.getText();
				String DOB = DoBText.getText();
				String home_address = homeAdressText.getText();
				String surName = surnameText.getText();
				String passwo = passwText.getText();
				String Mail = mailText.getText();
				String Phone = phoneText.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection addCustomerConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
					Statement addCustomerStmt = addCustomerConn.createStatement();
					String sql = "insert into customers(fname,lname,dob,home_adress,username,passw,mail,phone)"
								+" values('"+first_name+"','"+last_name+"','"+DOB+"','"+home_address+"','"+surName+"','"+passwo+"','"+Mail+"','"+Phone+"');";
					
					int resCust = addCustomerStmt.executeUpdate(sql);
					}
					
				catch(Exception exc) {
					exc.printStackTrace();
				}

				
			}
		});
		
	}
}
