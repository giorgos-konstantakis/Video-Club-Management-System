import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class add_del_room extends JPanel {
	public add_del_room() {
		setLayout(null);
		 setPreferredSize( new Dimension( 900, 150 ) );
		 setBackground(new Color(178, 34, 34)); //51
		
		 final JButton addRooms = new JButton("Add a new room");
		 addRooms.setForeground(new Color(255, 255, 255));
		 addRooms.setBackground(new Color(178, 34, 34));//255
		 addRooms.setFont(new Font("Montserrat", Font.BOLD, 20));		 
		 
		 final JButton deleteRooms = new JButton("Delete a room");
		 deleteRooms.setForeground(new Color(255, 255, 255));
		 deleteRooms.setBackground(new Color(178, 34, 34));//255
		 deleteRooms.setFont(new Font("Montserrat", Font.BOLD, 20));

		 final JButton searchRoomButton = new JButton("Search");
		 searchRoomButton.setForeground(new Color(255, 255, 255));
		 searchRoomButton.setBackground(new Color(178, 34, 34));
		 searchRoomButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton updateRoomButton = new JButton("Update");
		 updateRoomButton.setForeground(new Color(255, 255, 255));
		 updateRoomButton.setBackground(new Color(178, 34, 34));
		 updateRoomButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton rentRoomCustomer = new JButton("Rent Room");
		 rentRoomCustomer.setForeground(new Color(255, 255, 255));
		 rentRoomCustomer.setBackground(new Color(178, 34, 34));
		 rentRoomCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton unrentRoomCustomer = new JButton("Unrent Room");
		 unrentRoomCustomer.setForeground(new Color(255, 255, 255));
		 unrentRoomCustomer.setBackground(new Color(178, 34, 34));
		 unrentRoomCustomer.setFont(new Font("Montserrat", Font.BOLD, 20));

		 setLayout(new GridBagLayout());
		 GridBagConstraints gc = new GridBagConstraints();
			
		 gc.weightx = 1;
		 gc.weighty = 1;
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 0;
	 	 add(addRooms,gc);
		
	 	 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 0;
		 add(deleteRooms,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 1;
		 add(searchRoomButton,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 1;
		 add(updateRoomButton,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 2;
		 add(rentRoomCustomer,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 2;
		 add(unrentRoomCustomer,gc);
		 
		 addRooms.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					addRoomPanel roomAdd = new addRoomPanel();
					roomAdd.setVisible(true);
				}
			});
		 
		 deleteRooms.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					delRoomPanel roomDel = new delRoomPanel();
					roomDel.setVisible(true);
				}
			});
		 
		 searchRoomButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					searchRoomPanel roomSearch = new searchRoomPanel();
					roomSearch.setVisible(true);
				}
			});
		 
		 updateRoomButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					updateRoomPanel roomUpdate = new updateRoomPanel();
					roomUpdate.setVisible(true);
				}
			});
		 
		 rentRoomCustomer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					rentRoomPanel roomRent = new rentRoomPanel();
					roomRent.setVisible(true);
				}
			});
		 
		 unrentRoomCustomer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					unrentRoomPanel roomUnrent = new unrentRoomPanel();
					roomUnrent.setVisible(true);
				}
			});

		 
		 
		 
		 
	}
}
