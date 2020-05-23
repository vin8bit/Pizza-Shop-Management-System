/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
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
import static pizza.ViewPizza.model;

/**
 *
 * @author programmer
 */



////innerclass///
public class EditPizza extends javax.swing.JPanel {
    
    
     TableModel tmodel;
    JTable jTable;
    TableRowSorter<TableModel> rsorter;
    int i=0,k=0,l=0,p=0,y=0,j=0,y2=0,j2=0;
    Connection conn;
    Statement stm;
    PreparedStatement stm2;
    ResultSet rs;
    String username="root";
    String password="";
    Count1 count=new Count1();
    int g=0+count.call();
    Object array[][] = new Object[g][6];
    String columns[]={"Pizza ID","Pizza Name","Image","Price","Categorie","Description"};
    static Object[] row;
    static DefaultTableModel model;
    JScrollPane jScrollPane;
    String sl1,sl2,sl3,sl4,sl5,sl6;
    EditPizza editPizza;
    int pass2,error2;
    
    public static void setRow(String s1,String s2,String s3,String s4,String s5,String s6){
            JLabel label = new JLabel();
					label.setIcon(new ImageIcon((s3)));
            row = new Object[6];
            row[0]=(Object)s1;
            row[1]=(Object)s2;
            row[2]=(Object)label;
            row[3]=(Object)s4;
            row[4]=(Object)s5;
            row[5]=(Object)s6;
            model.addRow(row);
          
            
            
    }
    public  class ViewPizza extends javax.swing.JPanel {

   
   
    public void gg(EditPizza ed){
              editPizza = ed;
    }
    public ViewPizza() {
        
        this.fillData();
       jTable = new javax.swing.JTable();

        
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable);
        model = new DefaultTableModel(array,columns) {
            boolean[] canEdit = new boolean [] {true, true, false, true, true, false};

            @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];}};
        jTable.setModel(model);
        jTable.getColumn("Image").setCellRenderer(new LabelRenderer());
         rsorter = new TableRowSorter<TableModel>(model);
		
		jTable.setRowSorter(rsorter);
        /*model= new DefaultTableModel(array,columns);
			jTable=new JTable(model);
			jTable.getColumn("Image").setCellRenderer(new LabelRenderer());
			jTable.setCellSelectionEnabled(true);
			jTable.setColumnSelectionAllowed(true);
			//rsorter = new TableRowSorter<TableModel>(tmodel);
			JScrollPane jspane=new JScrollPane(jTable);
			jTable.setRowSorter(rsorter);*/
			
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
               int pss = 0;
               
                sl1 = model.getValueAt(i, 0).toString();
               try
			{
			
	
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT *  FROM add_pizza where pizza_id = "+sl1+" ");	
			
                        while(rs.next())
			{  
                            sl3=(String)rs.getObject(3);   pss = 1; 
                          //ltf3.setText(rs.getObject(3).toString());
                        }      
			conn.close();	
			}
		catch(SQLException |ClassNotFoundException ek){   } 
               if(pss==1){
                  
               sl2 = model.getValueAt(i, 1).toString();
               sl4 = model.getValueAt(i, 3).toString();
               sl5 = model.getValueAt(i, 4).toString();
               sl6 = model.getValueAt(i, 5).toString();
               ltf1.setText(sl1);
               ltf2.setText(sl2);
               ltf3.setText(sl3);
               ltf4.setText(sl4);
               ltf5.setText(sl5);
               choice.setSelectedItem(sl5);
               ltf6.setText(sl6);
               System.out.println(sl1);
               }
               
              
               
               
           }
       });
       jButton1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent eg){
        // TODO add your handling code here:
        if(eg.getSource()==jButton1)
				{ 
				String text=jTextField1.getText();
					if(text.length()==0)
					{     rsorter.setRowFilter(null);  }
					rsorter.setRowFilter(RowFilter.regexFilter(text));
				}
           }});       
       
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
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("Search");

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Veg Pizza", "Non-Veg Pizza"}));
       jComboBox1.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jComboBox1ItemStateChanged(evt);
    }
});
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>                        
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
						String search = (String) evt.getItem();
                                                if(search.equals("All")){
                                                }
                                                else{ rsorter.setRowFilter(RowFilter.regexFilter(search));}
					}
    }             
