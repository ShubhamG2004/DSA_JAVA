import java.awt.*;

public class GridLayoutEx extends Frame{
	
	GridLayoutEx(){
		setSize(300,300);
		setLayout(new GridLayout(3,2,5,5));
		
		for(int i=0;i<=8;i++){
			Button b=new Button("Button"+i);
			add(b);
		}
		setVisible(true);
	}
	
	public static void main(String args[]){
		new GridLayoutEx();
	}
}