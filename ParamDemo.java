import java.applet.*; 
import java.awt.*; 

public class ParamDemo extends Applet { 
    String msg; 

    public void init() { 
        msg = getParameter("String"); 
        if (msg == null) {
            msg = "No parameter found";
        }
    } 

    public void paint(Graphics g) { 
        g.drawString("You have entered: " + msg, 50, 50); 
    } 
} 

/* 
<applet code="ParamDemo.class" width="300" height="300"> 
    <param name="String" value="VJTech Academy"> 
</applet> 
*/  
