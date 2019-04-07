package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;



public class BouncingPanel extends JPanel implements ActionListener
{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	private int width = 100;
	private int height = 75;
	
	BouncingPanel()
	{
		this.x = 100;
		this.y = 200;
		this.xSpeed = 2;
		this.ySpeed = 2;
		
		//This timer calls the actionPerformed method every 10 milliseconds.
	    Timer timer = new Timer(10, this);
	    timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		this.x += this.xSpeed;
		this.y += this.ySpeed;
		
		if(this.x + this.width >= panelWidth || this.x <= 0)
		{
			this.xSpeed *= -1;
		}
		if(this.y + this.height >= panelHeight || this.y <= 0)
		{
			this.ySpeed *= -1;
		}
		
		
		repaint();
	}
	
	private Color generateRandomColor()
	{
		Random rand = new Random();
		int red = rand.nextInt((255 - 0) + 1) + 0;
		int green = rand.nextInt((255 - 0) + 1) + 0;
		int blue = rand.nextInt((255 - 0) + 1) + 0;
		Color randomColor = new Color(red, green, blue);
		return randomColor;
	}
	
	
	public void paintComponent(Graphics g){
		//g.setColor(generateRandomColor());
	    super.paintComponent(g);
	    g.fillRect(this.x, this.y, this.width, this.height);
	 }
	

}
