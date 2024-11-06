package lab24;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
public class MyTrafficlight extends JFrame implements ActionListener{
JRadioButton r1,r2,r3;
Color red_c,green_c,yellow_c;
	MyTrafficlight()
	{
		r1 = new JRadioButton("Red");
	    r2 = new JRadioButton("Yellow");
	    r3 = new JRadioButton("Green");
	    ButtonGroup gp = new ButtonGroup();
	    gp.add(r1);
	    gp.add(r2);
	    gp.add(r3);
	    r1.setBounds(50, 10, 100, 30);
	    r2.setBounds(150, 10, 100, 30);
	    r3.setBounds(250, 10, 100, 30);
	    add(r1);
	    add(r2);
	    add(r3);
	    r1.addActionListener(this);
	    r2.addActionListener(this);
	    r3.addActionListener(this);
	     red_c = getBackground();
	     green_c = getBackground();
	     yellow_c = getBackground();
	
	    setLayout(null);
	    setVisible(true);
	    setResizable(false);
	    setBounds(0,0,400,400);
	    
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(50,100,50,50);
		g.drawOval(50,160,50,50);
		g.drawOval(50,220,50,50);
		
		g.setColor(red_c);
		g.fillOval(50,100,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,160,50,50);
		g.setColor(green_c );
		g.fillOval(50,220,50,50);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (r1.isSelected()){
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
		}
		else if (r2.isSelected()){
			yellow_c=Color.yellow;
			red_c=getBackground();
			green_c=getBackground();
			
		}
		else if (r3.isSelected()){
			green_c=Color.green;
			yellow_c=getBackground();
			red_c=getBackground();
			
		}
		repaint();
	}
	
	public static void main(String[]args)
	{
		new MyTrafficlight();
	}

}