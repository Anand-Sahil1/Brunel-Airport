

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Brunel extends JFrame {

	protected static final String spinner_1_1 = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Brunel frame = new Brunel();
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
	public Brunel() {
		setResizable(false);
		getContentPane().setLayout(null);
		
		
		
		
		// synthetic data for all passangers
		Passanger a = new Passanger();
		a.setFirstName("Aaron");
		a.setSurName("Samuels");
		a.setTicketNumber(83746578);
		
		Passanger b = new Passanger();
		b.setFirstName("Regina");
		b.setSurName("George");
		b.setTicketNumber(27475839);
		
		Passanger c = new Passanger();
		c.setFirstName("Cady");
		c.setSurName("Heron");
		c.setTicketNumber(95738494);
		
		ArrayList<Passanger> allPassengers = new ArrayList<Passanger>();
		allPassengers.add(a);
		allPassengers.add(b);
		allPassengers.add(c);
		
		
		
		

		
		setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 702);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setBounds(52, 179, 89, 37);
		lblBreakfast.setForeground(Color.BLUE);
		lblBreakfast.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblBreakfast);
		
		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setBounds(360, 179, 89, 37);
		lblLunch.setForeground(Color.BLUE);
		lblLunch.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblLunch);
		
		JLabel lblDinner = new JLabel("Dinner");
		lblDinner.setBounds(646, 179, 89, 37);
		lblDinner.setForeground(Color.BLUE);
		lblDinner.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblDinner);
		
		JLabel lblNewLabel_1 = new JLabel("Toast   \u00A32.99");
		lblNewLabel_1.setBounds(25, 227, 106, 41);
		lblNewLabel_1.setForeground(new Color(0, 102, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Full English Breakfast  \u00A39.99");
		lblNewLabel_2.setBounds(25, 293, 203, 41);
		lblNewLabel_2.setForeground(new Color(0, 102, 204));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Breakfast Butty   \u00A34.99");
		lblNewLabel_3.setBounds(25, 380, 184, 24);
		lblNewLabel_3.setForeground(new Color(0, 102, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Muffin \u00A31.49");
		lblNewLabel_4.setBounds(25, 443, 89, 24);
		lblNewLabel_4.setForeground(new Color(0, 102, 204));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabelD_1 = new JLabel("Organic white or brown bread. Served ");
		lblNewLabelD_1.setBounds(24, 249, 231, 37);
		contentPane.add(lblNewLabelD_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("with a choice of jam or butter.");
		lblNewLabel_2_1.setBounds(24, 267, 212, 37);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_8 = new JLabel("Enter Full Name:");
		lblNewLabel_1_8.setBounds(294, 518, 318, 37);
		lblNewLabel_1_8.setForeground(SystemColor.desktop);
		lblNewLabel_1_8.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 23));
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Ticket Number:");
		lblNewLabel_1_9.setBounds(319, 566, 219, 37);
		lblNewLabel_1_9.setForeground(SystemColor.desktop);
		lblNewLabel_1_9.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 24));
		contentPane.add(lblNewLabel_1_9);
		
		textField = new JTextField();
		textField.setBounds(528, 518, 184, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(528, 566, 153, 33);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(246, 251, 36, 30);
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(246, 299, 36, 30);
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(246, 397, 36, 30);
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_3);
		
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(246, 464, 36, 30);
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		contentPane.add(spinner_4);
	
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(528, 233, 36, 30);
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_5);
		
				
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(528, 292, 36, 29);
		spinner_6.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_6);
			
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(528, 370, 36, 30);
		spinner_7.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(528, 437, 36, 30);
		spinner_8.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_8);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(822, 225, 36, 30);
		spinner_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		spinner_9.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		contentPane.add(spinner_9);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(822, 304, 36, 30);
		spinner_10.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_10);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(816, 370, 36, 30);
		spinner_11.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_11);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(816, 437, 36, 30);
		spinner_12.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(spinner_12);

        ArrayList<JSpinner> ajs = new ArrayList<JSpinner>();
		ajs.add(spinner_1);
		ajs.add(spinner_2);
		ajs.add(spinner_3);
		ajs.add(spinner_4);
		ajs.add(spinner_5);
		ajs.add(spinner_6);
		ajs.add(spinner_7);
		ajs.add(spinner_8);
		ajs.add(spinner_9);
		ajs.add(spinner_10);
		ajs.add(spinner_11);
		ajs.add(spinner_12);
		
		int[] stock = {100,100,100,100,100,100,100,100,100,100,100};
