package midterm2q5;


import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class q5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					q5 frame = new q5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public q5() {
		getContentPane().setBackground(Color.PINK);
		getContentPane().setForeground(Color.PINK);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblMonth = new JLabel("Month");
		GridBagConstraints gbc_lblMonth = new GridBagConstraints();
		gbc_lblMonth.anchor = GridBagConstraints.EAST;
		gbc_lblMonth.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonth.gridx = 5;
		gbc_lblMonth.gridy = 3;
		getContentPane().add(lblMonth, gbc_lblMonth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.BLUE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 6;
		gbc_comboBox.gridy = 3;
		comboBox.setSelectedIndex(10);
		getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblDay = new JLabel("Day");
		GridBagConstraints gbc_lblDay = new GridBagConstraints();
		gbc_lblDay.anchor = GridBagConstraints.EAST;
		gbc_lblDay.insets = new Insets(0, 0, 5, 5);
		gbc_lblDay.gridx = 5;
		gbc_lblDay.gridy = 4;
		getContentPane().add(lblDay, gbc_lblDay);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.CYAN);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 6;
		gbc_comboBox_1.gridy = 4;
		comboBox_1.setSelectedIndex(12);
		getContentPane().add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblYear = new JLabel("Year");
		GridBagConstraints gbc_lblYear = new GridBagConstraints();
		gbc_lblYear.anchor = GridBagConstraints.EAST;
		gbc_lblYear.insets = new Insets(0, 0, 0, 5);
		gbc_lblYear.gridx = 5;
		gbc_lblYear.gridy = 5;
		getContentPane().add(lblYear, gbc_lblYear);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.YELLOW);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 6;
		gbc_comboBox_2.gridy = 5;
		comboBox_2.setSelectedIndex(5);
		getContentPane().add(comboBox_2, gbc_comboBox_2);
	}

}
