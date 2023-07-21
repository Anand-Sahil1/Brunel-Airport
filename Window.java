import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
 
public class Window extends JFrame {
 
//ArrayList to store all the flight objects
public static ArrayList<Flight> flights = new ArrayList<>();
public static ArrayList<Flight> depFlights = new ArrayList<>();
public static ArrayList<Flight> arrivalFlights = new ArrayList<>();
 
//ArrayList to store the name of cities
public static ArrayList<String> cities = new ArrayList<>();
 
private JComboBox<String> depCpmbo;
private JComboBox<String> arrivalCombo;
private JTextField depDateText;
private JTextField arrivalDateText;
private JButton searchButton;
private JButton depButton;
private JButton arrivalButton;
private JTable depTable;
private JTable arrivalTable;
JScrollPane depScroll;
JScrollPane arrivalScroll;
 
public Window() {
 
setPreferredSize(new Dimension(1100, 650));
setLayout(null);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Brunel City Airport");
 
ImageWindow logo = new ImageWindow("logo.jpeg",245,125);
logo.setBounds(0,0,250,130);
add(logo);
 
 
//construct components
String[] depComboItems = new String[cities.size()];
depComboItems = cities.toArray(depComboItems);
String[] arrivalComboItems = cities.toArray(depComboItems);
 
depCpmbo = new JComboBox<> (depComboItems);
arrivalCombo = new JComboBox<> (arrivalComboItems);
 
JLabel labelFrom = new JLabel("From ");
JLabel labelTo = new JLabel("To ");
JLabel labelDepart = new JLabel("Departure ");
JLabel labelReturn = new JLabel("Return ");
searchButton = new JButton("Search");
depButton = new JButton("Departure");
arrivalButton = new JButton("Arrival");
depDateText = new JTextField();
arrivalDateText = new JTextField();
 
depTable = new JTable();
arrivalTable = new JTable();
setList();
 
depScroll = new JScrollPane(depTable);
arrivalScroll = new JScrollPane(arrivalTable);
 
//adjust size and set layout
 
 
//add components
add(depCpmbo);
add(arrivalCombo);
add(labelFrom);
add(labelTo);
add(labelDepart);
add(labelReturn);
add(searchButton);
add(depButton);
add(arrivalButton);
add(depScroll);
add(arrivalScroll);
add(depDateText);
add(arrivalDateText);
 
int y = 130;
//set component bounds (only needed by Absolute Positioning)
labelFrom.setBounds(150, y, 100, 30);
depCpmbo.setBounds(250, y, 200, 30);
labelTo.setBounds(650, y, 100, 30);
arrivalCombo.setBounds(750, y, 200, 30);
 
y = y + 50;
labelDepart.setBounds(150, y, 100, 30);
depDateText.setBounds(250,y,200,30);
labelReturn.setBounds(650, y, 100, 30);
arrivalDateText.setBounds(750,y,200,30);
 
y = y + 50;
searchButton.setBounds(500, y, 100, 30);
searchButton.setBackground(new Color(116, 186, 255));
y = y + 50;
 
depButton.setBounds(250, y, 100, 30);
depButton.setBackground(new Color(116, 186, 255));
 
arrivalButton.setBounds(750, y, 100, 30);
arrivalButton.setBackground(new Color(116, 186, 255));;
 
y=y+50;
depScroll.setBounds(50,y,500,250);
arrivalScroll.setBounds(550,y,500,250);
 
pack();
 
searchButton.addActionListener(e -> {
search();
});
 
arrivalButton.addActionListener(e -> {
new MapWindow();
});
 
}
 
public void setList(){
 
String[] depColumn = {"Time","To","Flight","Airline"};
String[] arrivalColumn = {"Time","From","Flight","Airline"};
 
DefaultTableModel model1 = (DefaultTableModel) depTable.getModel();
model1.setRowCount(0);
model1.setColumnIdentifiers(depColumn);
for (Flight f:depFlights){
model1.addRow(f.departInfo());
}
 
DefaultTableModel model2 = (DefaultTableModel) arrivalTable.getModel();
model2.setRowCount(0);
model2.setColumnIdentifiers(arrivalColumn);
for (Flight f:depFlights){
model2.addRow(f.arrivalInfo());
}
}
 
public void search(){
try {
LocalDate depDate = parseToDate(depDateText.getText());
LocalDate arrDate = parseToDate(arrivalDateText.getText());
depFlights = filterDepFlight((String) depCpmbo.getSelectedItem(), depDate);
arrivalFlights = filterArrivalFlight((String) arrivalCombo.getSelectedItem(), arrDate);
setList();
}catch (DateTimeParseException e){
JOptionPane.showMessageDialog(null,"Invalid Date Format","Invalid Date",JOptionPane.ERROR_MESSAGE);
}
 
}
 
 
public static void main(String[] args) {
 
 
try {
UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
loadData();
} catch (FileNotFoundException e) {
System.out.println("Error: File Not Found");
System.exit(0);
}catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
e.printStackTrace();
}
 
new Window();
}
 
public static ArrayList<Flight> filterDepFlight(String cityFrom, LocalDate date){
ArrayList<Flight> list = new ArrayList<>();
for (Flight flight: flights){
if (flight.getDepartureCity().equals(cityFrom) && flight.getFlightDate().equals(date)){
list.add(flight);
}
}
return list;
}
 
public static ArrayList<Flight> filterArrivalFlight(String cityTo, LocalDate date){
ArrayList<Flight> list = new ArrayList<>();
for (Flight flight: flights){
if (flight.getArrivalCity().equals(cityTo) && flight.getFlightDate().equals(date)){
list.add(flight);
}
}
return list;
}
 
 
/*
 * Method to load data from the csv file
 * If file is not found, it generates a message and system will terminate
 * */
public static void loadData() throws FileNotFoundException {
File file = new File("Flights-1.csv");
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
if (line != null) {
String[] token = line.split(",");
Flight flight = new Flight();
try {
flight.setFlightDate(parseToDate(token[0]));
flight.setDepartureTime(LocalTime.parse(token[1]));
flight.setArrivalTime(LocalTime.parse(token[2]));
flight.setFlightDuration(LocalTime.parse(token[3]));
flight.setDistanceTravelled(Double.parseDouble(token[4]));
flight.setFlightDelay(Integer.parseInt(token[5]));
flight.setDepartureAirport(token[6]);
flight.setDepartureCity(token[7]);
flight.setArrivalAirport(token[8]);
flight.setArrivalCity(token[9]);
flight.setFlightID(token[10]);
flight.setFlightAirline(token[11]);
flights.add(flight);
if (!cities.contains(token[7])) {
cities.add(token[7]);
}
if (!cities.contains(token[9])) {
cities.add(token[9]);
}
} catch (DateTimeParseException ignored) {
 
}
}
}
}
 
/*
 * Method that accepts a string as argument and return date by converting the string*/
public static LocalDate parseToDate(String text) throws DateTimeParseException {
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ROOT);
return LocalDate.parse(text, format);
}
 
 
}

