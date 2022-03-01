# Java-Programs

package com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame implements ActionListener{
	
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
		
		b1.addActionListener(this);
		b2.addActionListener(this);
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

		Login l=new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b1)    ///login validation's
		{
			String uname=tx1.getText();
			String pwd=tx2.getText();
			
			if(uname.trim().length()>0)
			{
				if(pwd.trim().length()>0)
				{
					if(uname.equals("admin") && pwd.equals("admin"))
					{
						System.out.println("Welcome");
					}
					else
					{
						System.out.println("Incorrect Username & Password");
					}
				}
				else
				{
					System.out.println("plzz enter Password");
				}
			}
			else
			{
				System.out.println("Plzz enter Username");
			}
		}
		else
		{
			tx1.setText(" ");
			tx2.setText(" ");
		}
	}
}

	
