import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FilteredFlights extends JFrame {

	private JPanel contentPane;
	private JTable DepartureTable;
	private JTable ReturnTable;

	 // Create the frame.
	public FilteredFlights(ArrayList<Flight> allFlights, String userDepartureCity, String userArrivalCity, String userDepartureDate,String userReturnDate) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//For Label "Available Flights"
		JLabel AvailableFlightsLB = new JLabel("Available Flights");
		AvailableFlightsLB.setFont(new Font("Tahoma", Font.BOLD, 35));
		AvailableFlightsLB.setBounds(10, 11, 292, 53);
		contentPane.add(AvailableFlightsLB);
		
		//For Label "Departures"
		JLabel DepartureLB = new JLabel("Departures");
		DepartureLB.setFont(new Font("Calibri", Font.BOLD, 25));
		DepartureLB.setForeground(Color.RED);
		DepartureLB.setBounds(68, 90, 126, 31);
		contentPane.add(DepartureLB);
		
		//For Label "Returns"
		JLabel ReturnsLB = new JLabel("Returns");
		ReturnsLB.setForeground(Color.RED);
		ReturnsLB.setFont(new Font("Calibri", Font.BOLD, 25));
		ReturnsLB.setBounds(68, 297, 88, 31);
		contentPane.add(ReturnsLB);
		
		//Adding Shop Button For Team Member"
		JButton btnSeatingPlan = new JButton("View Seating Plan");
		btnSeatingPlan.setForeground(Color.WHITE);
		btnSeatingPlan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSeatingPlan.setBackground(Color.BLUE);
		btnSeatingPlan.setBounds(84, 575, 218, 31);
		contentPane.add(btnSeatingPlan);
		
		//Declaring Arrays And Using Parameters That Will Be Used In These Arrays  
		ArrayList<Flight> departures = filterDepartures( allFlights, userDepartureCity, userArrivalCity, userDepartureDate, userReturnDate);
		ArrayList<Flight> returns = filterReturn( allFlights, userDepartureCity, userArrivalCity, userDepartureDate, userReturnDate);
		
		//Adding JScrollPanel To Add JTable To Display Filtered Departures
		JScrollPane DepartureScrollPane = new JScrollPane();
		DepartureScrollPane.setBounds(48, 119, 893, 173);
		DepartureScrollPane.setBackground(Color.BLACK);
		contentPane.add(DepartureScrollPane);
		
		DepartureTable = new JTable();
		DepartureTable.setBorder(null);
		DepartureTable.setSelectionBackground(Color.red); // To Change Color Of Selected Row
		DepartureScrollPane.setViewportView(DepartureTable);
		DepartureTable.setModel(new DefaultTableModel(
				
			//Displaying Filtered Departure Flight
				new Object[][] {
				{departures.get(0).getDate(), departures.get(0).departureCity, departures.get(0).departureAirport, departures.get(0).arrivalCity,
					departures.get(0).arrivalAirport, departures.get(0).departureTime, departures.get(0).arrivalTime, departures.get(0).flightNumber,
					departures.get(0).airline},				
			},
			// Heading For Columns Of Departure Table 
			new String[] {
				"Date Of Flight", "Departing From", "Airport", "Arriving To", "Airport", "Departure Time", "Arrival Time", "Flight Number", "Airline"
			}
			
			//Not Allowing User To Edit Any Column 
		) { boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		//Not Allowing User To Change Size Of Any Column And Defining Size Of Each Column
		DepartureTable.getColumnModel().getColumn(0).setResizable(false);
		DepartureTable.getColumnModel().getColumn(0).setPreferredWidth(81);
		DepartureTable.getColumnModel().getColumn(1).setResizable(false);
		DepartureTable.getColumnModel().getColumn(1).setPreferredWidth(94);
		DepartureTable.getColumnModel().getColumn(2).setResizable(false);
		DepartureTable.getColumnModel().getColumn(2).setPreferredWidth(53);
		DepartureTable.getColumnModel().getColumn(3).setResizable(false);
		DepartureTable.getColumnModel().getColumn(3).setPreferredWidth(90);
		DepartureTable.getColumnModel().getColumn(4).setResizable(false);
		DepartureTable.getColumnModel().getColumn(4).setPreferredWidth(51);
		DepartureTable.getColumnModel().getColumn(5).setResizable(false);
		DepartureTable.getColumnModel().getColumn(5).setPreferredWidth(89);
		DepartureTable.getColumnModel().getColumn(6).setResizable(false);
		DepartureTable.getColumnModel().getColumn(6).setPreferredWidth(70);
		DepartureTable.getColumnModel().getColumn(7).setResizable(false);
		DepartureTable.getColumnModel().getColumn(7).setPreferredWidth(79);
		DepartureTable.getColumnModel().getColumn(8).setResizable(false);
		DepartureTable.getColumnModel().getColumn(8).setPreferredWidth(44);
		
		////Adding JScrollPanel To Add JTable To Display Filtered Returns
		JScrollPane ReturnScrollPane = new JScrollPane();
		ReturnScrollPane.setBounds(48, 321, 893, 173);
		ReturnScrollPane.setBackground(Color.BLACK);
		contentPane.add(ReturnScrollPane);		
		
		ReturnTable = new JTable();
		ReturnTable.setBorder(null);
		ReturnTable.setSelectionBackground(Color.red); // To Change Color Of Selected Row
		ReturnScrollPane.setViewportView(ReturnTable);
		ReturnTable.setModel(new DefaultTableModel(
				
			// Displaying Filtered Return Flights	
			new Object[][] {
				{returns.get(0).getDate(), returns.get(0).departureCity, returns.get(0).departureAirport, returns.get(0).arrivalCity,
					returns.get(0).arrivalAirport, returns.get(0).departureTime, returns.get(0).arrivalTime, returns.get(0).flightNumber,
					returns.get(0).airline},
			},
			
			// Heading For Columns Of Return Table 
			new String[] {
				"Date Of Flight", "Departing From", "Airport", "Arriving To", "Airport", "Departure Time", "Arrival Time", "Flight Number", "Airline"
			}
			//Not Allowing User To Edit Any Column 
		) {boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		//Not Allowing User To Change Size Of Any Column And Defining Size Of Each Column
		ReturnTable.getColumnModel().getColumn(0).setResizable(false);
		ReturnTable.getColumnModel().getColumn(0).setPreferredWidth(81);
		ReturnTable.getColumnModel().getColumn(1).setResizable(false);
		ReturnTable.getColumnModel().getColumn(1).setPreferredWidth(94);
		ReturnTable.getColumnModel().getColumn(2).setResizable(false);
		ReturnTable.getColumnModel().getColumn(2).setPreferredWidth(53);
		ReturnTable.getColumnModel().getColumn(3).setResizable(false);
		ReturnTable.getColumnModel().getColumn(3).setPreferredWidth(90);
		ReturnTable.getColumnModel().getColumn(4).setResizable(false);
		ReturnTable.getColumnModel().getColumn(4).setPreferredWidth(51);
		ReturnTable.getColumnModel().getColumn(5).setResizable(false);
		ReturnTable.getColumnModel().getColumn(5).setPreferredWidth(89);
		ReturnTable.getColumnModel().getColumn(6).setResizable(false);
		ReturnTable.getColumnModel().getColumn(6).setPreferredWidth(70);
		ReturnTable.getColumnModel().getColumn(7).setResizable(false);
		ReturnTable.getColumnModel().getColumn(7).setPreferredWidth(79);
		ReturnTable.getColumnModel().getColumn(8).setResizable(false);
		ReturnTable.getColumnModel().getColumn(8).setPreferredWidth(44);
		
		//For Label "Select Number Of Tickets:" To Provide Clear Instruction To User, To Get User Input
		JLabel TicketLB = new JLabel("Select Number Of Tickets:");
		TicketLB.setFont(new Font("Calibri", Font.BOLD, 22));
		TicketLB.setForeground(Color.BLUE);
		TicketLB.setBounds(48, 536, 241, 28);
		contentPane.add(TicketLB);
		
		//Combo Box which contain Number Tickets, User Wants To Selects
		JComboBox TicketComboBox = new JComboBox();
		TicketComboBox.setFont(new Font("Calibri", Font.BOLD, 18));
		TicketComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		TicketComboBox.setBounds(288, 537, 66, 26);
		contentPane.add(TicketComboBox);
		
		// Adding Back Button To Allow User To Go Back On Previous Class 
		JButton ButtonBack = new JButton("BACK");
		ButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlightUI BackToFlightUI = new FlightUI(allFlights);	
				BackToFlightUI.setVisible(true);}
		});
		ButtonBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonBack.setBackground(Color.GRAY);
		ButtonBack.setBounds(724, 551, 108, 39);
		contentPane.add(ButtonBack);
				
		//Adding Submit Button To Check That User Have Select Flight For Departure And Return.
		JButton ButtonSubmit = new JButton("SUBMIT");
		ButtonSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//If User Select Flight For Departure And Return, Then User Will Get Thanking Message
				if (DepartureTable.getSelectedRow()==0 && ReturnTable.getSelectedRow()==0) {
					JOptionPane.showMessageDialog(null,"Thanks For Purchasing Ticket");}
				
				//If User Have Not Select Flight For Departure And Return, User Will Not Be Able To Purchase Ticket Or Click On Submit Button
				else if ((DepartureTable.getSelectedRow()==-1) || (ReturnTable.getSelectedRow()==-1)) {
					JOptionPane.showMessageDialog(null,"Select Flight For Departure And Return");}
				}		
		});
		ButtonSubmit.setBackground(Color.GRAY);
		ButtonSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonSubmit.setBounds(842, 551, 119, 39);
		contentPane.add(ButtonSubmit);
	}
	
	//Comparing ArrayFile & User Inputs To Find Flight For Departure
	public static ArrayList<Flight> filterDepartures(ArrayList<Flight> allFlights, String userDepartureCity, String userArrivalCity, String userDepartureDate,String userReturnDate)
	{

		ArrayList<Flight> departures = new ArrayList<Flight>();
		
		for(int i =0; i<allFlights.size(); i++)
		{
			if( allFlights.get(i).getDepartureCity().equals(userDepartureCity) &&  allFlights.get(i).getArrivalCity().equals(userArrivalCity) &&  allFlights.get(i).getDate().equals(userDepartureDate))
			{departures.add(allFlights.get(i));}
		}
		return departures;}
		
	
	//Comparing ArrayFile & User Inputs To Find Flight For Return
	public static ArrayList<Flight> filterReturn(ArrayList<Flight> allFlights, String userDepartureCity, String userArrivalCity, String userDepartureDate,String userReturnDate)
	{

		ArrayList<Flight> returns  = new ArrayList<Flight>();
		
		for(int i =0; i<allFlights.size(); i++)
		{
				if( allFlights.get(i).getDepartureCity().equals(userArrivalCity) &&  allFlights.get(i).getArrivalCity().equals(userDepartureCity) &&  allFlights.get(i).getDate().equals(userReturnDate))
				{returns.add(allFlights.get(i));}			
		}	
		return returns;}
		
}
