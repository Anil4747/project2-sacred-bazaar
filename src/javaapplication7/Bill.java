/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Bill extends javax.swing.JFrame {
    DefaultTableModel model;
    javaapplication7.trans_info ob1=new javaapplication7.trans_info();
    javaapplication7.trans_info  ob2=new javaapplication7.trans_info();
    javaapplication7.prod_info  ob3=new javaapplication7.prod_info();
    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
        LoadAll();
    }

    
    void LoadAll(){
    int cnt=0;
     model = (DefaultTableModel)MyTable.getModel();
        while(model.getRowCount()>0)
          model.removeRow(0);
        
        String query="31select * from trans_info where customer_name='"+Loginclass.CurrentUser+"' and status='0';";
       
        try 
        {
            Login.out.writeUTF(query);
            cnt=Integer.parseInt(Login.inn.readUTF());
        } catch (IOException ex) 
        {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
            System.out.println("towards for loop\n");
            for(int i=1;i<=cnt;i++)
            {
                
                try 
                {
                    ob1=(javaapplication7.trans_info)Login.input.readObject();
          
                }
                catch (IOException ex1) 
                {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex1);
                } 
                catch (ClassNotFoundException ex1) 
                {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
                model.addRow(new String []{ob1.trans_id,ob1.type,ob1.product_name,ob1.description,ob1.quantity,ob1.total_cost});
            
            }
            
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ProId = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        MyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Type", "Product Name", "Description", "Quantity", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MyTable);

        jLabel2.setText("jLabel2");

        ProId.setText("jTextField1");

        Qty.setText("jTextField2");

        jButton1.setText("Cancel Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Product-Id");

        jLabel4.setText("Quantity");

        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Toatl Cost");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(ProId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(60, 60, 60)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String  arr[][]=new String[100][2];
     int lp=0;
        Loginclass lg=new Loginclass();
int right=0;

String cmd="31Select * from trans_info where customer_name='"+Loginclass.CurrentUser+"' and status ='0';";

       int ans=0;
       try {
           Login.out.writeUTF(cmd);
     ans=Integer.parseInt(Login.inn.readUTF());
     if(ans==0)
     {
       JOptionPane.showMessageDialog(null,"No Product purchased Yet.");
       
     }
     else
     {int kl=ans;
        while(kl>0){
            ob2=(javaapplication7.trans_info)Login.input.readObject();
        kl--;
        arr[lp][0]=ob2.product_name;
        System.out.println(arr[lp][0]+"");
        arr[lp][1]=ob2.quantity;
        
        lp++;
                }
            int ld=0;
     while(ans>0){
      ans--;
         String cmd2="11select * from prod_info where prod_Name='"+arr[ld][0]+"';";
     int nm=Integer.parseInt(Login.inn.readUTF());
     ob3=(javaapplication7.prod_info)Login.input.readObject();
     
     String cmd1="10Update prod_info set qty_left='"+(Integer.parseInt(ob3.qty_left)-Integer.parseInt(arr[ld][1]))+"';";
     
     int Ans=0;

        try { 
            Ans=lg.Reply(cmd1,1,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Ans!=0)
        {
          
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Please try after some time.");
        }
        String cmd3="30Update trans_info set status='1';";
     
     int Ansq=0;

        try { 
            Ansq=lg.Reply(cmd1,1,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Ansq!=0)
        {
          JOptionPane.showMessageDialog(null,"Payment Confirmed.");
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Please try after some time.");
        }
        
     ld++;
     }
     
     }
           
           
       
           
// TODO add your handling code here:
       } catch (IOException ex) {
           Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
       }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MyTable;
    private javax.swing.JTextField ProId;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}