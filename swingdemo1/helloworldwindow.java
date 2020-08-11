package swingdemo1;
import javax.swing.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class helloworldwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Hello world");
		
		JLabel l1 = new JLabel("User Login");
		l1.setBounds(100, 20, 200, 30);
		f.add(l1);
		l1.setFont(new Font("Arial",Font.BOLD ,24));
		l1.setForeground(Color.RED);
		
		JLabel l = new JLabel("Username");
		l.setBounds(100, 50, 100, 20);
		f.add(l);
		
		JTextField tuser = new JTextField();
		tuser.setBounds(230, 50, 100, 20);
		f.add(tuser);
		
		JLabel lpwd = new JLabel("Password");
		lpwd.setBounds(100, 90, 100, 20);
		f.add(lpwd);
		
		JPasswordField tpwd = new JPasswordField();
		tpwd.setBounds(230, 90, 100, 20);
		f.add(tpwd);
		
		JButton b = new JButton(new ImageIcon("c:/java/save.png"));
		b.setBounds(100, 120, 100, 30);
		f.add(b);
		
		JButton b1 = new JButton("Open win");
		b1.setBounds(100,150,100, 30);
		f.add(b1);
		
		JTextArea tdetail = new JTextArea(4, 100);
		tdetail.setBounds(100, 300, 300, 80);
		f.add(tdetail);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
				nextwin.main(null);
				
			}
			
		});
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String inputtedUsername = tuser.getText();
				String inputtedPassword = tpwd.getText();
				String detail = "Dear friend, you have inputted Username: " + inputtedUsername + " and password : " + inputtedPassword;
				
				tdetail.setText(detail);					
			}
		});
		
		
		f.setSize(600, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
