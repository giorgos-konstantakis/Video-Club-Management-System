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

public class searchCustomerPanel extends JFrame {
	
	public searchCustomerPanel() {
		
		super("Search Customer Form");
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
		
		final JLabel lastName = new JLabel("Customer's last name :");
		lastName.setForeground(new Color(255, 255, 255));
		lastName.setBackground(new Color(178, 34, 34));
		lastName.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField lastNameText = new JTextField(20);
		lastNameText.setForeground(new Color(0,0,0));
		lastNameText.setBackground(new Color(255, 255, 255));
		lastNameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JLabel surname = new JLabel("Customer's surname :");
		surname.setForeground(new Color(255, 255, 255));
		surname.setBackground(new Color(178, 34, 34));
		surname.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		final JTextField surnameText = new JTextField(20);
		surnameText.setForeground(new Color(0, 0, 0));
		surnameText.setBackground(new Color(255, 255, 255));
		surnameText.setFont(new Font("Montserrat", Font.BOLD, 20));
		
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
	 	add(surname,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
	 	add(surnameText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 3;
	 	add(search,gc);
	 	
	 	search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTable table = new JTable() ;
				 
				 try {
					 
					    String first_name = firstNameText.getText();
						String last_name = lastNameText.getText();
						String surName = surnameText.getText();
					 
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection searchCustomers = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","password");
						String sql="SELECT fname AS First_Name,lname AS Last_Name,dob AS Date_Of_Birth,"
								+ "home_adress AS Home_Adress,passw AS Password,username AS Username,"
								+ "mail AS Mail,phone AS Contact_Phone FROM customers where fname LIKE ?"
								+" AND lname LIKE ? AND username LIKE ?";
						PreparedStatement customerStmt = searchCustomers.prepareStatement(sql);
						customerStmt.setString(1,"%"+first_name+"%");
						customerStmt.setString(2,"%"+last_name+"%");
						customerStmt.setString(3,"%"+surName+"%");
						
						ResultSet resCustomer = customerStmt.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(resCustomer));
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
