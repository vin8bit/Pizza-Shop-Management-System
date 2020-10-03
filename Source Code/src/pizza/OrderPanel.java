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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author programmer
 */
public class OrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderPanel
     */
    JTextField ltf4;
    OrderPanel.ViewPizza of; 
    String sl1,sl2,sl3,sl4="0",sl5,sl6;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    int i=0,i2=0;
    int pass1,pass2,error1,error2;
    Connection conn;
    String username = "root";
    String password ="";
   
    PreparedStatement stm;
    java.time.LocalDateTime now = java.time.LocalDateTime.now();  
	java.time.format.DateTimeFormatter format = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        	
         DateFormat time1 = new SimpleDateFormat("HH:mm:ss");
         JPanel DynamicPanel;
    public OrderPanel(String id) {
        ltf4 = new JTextField();
           of =new OrderPanel.ViewPizza();
         
        initComponents();
        ltf1.setText(id);
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
        jLabel1 = new javax.swing.JLabel();
        ltf1 = new javax.swing.JTextField();
        ltf2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ltf5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltf6 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ltf3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(159, 25, 25));

        jPanel1.setBackground(new java.awt.Color(159, 25, 25));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel1.setText("Member  ID :");

        ltf1.setEditable(false);

        ltf2.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel2.setText("Pizza ID :");

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel3.setText("Pizza Name :");

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel4.setText("Quantity :");

        jComboBox2.setBackground(new java.awt.Color(159, 25, 25));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel5.setText("Totel price :");

        ltf5.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 3, 14)); // NOI18N
        jLabel6.setText("Delivery Address :");

        jScrollPane1.setBackground(new java.awt.Color(159, 25, 25));

        ltf6.setColumns(20);
        ltf6.setRows(5);
        jScrollPane1.setViewportView(ltf6);

        jButton1.setBackground(new java.awt.Color(159, 25, 25));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(159, 25, 25));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ltf3.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltf1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltf5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ltf3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ltf2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ltf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ltf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ltf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ltf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(159, 25, 25));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(of);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            String s1 = (String) evt.getItem();
            i= Integer.parseInt(s1);
            i2= Integer.parseInt(sl4);
            int i3 = i*i2;
            String total = String.valueOf(i3);
            ltf4.setText(s1);

            ltf5.setText(total);

        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        s1 = ltf1.getText();
        s2 = ltf2.getText();
        s3 = ltf3.getText();
        s4 = ltf4.getText();
        s5 = ltf5.getText();
        s6 = ltf6.getText();
        String is = now.format(format);
        s7=is;

        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields is empty","Error",JOptionPane.ERROR_MESSAGE);

        }else{
            s1 = s1.trim();
            s2 = s2.trim();
            s3 = s3.trim();
            s4 = s4.trim();
            s5 = s5.trim();
            s6 = s6.trim();
            Calendar cal = Calendar.getInstance();
            s8=time1.format(cal.getTime());

            if(s4.equals("0")){JOptionPane.showMessageDialog(this,"Invalid quantity","Error",JOptionPane.ERROR_MESSAGE); }
            else {
                try        {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avskpizza?useSSL = true",username,password);
                    stm =  conn.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?)");
                    stm.setString(1,s1);
                    stm.setString(2,s2);
                    stm.setString(3,s3);
                    stm.setString(4,s4);
                    stm.setString(5,s5);
                    stm.setString(6,s6);
                    stm.setString(7,s7);
                    stm.setString(8,s8);
                    stm.executeUpdate();

                    JOptionPane.showMessageDialog(this,"Order Successful","Success",JOptionPane.INFORMATION_MESSAGE);
                    //ltf1.setText("");
                    ltf2.setText("");
                    ltf3.setText("");
                    ltf4.setText("");
                    ltf5.setText("");
                    ltf6.setText("");
                    jComboBox2.setSelectedIndex(0);
                    OrderReceipt or = new OrderReceipt(s1,s2,s3,s4,s5,s6,s7,s8);
                    or.setVisible(true);
                    conn.close();

                }
                catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(this,e,"Error",JOptionPane.ERROR_MESSAGE); }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //ltf1.setText("");
        ltf2.setText("");
        ltf3.setText("");
        ltf4.setText("");
        ltf5.setText("");
        ltf6.setText("");
        jComboBox2.setSelectedIndex(0);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ltf1;
    private javax.swing.JTextField ltf2;
    private javax.swing.JTextField ltf3;
    private javax.swing.JTextField ltf5;
    private javax.swing.JTextArea ltf6;
    // End of variables declaration//GEN-END:variables
//////////inner class////////////
    public  class ViewPizza extends javax.swing.JPanel {

    /**
     * Creates new form ViewPizza
     */
     TableModel tmodel;
    JTable jTable;
    TableRowSorter<TableModel> rsorter;
    int i=0,k=0,l=0,p=0,y=0,j=0,y2=0,j2=0;
    Connection conn;
    Statement stm;
    ResultSet rs;
    String username="root";
    String password="";
    Count1 count=new Count1();
    int g=0+count.call();
    Object array[][] = new Object[g][6];
    String columns[]={"Pizza ID","Pizza Name","Image","Price","Categorie","Description"};
    Object[] row;
    DefaultTableModel model;
    JScrollPane jScrollPane;
    
    EditPizza editPizza;
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
       
                
			
        initComponents();
        this.add(jScrollPane,BorderLayout.CENTER);
        jTable.setSelectionBackground(new java.awt.Color(159, 25, 25));
        jPanel1.setBackground(new java.awt.Color(159, 25, 25));
        jButton1.setBackground(new java.awt.Color(159, 25, 25));

jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

jButton1.setForeground(new java.awt.Color(255, 255, 255));
        //add(jspane,BorderLayout.CENTER);
        
        //jTable1.setModel(model);
       jTable.addMouseListener(new MouseAdapter(){
           
           public void mouseClicked(MouseEvent e){
               jComboBox2.setSelectedItem("0");
               int i = jTable.getSelectedRow();
               sl1 = model.getValueAt(i, 0).toString();
               sl2 = model.getValueAt(i, 1).toString();
               sl3 = model.getValueAt(i, 2).toString();
               sl4 = model.getValueAt(i, 3).toString();
               sl5 = model.getValueAt(i, 4).toString();
               sl6 = model.getValueAt(i, 5).toString();
               ltf2.setText(sl1);
               ltf3.setText(sl2);
                ltf5.setText("");
               
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
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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



}