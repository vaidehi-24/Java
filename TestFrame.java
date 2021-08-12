import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.Console;

import java.sql.SQLException;


class DemoFrame implements ActionListener
{
   JFrame frame = null;
   JTextField txtUsername = null;
   JTextField txtPass = null;
   JButton btnLogin = null;
   JButton btnCancle = null;
   
   DemoFrame()
   {
   
       frame.getContentPane().setBackground(java.awt.Color.BLUE);
       frame.setVisible(true);
       frame.setTitle("Login Page");
       frame.setSize(500,500);
       frame.setLocation(500,200);
       frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       Components();
	   Connect();
   }
   
      Connection con= null;
	  Statement st = null;
	  ResultSet rs = null;
	  Scanner sc = null;
	  PreparedStatement pst = null;
   
   public void Connect()
   {
	   try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/project2", "root", "");
			
             } catch (ClassNotFoundException | SQLException ex) {
				 
            System.out.println("Record not found"); 
			
            }
          
   }
   
   void Components()
   {
	   JLabel lblUsername = new JLabel();
	   lblUsername.setText("User Name :");
	   frame.add(lblUsername);
	   lblUsername.setBounds(50,100,100,20);
	   
	   JLabel lblPass = new JLabel();
	   lblPass.setText("Password :");
	   frame.add(lblPass);
	   lblPass.setBounds(50,150,100,20);
	   
	   JTextField txtUsername = new JTextField();
	   frame.add(txtUsername);
	   txtUsername.setBounds(130,100,100,20);
	   
	   JTextField txtPass = new JTextField();
	   frame.add(txtPass);
	   txtPass.setBounds(130,150,100,20);
	   
	   btnLogin = new JButton();
	   btnLogin.setText("LOGIN");
	   frame.add(btnLogin);
	   btnLogin.setBounds(100,200,70,20);
	   btnLogin.addActionListener(this);
	   
	   btnCancle = new JButton();
	   btnCancle.setText("CANCLE");
	   frame.add(btnCancle);
	   btnCancle.setBounds(180,200,80,20);
	   btnCancle.addActionListener(this);
	   
	 
	
   
   }

public void actionPerformed(ActionEvent ae)
{
	
	String username = txtUsername.getText();
	String password =txtPass.getText();
	Connect();
	
	
	
		try{
		    pst = con.prepareStatement("select * from user where Username = ? and Password = ? and Usertype = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            
			
			rs = pst.executeQuery();
		   
		   if(rs.next())
	       {
			     rs.getString(username);
				 rs.getString(password);
				 
	             int count = rs.getInt(1);
				 System.out.println(count);
				 if(count ==1)
	             {
		            System.out.println("Login Susscessfull"); 
	             }
				 else
				 {
					 System.out.println("Login Faillll");
				 }
				 
		   }
		   else
	       {
		         System.out.println("Record not found"); 
	       
		   }
   }catch(SQLException ex){
	   
	   System.out.println("Ohh Nooooooo");
	   
   }
   
   }
		
		
	

	
	
}
	
class TestFrame
{

   public static void main(String args[])
   {
   
       DemoFrame dframe = new DemoFrame();
       
   
   }


}