package LearningSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Student extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DSA77");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(37, 186, 221, 63);
		contentPane.add(btnNewButton);
		
		JButton btnCp = new JButton("CP332");
		btnCp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCp.setBounds(37, 113, 221, 63);
		contentPane.add(btnCp);
		
		JButton btnDm = new JButton("DM172");
		btnDm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDm.setBounds(37, 259, 221, 63);
		contentPane.add(btnDm);
		
		JLabel lblNewLabel = new JLabel("Ocampo, Cobain");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(456, 229, 135, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("415862");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(494, 259, 58, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\SHAWN\\Eclipse Projects\\StudentFiles\\images\\ProfileImage1.png"));
		lblNewLabel_2.setBounds(446, 83, 135, 136);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student Info");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_3.setBounds(247, 10, 183, 63);
		contentPane.add(lblNewLabel_3);
	}
}