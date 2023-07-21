// FlightArrivalMap 
import java.time.LocalDate;
import java.time.LocalTime;
 
/*
* Class to represent details of a flight
* Object of this class serves as one flight record
* */
public class FlightArrivalMap  {
//Data fields for flight information
private LocalDate flightDate;
private LocalTime departureTime;
private LocalTime arrivalTime;
private LocalTime flightDuration;
private double distanceTravelled;
private int flightDelay;
private String departureAirport;
private String departureCity;
private String arrivalAirport;
private String arrivalCity;
private String flightID;
private String flightAirline;
 
//default constructor to initialise values
FlightArrivalMap () {
flightDate = Window.parseToDate("01/01/2021");
departureTime = LocalTime.parse("00:00");
arrivalTime = LocalTime.parse("00:00");
flightDuration = LocalTime.parse("00:00");
distanceTravelled = 0;
flightDelay = 0;
departureAirport = "ABC";
departureCity = "ABC";
arrivalAirport = "XYZ";
arrivalCity = "XYZ";
flightID = "AA001";
flightAirline = "NONE";
}
 
/**Wrapping the data and code acting on the data together as a single unit
 * Setters for data members
 * To implement data encapsulation
 * Each setter set the value for respective data member
 */
public void setFlightDate(LocalDate flightDate) {
this.flightDate = flightDate;
}
 
public void setDepartureTime(LocalTime departureTime) {
this.departureTime = departureTime;
}
 
public void setArrivalTime(LocalTime arrivalTime) {
this.arrivalTime = arrivalTime;
}
 
public void setFlightDuration(LocalTime flightDuration) {
this.flightDuration = flightDuration;
}
 
public void setDistanceTravelled(double distanceTravelled) {
this.distanceTravelled = distanceTravelled;
}
 
public void setFlightDelay(int flightDelay) {
this.flightDelay = flightDelay;
}
 
public void setDepartureAirport(String departureAirport) {
this.departureAirport = departureAirport;
}
 
public void setDepartureCity(String departureCity) {
this.departureCity = departureCity;
}
 
public void setArrivalAirport(String arrivalAirport) {
this.arrivalAirport = arrivalAirport;
}
 
public void setArrivalCity(String arrivalCity) {
this.arrivalCity = arrivalCity;
}
 
public void setFlightID(String flightID) {
this.flightID = flightID;
}
 
public void setFlightAirline(String flightAirline) {
this.flightAirline = flightAirline;
}
 
 
/*
 * Getters for data members
 * Each method returns the respective value of data members
 * */
public LocalDate getFlightDate() {
return flightDate;
}
 
public LocalTime getDepartureTime() {
return departureTime;
}
 
public LocalTime getArrivalTime() {
return arrivalTime;
}
 
public LocalTime getFlightDuration() {
return flightDuration;
}
 
public double getDistanceTravelled() {
return distanceTravelled;
}
 
public int getFlightDelay() {
return flightDelay;
}
 
public String getDepartureAirport() {
return departureAirport;
}
 
public String getDepartureCity() {
return departureCity;
}
 
public String getArrivalAirport() {
return arrivalAirport;
}
 
public String getArrivalCity() {
return arrivalCity;
}
 
public String getFlightID() {
return flightID;
}
 
public String getFlightAirline() {
return flightAirline;
}
 
/*returns a string containing the source text segment which was used to define the function
 * Override toSting() method to return string contain
 * all the information about the Flight object
 * */
@Override
public String toString() {
return "Flight Date = " + flightDate +
"\nDeparture Time = " + departureTime +
"\nArrival Time = " + arrivalTime +
"\nFlight Duration = " + flightDuration +
"\nDistance Travelled = " + distanceTravelled +
"\nFlight Delay = " + flightDelay +
"\nDeparture Airport = " + departureAirport +
"\nDeparture City = " + departureCity +
"\nArrival Airport = " + arrivalAirport +
"\nArrival City = " + arrivalCity +
"\nFlight ID = " + flightID +
"\nFlight Airline = " + flightAirline;
}
 
/*
 * Method to print general information of Flight object*/
public String delayInfo() {
LocalTime newTime = arrivalTime.plusMinutes(flightDelay);
return departureTime + " " + departureAirport + " " + arrivalAirport + " " + arrivalTime + " " + flightDelay + " " + newTime + "\n";
}
 
public String[] departInfo() {
return new String[]{departureTime.toString(), arrivalCity, flightID, flightAirline};
}
 
public String[] arrivalInfo() {
return new String[]{arrivalTime.toString(), arrivalCity, flightID, flightAirline};
}
 
}


