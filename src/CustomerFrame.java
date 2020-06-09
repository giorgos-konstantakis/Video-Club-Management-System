import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class CustomerFrame extends JFrame{

	public CustomerFrame() {
		 super("Customers");
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 setSize(900,400);
		 //setVisible(true);
		 getContentPane().setBackground(new Color(178, 34, 34));
		 getContentPane().setForeground(new Color(0, 0, 0));
		 
		 setLayout(new BorderLayout());
		 add_del_customer x = new add_del_customer();
		 
		 Container c = getContentPane();
		 
		 c.add(x,BorderLayout.NORTH);
		 
		 
		 JTable table = new JTable() ;
		 
		 try {
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection allCustomers = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
				Statement customerStmt = allCustomers.createStatement();
				String sql="SELECT fname AS First_Name,lname AS Last_Name,dob AS Date_Of_Birth,"
						+ "home_adress AS Home_Adress,passw AS Password,username AS Username,mail AS Mail,phone AS Contact_Phone FROM customers";
				ResultSet resCustomer = customerStmt.executeQuery(sql);
				
				table.setModel(DbUtils.resultSetToTableModel(resCustomer));
				JScrollPane tableContainer = new JScrollPane(table);
				tableContainer.setSize(900,500);
				tableContainer.setBackground(new Color(255, 51, 51));
				table.getTableHeader().setBackground(new Color(178, 34, 34));
				table.getTableHeader().setForeground(new Color(255, 255, 255));
				table.getTableHeader().setFont(new Font("Montserrat", Font.BOLD, 14));
				table.setOpaque(true);
				table.setFillsViewportHeight(true);
				table.setBackground(new Color(178, 34, 34));
				table.setForeground(new Color(255, 255, 255));
				table.setFont(new Font("Montserrat", Font.BOLD, 14));
				c.add(tableContainer,BorderLayout.CENTER);
				
			}
			catch(Exception exc) {
				exc.printStackTrace();
			}
		 
		 
	}
}
