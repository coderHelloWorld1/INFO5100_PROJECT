/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.AssignOrdersData;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EmployeeLoadTable;

/**
 *
 * @author Purvam Sheth
 */
public class ExportData_View extends javax.swing.JPanel {

    /**
     * Creates new form ExportData_View
     */
    ArrayList<EmployeeLoadTable> ets;    
    public ExportData_View() {
        initComponents();
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExportEmployeeLoadButton = new javax.swing.JPanel();
        ExportEmployeeLoadButton_Label = new javax.swing.JLabel();
        employeeLoadTableScrollPane = new javax.swing.JScrollPane();
        employeeLoadTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(943, 600));
        setMinimumSize(new java.awt.Dimension(943, 600));

        ExportEmployeeLoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportEmployeeLoadButtonMouseClicked(evt);
            }
        });

        ExportEmployeeLoadButton_Label.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ExportEmployeeLoadButton_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExportEmployeeLoadButton_Label.setText("Export Employees Data");

        javax.swing.GroupLayout ExportEmployeeLoadButtonLayout = new javax.swing.GroupLayout(ExportEmployeeLoadButton);
        ExportEmployeeLoadButton.setLayout(ExportEmployeeLoadButtonLayout);
        ExportEmployeeLoadButtonLayout.setHorizontalGroup(
            ExportEmployeeLoadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExportEmployeeLoadButton_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        ExportEmployeeLoadButtonLayout.setVerticalGroup(
            ExportEmployeeLoadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportEmployeeLoadButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportEmployeeLoadButton_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        employeeLoadTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        employeeLoadTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"56473", "PAWAN", "12", "26"},
                {"57683", "KUMAR", "32", "8"},
                {"892043", "SHEKAVAT", "11", "21"}
            },
            new String [] {
                "EID", "Employee Name", "Completed Orders", "Working on"
            }
        ));
        employeeLoadTableScrollPane.setViewportView(employeeLoadTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeLoadTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportEmployeeLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(ExportEmployeeLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeLoadTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExportEmployeeLoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportEmployeeLoadButtonMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Employee Load Details");
        MessageFormat footer = new MessageFormat("Created by P.S");
        try{
            PrintRequestAttributeSet set= new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            employeeLoadTable.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(this, "Printed Successfully");   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "\n Failed \n" + e);
        }        
    }//GEN-LAST:event_ExportEmployeeLoadButtonMouseClicked

    private void populateFields(){
        try{
            this.ets = AssignOrdersData.getAllUsers();
            DefaultTableModel table = (DefaultTableModel) employeeLoadTable.getModel();
            table.setRowCount(0);
            for(EmployeeLoadTable u: ets){
                Object[] row = new Object[5];
                row[0] = u.getEID();
                row[1] = u.getEmployeeName();
                row[2] = u.getCompletedOrder_thisMonth();
                row[3] = u.getProcessingOrder_thisMonth();
                table.addRow(row);
            }
            // TotalEmployeeCountLabel.setText("Total Pending Requests : " +OrderCancellationRequestData.totalCancellationRequestTally()); 
        }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Exception occoured!", "Cannot update user", HEIGHT);
        }    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExportEmployeeLoadButton;
    private javax.swing.JLabel ExportEmployeeLoadButton_Label;
    private javax.swing.JTable employeeLoadTable;
    private javax.swing.JScrollPane employeeLoadTableScrollPane;
    // End of variables declaration//GEN-END:variables
}