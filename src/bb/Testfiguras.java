package bb;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Testfiguras extends JFrame
{
	public Testfiguras()
	{
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	public static void main(String a[])
	{
		new Testfiguras();
	}
	
	public void paint(Graphics g)
	{
		//         X    Y   no  no    no   no
		g.drawArc(getX(), 200, 600, 600, 180, -180);
	}
	
}

