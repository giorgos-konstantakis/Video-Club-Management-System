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

public class updateCustomerPanel extends JFrame {
		public updateCustomerPanel() {
			
			super("Update Customer Form");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(900,600);
			//setVisible(true);
			getContentPane().setBackground(new Color(178, 34, 34));
			getContentPane().setForeground(new Color(0, 0, 0));
			
			final JLabel CurrentCustomer = new JLabel("Customer's current records");
			CurrentCustomer.setForeground(new Color(255, 255, 255));
			CurrentCustomer.setBackground(new Color(178, 34, 34));
			CurrentCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel firstNameSelect = new JLabel("Customer's first name :");
			firstNameSelect.setForeground(new Color(255, 255, 255));
			firstNameSelect.setBackground(new Color(178, 34, 34));
			firstNameSelect.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField firstNameSelectText = new JTextField(20);
			firstNameSelectText.setForeground(new Color(0,0,0));
			firstNameSelectText.setBackground(new Color(255, 255, 255));
			firstNameSelectText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel lastNameSelect = new JLabel("Customer's name :");
			lastNameSelect.setForeground(new Color(255, 255, 255));
			lastNameSelect.setBackground(new Color(178, 34, 34));
			lastNameSelect.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField lastNameSelectText = new JTextField(20);
			lastNameSelectText.setForeground(new Color(0,0,0));
			lastNameSelectText.setBackground(new Color(255, 255, 255));
			lastNameSelectText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel passwSelect = new JLabel("Customer's password :");
			passwSelect.setForeground(new Color(255, 255, 255));
			passwSelect.setBackground(new Color(178, 34, 34));
			passwSelect.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JTextField passwSelectText = new JTextField(20);
			passwSelectText.setForeground(new Color(0, 0, 0));
			passwSelectText.setBackground(new Color(255, 255, 255));
			passwSelectText.setFont(new Font("Montserrat", Font.BOLD, 20));
			
			final JLabel NextCustomer = new JLabel("Customer's new records");
			NextCustomer.setForeground(new Color(255, 255, 255));
			NextCustomer.setBackground(new Color(178, 34, 34));
			NextCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));
			
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
			
			final JButton update = new JButton("Update the customer");
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
		 	add(CurrentCustomer,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 1;
		 	add(firstNameSelect,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 1;
		 	add(firstNameSelectText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 2;
		 	add(lastNameSelect,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 2;
		 	add(lastNameSelectText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 3;
		 	add(passwSelect,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 3;
		 	add(passwSelectText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 5;
		 	add(NextCustomer,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 6;
		 	add(firstName,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 6;
		 	add(firstNameText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 7;
		 	add(lastName,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 7;
		 	add(lastNameText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 8;
		 	add(DoB,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 8;
		 	add(DoBText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 9;
		 	add(homeAdress,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 9;
		 	add(homeAdressText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 10;
		 	add(surname,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 10;
		 	add(surnameText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 11;
		 	add(passw,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 11;
		 	add(passwText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 12;
		 	add(mail,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 12;
		 	add(mailText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 13;
		 	add(phone,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_START;
			gc.gridx = 1;
			gc.gridy = 13;
		 	add(phoneText,gc);
		 	
		 	gc.anchor = GridBagConstraints.LINE_END;
			gc.gridx = 0;
			gc.gridy = 14;
		 	add(update,gc);
		 	
		 	update.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String first_name_select = firstNameSelectText.getText();
					String last_name_select = lastNameSelectText.getText();
					String passwo_select = passwSelectText.getText();
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
						Connection addCustomerConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","password");
						Statement addCustomerStmt = addCustomerConn.createStatement();
						String sql = "UPDATE customers SET fname='"+first_name+"',lname='"+last_name+"',dob='"+DOB+"',home_adress='"+home_address+"',"
									+"username='"+surName+"',passw='"+passwo+"',mail='"+Mail+"',phone='"+Phone+"'"
									+" WHERE fname='"+first_name_select+"' AND lname='"+last_name_select+"' AND passw='"+passwo_select+"'";
						
						int resCust = addCustomerStmt.executeUpdate(sql);
						}
						
					catch(Exception exc) {
						exc.printStackTrace();
					}

					
				}
			});
			
		}
}
