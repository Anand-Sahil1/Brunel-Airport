import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BrunelCityAirport {
	
	//Declaring Array!
	static ArrayList <Flight> allFlights = new ArrayList<Flight>();

	public static void main(String[] args) throws ParseException {
		
		//Reading CSV File Until Full File Is Not Read Using Reader
		try {
			File flights = new File("C:\\Users\\ADMIN\\Desktop\\BRUNEL UNIVERSITY\\CS1701 Group Project Lectures and Tutorials (A 20212)\\Assignment 3\\Flights.csv"); //Location Of The File 
			Scanner myReader = new Scanner(flights);
			
			while (myReader.hasNextLine()) { 
				String[] row = myReader.nextLine().split(","); // Splitting When Any Coma Found In The Row 
							
				//Assigning Extracted Value To Created Object
				Flight newFlight = new Flight();
				
				newFlight.dateOfFlight(row[0]);
				
				newFlight.departureTime(row[1]);
				
				newFlight.arrivalTime(row[2]);
				
				newFlight.flightDuration(row[3]);
				
				newFlight.distanceTravelled(Double.parseDouble(row[4]));
				
				newFlight.delay(Integer.parseInt(row[5]));
				
				newFlight.departureAirport(row[6]);
				
				newFlight.departureCity(row[7]);
				
				newFlight.arrivalAirport(row[8]);
				
				newFlight.arrivalCity(row[9]);
				
				newFlight.flightNumber(row[10]);
				
				newFlight.airline(row[11]);		
				
				allFlights.add(newFlight);
			}
			
			myReader.close(); // Closing Reader
		}
		
		// If The Flight CSV File Cannot Be Found So It Will Print "FILE CANNOT BE FOUND" Required Thing In The Console As An Error Handler
		catch (FileNotFoundException e) {
			System.out.println("FILE CANNOT BE FOUND");
			e.printStackTrace();}
		
		// Opening The Main Page
		try {
			FlightUI frame = new FlightUI(allFlights);
			frame.setVisible(true);}
			catch (Exception e) {
			e.printStackTrace();}
	}
		
}
		

	

