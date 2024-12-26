import javax.swing.*;
import java.awt.event.*;

public class MouseLis extends JFrame{
	private JTextArea textarea;
	
	public MouseLis(){
		setTitle("Mouse Listener");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		textarea = new JTextArea();
		textarea.setBounds(20,20,300,300);
		textarea.setEditable(false);
		
		textarea.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				String btn;
				
				switch(e.getButton()){
					case MouseEvent.BUTTON1:
						btn="Left Button Clicked";
						break;
					case MouseEvent.BUTTON2:
						btn="Middle Button Clicked";
						break;
					case MouseEvent.BUTTON3:
						btn="Right Button Clicked";
						break;
					default :
						btn="Unknown button";
				}
				textarea.append("Mouse Clicked:" + btn +"\n");
			}
		});
		
		add(textarea);
		
		setVisible(true);
	}
	public static void main(String []args){
		new MouseLis();
	}
}