package basic07.training07.myself;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

class MySelf {
	public static void main(String[] args) {
		Frame frame = new Frame("자기소개");
		frame.setSize(300,200);
		frame.setVisible(true);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
	}
}

class Test{}