//==============================================================action button starts here========================================
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(766, 537, 92, 59);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String fullName = textField.getText(); 
			String ticketNumber = textField_1.getText(); 	
			
           if (fullName.isBlank() && ticketNumber.isBlank() == true) {
        	   JOptionPane.showMessageDialog(contentPane, "please input Full Name and ticket number!");
           }
           else if ( fullName.isEmpty()  == true )
				JOptionPane.showMessageDialog(contentPane, "please input Full Name!");
           else if ( ticketNumber.isEmpty()  == true )
				JOptionPane.showMessageDialog(contentPane, "please input Ticket Number!");
     
           
           
           ArrayList<Double> prices = new ArrayList<Double>();
			prices.add(2.99);
			prices.add(9.99);
			prices.add(4.99);
			prices.add(1.49);
			prices.add(13.00);
			prices.add(12.50);
			prices.add(11.50);
			prices.add(10.00);
			prices.add(9.99);
			prices.add(8.99);
			prices.add(12.99);
			prices.add(10.49);
			
			for(int i = 0; i<stock.length; i++)
			{
				stock[i] = stock[i] - (int) ajs.get(i).getValue();
				
				if( stock[i] < 0 )
				{
					myTimer();             //timer method found in just below ~50 lines
					
					stock[i] = stock[i] + 100;
					// update stock
				}
			}
			
			
			double total = 0.0;
			for(int i=0;i<ajs.size();++i)
			{
				int tot = (int)(ajs.get(i).getValue());
				double cost = prices.get(i);
				total = total + cost*tot;
				
			}
			
	
			for(int i = 0; i<allPassengers.size(); ++i)
			{
				String[] name = fullName.split(" ");
	
				if( name.length == 1 )
				{
					 JOptionPane.showMessageDialog(contentPane, "Please enter a valid input!");
					 break;
				}
				String ticket = (String) String.valueOf( allPassengers.get(i).getTicketNumber() );
									
				if( allPassengers.get(i).getFirstName().equals(name[0]) && allPassengers.get(i).getSurName().equals(name[1]) &&  ticket.equals(ticketNumber ))
				{		
					//passenger exists so purchase can be made
				
					    JOptionPane.showMessageDialog(contentPane, "Purchase success !");
                   
					//total price printing
					 JOptionPane.showMessageDialog(contentPane, "Total price is: £" + total);
					 break;
								
				}
			
				else 
				{
					JOptionPane.showMessageDialog(contentPane, "Sorry you're not registered!");
					break;
				}
			}
			
			
			
		
			
			
			}
	
			private void myTimer() {
				// TODO Auto-generated method stub
				Timer timer = new Timer();
				TimerTask timerTask = new TimerTask() {
					
					public void run()
					{
						
					}
				};
				timer.scheduleAtFixedRate(timerTask, 0, 180000);
				
			}
		});
		
		//==============================================================action button Ends here=====================================================
		
		btnNewButton.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnNewButton.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionForeground"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_5 = new JLabel("Brunel");
		lblNewLabel_1_5.setBounds(333, -14, 203, 82);
		lblNewLabel_1_5.setForeground(new Color(25, 25, 112));
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 47));
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_16 = new JLabel("City");
		lblNewLabel_16.setBounds(389, 43, 175, 49);
		lblNewLabel_16.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_1_7 = new JLabel("Restaurant");
		lblNewLabel_1_7.setBounds(230, 66, 408, 102);
		lblNewLabel_1_7.setForeground(SystemColor.desktop);
		lblNewLabel_1_7.setFont(new Font("Segoe Print", Font.BOLD, 70));
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabeld_2 = new JLabel("All meals served with a choice of any soft drink, tea or coffe.");
		lblNewLabeld_2.setBounds(25, 631, 351, 25);
		lblNewLabeld_2.setForeground(new Color(0, 102, 204));
		contentPane.add(lblNewLabeld_2);
		
		
		
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("2 Sausages, 2 bacon rashers, 2 hash ");
		lblNewLabel_2_2.setBounds(24, 315, 212, 37);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("browns, baked beans, toast.");
		lblNewLabel_2_1_1.setBounds(24, 333, 212, 37);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Choose from egg and bacon, ");
		lblNewLabel_2_3.setBounds(25, 395, 212, 37);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("egg and cheese or egg and ham.");
		lblNewLabel_2_1_2.setBounds(24, 413, 212, 37);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("Baked fresh daily. choice of blueberry, c");
		lblNewLabel_2_4.setBounds(24, 461, 212, 37);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("hocolate chip or caramel");
		lblNewLabel_2_1_3.setBounds(24, 479, 212, 37);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_5 = new JLabel("Steak Sandwich  \u00A313.00");
		lblNewLabel_5.setBounds(319, 214, 184, 41);
		lblNewLabel_5.setForeground(new Color(0, 102, 204));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("6 oz striploin cooked to you on Garlic ");
		lblNewLabel_2_5.setBounds(318, 236, 225, 37);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("ciabattam served with salad.");
		lblNewLabel_2_1_4.setBounds(318, 254, 212, 37);
		contentPane.add(lblNewLabel_2_1_4);
		
		
		JLabel lblNewLabel_6 = new JLabel("Duck wrap  \u00A312.50");
		lblNewLabel_6.setBounds(319, 280, 203, 41);
		lblNewLabel_6.setForeground(new Color(0, 102, 204));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Strips of crispy Duck stir Fried");
		lblNewLabel_2_2_1.setBounds(318, 302, 212, 37);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("with vegetables in chilli & tomato.");
		lblNewLabel_2_1_1_1.setBounds(318, 320, 212, 37);
		contentPane.add(lblNewLabel_2_1_1_1);
		
				
		JLabel lblNewLabel_7 = new JLabel("Chicken Curry  \u00A311.50");
		lblNewLabel_7.setBounds(319, 367, 184, 24);
		lblNewLabel_7.setForeground(new Color(0, 102, 204));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("With Basmati rice.");
		lblNewLabel_2_3_1.setBounds(318, 382, 212, 37);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Add some fries \u00A31");
		lblNewLabel_2_1_2_1.setBounds(318, 400, 212, 37);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_8 = new JLabel("Warm Couscous Bowl \u00A310.00");
		lblNewLabel_8.setBounds(319, 430, 211, 24);
		lblNewLabel_8.setForeground(new Color(0, 102, 204));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("chick peas, peppers, stirred in with ");
		lblNewLabel_2_4_1.setBounds(318, 448, 212, 37);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("a bowl Thai infused couscous with Conander.");
		lblNewLabel_2_1_3_1.setBounds(318, 466, 225, 37);
		contentPane.add(lblNewLabel_2_1_3_1);
		
			
		
		JLabel lblNewLabel_9 = new JLabel("Lasagne  \u00A39.99");
		lblNewLabel_9.setBounds(607, 214, 106, 41);
		lblNewLabel_9.setForeground(new Color(0, 102, 204));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_2_6 = new JLabel("Veggie option available. ");
		lblNewLabel_2_6.setBounds(606, 236, 212, 37);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("served with a light salad.");
		lblNewLabel_2_1_5.setBounds(606, 254, 212, 37);
		contentPane.add(lblNewLabel_2_1_5);
		
		
		
		JLabel lblNewLabel_10 = new JLabel("Tacos \u00A38.99");
		lblNewLabel_10.setBounds(607, 280, 203, 41);
		lblNewLabel_10.setForeground(new Color(0, 102, 204));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Choice of beef, pork, chicken or vegetables ");
		lblNewLabel_2_2_2.setBounds(606, 302, 212, 37);
		contentPane.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("with cheese, sour cream and guacamole.");
		lblNewLabel_2_1_1_2.setBounds(606, 320, 212, 37);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		
		
		JLabel lblNewLabel_11 = new JLabel("Fish & Chips \u00A312.99");
		lblNewLabel_11.setBounds(607, 367, 184, 24);
		lblNewLabel_11.setForeground(new Color(0, 102, 204));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Choice of cod or haddock. ");
		lblNewLabel_2_3_2.setBounds(606, 382, 212, 37);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("served with peas.");
		lblNewLabel_2_1_2_2.setBounds(606, 400, 212, 37);
		contentPane.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_12 = new JLabel("Roast Chicken \u00A310.49");
		lblNewLabel_12.setBounds(607, 430, 197, 24);
		lblNewLabel_12.setForeground(new Color(0, 102, 204));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Served with roast potatoes, ");
		lblNewLabel_2_4_2.setBounds(606, 448, 212, 37);
		contentPane.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("stuffing and vegetables.");
		lblNewLabel_2_1_3_2.setBounds(606, 466, 212, 37);
		contentPane.add(lblNewLabel_2_1_3_2);
		
		
	
		
	    
	}
}

