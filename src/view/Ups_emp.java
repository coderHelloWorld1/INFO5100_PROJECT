/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import utils.db_connector;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Order_upsemp;

/**
 *
 * @author admin
 */
public class Ups_emp extends javax.swing.JFrame {

    /**
     * Creates new form Ups_emp_2
     */
     private Ups_emp() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Ups_emp(JFrame loginframe) {
        
        initComponents();
        populateTable();
        loginframe.dispose();
        this.setTitle("UPS Managment Systems");
        OrderCancellationRequestPanel orp = new OrderCancellationRequestPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private Order_upsemp selectedorder;
    private ArrayList<Order_upsemp> orders;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upsempJPanel = new javax.swing.JPanel();
        orderstatusLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        orderstatusButton = new javax.swing.JButton();
        orderstatusTextField = new javax.swing.JTextField();
        changestatusLabel = new javax.swing.JLabel();
        orderstatusComboBox = new javax.swing.JComboBox<>();
        orderstatusUpdateButton = new javax.swing.JButton();
        notesTextfield = new javax.swing.JTextField();
        changestatusLabel1 = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upsempJPanel.setBackground(new java.awt.Color(0, 76, 109));

        orderstatusLabel.setBackground(new java.awt.Color(204, 204, 255));
        orderstatusLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        orderstatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderstatusLabel.setText("Delivery Agent Portal");

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OrderID", "CreatorID", "ProductName", "Address", "PlacedDate", "AgentID", "OrderStatus", "Notes"
            }
        ));
        jScrollPane1.setViewportView(OrderTable);

        orderstatusButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        orderstatusButton.setText("Order Status");
        orderstatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderstatusButtonActionPerformed(evt);
            }
        });

        orderstatusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderstatusTextFieldActionPerformed(evt);
            }
        });

        changestatusLabel.setBackground(new java.awt.Color(255, 255, 255));
        changestatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        changestatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        changestatusLabel.setText("Change Status");

        orderstatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In process", "Out for Delivery", "Delivered", "Failed" }));
        orderstatusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderstatusComboBoxActionPerformed(evt);
            }
        });

        orderstatusUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        orderstatusUpdateButton.setText("Update");
        orderstatusUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderstatusUpdateButtonActionPerformed(evt);
            }
        });

        notesTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesTextfieldActionPerformed(evt);
            }
        });

        changestatusLabel1.setBackground(new java.awt.Color(255, 255, 255));
        changestatusLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        changestatusLabel1.setForeground(new java.awt.Color(255, 255, 255));

        commentLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        commentLabel.setForeground(new java.awt.Color(255, 255, 255));
        commentLabel.setText("Comments");

        javax.swing.GroupLayout upsempJPanelLayout = new javax.swing.GroupLayout(upsempJPanel);
        upsempJPanel.setLayout(upsempJPanelLayout);
        upsempJPanelLayout.setHorizontalGroup(
            upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(upsempJPanelLayout.createSequentialGroup()
                .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upsempJPanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(orderstatusLabel))
                    .addGroup(upsempJPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderstatusButton)
                            .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(commentLabel)
                                .addComponent(changestatusLabel))
                            .addComponent(changestatusLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderstatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderstatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notesTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(orderstatusUpdateButton)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        upsempJPanelLayout.setVerticalGroup(
            upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upsempJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderstatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderstatusButton)
                    .addComponent(orderstatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changestatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderstatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(notesTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(orderstatusUpdateButton))
                    .addGroup(upsempJPanelLayout.createSequentialGroup()
                        .addGroup(upsempJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(commentLabel)
                            .addComponent(changestatusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upsempJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upsempJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderstatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderstatusButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = OrderTable.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an order to edit", "Cannot edit Order", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        //        int column = orderTable.getSelectedColumn();
        //        int row = orderTable.getSelectedRow();
        //        String status = orderTable.getModel().getValueAt(row, column).toString();
        //        orderstatusTextField.setText(status);
        selectedorder = orders.get(selectedIndex);
        orderstatusTextField.setText(selectedorder.getOrderstatus());

    }//GEN-LAST:event_orderstatusButtonActionPerformed

    private void orderstatusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderstatusTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderstatusTextFieldActionPerformed

    private void orderstatusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderstatusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderstatusComboBoxActionPerformed

    private void orderstatusUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderstatusUpdateButtonActionPerformed
        // TODO add your handling code here:
        Order_upsemp neworder = new Order_upsemp();
        int selectedIndex = OrderTable.getSelectedRow();
        selectedorder = orders.get(selectedIndex);
        
        //       neworder.setOrderstatus(orderstatusComboBox.getSelectedItem().toString());
        //        newUser.setAge(ageField.getText());

        try {
            if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an order to edit", "Cannot edit Order", JOptionPane.PLAIN_MESSAGE);
            return;
        }

            neworder.setOrderstatus(orderstatusComboBox.getSelectedItem().toString());
            neworder.setNotes(notesTextfield.getText());

            //insert into db
            Order_upsemp.editorder_upsemp(selectedorder, neworder);
            JOptionPane.showMessageDialog(null, "Order Edited Successfully", "Successful Edit", JOptionPane.PLAIN_MESSAGE);
            clearFields();
            populateTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_orderstatusUpdateButtonActionPerformed

    private void notesTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notesTextfieldActionPerformed

     public void populateTable() {
        try {
            this.orders = Order_upsemp.getAllorders_upsemp();
            DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
            model.setRowCount(0);
            for (Order_upsemp o : orders) {
                Object[] row = new Object[8];
                row[0] = o.getOrderid();
//                row[0] = u;
                row[1] = o.getCreatorid();
                row[2] = o.getProductname();
                row[3] = o.getAddress();
                row[4] = o.getPlacedate();
                row[5] = o.getAgentid();
                row[6] = o.getOrderstatus();
                row[7] = o.getNotes();
                model.addRow(row);
            }
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {
        orderstatusTextField.setText("");
        selectedorder = null;
    }
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
            java.util.logging.Logger.getLogger(Ups_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ups_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ups_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ups_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ups_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderTable;
    private javax.swing.JLabel changestatusLabel;
    private javax.swing.JLabel changestatusLabel1;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField notesTextfield;
    private javax.swing.JButton orderstatusButton;
    private javax.swing.JComboBox<String> orderstatusComboBox;
    private javax.swing.JLabel orderstatusLabel;
    private javax.swing.JTextField orderstatusTextField;
    private javax.swing.JButton orderstatusUpdateButton;
    private javax.swing.JPanel upsempJPanel;
    // End of variables declaration//GEN-END:variables
}
