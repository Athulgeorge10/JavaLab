package lab24;
import java.awt.Frame;
import java.awt.event.*;

import javax.swing.*;

public class GUICalc implements ActionListener{
	JFrame f = new JFrame("Calculator");
	JTextField t1 = new JTextField();
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclr,bequal;
	int n1,n2;
	String op;
	double result = 0;
	GUICalc(){
		f = new JFrame("Calculator");
		t1 = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bclr = new JButton("C");
		bequal = new JButton("=");
		
		t1.setBounds(100, 100, 200, 30);
		b1.setBounds(100,140,50,30);
		b2.setBounds(150,140,50,30);
		b3.setBounds(200,140,50,30);
		b4.setBounds(100,170,50,30);
		b5.setBounds(150,170,50,30);
		b6.setBounds(200,170,50,30);
		b7.setBounds(100,200,50,30);
		b8.setBounds(150,200,50,30);
		b9.setBounds(200,200,50,30);
		b0.setBounds(100,230,50,30);
		badd.setBounds(250,140,50,30);
		bsub.setBounds(250,170,50,30);
		bmul.setBounds(250,200,50,30);
		bdiv.setBounds(250,230,50,30);
		bclr.setBounds(150,230,50,30);
		bequal.setBounds(200,230,50,30);
		
		f.add(t1);	
		f.add(b1);	f.add(b2);	f.add(b3);	f.add(badd);
		f.add(b4);	f.add(b5);	f.add(b6);	f.add(bsub);
		f.add(b7);	f.add(b8);	f.add(b9);	f.add(bmul);
		f.add(b0);	f.add(bclr);f.add(bequal);f.add(bdiv);
		
		f.setLayout(null);
		f.setBounds(0,0,400,400);
		f.setVisible(true);
		f.setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bclr.addActionListener(this);
		bequal.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) t1.setText(t1.getText()+"1");
		if(e.getSource() == b2) t1.setText(t1.getText()+"2");
		if(e.getSource() == b3) t1.setText(t1.getText()+"3");
		if(e.getSource() == badd) {
			n1=Integer.parseInt(t1.getText());
			t1.setText("");
			op="+";
		}
		if(e.getSource() == b4) t1.setText(t1.getText()+"4");
		if(e.getSource() == b5) t1.setText(t1.getText()+"5");
		if(e.getSource() == b6) t1.setText(t1.getText()+"6");
		if(e.getSource() == bsub) {
			n1=Integer.parseInt(t1.getText());
			t1.setText("");
			op="-";
		}
		if(e.getSource() == b7) t1.setText(t1.getText()+"7");
		if(e.getSource() == b8) t1.setText(t1.getText()+"8");
		if(e.getSource() == b9) t1.setText(t1.getText()+"9");
		if(e.getSource() == bmul) {
			n1=Integer.parseInt(t1.getText());
			t1.setText("");
			op="*";
		}
		if(e.getSource() == b0) t1.setText(t1.getText()+"0");
		if(e.getSource() == bdiv) {
			n1=Integer.parseInt(t1.getText());
			t1.setText("");
			op="/";
		}
		if(e.getSource() == bclr) {
			t1.setText("");
		}
		if(e.getSource() == bequal) {
			n2 = Integer.parseInt(t1.getText());
			
			switch(op) {
				case "+":
					result = n1 + n2;
					break;
				case "-":
					result = n1 - n2;
					break;
				case "*":
					result = n1 * n2;
					break;
				case "/":
					try{
						result = n1 / n2;
					}catch(ArithmeticException i) {
						t1.setText("Math Error");
						return;
					}
					break;
			}
			t1.setText(""+result);
		}
		
	}
	public static void main(String[] args) {
		new GUICalc();
	}
	
}
