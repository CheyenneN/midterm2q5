package midterm2q5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JComboBox;




import java.awt.Insets;


import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class question5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					question5 frame = new question5();
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
	public question5() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblStuff = new JLabel("Month");
		GridBagConstraints gbc_lblStuff = new GridBagConstraints();
		gbc_lblStuff.insets = new Insets(0, 0, 5, 5);
		gbc_lblStuff.anchor = GridBagConstraints.EAST;
		gbc_lblStuff.gridx = 3;
		gbc_lblStuff.gridy = 2;
		contentPane.add(lblStuff, gbc_lblStuff);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		
	
		comboBox.addItem(new ComboItem(1, "January"));
		comboBox.addItem(new ComboItem(2, "February"));
		comboBox.addItem(new ComboItem(3, "March"));
		comboBox.addItem(new ComboItem(4, "April"));
		comboBox.addItem(new ComboItem(5, "May"));
		comboBox.addItem(new ComboItem(6, "June"));
		comboBox.addItem(new ComboItem(7, "July"));
		comboBox.addItem(new ComboItem(8, "August"));
		comboBox.addItem(new ComboItem(9, "September"));
		comboBox.addItem(new ComboItem(10, "October"));
		comboBox.addItem(new ComboItem(11, "November"));
		comboBox.addItem(new ComboItem(12, "December"));
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 2;
		comboBox.setSelectedIndex(10);
		contentPane.add(comboBox, gbc_comboBox);
		
		Calendar javaCalendar = null;
		 String currentDate = "";

		javaCalendar = Calendar.getInstance();
		
		//ComboItem cItem = new ComboItem(javaCalendar.get(Calendar.MONTH)));
		
		
		//comboBox.setSelectedItem(arg0)
		//javaCalendar.MONTH
	
		
		JLabel lblDay = new JLabel("Day");
		GridBagConstraints gbc_lblDay = new GridBagConstraints();
		gbc_lblDay.insets = new Insets(0, 0, 5, 5);
		gbc_lblDay.anchor = GridBagConstraints.EAST;
		gbc_lblDay.gridx = 3;
		gbc_lblDay.gridy = 3;
		contentPane.add(lblDay, gbc_lblDay);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 3;
		comboBox_1.setSelectedIndex(12);
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblYear = new JLabel("Year");
		GridBagConstraints gbc_lblYear = new GridBagConstraints();
		gbc_lblYear.insets = new Insets(0, 0, 5, 5);
		gbc_lblYear.anchor = GridBagConstraints.EAST;
		gbc_lblYear.gridx = 3;
		gbc_lblYear.gridy = 4;
		contentPane.add(lblYear, gbc_lblYear);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 4;
		gbc_comboBox_2.gridy = 4;
		comboBox_2.setSelectedIndex(5);
		contentPane.add(comboBox_2, gbc_comboBox_2);
	}

}
