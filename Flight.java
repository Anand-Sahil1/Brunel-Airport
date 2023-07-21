import java.time.LocalTime;

public class Flight {
	
	//variables to store flight input value
	public String dateOfFlight;
	public String departureTime;
	public String arrivalTime;
	public String flightDuration;
	public double distanceTravelled;
	public int delay;
	public String departureAirport;
	public String departureCity;
	public String arrivalAirport;
	public String arrivalCity;
	public String flightNumber;
	public String airline;
	
	//Data Setters
	public void dateOfFlight (String dateOfFlight) {
		this.dateOfFlight = dateOfFlight;}
	
	public void departureTime (String departureTime) {
		this.departureTime = departureTime;}
	
	public void arrivalTime (String arrivalTime) {
		this.arrivalTime = arrivalTime;}
	
	public void flightDuration (String flightDuration) {
		this.flightDuration = flightDuration;}
	
	public void distanceTravelled (double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;}
	
	public void delay (int delay) {
		this.delay = delay;}
	
	public void departureAirport (String departureAirport) {
		this.departureAirport = departureAirport;}
	
	public void departureCity (String departureCity) {
		this.departureCity = departureCity;}
	
	public void arrivalAirport (String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;}
	
	public void arrivalCity (String arrivalCity) {
		this.arrivalCity = arrivalCity;}
	
	public void flightNumber (String flightNumber) {
		this.flightNumber = flightNumber;}
	
	public void airline (String airline) {
		this.airline = airline;}

	//Data Getters
	public String getDate()
	{return dateOfFlight;}
	
	public String getDepartureCity()
	{return departureCity;}
	
	public String getArrivalCity()
	{return arrivalCity;}
	
}
