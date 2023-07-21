//Imports
import java.io.FileNotFoundException;
import java.util.Random;
//Ticket Generator Class
public class TicketGen
{
    private int TicketNo = 0;
    public int generator() 
    {
        int intlength = 0;
        while (intlength != 8)
        {
            Random num = new Random();
            TicketNo = num.nextInt(100000000) + 10000000;
            intlength = String.valueOf(TicketNo).length();
        }
        return TicketNo;
    }
}
