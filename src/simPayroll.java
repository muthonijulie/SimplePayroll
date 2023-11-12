import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class simPayroll {

	private JFrame frame;
	private JTextField txtC;
	private JTextField textFieldrate;
	private JTextField textFieldhour;
	private JTextField textFielddays;
	private JTextField textFieldtax;
	private JTextField textFieldPhil;
	private JTextField textFieldsss;
	private JTextField textFieldgrossSal;
	private JTextField textFieldDed;
	private JTextField textFieldSal;
	private JTextField textFieldTtDed;
	private JTextField textFieldnetSal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simPayroll window = new simPayroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public simPayroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 872, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll  System");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(245, 11, 257, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setBounds(49, 62, 110, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour:");
		lblNewLabel_2.setBounds(59, 87, 92, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hour Per Day:");
		lblNewLabel_3.setBounds(62, 112, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of days worked:");
		lblNewLabel_4.setBounds(15, 137, 144, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(31, 189, 118, 40);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setForeground(new Color(128, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(317, 58, 153, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		txtC = new JTextField();
		txtC.setBounds(156, 58, 127, 20);
		frame.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		textFieldrate = new JTextField();
		textFieldrate.setBounds(156, 88, 127, 20);
		frame.getContentPane().add(textFieldrate);
		textFieldrate.setColumns(10);
		
		textFieldhour = new JTextField();
		textFieldhour.setBounds(156, 113, 127, 20);
		frame.getContentPane().add(textFieldhour);
		textFieldhour.setColumns(10);
		
		textFielddays = new JTextField();
		textFielddays.setBounds(156, 141, 127, 20);
		frame.getContentPane().add(textFielddays);
		textFielddays.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15%  of Monthly Wage");
		lblNewLabel_7.setBounds(296, 84, 187, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(364, 116, 77, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setBounds(395, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textFieldtax = new JTextField();
		textFieldtax.setEditable(false);
		textFieldtax.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldtax.setBounds(451, 88, 86, 20);
		frame.getContentPane().add(textFieldtax);
		textFieldtax.setColumns(10);
		
		textFieldPhil = new JTextField();
		textFieldPhil.setEditable(false);
		textFieldPhil.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldPhil.setBounds(451, 113, 86, 20);
		frame.getContentPane().add(textFieldPhil);
		textFieldPhil.setColumns(10);
		
		textFieldsss = new JTextField();
		textFieldsss.setEditable(false);
		textFieldsss.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldsss.setBounds(451, 142, 86, 20);
		frame.getContentPane().add(textFieldsss);
		textFieldsss.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gross Salary:");
		lblNewLabel_10.setBounds(620, 88, 77, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Deduction:");
		lblNewLabel_11.setBounds(630, 116, 67, 17);
		frame.getContentPane().add(lblNewLabel_11);
		
		textFieldgrossSal = new JTextField();
		textFieldgrossSal.setEditable(false);
		textFieldgrossSal.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldgrossSal.setBounds(707, 85, 86, 20);
		frame.getContentPane().add(textFieldgrossSal);
		textFieldgrossSal.setColumns(10);
		
		textFieldDed = new JTextField();
		textFieldDed.setEditable(false);
		textFieldDed.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldDed.setBounds(707, 113, 86, 22);
		frame.getContentPane().add(textFieldDed);
		textFieldDed.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(297, 189, 153, 40);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(592, 189, 99, 40);
		frame.getContentPane().add(lblNewLabel_13);
		
		textFieldSal = new JTextField();
		textFieldSal.setEditable(false);
		textFieldSal.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldSal.setBounds(156, 201, 110, 20);
		frame.getContentPane().add(textFieldSal);
		textFieldSal.setColumns(10);
		
		textFieldTtDed = new JTextField();
		textFieldTtDed.setEditable(false);
		textFieldTtDed.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldTtDed.setBounds(451, 201, 86, 20);
		frame.getContentPane().add(textFieldTtDed);
		textFieldTtDed.setColumns(10);
		
		textFieldnetSal = new JTextField();
		textFieldnetSal.setEditable(false);
		textFieldnetSal.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		textFieldnetSal.setBounds(707, 201, 86, 20);
		frame.getContentPane().add(textFieldnetSal);
		textFieldnetSal.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empName;
				int rate,hours,daysworked,grossSal;
				double tax,philTax,sssTax,totalDeductions,netSalary;
				
				rate=Integer.parseInt(textFieldrate.getText());
				hours = Integer.parseInt(textFieldhour.getText());
				daysworked = Integer.parseInt(textFielddays.getText());
				empName = txtC.getText();
				DecimalFormat df = new DecimalFormat("0");
				grossSal=rate*hours*daysworked;
				tax=0.15*grossSal;
				textFieldtax.setText(String.valueOf(df.format(tax)));
				philTax=0.05*grossSal;
				
				textFieldPhil.setText(String.valueOf(df.format(philTax)));

				sssTax=0.02*grossSal;
				
				textFieldsss.setText(String.valueOf(df.format(sssTax)));
				textFieldgrossSal.setText(String.valueOf(grossSal));

				totalDeductions=tax+philTax+sssTax;
				textFieldDed.setText(String.valueOf(df.format(totalDeductions)));
				textFieldSal.setText(String.valueOf(grossSal));
				textFieldTtDed.setText(String.valueOf(df.format(totalDeductions)));
				netSalary=grossSal-totalDeductions;
				
				textFieldnetSal.setText(String.valueOf(df.format(netSalary)));
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 64, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(330, 248, 153, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
