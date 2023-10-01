/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author programmer
 */
        
public class DataTable {
        String username="root";
	String password="1234";
	PreparedStatement stm;
	PreparedStatement preparedStmt;
    
    public DataTable(){
    
    try{
				Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
				/*String queryd = "create database avskpizza";
      				preparedStmt = conn.prepareStatement(queryd);
      				preparedStmt.execute();*/
                                
                                String query = "use avskpizza";
      				preparedStmt = conn.prepareStatement(query);
      				preparedStmt.execute();
				
                                
				String query2 = "CREATE TABLE  add_pizza(pizza_id varchar(50),pizza_name varchar(200),image varchar(500),price varchar(50),categorie varchar(100),description varchar(200))";
      				preparedStmt = conn.prepareStatement(query2);
      				preparedStmt.execute();				
				String query3 = "CREATE TABLE  admin(id varchar(50),password varchar(200))";
      				preparedStmt = conn.prepareStatement(query3);
      				preparedStmt.execute();
                                stm =  conn.prepareStatement("insert into admin values(?,?)");
			                stm.setString(1,"avsk");
				stm.setString(2,"456");
				stm.executeUpdate();
				String query4 = "CREATE TABLE  create_account(id varchar(50),name varchar(50),mobile varchar(50),password varchar(100),email varchar(50))";
      				preparedStmt = conn.prepareStatement(query4);
      				preparedStmt.execute();
				String query5 = "CREATE TABLE  feedback(id varchar(50),feedback varchar(300))";
      				preparedStmt = conn.prepareStatement(query5);
      				preparedStmt.execute();
                                String query6 = "CREATE TABLE  orders(id varchar(50),pizza_id varchar(50),name varchar(50),qty varchar(100),total varchar(50),address varchar(200),date varchar(50),time varchar(50))";
      				preparedStmt = conn.prepareStatement(query6);
      				preparedStmt.execute();
				
				System.out.println("Create table successful");
                                JOptionPane.showMessageDialog((JComponent)null,"Create table successful","Create table successful",JOptionPane.INFORMATION_MESSAGE);
				
				    }
				catch(Exception v) { System.out.println(v);  JOptionPane.showMessageDialog((JComponent)null,v,"Error",JOptionPane.INFORMATION_MESSAGE);  }
    
    }
    
    public static void main(String args[]){
        new DataTable();
    }
}
