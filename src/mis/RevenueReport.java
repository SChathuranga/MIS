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
//import javax.swing.JTextField;
//import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.BorderFactory;

@SuppressWarnings("serial")
public class RevenueReport extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public RevenueReport() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RevenueReport.class.getResource("/Resources/Custo.Man.Christmas.Folder.Library.ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		StartPosition.centerOnScreen(this);
		
		JLabel lblLibraryMnagementSystem = new JLabel("Revenue Reports");
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
		label.setIcon(new ImageIcon(RevenueReport.class.getResource("/Resources/Bino.png")));
		label.setBounds(201, 11, 256, 167);
		contentPane.add(label);
		
		JLabel lblStudentId = new JLabel("Select Time Period");
		lblStudentId.setForeground(Color.WHITE);
		lblStudentId.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblStudentId.setBounds(309, 189, 151, 23);
		contentPane.add(lblStudentId);
		
		JLabel lblGrade = new JLabel("to");
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblGrade.setBounds(635, 189, 27, 23);
		contentPane.add(lblGrade);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setForeground(Color.WHITE);
		btnGenerate.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		btnGenerate.setBackground(Color.DARK_GRAY);
		btnGenerate.setBounds(898, 185, 104, 30);
		contentPane.add(btnGenerate);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		btnPrint.setBackground(Color.DARK_GRAY);
		btnPrint.setBounds(1206, 713, 104, 30);
		contentPane.add(btnPrint);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setForeground(Color.WHITE);
		dateChooser.getCalendarButton().setBackground(Color.DARK_GRAY);
		dateChooser.setForeground(Color.WHITE);
		dateChooser.setBorder(BorderFactory.createEmptyBorder());
		dateChooser.setBackground(Color.DARK_GRAY);
		dateChooser.setBounds(672, 192, 151, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.getCalendarButton().setForeground(Color.WHITE);
		dateChooser_1.getCalendarButton().setBackground(Color.DARK_GRAY);
		dateChooser_1.setForeground(Color.WHITE);
		dateChooser_1.setBorder(BorderFactory.createEmptyBorder());
		dateChooser_1.setBackground(Color.DARK_GRAY);
		dateChooser_1.setBounds(457, 192, 151, 20);
		contentPane.add(dateChooser_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBorder(new LineBorder(Color.BLUE));
		label_1.setBounds(114, 150, 1121, 94);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBorder(new LineBorder(Color.BLUE));
		label_2.setBounds(52, 259, 1258, 443);
		contentPane.add(label_2);
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
