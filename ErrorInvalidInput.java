//imports
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class ErrorInvalidInput extends JFrame {

    private JPanel contentPane;
    /**
     * Create the frame.
     */
    public ErrorInvalidInput() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 370);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(10, 11, 139, 56);
        contentPane.add(panel);
        
        JLabel ErrorLabel = new JLabel("Error!", SwingConstants.CENTER);
        ErrorLabel.setBackground(Color.RED);
        ErrorLabel.setBounds(34, 11, 74, 34);
        panel.add(ErrorLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(10, 78, 464, 195);
        contentPane.add(panel_1);
        
        JLabel lblOneOrMore = new JLabel("One or more of your inputs are invalid: ", SwingConstants.CENTER);
        lblOneOrMore.setBounds(10, 11, 444, 27);
        panel_1.add(lblOneOrMore);
        
        JLabel lblFirstNameMust = new JLabel("First name must be at least 3 characters long.", SwingConstants.CENTER);
        lblFirstNameMust.setBounds(10, 42, 444, 27);
        panel_1.add(lblFirstNameMust);
        
        JLabel lblSurnameMustBe = new JLabel("Surname must be at least 3 characters long.", SwingConstants.CENTER);
        lblSurnameMustBe.setBounds(10, 70, 444, 27);
        panel_1.add(lblSurnameMustBe);
        
        JLabel lblFirstNameMust_1_1 = new JLabel("Telephone number input must be an integer.", SwingConstants.CENTER);
        lblFirstNameMust_1_1.setBounds(10, 98, 444, 27);
        panel_1.add(lblFirstNameMust_1_1);
        
        JLabel lblFirstNameMust_1_1_1 = new JLabel("Email address input must contain \u2018@\u2019 character.", SwingConstants.CENTER);
        lblFirstNameMust_1_1_1.setBounds(10, 125, 444, 27);
        panel_1.add(lblFirstNameMust_1_1_1);
        
        JLabel lblFirstNameMust_1_1_1_1 = new JLabel("One or more of your inputs are empty!", SwingConstants.CENTER);
        lblFirstNameMust_1_1_1_1.setBounds(10, 153, 444, 27);
        panel_1.add(lblFirstNameMust_1_1_1_1);
        
        JButton TryAgain = new JButton("Try Again");
        TryAgain.setBounds(369, 284, 105, 36);
        contentPane.add(TryAgain);
        TryAgain.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }
}


