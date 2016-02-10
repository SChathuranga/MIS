package mis;

import java.awt.EventQueue;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ReportsView extends JFrame {

	private JPanel contentPane;
	//private static Point point = new Point();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportsView frame = new ReportsView();
					frame.setUndecorated(true);
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
	public ReportsView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReportsView.class.getResource("/Resources/Custo.Man.Christmas.Folder.Library.ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		StartPosition.centerOnScreen(this);
		
		JLabel lblLibraryMnagementSystem = new JLabel("Reports Generation");
		lblLibraryMnagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryMnagementSystem.setForeground(Color.WHITE);
		lblLibraryMnagementSystem.setFont(new Font("Ubuntu", Font.BOLD, 36));
		lblLibraryMnagementSystem.setBounds(449, 90, 518, 72);
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
		label.setIcon(new ImageIcon(ReportsView.class.getResource("/Resources/Bino.png")));
		label.setBounds(201, 52, 256, 167);
		contentPane.add(label);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionsReport frame = new TransactionsReport();
				frame.setUndecorated(true);
				frame.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(ReportsView.class.getResource("/Resources/emblem_library.png")));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(236, 358, 167, 167);
		contentPane.add(button);
		
		JLabel lblManageBooks = new JLabel("Library Revenue Reports");
		lblManageBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageBooks.setForeground(new Color(255, 255, 255));
		lblManageBooks.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblManageBooks.setBounds(175, 548, 282, 37);
		contentPane.add(lblManageBooks);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RevenueReport frame = new RevenueReport();
				//frame.ID = lblID.getText();
				frame.setUndecorated(true);
				frame.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(ReportsView.class.getResource("/Resources/checklist-icon.png")));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(590, 358, 167, 167);
		contentPane.add(button_1);
		
		JLabel lblManageMembers = new JLabel("Exam Reports");
		lblManageMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageMembers.setForeground(Color.WHITE);
		lblManageMembers.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblManageMembers.setBounds(559, 548, 222, 37);
		contentPane.add(lblManageMembers);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExamReports frame = new ExamReports();
				//frame.ID = lblID.getText();
				frame.setUndecorated(true);
				frame.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon(ReportsView.class.getResource("/Resources/Actions-view-history-icon.png")));
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBounds(944, 358, 167, 167);
		contentPane.add(button_2);
		
		JLabel lblViewIssuedBooks = new JLabel("Library Transactions Reports");
		lblViewIssuedBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewIssuedBooks.setForeground(Color.WHITE);
		lblViewIssuedBooks.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblViewIssuedBooks.setBounds(889, 538, 287, 57);
		contentPane.add(lblViewIssuedBooks);
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
	/*public JLabel getLblName() {
		return; //lblName;
	}
	public JLabel getLblProfilePicture() {
		return lblProfilePicture;
	}
	public JLabel getLblID() {
		return lblID;
	}*/
}
