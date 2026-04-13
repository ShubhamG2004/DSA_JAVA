import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"oppen.png");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 10,10, this);  
  }  
}
/*
<applet code="DisplayImage"  width="900" height="900"></applet>
*/  