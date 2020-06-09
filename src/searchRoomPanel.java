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

public class searchRoomPanel extends JFrame {
	
	public searchRoomPanel() {
		super("Search Room Form");
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
	 	add(roomCapacity,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
	 	add(roomCapacityText,gc);
	 	
	 	gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 1;
	 	add(search,gc);
		
	 	
	 	search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTable table = new JTable() ;
				 
				 try {
					 
					    String room_capacity = roomCapacityText.getText();
					    int capac = Integer.parseInt(room_capacity);
					 
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection searchRooms = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_java","root","giorgos7fak13lovbuziaa");
						String sql="SELECT cinema_room.room_id AS Room_Number,cinema_room.capacity AS Capacity,cinema_room.rent_for AS Rented_for,"
									+"customers.fname AS First_Name,customers.lname AS Last_Name FROM "
									+"cinema_room LEFT JOIN customers ON cinema_room.customer_id = customers.customer_id "
									+"WHERE cinema_room.capacity>=?";
			
						PreparedStatement roomStmt = searchRooms.prepareStatement(sql);
						roomStmt.setInt(1,capac);
						
						ResultSet resRoom = roomStmt.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(resRoom));
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