private void fillData(){
    
    try
			{
			
	
			Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
			stm= conn.createStatement(); 
			rs= stm.executeQuery("SELECT *  FROM add_pizza ");	
			
			while(rs.next())
			{   
                            JLabel label = new JLabel();
					label.setIcon(new ImageIcon((String)rs.getObject(3)));
				array[i++][0]=rs.getObject(1);
				array[k++][1]=rs.getObject(2);
				array[l++][2]=label;
				array[p++][3]=rs.getObject(4);
				array[y++][4]=rs.getObject(5);
				array[j++][5]=rs.getObject(6);
				

				
				
			}      
			conn.close();	
				
			}
		catch(SQLException |ClassNotFoundException e)
		{   	JOptionPane.showMessageDialog(this,e,"Error",JOptionPane.INFORMATION_MESSAGE);
			 } 
    }

    class LabelRenderer implements TableCellRenderer{
                @Override
		public Component getTableCellRendererComponent(JTable jtable,Object value,boolean isSelected,boolean hasFocus,int row,int column){
			TableColumn tc = jtable.getColumn("Image");
			tc.setMinWidth(100);
			tc.setMaxWidth(100);
			jtable.setRowHeight(100);
			return (JComponent) value;
		}

	}
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}

    
    /////////**************************/////////////////////////

    /**
     * Creates new form EditPizza
     */
    String s1,s2,s3,s4,s5,s6;
    javax.swing.JTextField ltf5 = new javax.swing.JTextField();
    //String sl1,sl2,sl3,sl4,sl5,sl6;
    EditPizza.ViewPizza ev;
    public EditPizza() {
        ev = new EditPizza.ViewPizza();
        initComponents();
        
        
    }
    public  void setSelectValue1(String sl1,String sl2,String sl3,String sl4,String sl5,String sl6){
        ltf1.setText(sl1);
        ltf1.setText(sl2);
        ltf1.setText(sl3);
        ltf1.setText(sl4);
        ltf1.setText(sl5);
        ltf1.setText(sl6);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ltf3 = new javax.swing.JTextField();
        choice = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltf6 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        reset1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ltf1 = new javax.swing.JTextField();
        ltf2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ltf4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(159, 25, 25));

        jTablePanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(159, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(159, 25, 25));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Get Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 28));

        ltf3.setEditable(false);
        ltf3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ltf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 151, 28));

        choice.setBackground(new java.awt.Color(159, 25, 25));
        choice.setForeground(new java.awt.Color(255, 255, 255));
        choice.addItem("");
        choice.addItem("Veg Pizza");
        choice.addItem("Non-Veg Pizza");
        choice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceItemStateChanged(evt);
            }
        });
        jPanel1.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 169, 22));

        ltf6.setColumns(20);
        ltf6.setRows(5);
        jScrollPane1.setViewportView(ltf6);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 209, -1));

        jButton2.setBackground(new java.awt.Color(159, 25, 25));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 80, 32));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edit Pizza");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 9, 190, 40));

        reset1.setBackground(new java.awt.Color(159, 25, 25));
        reset1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel1.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 70, 32));

        delete.setBackground(new java.awt.Color(159, 25, 25));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, 32));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel1.setText("Pizza ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 78, 22));

        ltf1.setEditable(false);
        ltf1.setBackground(new java.awt.Color(255, 255, 255));
        ltf1.setToolTipText("");
        jPanel1.add(ltf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 151, 27));
        jPanel1.add(ltf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 151, 28));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel2.setText("Pizza Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 121, 22));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel3.setText("Image :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 87, 22));
        jPanel1.add(ltf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 151, 27));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel4.setText("Price :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 77, 22));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel5.setText("Categorie :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 107, 22));

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel6.setText("Description :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 107, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addComponent(jTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePanel.add(ev,BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        File file= chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION){
            ltf3.setText(file.getPath());

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        s1 = ltf1.getText();
        s2 = ltf2.getText();
        s3 = ltf3.getText();
        s4 = ltf4.getText();
        s5 = ltf5.getText();
        s6 = ltf6.getText();
        pass2=0;
        error2=0;
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields is empty","Error",JOptionPane.ERROR_MESSAGE);

        }else{         
                   s1.trim();
                   s2.trim();
                   s3.trim();
                   s4.trim();
                   s5.trim();
                   s6.trim();
                        for(int y=0;y<s4.length(); ++y)
					{
						if(!Character.isDigit(s4.charAt(y)))
							{  pass2=4;   error2=1; }
					
					}
                          if(pass2==0){
                        try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
      							String query = "delete from add_pizza where pizza_id = ?";
      							PreparedStatement preparedStmt = con2.prepareStatement(query);
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
                                                        
      							con2.close();
				   		} catch(ClassNotFoundException | HeadlessException | SQLException r){JOptionPane.showMessageDialog(this,r,"Success",JOptionPane.INFORMATION_MESSAGE);}
                        try{
                                                        Class.forName("com.mysql.cj.jdbc.Driver");
							conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
							stm2 =  conn.prepareStatement("insert into add_pizza values(?,?,?,?,?,?)");
			                		stm2.setString(1,s1);
							stm2.setString(2,s2);
							stm2.setString(3,s3);	
							stm2.setString(4,s4);
							stm2.setString(5,s5);
							stm2.setString(6,s6);
							stm2.executeUpdate();
                                                        
                                                        
							JOptionPane.showMessageDialog(this,"Update Successful","Success",JOptionPane.INFORMATION_MESSAGE);
							ltf1.setText("");	
				 			ltf2.setText("");
							ltf3.setText("");
							ltf4.setText("");
							ltf5.setText("");
							ltf6.setText("");
                                                        choice.setSelectedIndex(0);
							conn.close();

							}
						catch(ClassNotFoundException | HeadlessException | SQLException e){ JOptionPane.showMessageDialog(this,e,"Error",JOptionPane.ERROR_MESSAGE);}
            int i2 = jTable.getSelectedRow();
            model.removeRow(i2);
                 JLabel label = new JLabel();
					label.setIcon(new ImageIcon((s3)));
            row = new Object[6];
            row[0]=(Object)s1;
            row[1]=(Object)s2;
            row[2]=(Object)label;
            row[3]=(Object)s4;
            row[4]=(Object)s5;
            row[5]=(Object)s6;
            model.addRow(row);
                          }else{ if(error2==1){ JOptionPane.showMessageDialog(this,"Invalid price !","Error",JOptionPane.ERROR_MESSAGE);}}
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        ltf1.setText("");
        ltf2.setText("");
        ltf3.setText("");
        ltf4.setText("");
        ltf5.setText("");
        ltf6.setText("");
        choice.setSelectedIndex(0);
    }//GEN-LAST:event_reset1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         s1 = ltf1.getText();
        s2 = ltf2.getText();
        s3 = ltf3.getText();
        s4 = ltf4.getText();
        s5 = ltf5.getText();
        s6 = ltf6.getText();
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields is empty","Error",JOptionPane.ERROR_MESSAGE);
            
        }else{    
                    
        
                try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
      							String query = "delete from add_pizza where pizza_id = ?";
      							PreparedStatement preparedStmt = con2.prepareStatement(query);
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
                                                        JOptionPane.showMessageDialog(this,"Delete successful","Success",JOptionPane.INFORMATION_MESSAGE);
                                                        ltf1.setText("");	
				 			ltf2.setText("");
							ltf3.setText("");
							ltf4.setText("");
							ltf5.setText("");
							ltf6.setText("");
                                                        choice.setSelectedIndex(0);
                                                        int i2 = jTable.getSelectedRow();
                                                         model.removeRow(i2);
      							con2.close();
				   		} catch(ClassNotFoundException | HeadlessException | SQLException r){JOptionPane.showMessageDialog(this,r,"Error",JOptionPane.ERROR_MESSAGE);}
            
            }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void choiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
						ltf5.setText((String) evt.getItem());
					}
    }//GEN-LAST:event_choiceItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTablePanel;
    private javax.swing.JTextField ltf1;
    private javax.swing.JTextField ltf2;
    private javax.swing.JTextField ltf3;
    private javax.swing.JTextField ltf4;
    private javax.swing.JTextArea ltf6;
    private javax.swing.JButton reset1;
    // End of variables declaration//GEN-END:variables
}
