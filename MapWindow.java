import javax.swing.*;
import java.awt.*;
 
public class MapWindow extends JFrame{
MapWindow(){
setSize(1250,680);
setVisible(true);
setLayout(null);
ImageWindow map = new ImageWindow("img.png",900,670);
map.setBounds(10,10,910,680);
 
JLabel label = new JLabel("Delays: ");
label.setFont(new Font(Font.SERIF,Font.BOLD,18));
label.setBounds(930,10,100,30);
 
JTextArea text = new JTextArea();
StringBuilder str = new StringBuilder();
for (Flight f:Window.flights){
if (f.getFlightDelay()>=30){
str.append(f.delayInfo());
}
}
text.setText(str.toString());
text.setEditable(false);
text.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
 
JScrollPane scrollPane = new JScrollPane(text);
scrollPane.setBounds(930,50,300,580);
 
add(label);
add(map);
add(scrollPane);
}
}

