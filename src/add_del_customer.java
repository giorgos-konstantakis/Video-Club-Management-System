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

public class add_del_customer extends JPanel {
	public add_del_customer() {
		 
		 setLayout(null);
		 setPreferredSize( new Dimension( 900, 150 ) );
		 setBackground(new Color(178, 34, 34)); //51
		 
		 
		 final JButton addCustomers = new JButton("Add a new customer");
		 addCustomers.setForeground(new Color(255, 255, 255));
		 addCustomers.setBackground(new Color(178, 34, 34));//255
		 addCustomers.setFont(new Font("Montserrat", Font.BOLD, 20));		 
		 
		 final JButton deleteCustomers = new JButton("Delete a customer");
		 deleteCustomers.setForeground(new Color(255, 255, 255));
		 deleteCustomers.setBackground(new Color(178, 34, 34));//255
		 deleteCustomers.setFont(new Font("Montserrat", Font.BOLD, 20));

		 final JButton searchCustomerButton = new JButton("Search");
		 searchCustomerButton.setForeground(new Color(255, 255, 255));
		 searchCustomerButton.setBackground(new Color(178, 34, 34));
		 searchCustomerButton.setFont(new Font("Montserrat", Font.BOLD, 20));
		 
		 final JButton updateCustomerButton = new JButton("Update");
		 updateCustomerButton.setForeground(new Color(255, 255, 255));
		 updateCustomerButton.setBackground(new Color(178, 34, 34));
		 updateCustomerButton.setFont(new Font("Montserrat", Font.BOLD, 20));

		 setLayout(new GridBagLayout());
		 GridBagConstraints gc = new GridBagConstraints();
			
		 gc.weightx = 1;
		 gc.weighty = 1;
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 0;
	 	 add(addCustomers,gc);
		
	 	 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 0;
		 add(deleteCustomers,gc);
		 
		 
		 gc.anchor = GridBagConstraints.LINE_END;
		 gc.gridx = 0;
		 gc.gridy = 1;
		 add(searchCustomerButton,gc);
		 
		 gc.anchor = GridBagConstraints.LINE_START;
		 gc.gridx = 1;
		 gc.gridy = 1;
		 add(updateCustomerButton,gc);
		 
		 addCustomers.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					addCustomerPanel AdD = new addCustomerPanel();
					AdD.setVisible(true);
				}
			});
		 
		 deleteCustomers.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					delCustomerPanel DeL = new delCustomerPanel();
					DeL.setVisible(true);
				}
			});
		 
		 searchCustomerButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					searchCustomerPanel sea = new searchCustomerPanel();
					sea.setVisible(true);
				}
			});
		 
		 updateCustomerButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					updateCustomerPanel sea = new updateCustomerPanel();
					sea.setVisible(true);
				}
			});
		 
		 
		 
	}

}
