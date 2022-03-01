# Java-Programs

package com;
import java.awt.*;;
public class Login extends Frame{
	
	Label l1,l2;
	TextField tx1,tx2;
	Button b1,b2;
	
	public Login()
	{
		setLayout(new FlowLayout());
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(3,2));
		setSize(300,200);
		setVisible(true);
		
		l1=new Label("username");
		l2=new Label("password");
		
		tx1=new TextField(20);
		tx2=new TextField(20);
		
		b1=new Button("Login");
		b2=new Button("Clear");
		
		p1.add(l1);
		p1.add(tx1);
		p1.add(l2);
		p1.add(tx2);
		p1.add(b1);
		p1.add(b2);
		
		
		add(p1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login l1=new Login();
	}

}
