import java.awt.*;
 
public class ImageWindow extends Canvas {
private String file;
private int height;
private int width;
 
public void paint(Graphics g) {
Toolkit t = Toolkit.getDefaultToolkit();
Image i = t.getImage(file);
g.drawImage(i, 0, 0, width, height, this);
}
 
ImageWindow(String file, int width,int height) {
this.file = file;
this.width = width;
this.height = height;
}
 
}

