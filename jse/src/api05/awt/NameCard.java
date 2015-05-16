package api05.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NameCard {
	public static void main(String[] args) {
		Frame frame = new Frame("명함");
		frame.setSize(300, 200);
		frame.setLayout(null);
	
		
		Label name = new Label("이름 : 홍길동");
		name.setBounds(50,50,100,15);
		Label age = new Label("나이 : 20");
		age.setBounds(50,65,100,15);
		Exit exit = new Exit();
		frame.addWindowListener(exit);
		frame.add(name);
		frame.add(age);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		frame.setLocation(100,100);
		frame.setVisible(true);
	}
}

class Exit extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}