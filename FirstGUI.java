
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class FirstGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea nameTextArea;
	private JTextArea ticketTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGUI frame = new FirstGUI();
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
	public FirstGUI() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Confectioneries");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(84, 68, 103, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chocolate \u00A312.00");
		lblNewLabel_1.setBounds(65, 152, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fanta \u00A32.50");
		lblNewLabel_2.setBounds(73, 200, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gum \u00A30.90");
		lblNewLabel_3.setBounds(73, 246, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Crisps \u00A31.60");
		lblNewLabel_4.setBounds(73, 297, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(184, 149, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setBounds(184, 294, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_2.setBounds(184, 243, 30, 20);
		contentPane.add(spinner_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lipstick \u00A35.00");
		lblNewLabel_1_1.setBounds(252, 246, 103, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hairspray \u00A33.00");
		lblNewLabel_1_2.setBounds(252, 297, 103, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Comb \u00A33.00");
		lblNewLabel_1_3.setBounds(252, 152, 103, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Face wipes \u00A32.00");
		lblNewLabel_1_4.setBounds(252, 200, 103, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_4.setBounds(354, 149, 30, 20);
		contentPane.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_5.setBounds(354, 197, 30, 20);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_6.setBounds(354, 243, 30, 20);
		contentPane.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7.setBounds(354, 294, 30, 20);
		contentPane.add(spinner_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Trainers \u00A350.00");
		lblNewLabel_1_1_1.setBounds(406, 152, 103, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Jumper \u00A310.00");
		lblNewLabel_1_1_1_1.setBounds(406, 200, 103, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Neck pillow \u00A325.00");
		lblNewLabel_1_1_1_1_1.setBounds(406, 246, 103, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Watch \u00A315.00");
		lblNewLabel_1_1_1_1_2.setBounds(406, 297, 103, 14);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JSpinner spinner_7_1 = new JSpinner();
		spinner_7_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7_1.setBounds(549, 197, 30, 20);
		contentPane.add(spinner_7_1);
		
		JSpinner spinner_7_1_1 = new JSpinner();
		spinner_7_1_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7_1_1.setBounds(549, 149, 30, 20);
		contentPane.add(spinner_7_1_1);
		
		JSpinner spinner_7_1_2 = new JSpinner();
		spinner_7_1_2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7_1_2.setBounds(549, 243, 30, 20);
		contentPane.add(spinner_7_1_2);
		
		JSpinner spinner_7_1_2_1 = new JSpinner();
		spinner_7_1_2_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_7_1_2_1.setBounds(549, 297, 30, 20);
		contentPane.add(spinner_7_1_2_1);
		
		JLabel lblCosmetics = new JLabel("Cosmetics ");
		lblCosmetics.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCosmetics.setBounds(252, 68, 103, 44);
		contentPane.add(lblCosmetics);
		
		JLabel lblNewLabel_5_1 = new JLabel("Clothes");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(419, 68, 103, 44);
		contentPane.add(lblNewLabel_5_1);
		
		nameTextArea = new JTextArea();
		nameTextArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameTextArea.setBounds(754, 51, 171, 20);
		contentPane.add(nameTextArea);
		
		ticketTextArea = new JTextArea();
		ticketTextArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ticketTextArea.setBounds(754, 92, 171, 22);
		contentPane.add(ticketTextArea);
		
		JLabel lblNewLabel_5 = new JLabel("Full name ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(623, 56, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_2 = new JLabel("Ticket Number");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(623, 95, 103, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JButton btnNewButton = new JButton("Buy Now");
	
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(683, 156, 116, 58);
		contentPane.add(btnNewButton);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_3.setBounds(184, 197, 30, 20);
		contentPane.add(spinner_3);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// handle
				JOptionPane.showMessageDialog(null,"Thank you for your purchase!");
			}
		});
	
	
	}
}

