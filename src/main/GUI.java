package main;

import javax.swing.JFrame;

public class GUI
{
	JFrame jframe;
	
	
	GUI()
	{
		jframe = new JFrame("Bouncing DVD Logo");
		jframe.setSize(800, 600);
		
		
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(new BouncingPanel());
		jframe.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		GUI gui = new GUI();
	}
}
