/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static pizza.EditPizza.model;

/**
 *
 * @author programmer
 */
public class MemberPanel extends javax.swing.JPanel {

    /**
     * Creates new form MemberPanel
     */
     String s1,s2,s3,s4,s5,s6;
    
    String username = "root";
    String password = "";
    Connection conn;
    Statement stm2;
    PreparedStatement stm;
    ResultSet rs2 ;
    int pass1,pass2;
    int error1,error2;
    TableModel tmodel;
    JTable jTable;
    TableRowSorter<TableModel> rsorter;
    int i=0,k=0,l=0,p=0,y=0,j=0,y2=0,j2=0;
 
    
    ResultSet rs;
    
    Count1 count=new Count1();
    int g=5+count.call2();
    Object array[][] = new Object[g][5];
    String columns[]={"Member ID","Member Name","Mobile no","Password","Email"};
    Object[] row;
    DefaultTableModel model;
    JScrollPane jScrollPane;
    String sl1,sl2,sl3,sl4,sl5,sl6;
    MemberPanel.ViewMember mv;
    public MemberPanel() {
         mv = new MemberPanel.ViewMember();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ltf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ltf5 = new javax.swing.JTextField();
        ltf3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ltf4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ltf2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(159, 25, 25));

        jPanel1.setBackground(new java.awt.Color(159, 25, 25));

        jButton1.setBackground(new java.awt.Color(159, 25, 25));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ltf1.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel2.setText("Member Name :");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Member");

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel1.setText("Member id :");

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel5.setText("Email id :");

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel4.setText("Password :");

        jButton2.setBackground(new java.awt.Color(159, 25, 25));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel3.setText("Mobile no :");

        jButton3.setBackground(new java.awt.Color(159, 25, 25));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ltf4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltf3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltf2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltf1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ltf5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ltf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ltf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ltf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ltf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ltf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(159, 25, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(mv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        s1 = ltf1.getText();
        s2 = ltf2.getText();
        s3 = ltf3.getText();
        s4 = ltf4.getText();
        s5 = ltf5.getText();

        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields is empty","Error",JOptionPane.ERROR_MESSAGE);

        }else{
            s1 = s1.trim();
            s2 = s2.trim();
            s3 = s3.trim();
            s4 = s4.trim();
            s5 = s5.trim();
            
                    

                    try        {
                            try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
      							String query = "delete from create_account where id = ?";
      							PreparedStatement preparedStmt = con2.prepareStatement(query);
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
                                                        
      							con2.close();
				   		} catch(ClassNotFoundException | HeadlessException | SQLException r){JOptionPane.showMessageDialog(this,r,"Success",JOptionPane.INFORMATION_MESSAGE);}
                        Class.forName("com.mysql.cj.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
                        stm =  conn.prepareStatement("insert into create_account values(?,?,?,?,?)");
                        stm.setString(1,s1);
                        stm.setString(2,s2);
                        stm.setString(3,s3);
                        stm.setString(4,s4);
                        stm.setString(5,s5);

                        stm.executeUpdate();

                        JOptionPane.showMessageDialog(this,"Update Member Successful","Success",JOptionPane.INFORMATION_MESSAGE);
                        ltf1.setText("");
                        ltf2.setText("");
                        ltf3.setText("");
                        ltf4.setText("");
                        ltf5.setText("");

                        conn.close();
                        
                        int i2 = jTable.getSelectedRow();
            model.removeRow(i2);
                
            row = new Object[6];
            row[0]=(Object)s1;
            row[1]=(Object)s2;
            row[2]=(Object)s3;
            row[3]=(Object)s4;
            row[4]=(Object)s5;
            model.addRow(row);

                    }
                    catch(HeadlessException | SQLException | ClassNotFoundException e){ }

               
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ltf1.setText("");
        ltf2.setText("");
        ltf3.setText("");
        ltf4.setText("");
        ltf5.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         s1 = ltf1.getText();
        s2 = ltf2.getText();
        s3 = ltf3.getText();
        s4 = ltf4.getText();
        s5 = ltf5.getText();
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields is empty","Error",JOptionPane.ERROR_MESSAGE);
            
        }else{    
                    
        
                try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
      							String query = "delete from create_account where id = ?";
      							PreparedStatement preparedStmt = con2.prepareStatement(query);
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
                                                        JOptionPane.showMessageDialog(this,"Delete successful","Success",JOptionPane.INFORMATION_MESSAGE);
                                                        ltf1.setText("");	
				 			ltf2.setText("");
							ltf3.setText("");
							ltf4.setText("");
							ltf5.setText("");
							
                                                        int i2 = jTable.getSelectedRow();
                                                         model.removeRow(i2);
      							con2.close();
				   		} catch(ClassNotFoundException | HeadlessException | SQLException r){JOptionPane.showMessageDialog(this,r,"Error",JOptionPane.ERROR_MESSAGE);}
            
            }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ltf1;
    private javax.swing.JTextField ltf2;
    private javax.swing.JTextField ltf3;
    private javax.swing.JTextField ltf4;
    private javax.swing.JTextField ltf5;
    // End of variables declaration//GEN-END:variables

///////////////////////**********End Super Class******//////////////////
    
