import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEx extends JFrame{
	JTextArea j;
	Label l;
	MouseEx(){
		setSize(300,300);
		setLayout(null);
		
		j=new JTextArea();
		j.setBounds(20,20,100,100);
		j.setEditable(false);
		
		j.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				String btn;
				switch(me.getButton()){
					case MouseEvent.BUTTON1:
						btn="Left Button";
						break;
					case MouseEvent.BUTTON2:
						btn="Middle Button";
						break;
					case MouseEvent.BUTTON3:
						btn="Right Button";
						break;
					default:
						btn="Another Key";
				}
				j.append("Clicked"+btn+"\n");
			}
			
		});
		add(j);
		setVisible(true);
	}
	public static void main(String args[]){
		new MouseEx();
	}
}