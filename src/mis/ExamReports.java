package mis;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Toolkit;
//import javax.swing.BorderFactory;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class ExamReports extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public ExamReports() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ExamReports.class.getResource("/Resources/Custo.Man.Christmas.Folder.Library.ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		StartPosition.centerOnScreen(this);
		
		JLabel lblLibraryMnagementSystem = new JLabel("Exam Reports");
		lblLibraryMnagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryMnagementSystem.setForeground(Color.WHITE);
		lblLibraryMnagementSystem.setFont(new Font("Ubuntu", Font.BOLD, 36));
		lblLibraryMnagementSystem.setBounds(449, 49, 518, 72);
		contentPane.add(lblLibraryMnagementSystem);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				closeFrame();
			}
		});
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		lblX.setBounds(1320, 11, 34, 23);
		contentPane.add(lblX);
		
		JLabel lblMin = new JLabel("__");
		lblMin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MinFrame();
			}
		});
		lblMin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMin.setForeground(Color.RED);
		lblMin.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		lblMin.setBounds(1276, 11, 34, 23);
		contentPane.add(lblMin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ExamReports.class.getResource("/Resources/Bino.png")));
		label.setBounds(201, 11, 256, 167);
		contentPane.add(label);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setForeground(Color.WHITE);
		lblStudentId.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblStudentId.setBounds(144, 186, 151, 23);
		contentPane.add(lblStudentId);
		
		JLabel lblTerm = new JLabel("Term");
		lblTerm.setForeground(Color.WHITE);
		lblTerm.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblTerm.setBounds(467, 186, 151, 23);
		contentPane.add(lblTerm);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblGrade.setBounds(786, 186, 151, 23);
		contentPane.add(lblGrade);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setBounds(533, 187, 151, 20);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.GRAY);
		textField_1.setBounds(231, 187, 151, 20);
		contentPane.add(textField_1);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setForeground(Color.WHITE);
		btnGenerate.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		btnGenerate.setBackground(Color.DARK_GRAY);
		btnGenerate.setBounds(1077, 182, 104, 30);
		contentPane.add(btnGenerate);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		btnPrint.setBackground(Color.DARK_GRAY);
		btnPrint.setBounds(1206, 713, 104, 30);
		contentPane.add(btnPrint);
		
		JLabel label_1 = new JLabel("");
		label_1.setBorder(new LineBorder(Color.BLUE));
		label_1.setBounds(114, 150, 1121, 94);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBorder(new LineBorder(Color.BLUE));
		label_2.setBounds(52, 259, 1258, 443);
		contentPane.add(label_2);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setBounds(857, 188, 151, 20);
		contentPane.add(comboBox_1);
	}
	public void closeFrame()
	{
		super.dispose();
	}
	
	@SuppressWarnings("static-access")
	public void MinFrame()
	{
		super.setState(super.ICONIFIED);
	}
}
