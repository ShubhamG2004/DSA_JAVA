import java.awt.*;
import java.awt.event.*;

class  BorderLayEx {
	BorderLayEx(){
		Frame f =new Frame();
		f.setSize(300,300);
		f.setTitle("Example of the Border Layout!!");
		
		
		Button b1= new Button("EAST");
		Button b2= new Button("WEST");
		Button b3= new Button("SOUTH");
		Button b4= new Button("NORTH");
		Button b5= new Button("CENTER");
		
		f.setLayout(new BorderLayout(20,5));
		f.add(b1, BorderLayout.EAST);
		f.add(b2, BorderLayout.WEST);
		f.add(b3, BorderLayout.SOUTH);
		f.add(b4, BorderLayout.NORTH);
		f.add(b5, BorderLayout.CENTER);
		
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		new BorderLayEx();
	}
}