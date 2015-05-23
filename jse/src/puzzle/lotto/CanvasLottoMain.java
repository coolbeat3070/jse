package puzzle.lotto;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CanvasLottoMain extends JFrame{
	CanvasLotto can;
	JButton jb1;
	JPanel jp1;
	
	public CanvasLottoMain() {
		setTitle("로또생성기");
		can = new CanvasLotto();
		jp1 = new JPanel();
		jb1 = new JButton("생성기");
		
		jp1.add(jb1);
		add(jp1, BorderLayout.NORTH);
		add(can, BorderLayout.CENTER);
		setBounds(100, 100, 800, 250);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CanvasLottoMain();
	}
}