    public  class ViewMember extends javax.swing.JPanel {

    /**
     * Creates new form ViewPizza
     */
     
   
    
    public ViewMember() {
        
        this.fillData();
       jTable = new javax.swing.JTable();

        
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable);
        model = new DefaultTableModel(array,columns) {
        boolean[] canEdit = new boolean [] {true, true,true, true,true};};
        jTable.setModel(model);
        rsorter = new TableRowSorter<TableModel>(model);
		
		jTable.setRowSorter(rsorter);
       
			
        initComponents();
        this.add(jScrollPane,BorderLayout.CENTER);
        jPanel1.setBackground(new java.awt.Color(159, 25, 25));
        jTable.setSelectionBackground(new java.awt.Color(159, 25, 25));
        jButton1.setBackground(new java.awt.Color(159, 25, 25));

jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

jButton1.setForeground(new java.awt.Color(255, 255, 255));
        //add(jspane,BorderLayout.CENTER);
        
        //jTable1.setModel(model);
       jTable.addMouseListener(new MouseAdapter(){
           
           public void mouseClicked(MouseEvent e){
               int i = jTable.getSelectedRow();
               sl1 = model.getValueAt(i, 0).toString();
               sl2 = model.getValueAt(i, 1).toString();
               sl3 = model.getValueAt(i, 2).toString();
               sl4 = model.getValueAt(i, 3).toString();
               sl5 = model.getValueAt(i, 4).toString();
               ltf1.setText(sl1);
               ltf2.setText(sl2);
               ltf3.setText(sl3);
               ltf4.setText(sl4);
               ltf5.setText(sl5);
               
               System.out.println(sl1);
               
               
              
               
               
           }
       });
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(evt.getSource()==jButton1)
				{ 
				String text=jTextField1.getText();
					if(text.length()==0)
					{     rsorter.setRowFilter(null);  }
					rsorter.setRowFilter(RowFilter.regexFilter(text));
				}
    }                                        

                                      

private void fillData(){
    
    try
			{
			
	
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm2= conn.createStatement(); 
			rs= stm2.executeQuery("SELECT *  FROM create_account ");	
			
			while(rs.next())
			{   
                           
				array[i++][0]=rs.getObject(1);
				array[k++][1]=rs.getObject(2);
				array[l++][2]=rs.getObject(3);
				array[p++][3]=rs.getObject(4);
				array[y++][4]=rs.getObject(5);
				
				

				
				
			}      
			conn.close();	
				
			}
		catch(SQLException |ClassNotFoundException e)
		{   	JOptionPane.showMessageDialog(this,e,"Error",JOptionPane.INFORMATION_MESSAGE);
			 } 
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration  
    



    }
}