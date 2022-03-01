# Java-Programs
package com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener {

	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b2;
	
	public Login()
	{
		setLayout(new FlowLayout());
		{
			Panel p1=new Panel();
			p1.setLayout(new GridLayout(3,2));
			setSize(300,300);
			setVisible(true);
			
			l1=new JLabel("username");
			l2=new JLabel("password");
	
			tx1=new JTextField(20);
			tx2=new JPasswordField(20);
			
			b1=new JButton("Login");
			b2=new JButton("Clear");
			
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login l=new Login();
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b1)  //login validation's
		{
			String uname = tx1.getText();
			String pwd = tx2.getText();    //depricated
			
			if(uname.trim().length()>0)
			{
				if(pwd.trim().length()>0)
				{
					if(uname.equals("admin") && pwd.equals("admin"))
					{
						JOptionPane.showMessageDialog(this,"Welcome");
					}
				
					else
					{
						JOptionPane.showMessageDialog(this,"Incorrect Username & PassWord");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Plzz Enter PassWord");
					
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Plzz Enter UserName");
			}
		}
		else
		{
			tx1.setText(" ");
			tx2.setText(" ");
		}
	}

}

