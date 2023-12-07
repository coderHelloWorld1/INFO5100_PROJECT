/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.text.MessageFormat;
import java.util.ArrayList;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.CustomerOrders;
import model.EmpTable;
import model.RequestsData;
import controller.CustomerManagerDBC;
import java.io.FileOutputStream;
import javax.swing.JFrame;
//import javax.swing.text.Document;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print. PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io. FileOutputStream;

/**
 *
 * @author varun
 */
public class CustomerManagerPanel extends javax.swing.JPanel {

    private ArrayList<CustomerOrders> orderlist; 
    private ArrayList <RequestsData> requestlist;
    private CustomerOrders selectedOrderDetails;
    private JPanel bottomPanel;
    private CustomerOrders orderUpdate;
    private CustomerOrders newCustomerOrders;
    private RequestsData selectedRequest;
    private RequestsData reqtype;
    private RequestsData reqData;
    String oldAddress="";
    int orderIdForUpdate=0;
    String addressForUpdate="";
    int orderid=0;
    JFrame loginframe;
    int loggedInID=-1;
    /**
     * Creates new form CustomerOrders
   **/
  
    public CustomerManagerPanel(JPanel bottomPanel, int loggedInID, JFrame loginframe) {
        initComponents();
       
        this.bottomPanel=bottomPanel;
        this.loggedInID = loggedInID;
        this.loginframe = loginframe;
         populateTable();
        populateRequestTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTableButton = new javax.swing.JButton();
        orderTableButton = new javax.swing.JButton();
        Approve = new javax.swing.JButton();
        requestCancellation = new javax.swing.JButton();
        orderTable = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        requestTable = new javax.swing.JScrollPane();
        requests_table = new javax.swing.JTable();
        rejectbutton = new javax.swing.JButton();
        ExportData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        requestTableButton.setBackground(new java.awt.Color(0, 76, 109));
        requestTableButton.setForeground(new java.awt.Color(0, 79, 106));
        requestTableButton.setText("Switch to Order Table");
        requestTableButton.setBorder(null);
        requestTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderTableActionPerformed(evt);
            }
        });

        orderTableButton.setBackground(new java.awt.Color(0, 76, 109));
        orderTableButton.setForeground(new java.awt.Color(0, 76, 109));
        orderTableButton.setText("Switch to Requests Table");
        orderTableButton.setBorder(null);
        orderTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTableButtonActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(0, 76, 109));
        setForeground(new java.awt.Color(255, 255, 255));

        Approve.setText("approve");
        Approve.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveActionPerformed(evt);
            }
        });

        requestCancellation.setText("Request Cancellation");
        requestCancellation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestCancellationActionPerformed(evt);
            }
        });

        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Created By ID", "Product Name", "Address", "Order Placed On", "Delievery Agent ID", "Order Status", "Notes"
            }
        ));
        orderTable.setViewportView(order_table);

        requestTable.setBackground(new java.awt.Color(228, 226, 226));

        requests_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestType", "Order_ID", "Requested_By_id", "RequestStatus", "NewAddress", "Comments", "requester_company", "date"
            }
        ));
        requestTable.setViewportView(requests_table);

        rejectbutton.setText("Reject");
        rejectbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rejectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectbuttonActionPerformed(evt);
            }
        });

        ExportData.setText("Export Order Data");
        ExportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportDataActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Orders Table");

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Requests Table");

        logOutButton.setBackground(new java.awt.Color(153, 0, 0));
        logOutButton.setForeground(new java.awt.Color(242, 242, 242));
        logOutButton.setText("Logout");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Manager View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(786, 786, 786)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestTable, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rejectbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(requestCancellation, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExportData, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel3)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(requestTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(orderTable, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rejectbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(requestCancellation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ExportData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestCancellationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestCancellationActionPerformed
        // TODO add your handling code here:
        int selectedIndex = order_table.getSelectedRow();
        if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,"Please select a request to update", "Cannot update request", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        selectedOrderDetails=orderlist.get(selectedIndex);
        orderid=selectedOrderDetails.getOrderId();
        orderUpdate=new CustomerOrders();
        reqtype=new RequestsData();
        reqtype.setRequestType("Cancel Request");
        reqtype.setRequestStatus("Pending");
        reqtype.setComments("");
        
        System.out.println(orderid);
        /*selectedOrderDetails = orderlist.get(selectedIndex);
        //addressForUpdate=selectedRequest.getNewAddress();
        orderid=selectedOrderDetails.getOrderId();
        reqtype=new RequestsData();
        reqtype.setRequestType("Cancel Request");
        System.out.println(reqtype.getRequestType());
        reqtype.setOrderId(orderid);
        System.out.println(orderid);*/
        CustomerManagerDBC.updateRequestType(selectedOrderDetails, reqtype);
        populateRequestTable();
    }//GEN-LAST:event_requestCancellationActionPerformed

    private void ApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveActionPerformed
       // TODO add your handling code here:
       int selectedIndex = requests_table.getSelectedRow();
        if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,"Please select a request to update", "Cannot update request", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        selectedRequest = requestlist.get(selectedIndex);
        addressForUpdate=selectedRequest.getNewAddress();
        orderIdForUpdate=selectedRequest.getOrderId();
        selectedRequest.setRequestStatus("Approved");
        //oldaddress=selectedRequest.;
        System.out.println(addressForUpdate);
        System.out.println(orderIdForUpdate);
        // System.out.println(oldaddress);
        //System.out.println(addressForUpdate);
        
        orderUpdate=new CustomerOrders();
        selectedRequest.setRequestStatus("Approved");
        //orderUpdate.setOldAddress(oldaddress);
       // orderUpdate.setAddress(oldaddress);
         
         //orderUpdate.setOrderId(orderid);
         //orderIdForUpdate=reqData.getOrderId();
         orderUpdate.setAddress(addressForUpdate);
         orderUpdate.setOrderId(orderIdForUpdate);
         CustomerManagerDBC.updateAddress(orderUpdate);
         //CustomerManagerDBC.updateRequest(selectedRequest);
         CustomerManagerDBC.updateRequestStatus(selectedRequest);
        populateTable();
        populateRequestTable();
        //orderid
        //CustomerMaupdateAddress(orderUpdate);
        //database -> request table status update -> order table address change where orderid ==
        
    }//GEN-LAST:event_ApproveActionPerformed

    private void requestTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTableButtonActionPerformed
                populateRequestTable();        // TODO add your handling code here:
    }//GEN-LAST:event_requestTableButtonActionPerformed

    private void OrderTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderTableActionPerformed
        // TODO add your handling code here:
        populateTable();
         int selectedIndex = order_table.getSelectedRow();
        if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,"Please select an order to update", "Cannot update order", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        selectedOrderDetails = orderlist.get(selectedIndex);
        
    }//GEN-LAST:event_OrderTableActionPerformed

    private void rejectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectbuttonActionPerformed
        // TODO add your handling code here:
          int selectedIndex = requests_table.getSelectedRow();
        if(selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,"Please select a patient to delete", "Cannot delete patient", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            selectedRequest = requestlist.get(selectedIndex);
            CustomerManagerDBC.deleteRequest(selectedRequest);
            JOptionPane.showMessageDialog(null,"User Deleted Successfully", "Successfully Deleted",JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }    
    }//GEN-LAST:event_rejectbuttonActionPerformed

    private void ExportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportDataActionPerformed
        // TODO add your handling code here:
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("./orders-export.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            PdfTemplate template = contentByte.createTemplate(950, 500);
            Graphics2D g2 = template.createGraphics(500, 500);
            this.print(g2);
            g2.dispose();
            contentByte.addTemplate(template, 30, 300);
            JOptionPane.showMessageDialog(null,"PDF generated successfully","Successfully Generated", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }       
    populateTable();                                                 

    }//GEN-LAST:event_ExportDataActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        LoginPanel lp = new LoginPanel(bottomPanel, loginframe);
         bottomPanel.add(lp);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);
    }//GEN-LAST:event_logOutButtonActionPerformed

 public void populateTable() {
        try {
            this.orderlist = CustomerManagerDBC.getAllOrders();
            DefaultTableModel model = (DefaultTableModel) order_table.getModel();
            model.setRowCount(0);
            for (CustomerOrders Order :orderlist ) {
               Object[] row = new Object[9];
                row[0] =Order.getOrderId();
                row[1]=Order.getCreatorId();
                row[2]=Order.getProdName();
                row[3]=Order.getAddress();
                row[4]=Order.getDate();
                row[5]=Order.getAgentId();
                row[6]=Order.getStatus();
                row[7]=Order.getNotes();
                
                        
                model.addRow(row);
            }
            //clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
    }
 
 public void populateRequestTable(){
      try {
            this.requestlist = CustomerManagerDBC.getAllRequests();
            DefaultTableModel model = (DefaultTableModel) requests_table.getModel();
            //EmpTable eid=new EmpTable();
            model.setRowCount(0);
            for (RequestsData request :requestlist) {
               Object[] row = new Object[9];
                row[0] =request.getRequestType();
                row[1]=request.getOrderId();
                row[2]=request.getRequestedById();
                row[3]=request.getRequestStatus();
                row[4]=request.getNewAddress();
                row[5]=request.getComments();
                row[6]=request.getRequesterCompany();
                row[7]=request.getDateOfRequest();
                model.addRow(row);
            }
            //clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approve;
    private javax.swing.JButton ExportData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logOutButton;
    private javax.swing.JScrollPane orderTable;
    private javax.swing.JButton orderTableButton;
    private javax.swing.JTable order_table;
    private javax.swing.JButton rejectbutton;
    private javax.swing.JButton requestCancellation;
    private javax.swing.JScrollPane requestTable;
    private javax.swing.JButton requestTableButton;
    private javax.swing.JTable requests_table;
    // End of variables declaration//GEN-END:variables
}
