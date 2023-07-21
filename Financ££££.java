import java.awt.Color;
import java.awt.Font;
import java.util.Random;
//import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Component;



public class Financ££££ {
	private static JScrollPane pane;
	
	

		public void finance() {
			JTable table = new JTable();
			//this allows the Jtable to list all the columns i have listed below when I run the code.
			Object[] columns = {"First name", "Surname", "D.O.B", "Ticket No.", "Ticket cost", "Bag cost", "Food cost", "Product cost", "Compensation", "Total overal cost"};
			DefaultTableModel model = new DefaultTableModel();
			
			
			JFrame frame = new JFrame("FINANCES");
			frame.getContentPane().setBackground(new Color(173, 216, 230));
			frame.getContentPane().setForeground(Color.BLACK);
			frame.setBounds(100,100,1014,442);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setLocationRelativeTo(null);
			
			//this allows the table to identify the columns i put
			model.setColumnIdentifiers(columns);
			table.setModel(model);
			
			table.setBackground(Color.orange);
			table.setForeground(Color.black);
			table.setSelectionBackground(Color.black);
			table.setGridColor(Color.black);
			table.setFont(new Font("Tahoma", Font.PLAIN,17));
			table.setRowHeight(30);
			table.setAutoCreateRowSorter(true);
			
			pane = new JScrollPane(table);
			pane.setForeground(Color.GREEN);
			pane.setBackground(Color.BLUE);
			pane.setBounds(6,16,1002,293);
			frame.getContentPane().add(pane);
			
			//this random generator generates number between 0-6 for baggage so if the system selects 0 it means 1 bag and it won't charge extra
			Random random = new Random();
			int x = (6);
			int bagCost = random.nextInt(x)*25;
			int bagCost1 = random.nextInt(x)*25;
			int bagCost2 = random.nextInt(x)*25;
			
			//this is double random generator for product cost between 1 and 650.0 and it rounds up the number and divides 2.5 for more accuracy
			double start = 1;
			double end = 650;
			double random1 = new Random().nextDouble();
			double productCost = Math.round(+ (random1 * (end - start)))/2.5;
			System.out.println(productCost);
			
			
			double start1 = 1;
			double end1 = 650;
			double random2 = new Random().nextDouble();
			double productCost2 = Math.round(+ (random2 * (end1 - start1)))/2.5;
			System.out.println(productCost2);
			
			double start2 = 1;
			double end2 = 650;
			double random3 = new Random().nextDouble();
			double productCost3 = Math.round(+ (random3 * (end2 - start2)))/2.5;
			System.out.println(productCost3);
			
			//this is random double generator for food cost between 1 and 300 and the random number will be rounded to the next 2dp
			double min = 1;
			double max = 300;
			double rand = new Random().nextDouble();
			double foodCost = Math.round(+ (rand * (max - min)))/2.0;
			System.out.println(foodCost);
			
			double min1 = 1;
			double max1 = 300;
			double rand1 = new Random().nextDouble();
			double foodCost1 = Math.round(+ (rand1 * (max1 - min1)))/2.0;
			System.out.println(foodCost1);
			
			double min2 = 1;
			double max2 = 300;
			double rand2 = new Random().nextDouble();
			double foodCost2 = Math.round(+ (rand2 * (max2 - min2)))/2.0;
			System.out.println(foodCost2);
			
			//I declared these departure and arrival distance (miles) doubles as it was provided in the assignment brief and I need it to calculate ticket cost and work out seat type
			double DepartureDistance = 7021.04;
			double ArrivalDistance = 11687.85;
			//I am declaring string seat type to calculate ticket prices for each seating class
			String eSeat = "Economy";
			String bSeat = "Business";
			String fSeat = "First";
			
			//this calculates the ticket cost for both legs by adding up departure and arrival distances multiplied by seat class and it rounds up to the next 2dp
			double ticketCost = Math.round((DepartureticketCost(DepartureDistance,fSeat) + ArrivalticketCost(ArrivalDistance, fSeat)) *50.0) / 100.0;
			double ticketCost1 = Math.round((DepartureticketCost(DepartureDistance,bSeat) + ArrivalticketCost(ArrivalDistance, bSeat)) *50.0) / 100.0;
			double ticketCost2 = Math.round((DepartureticketCost(DepartureDistance,eSeat) + ArrivalticketCost(ArrivalDistance, eSeat)) *50.0) / 100.0;
			

			
			
			Object[] row = new Object[10];
			Object[] row1 = new Object[10];
			Object[] row2 = new Object[10];
			//Object[] row3 = new Object[10];
//			Object[] row4 = new Object[10];
//			Object[] row5 = new Object[10];
//			Object[] row6 = new Object[10];
//			Object[] row7 = new Object[10];
			

			row[0] = "Aaron";row[1] = "Samuels";row[2] = "09/12/2090";row[3] = "83746578"; row[4] = "£" + ticketCost; row[5] = "£" + bagCost; row[6] = "£" + foodCost; row[7] = "£" + productCost; row[8] = "£" + Compensation(180); row[9] = ("£" + TotalCost(foodCost, ticketCost, productCost, Compensation(180), bagCost));
			row1[0] = "Regina";row1[1] = "George";row1[2] = "07/02/2090";row1[3] = "27475839"; row1[4] = "£" + ticketCost1; row1[5] = "£" + bagCost1; row1[6] = "£" + foodCost1; row1[7] = "£" + productCost2; row1[8] =( "£" + Compensation(180)); row1[9] = ("£" + TotalCost(foodCost1, ticketCost1, productCost2, Compensation(180), bagCost1));
			row2[0] = "Cady";row2[1] = "Heron";row2[2] = "01/10/2030";row2[3] = "95738494"; row2[4] = "£" + ticketCost2; row2[5] = "£" + bagCost2; row2[6] = "£" + foodCost2; row2[7] = "£" + productCost3; row2[8] = "£" + Compensation(180); row2[9] = ("£" + TotalCost(foodCost2, ticketCost2, productCost3, Compensation(180),bagCost2));
			
			
			//this allows me to add new row into my JTable
			model.addRow(row);
			model.addRow(row1);
			model.addRow(row2);
			//model.addRow(row3);
			
			//this makes sure the frame is visible
			frame.revalidate();
			frame.setVisible(true);
		}
			//I am declaring the compensation amount the system should give if there is any delays
			public static int Compensation(int delayMinutes) {
					int compensation ;
				
				if (delayMinutes >60 && delayMinutes  <= 120) {
					return compensation = 100;
				}
				else if (delayMinutes >120 && delayMinutes <= 180) {
					return compensation = 200;
				}
				
					return 300;
		}
			
			
			//the total cost is calculated by adding up food cost,bag cost,ticket cost,product cost minus any compensation 
				public static double TotalCost(double foodCost, double ticketCost, double productCost, int compensation, int bagCost ) {
					double totalCost = (foodCost + bagCost + ticketCost + productCost) - Compensation(compensation);
					return totalCost;
			
			}
				public static double ArrivalticketCost(double distance, String seat) {
					double ticketCost = 0;
					if(seat.equals("First")) {
							ticketCost = 1.5 * distance;
					}
					else if (seat.equals("Business")) {
							ticketCost = 1.0 * distance;
					}
					else {
						ticketCost = 0.5 * distance;
					}
					return ticketCost;
				}
				
				public static double DepartureticketCost(double distance, String seat) {
					double ticketCost = 0;
					if(seat.equals("First")) {
							ticketCost = 1.5 * distance;
					}
					else if (seat.equals("Business")) {
							ticketCost = 1.0 * distance;
					}
					else {
						ticketCost = 0.5 * distance;
					}
					return ticketCost;
				}
			
				
	}
