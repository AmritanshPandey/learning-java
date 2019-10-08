import java.applet.Applet;
import java.awt.Graphics;


// Param Tag is used to pass the paremeter value from HTML file to applet code
// Param name is used as "name" which should be passed as parameter in get parameter method to fetch the value of the parameter

public class abc extends Applet {
        String str = null;
    public void init(){
        str = getParameter("name");
    }
    public void paint(Graphics g) {
        g.drawString(str, 100, 100);
    }
}