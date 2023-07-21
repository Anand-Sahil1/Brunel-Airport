import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import java.util.ArrayList;
import java.util.Date;

public class FlightUI extends JFrame {

	private JPanel contentPane;
	
	//Create the frame.
	public FlightUI(ArrayList<Flight> allFlights) {
		
		//Main Flight Interface
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adding Brunel Logo using JLabel
		JLabel BrunelLogo = new JLabel("");
		BrunelLogo.setIcon(new ImageIcon(FlightUI.class.getResource("/logo/logo.png")));
		BrunelLogo.setBounds(10, 11, 304, 140);
		contentPane.add(BrunelLogo);
		
		//For Label "From"
		JLabel FromLB = new JLabel("From:");
		FromLB.setFont(new Font("Calibri", Font.BOLD, 28));
		FromLB.setForeground(Color.BLUE);
		FromLB.setBounds(29, 229, 69, 39);
		contentPane.add(FromLB);
		
		//For Label "Depart"
		JLabel DepartLB = new JLabel("Depart:");
		DepartLB.setForeground(Color.BLUE);
		DepartLB.setFont(new Font("Calibri", Font.BOLD, 28));
		DepartLB.setBounds(9, 363, 89, 39);
		contentPane.add(DepartLB);
		
		//For Label "To"
		JLabel ToLB = new JLabel("To:");
		ToLB.setForeground(Color.BLUE);
		ToLB.setFont(new Font("Calibri", Font.BOLD, 28));
		ToLB.setBounds(546, 229, 37, 39);
		contentPane.add(ToLB);
		
		//For Label "Return"
		JLabel ReturnLB = new JLabel("Return:");
		ReturnLB.setForeground(Color.BLUE);
		ReturnLB.setFont(new Font("Calibri", Font.BOLD, 28));
		ReturnLB.setBounds(494, 363, 89, 39);
		contentPane.add(ReturnLB);
		
		//Adding Shop Button For Team Member"
		JButton ButtonShop = new JButton("SHOP");
		ButtonShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstGUI TakeToShopClass = new FirstGUI();	
				TakeToShopClass.setVisible(true);}
		});
		ButtonShop.setForeground(Color.BLACK);
		ButtonShop.setBackground(Color.WHITE);
		ButtonShop.setFont(new Font("Tahoma", Font.BOLD, 23));
		ButtonShop.setBounds(466, 59, 111, 50);
		contentPane.add(ButtonShop);
		
		//Adding Restaurant Button For Team Member"
		JButton ButtonRestaurant = new JButton("RESTAURANT");
		ButtonRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Brunel TakeToResturantClass = new Brunel();	
				TakeToResturantClass.setVisible(true);}		
		});
		ButtonRestaurant.setForeground(Color.BLACK);
		ButtonRestaurant.setFont(new Font("Tahoma", Font.BOLD, 23));
		ButtonRestaurant.setBackground(Color.WHITE);
		ButtonRestaurant.setBounds(593, 59, 196, 50);
		contentPane.add(ButtonRestaurant);
		
		//Adding Departure Button For Team Member"
		JButton ButtonDepartures = new JButton("DEPARTURES");
		ButtonDepartures.setForeground(Color.BLACK);
		ButtonDepartures.setFont(new Font("Tahoma", Font.BOLD, 23));
		ButtonDepartures.setBackground(Color.WHITE);
		ButtonDepartures.setBounds(532, 120, 196, 50);
		contentPane.add(ButtonDepartures);
		
		//Adding Arrival Button For Team Member"
		JButton ButtonArrivals = new JButton("ARRIVALS");
		ButtonArrivals.setForeground(Color.BLACK);
		ButtonArrivals.setFont(new Font("Tahoma", Font.BOLD, 23));
		ButtonArrivals.setBackground(Color.WHITE);
		ButtonArrivals.setBounds(739, 120, 164, 50);
		contentPane.add(ButtonArrivals);
		
		//Adding Finances Button For Team Member"
		JButton ButtonFinances = new JButton("FINANCES");
		ButtonFinances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financ££££ TakeToFinanceClass = new Financ££££();	
				TakeToFinanceClass.finance();}
		});
		ButtonFinances.setForeground(Color.BLACK);
		ButtonFinances.setFont(new Font("Tahoma", Font.BOLD, 23));
		ButtonFinances.setBackground(Color.WHITE);
		ButtonFinances.setBounds(803, 59, 158, 50);
		contentPane.add(ButtonFinances);
		
		//Drop-Down Menu which contain City Names For Departure
		JComboBox DepartureComboBox = new JComboBox();
		DepartureComboBox.setBackground(Color.WHITE);
		DepartureComboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		DepartureComboBox.setModel(new DefaultComboBoxModel(new String[] {"","Amsterdam", "Athens", "Bangkok", "Cairo", "Delhi", "Dubai", "Dublin", "Hong Kong", "Johannesburg", "Lagos", "Las Vegas", "Lisbon", "London", "Madrid", "Marrakkesh", "Mexico", "Moscow", "New York", "Paris", "Rome", "San Paulo", "Sweden", "Sydney", "Texas", "Tokyo", "Toronto"}));
		DepartureComboBox.setBounds(107, 229, 346, 39);
		contentPane.add(DepartureComboBox);
		
		//Drop-Down Menu which contain City Names For Return
		JComboBox ReturnComboBox = new JComboBox();
		ReturnComboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		ReturnComboBox.setModel(new DefaultComboBoxModel(new String[] {"","Amsterdam", "Athens", "Bangkok", "Cairo", "Delhi", "Dubai", "Dublin", "Hong Kong", "Johannesburg", "Lagos", "Las Vegas", "Lisbon", "London", "Madrid", "Marrakkesh", "Mexico", "Moscow", "New York", "Paris", "Rome", "San Paulo", "Sweden", "Sydney", "Texas", "Tokyo", "Toronto"}));
		ReturnComboBox.setBackground(Color.WHITE);
		ReturnComboBox.setBounds(590, 227, 346, 39);
		contentPane.add(ReturnComboBox);
		
		//Only Allowing User To Select Dates Between 01/08/2021 To 29/04/2022
		String MinimumDate="01/08/2021";
		String MaximumDate="29/04/2022";
		Date minDate = null;
		Date maxDate = null;
		try {
			minDate=new SimpleDateFormat("dd/MM/yyyy").parse(MinimumDate);
			maxDate=new SimpleDateFormat("dd/MM/yyyy").parse(MaximumDate);}

		 catch (ParseException e1) {
			 e1.printStackTrace();}
		
		//Using JDateChooser To Take User Departure Date Input
		JDateChooser DepartureDate = new JDateChooser();
		DepartureDate.setBounds(108, 363, 346, 39);
		DepartureDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		DepartureDate.setMaxSelectableDate(maxDate);
		DepartureDate.setMinSelectableDate(minDate);
		contentPane.add(DepartureDate);
				
		//Using JDateChooser To Take User Return Date Input
		JDateChooser ReturnDate = new JDateChooser();
		ReturnDate.setBounds(590, 363, 346, 39);
		ReturnDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		ReturnDate.setMaxSelectableDate(maxDate);
		ReturnDate.setMinSelectableDate(minDate);
		contentPane.add(ReturnDate);
		
		//Adding Search Button To Validate User Inputs And To Take User From Flight Interface To Filtered Flight Class Or Interface 
		JButton ButtonSearch = new JButton("SEARCH");
		ButtonSearch.setForeground(Color.BLACK);
		ButtonSearch.setFont(new Font("Tahoma", Font.BOLD, 35));
		ButtonSearch.setBackground(Color.GRAY);
		ButtonSearch.setBounds(399, 476, 229, 77);
		contentPane.add(ButtonSearch);
		
		
		ButtonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				//For Changing Date Format
				SimpleDateFormat converter = new SimpleDateFormat("dd/MM/yyyy");
				
				//Checking All Required Inputs Have Been Entered
				if (DepartureComboBox.getSelectedItem() == "" || ReturnComboBox.getSelectedItem() == "" || DepartureDate.getDate()==null || ReturnDate.getDate()==null) {
					JOptionPane.showMessageDialog(null,"Not All Required Fields Have Been Entered");}
				
			//	System.out.println(DepartureDate.getDate());
				
				//Converting Date Into String Data Type And Also Changing Date Format Into DD/MM/YYYY
				else { String depDate = converter.format(DepartureDate.getDate());
					   String arrvDate = converter.format(ReturnDate.getDate());
				
				//Displaying Error Message If User Have Select Same City For Departure And Arrival  
				if (DepartureComboBox.getSelectedItem() == ReturnComboBox.getSelectedItem()) {
					JOptionPane.showMessageDialog(null,"From And To Cannot Be The Same");}
				
				//Displaying Error Message If User Have Select Same Date For Departure And Return Using Formatted Dates Which Are depDate And arrvDate
				else if (depDate.equals(arrvDate)) {
					JOptionPane.showMessageDialog(null,"Return Date Must Be After Depart Date");}
								
				//Displaying Error Message If User Have Select Return date 
				else if (DepartureDate.getDate().compareTo(ReturnDate.getDate()) >= 0) {
					JOptionPane.showMessageDialog(null,"Return Date Must Be After Depart Date");}
						
				//If All Inputs Are Valid, Then All Inputs Are Stored In String Data Type For Comparison And Also Move To FilteredFlights Class 
				else {
				String userDepartureCity = DepartureComboBox.getSelectedItem()+"";
				String userArrivalCity = ReturnComboBox.getSelectedItem()+"";
				String userDepartureDate = depDate;
				String userReturnDate = arrvDate;

				FilteredFlights TakeToFilteredFlights = new FilteredFlights(allFlights, userDepartureCity, userArrivalCity, userDepartureDate, userReturnDate);	
				TakeToFilteredFlights.setVisible(true);}
					}
				}		
		});
	}
}
