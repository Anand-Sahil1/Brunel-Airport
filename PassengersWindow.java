//imports 
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengersWindow extends JFrame {

    File UsedSeatsAirBus = new File("UsedSeatsAirBus.txt");
    
    File UsedSeatsBoeing = new File("UsedSeatsBoeing.txt");
    
    Integer[] days = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    Integer[] months = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11, 12};
    
    Integer[] BagNum = {0, 1 , 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public JPanel contentPane;
    
    private JTextField FirstName;
    
    private JTextField Surname;
    
    private JTextField Email;
    
    private JTextField TeleNo;
    
    public int PTicketNo = 0;
    
    public static ArrayList<String> UsedSeatsAirBusAL = new ArrayList<String>(); //Stores used seats on an arraylist.
    public static ArrayList<String> UsedSeatsBoeingAL = new ArrayList<String>(); //Stores used seats on an arraylist.
    
    public String UsedDepartSeat = "";
    
    public String UsedReturnSeat = "";
    
    public String PlaneSelected = "AirBus";
        
    
    String[] AirBus = {"1A", "2A", "3A", "4A","5A", "6A", "7A", "8A", "9A", "10A","11A", "12A", "13A", "14A", 
            "1B", "2B", "3B", "4B","5B", "6B", "7B", "8B", "9B", "10B", "11B", "12B", "13B", "14B", 
            "6C", "7C", "8C", "9C", "10C", "11C", "12C", "13C", "14C", 
            "6D", "7D", "8D", "9D", "10D", "11D", "12D", "13D", "14D", 
            "6E", "7E", "8E", "9E", "10E", "11E", "12E", "13E", "14E", 
            "6F", "7F", "8F", "9F", "10F", "11F", "12F", "13F", "14F"};
    
    String[] Boeing = {"1A", "2A", "3A", "4A","5A", "6A", "7A", "8A", "9A", "10A","11A", "12A", "13A", "14A", "15A", "16A", "17A", "18A", "19A",
            "1B", "2B", "3B", "4B","5B", "6B", "7B", "8B", "9B", "10B","11B", "12B", "13B", "14B", "15B", "16B", "17B", "18B", "19B",
            "6C", "7C", "8C", "9C", "10C","11C", "12C", "13C", "14C", "15C", "16C", "17C", "18C", "19C",
            "6D", "7D", "8D", "9D", "10D","11D", "12D", "13D", "14D", "15D", "16D", "17D", "18D", "19D",
            "11E", "12E", "13E", "14E", "15E", "16E", "17E", "18E", "19E",
            "11F", "12F", "13F", "14F", "15F", "16F", "17F", "18F", "19F"};
    
    

    /**
     * Create the frame.
     */
    public PassengersWindow() throws FileNotFoundException
    {
        
        //Creation of GUI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 720, 410);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(20, 11, 182, 40);
        contentPane.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JPanel panel_1 = new JPanel();
        panel.add(panel_1);
        
        JLabel lblNewLabel = new JLabel("Input Details");
        panel_1.add(lblNewLabel);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_2.setBounds(20, 68, 662, 288);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("First Name", SwingConstants.CENTER);
        lblNewLabel_1.setBounds(10, 11, 113, 41);
        panel_2.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Surname", SwingConstants.CENTER);
        lblNewLabel_1_1.setBounds(10, 63, 113, 41);
        panel_2.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Date Of Birth (DD.MM.YYYY)", SwingConstants.CENTER);
        lblNewLabel_1_2.setBounds(10, 115, 157, 41);
        panel_2.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("Email", SwingConstants.CENTER);
        lblNewLabel_1_3.setBounds(10, 167, 113, 41);
        panel_2.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_1_4 = new JLabel("Telephone Number", SwingConstants.CENTER);
        lblNewLabel_1_4.setBounds(10, 219, 113, 41);
        panel_2.add(lblNewLabel_1_4);
        
        JLabel lblNewLabel_1_3_1 = new JLabel("Return Seat", SwingConstants.CENTER);
        lblNewLabel_1_3_1.setBounds(363, 167, 113, 41);
        panel_2.add(lblNewLabel_1_3_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Depart Seat", SwingConstants.CENTER);
        lblNewLabel_1_1_1.setBounds(363, 115, 113, 41);
        panel_2.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_5 = new JLabel("Number Of Bags", SwingConstants.CENTER);
        lblNewLabel_1_5.setBounds(363, 11, 113, 41);
        panel_2.add(lblNewLabel_1_5);
        
        FirstName = new JTextField();
        FirstName.setBounds(133, 21, 138, 20);
        panel_2.add(FirstName);
        FirstName.setColumns(10);
        
        Surname = new JTextField();
        Surname.setColumns(10);
        Surname.setBounds(133, 73, 138, 20);
        panel_2.add(Surname);
        
        Email = new JTextField();
        Email.setColumns(10);
        Email.setBounds(133, 177, 138, 20);
        panel_2.add(Email);
        
        TeleNo = new JTextField();
        TeleNo.setColumns(10);
        TeleNo.setBounds(133, 229, 138, 20);
        panel_2.add(TeleNo);
        
        JComboBox DateDay = new JComboBox(days);
        DateDay.setToolTipText("DD");
        DateDay.setBounds(177, 124, 46, 22);
        panel_2.add(DateDay);
        
        JComboBox DateMonth = new JComboBox(months);
        DateMonth.setToolTipText("MM");
        DateMonth.setBounds(233, 124, 46, 22);
        panel_2.add(DateMonth);
        
        JComboBox DateYear = new JComboBox();
        //Adds years between two numbers
        for(int y=1940;y<=2022;y++)
        {
            DateYear.addItem(y);
        }
        DateYear.setToolTipText("YYYY");
        DateYear.setBounds(289, 124, 64, 22);
        panel_2.add(DateYear);
        
        JComboBox BagNumber = new JComboBox(BagNum);
        BagNumber.setToolTipText("Number of bags you have");
        BagNumber.setBounds(486, 20, 46, 22);
        panel_2.add(BagNumber);
        
        JLabel JPlaneType = new JLabel("Plane", SwingConstants.CENTER);
        JPlaneType.setBounds(363, 63, 113, 41);
        panel_2.add(JPlaneType);
        
        JComboBox DepSeatOptions = new JComboBox(AirBus);
        DepSeatOptions.setToolTipText("Seat options");
        DepSeatOptions.setBounds(486, 124, 64, 22);
        panel_2.add(DepSeatOptions);
        
        
        JComboBox RetSeatOptions = new JComboBox(AirBus);
        RetSeatOptions.setToolTipText("Seat options");
        RetSeatOptions.setBounds(486, 176, 64, 22);
        panel_2.add(RetSeatOptions);
        
        
        UsedDepartSeat = "";
        UsedReturnSeat = "";
        PlaneSelected = "AirBus";
        //Creates file
        CreateFile();
        //Reads UsedSeatsAirBus and removes used options
        FileReader(UsedSeatsAirBus);
        
        
        //Combobox changes based on the plane selected
        String[] Planes = {"AirBus", "Boeing"};
        JComboBox PlaneOptions = new JComboBox(Planes);
        PlaneOptions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Get selected value from plane type combobox.
                PlaneSelected = String.valueOf(PlaneOptions.getSelectedItem());
                //CHOOSING SEAT OPTIONS BASED ON PLANE
                DepSeatOptions.removeAllItems();
                RetSeatOptions.removeAllItems();
                
                if (PlaneSelected == "AirBus")
                {
                    FileReader(UsedSeatsAirBus);
                    for(int i = 0; i < AirBus.length; ++i)
                        DepSeatOptions.addItem(AirBus[i]);
                    
                    for(int i = 0; i < AirBus.length; ++i)
                        RetSeatOptions.addItem(AirBus[i]);
                    
                    for (int j = 0; j < UsedSeatsAirBusAL.size(); ++j)
                    {
                        DepSeatOptions.removeItem(UsedSeatsAirBusAL.get(j));
                        RetSeatOptions.removeItem(UsedSeatsAirBusAL.get(j));
                    }   
                }
                    
                if (PlaneSelected == "Boeing")
                {
                    FileReader(UsedSeatsBoeing);
                    for(int i = 0; i < Boeing.length; ++i)
                        DepSeatOptions.addItem(Boeing[i]);
                    
                    for(int i = 0; i < Boeing.length; ++i)
                        RetSeatOptions.addItem(Boeing[i]);
                }
                for (int j = 0; j < UsedSeatsBoeingAL.size(); ++j)
                {
                    DepSeatOptions.removeItem(UsedSeatsBoeingAL.get(j));
                    RetSeatOptions.removeItem(UsedSeatsBoeingAL.get(j));
                }   
            }
        });
        PlaneOptions.setToolTipText("PlaneOptions");
        PlaneOptions.setBounds(486, 72, 74, 22);
        panel_2.add(PlaneOptions);
        
        for (int j = 0; j < UsedSeatsAirBusAL.size(); ++j)
        {
            DepSeatOptions.removeItem(UsedSeatsAirBusAL.get(j));
            RetSeatOptions.removeItem(UsedSeatsAirBusAL.get(j));
        }
        
        
        //Submit button checks inputs
        JButton Submit = new JButton("Submit");
        Submit.setBounds(535, 228, 89, 23);
        panel_2.add(Submit);
        Submit.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                //Check input
                if (CheckInput() == true)
                {
                    //Generates tickets + window
                    TicketGen Ticket = new TicketGen();
                    PTicketNo = Ticket.generator();
                    try {
                        DisplayTicketWindow frame = new DisplayTicketWindow(PTicketNo);
                        frame.setVisible(true);
                        frame.setTitle("Your ticket number!");
                    } catch (Exception f) {
                        f.printStackTrace();
                    }
                    
                    
                    //Removing previously selected items
                    
                    UsedDepartSeat = String.valueOf(DepSeatOptions.getSelectedItem());
                    UsedReturnSeat = String.valueOf(RetSeatOptions.getSelectedItem());
                    PlaneSelected = String.valueOf(PlaneOptions.getSelectedItem());

                    if (PlaneSelected == "AirBus")
                    {
                        FileWriter(UsedSeatsAirBus);
                    }
                    else
                    {
                        FileWriter(UsedSeatsBoeing);
                    }
                    
                    //Creates input details window again
                    try 
                    {
                        PassengersWindow frame = new PassengersWindow();
                        frame.setVisible(true);
                        frame.setTitle("Input Your Details");
                    } 
                    catch (Exception f) 
                    {
                        f.printStackTrace();
                    }
                    
                    //Disposes current window
                    dispose();
                    
                }
                //Create invalid input error window
                else 
                {
                    try {
                        ErrorInvalidInput frame2 = new ErrorInvalidInput();
                        frame2.setVisible(true);
                        frame2.setTitle("Error: Invalid Inputs!");
                    } catch (Exception f) {
                        f.printStackTrace();
                    }
                }
            }
        });
        
    }
    //Checks that input is valid
    public boolean CheckInput()
    {
        //Getters
        String fName = FirstName.getText();
        String lName = Surname.getText();
        String emailadd = Email.getText();
        String telephone =  TeleNo.getText();
        boolean inputValid = true;
        if (fName.isEmpty() || lName.isEmpty()|| emailadd.isEmpty() || telephone.isEmpty() || emailadd.contains("@") == false || fName.length() < 4 || lName.length() < 4 || telephone.matches("[0-9]+") == false)
        {
            inputValid = false;
            return inputValid;
            
        }
        else 
        {
            return inputValid;
        }
    }
    //Creates a file to store previous options 
    public void CreateFile() 
    {
        
        //Creates the files if it does not exist
        if (UsedSeatsAirBus.exists() == false || UsedSeatsBoeing.exists() == false)
        {
            try
            {
                
                UsedSeatsAirBus.createNewFile();
                UsedSeatsBoeing.createNewFile();
                    
                
            }
                catch (IOException e)
                {
                    System.out.println("Error accessing file");
                    e.printStackTrace();
                }
        }
    }
    
    //Writes selected seats on the file and reads them to append on the array
    public void FileWriter(File UsedSeatsFile)
    {
        //Writing to file
        try 
        {
                FileWriter FWriter = new FileWriter(UsedSeatsFile, true);
                FWriter.write(UsedDepartSeat + "\n");
                FWriter.write(UsedReturnSeat + "\n");
                FWriter.close();

        }
        catch (IOException f)
        {
            f.printStackTrace();
            System.out.println("Error writing file");
        }
        
    }
    public void FileReader(File UsedSeatsFile)
    {
        //reads file and appends seats to the UsedSeats arraylist
        try 
        {
            Scanner FReader = new Scanner(UsedSeatsFile);
            while (FReader.hasNextLine())
            {
                String FContents = FReader.nextLine();
                if (FContents.isEmpty() == false && PlaneSelected == "AirBus")
                {
                    UsedSeatsAirBusAL.add(FContents);
                }
                if (FContents.isEmpty() == false && PlaneSelected == "Boeing")
                {
                    UsedSeatsBoeingAL.add(FContents);
                }
            }
            FReader.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("Error reading file");
        }

    }
    /**
     * Launch the application.
     */
    // public static void main(String[] args) 
    // {
    //  EventQueue.invokeLater(new Runnable() 
    //  {
    //      public void run() 
    //      {
    //          try 
    //          {
    //              PassengersWindow frame = new PassengersWindow();
    //              frame.setVisible(true);
    //              frame.setTitle("Input Your Details");
    //          } 
    //          catch (Exception e) 
    //          {
    //              e.printStackTrace();
    //          }
    //      }
    //  });
    // }
}


