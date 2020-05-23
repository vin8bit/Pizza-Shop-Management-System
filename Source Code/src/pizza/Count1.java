/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




class Count1
{ 
	
	 Connection conn;
	 Statement stm;
	 ResultSet rs;
	int rowCount,rowCount2,rowCount3,rowCount4;
	String username="root";
	String password="";
	public Count1() //throws Exception
	{         
	}
	public  int call() //throws Exception
	{
			
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT COUNT(*)  FROM add_pizza ");
			rs.next();
			rowCount=rs.getInt(1);	
			rs.close();
			stm.close();
			conn.close();
			
			
                }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);}    
             return rowCount;
	}
	
	public  int call2() 
	{
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT COUNT(*)  FROM create_account ");
			rs.next();
			 rowCount2=rs.getInt(1);	
			rs.close();
			stm.close();
			conn.close();
			
                         }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);}  
                        return rowCount2;
	}
	
        public  int call3()
	{
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT COUNT(*)  FROM orders ");
			rs.next();
			rowCount3=rs.getInt(1);	
			rs.close();
			stm.close();
			conn.close();
                        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);}  
			return rowCount3;
	}
        public  int call4()
	{
			try{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT COUNT(*)  FROM feedback ");
			rs.next();
			rowCount4=rs.getInt(1);	
			rs.close();
			stm.close();
			conn.close();
                        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);}  
			return rowCount4;
	}
public static void main(String []args) //throws Exception
	{
		Count1 d=new Count1();	
	}
}	
