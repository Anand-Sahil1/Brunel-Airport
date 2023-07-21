//imports
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DisplayTicketWindow extends JFrame {
    
    private JPanel contentPane;
    public int PTicketNo;
    
    /**
     * Create the frame.
     */
    public DisplayTicketWindow(int PTicketNo) {
        String TicketNoDisplay = PTicketNo + "";
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(10, 11, 414, 56);
        contentPane.add(panel);
        
        JLabel ErrorLabel = new JLabel("Your Ticket Number Is:", SwingConstants.CENTER);
        ErrorLabel.setBackground(Color.RED);
        ErrorLabel.setBounds(10, 11, 394, 34);
        panel.add(ErrorLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(10, 78, 414, 172);
        contentPane.add(panel_1);
        
        JLabel TicketDisplay = new JLabel(TicketNoDisplay, SwingConstants.CENTER);
        TicketDisplay.setBounds(10, 11, 394, 150);
        panel_1.add(TicketDisplay);
    }

}


