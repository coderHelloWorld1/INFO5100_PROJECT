/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
/**
 *
 * @author Purvam Sheth
 */
public class UPS_admin_MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NEU_admin_MainFrame
     */
    public UPS_admin_MainFrame() {
        initComponents();
        this.setTitle("UPS Managment Systems");
        OrderCancellationRequestPanel orp = new OrderCancellationRequestPanel();
        LoginPanel l = new LoginPanel(bottomPanel);
        bottomPanel.add(l);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        Title_Label = new javax.swing.JLabel();
        Seperator_1 = new javax.swing.JSeparator();
        orderCancellationButton_SidePanel = new javax.swing.JPanel();
        orderCancellationLabel_SidePanel = new javax.swing.JLabel();
        ManageEmployeeButton_SidePanel = new javax.swing.JPanel();
        manageEmployeeButton_SidePanel = new javax.swing.JLabel();
        OrderAssignmentButton_SidePanel = new javax.swing.JPanel();
        OrderAssignmentLabel_SidePanel = new javax.swing.JLabel();
        ExportButton_SidePanel1 = new javax.swing.JPanel();
        ExportLabel_SidePanel1 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JPanel();
        LogOutLabelSidePanel = new javax.swing.JLabel();
        viewPanel = new javax.swing.JPanel();
        viewSplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        HeadingLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        directoryLabel = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setForeground(new java.awt.Color(255, 255, 255));
        bgPanel.setMaximumSize(new java.awt.Dimension(1200, 750));
        bgPanel.setMinimumSize(new java.awt.Dimension(1200, 750));

        sidePanel.setBackground(new java.awt.Color(0, 76, 109));
        sidePanel.setMaximumSize(new java.awt.Dimension(237, 750));
        sidePanel.setMinimumSize(new java.awt.Dimension(237, 750));

        Title_Label.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Title_Label.setForeground(new java.awt.Color(255, 255, 255));
        Title_Label.setText("UPS LTD. ");

        Seperator_1.setBackground(new java.awt.Color(255, 255, 255));
        Seperator_1.setForeground(new java.awt.Color(255, 255, 255));

        orderCancellationButton_SidePanel.setBackground(new java.awt.Color(122, 166, 194));
        orderCancellationButton_SidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderCancellationButton_SidePanelMouseClicked(evt);
            }
        });

        orderCancellationLabel_SidePanel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        orderCancellationLabel_SidePanel.setForeground(new java.awt.Color(255, 255, 255));
        orderCancellationLabel_SidePanel.setText("Order Cancellation Requests");

        javax.swing.GroupLayout orderCancellationButton_SidePanelLayout = new javax.swing.GroupLayout(orderCancellationButton_SidePanel);
        orderCancellationButton_SidePanel.setLayout(orderCancellationButton_SidePanelLayout);
        orderCancellationButton_SidePanelLayout.setHorizontalGroup(
            orderCancellationButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderCancellationButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderCancellationLabel_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderCancellationButton_SidePanelLayout.setVerticalGroup(
            orderCancellationButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderCancellationButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderCancellationLabel_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        ManageEmployeeButton_SidePanel.setBackground(new java.awt.Color(52, 104, 136));
        ManageEmployeeButton_SidePanel.setPreferredSize(new java.awt.Dimension(186, 56));
        ManageEmployeeButton_SidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageEmployeeButton_SidePanelMouseClicked(evt);
            }
        });

        manageEmployeeButton_SidePanel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        manageEmployeeButton_SidePanel.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeButton_SidePanel.setText("Manage Employees ");

        javax.swing.GroupLayout ManageEmployeeButton_SidePanelLayout = new javax.swing.GroupLayout(ManageEmployeeButton_SidePanel);
        ManageEmployeeButton_SidePanel.setLayout(ManageEmployeeButton_SidePanelLayout);
        ManageEmployeeButton_SidePanelLayout.setHorizontalGroup(
            ManageEmployeeButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageEmployeeButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageEmployeeButton_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageEmployeeButton_SidePanelLayout.setVerticalGroup(
            ManageEmployeeButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageEmployeeButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageEmployeeButton_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        OrderAssignmentButton_SidePanel.setBackground(new java.awt.Color(52, 104, 136));
        OrderAssignmentButton_SidePanel.setPreferredSize(new java.awt.Dimension(186, 56));
        OrderAssignmentButton_SidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderAssignmentButton_SidePanelMouseClicked(evt);
            }
        });

        OrderAssignmentLabel_SidePanel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        OrderAssignmentLabel_SidePanel.setForeground(new java.awt.Color(255, 255, 255));
        OrderAssignmentLabel_SidePanel.setText("Order Assignments");

        javax.swing.GroupLayout OrderAssignmentButton_SidePanelLayout = new javax.swing.GroupLayout(OrderAssignmentButton_SidePanel);
        OrderAssignmentButton_SidePanel.setLayout(OrderAssignmentButton_SidePanelLayout);
        OrderAssignmentButton_SidePanelLayout.setHorizontalGroup(
            OrderAssignmentButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderAssignmentButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrderAssignmentLabel_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrderAssignmentButton_SidePanelLayout.setVerticalGroup(
            OrderAssignmentButton_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderAssignmentButton_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrderAssignmentLabel_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        ExportButton_SidePanel1.setBackground(new java.awt.Color(52, 104, 136));
        ExportButton_SidePanel1.setPreferredSize(new java.awt.Dimension(186, 56));
        ExportButton_SidePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportButton_SidePanel1MouseClicked(evt);
            }
        });

        ExportLabel_SidePanel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ExportLabel_SidePanel1.setForeground(new java.awt.Color(255, 255, 255));
        ExportLabel_SidePanel1.setText("Export");

        javax.swing.GroupLayout ExportButton_SidePanel1Layout = new javax.swing.GroupLayout(ExportButton_SidePanel1);
        ExportButton_SidePanel1.setLayout(ExportButton_SidePanel1Layout);
        ExportButton_SidePanel1Layout.setHorizontalGroup(
            ExportButton_SidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportButton_SidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportLabel_SidePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExportButton_SidePanel1Layout.setVerticalGroup(
            ExportButton_SidePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportButton_SidePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportLabel_SidePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        LogOutButton.setBackground(new java.awt.Color(52, 104, 136));
        LogOutButton.setPreferredSize(new java.awt.Dimension(186, 56));
        LogOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutButtonMouseClicked(evt);
            }
        });

        LogOutLabelSidePanel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        LogOutLabelSidePanel.setForeground(new java.awt.Color(255, 255, 255));
        LogOutLabelSidePanel.setText("Logout");

        javax.swing.GroupLayout LogOutButtonLayout = new javax.swing.GroupLayout(LogOutButton);
        LogOutButton.setLayout(LogOutButtonLayout);
        LogOutButtonLayout.setHorizontalGroup(
            LogOutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutLabelSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogOutButtonLayout.setVerticalGroup(
            LogOutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutLabelSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderCancellationButton_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManageEmployeeButton_SidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
            .addComponent(OrderAssignmentButton_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
            .addComponent(ExportButton_SidePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Title_Label))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Seperator_1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(LogOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Title_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seperator_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(orderCancellationButton_SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageEmployeeButton_SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderAssignmentButton_SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExportButton_SidePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewPanel.setBackground(new java.awt.Color(255, 255, 255));
        viewPanel.setMaximumSize(new java.awt.Dimension(951, 750));
        viewPanel.setMinimumSize(new java.awt.Dimension(951, 750));
        viewPanel.setPreferredSize(new java.awt.Dimension(951, 750));

        viewSplitPane.setDividerLocation(145);
        viewSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        viewSplitPane.setMaximumSize(new java.awt.Dimension(943, 750));
        viewSplitPane.setMinimumSize(new java.awt.Dimension(943, 750));
        viewSplitPane.setPreferredSize(new java.awt.Dimension(943, 750));

        topPanel.setBackground(new java.awt.Color(193, 231, 255));
        topPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.setMaximumSize(new java.awt.Dimension(943, 150));
        topPanel.setMinimumSize(new java.awt.Dimension(943, 150));
        topPanel.setPreferredSize(new java.awt.Dimension(943, 150));

        HeadingLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLabel.setText("UPS MANGER PORTAL");

        userLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("User: Purvam Sheth");

        directoryLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        directoryLabel.setForeground(new java.awt.Color(153, 207, 245));
        directoryLabel.setText("Order Cancellation Requests / ");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(directoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap(657, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(13, 13, 13))
        );

        viewSplitPane.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setMaximumSize(new java.awt.Dimension(943, 600));
        bottomPanel.setMinimumSize(new java.awt.Dimension(943, 600));
        bottomPanel.setPreferredSize(new java.awt.Dimension(943, 600));
        bottomPanel.setLayout(new java.awt.CardLayout());
        viewSplitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageEmployeeButton_SidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageEmployeeButton_SidePanelMouseClicked
        // TODO add your handling code here:
       directoryLabel.setText("Manage Employees /");
        ManageEmployeePanel mep = new ManageEmployeePanel();
        bottomPanel.add(mep);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);
        ManageEmployeeButton_SidePanel.setBackground(new Color(122,166,194));
        orderCancellationButton_SidePanel.setBackground(new Color(52, 104, 136));
        OrderAssignmentButton_SidePanel.setBackground(new Color(52, 104, 136));
        ExportButton_SidePanel1.setBackground(new Color(52, 104, 136));
        LogOutButton.setBackground(new Color(52, 104, 136)); 
    }//GEN-LAST:event_ManageEmployeeButton_SidePanelMouseClicked

    private void orderCancellationButton_SidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderCancellationButton_SidePanelMouseClicked
        // TODO add your handling code here:
       directoryLabel.setText("Order Cancellation Request /");
        OrderCancellationRequestPanel ocr = new OrderCancellationRequestPanel();
        bottomPanel.add(ocr);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);        
       orderCancellationButton_SidePanel.setBackground(new Color(122,166,194));
        ManageEmployeeButton_SidePanel.setBackground(new Color(52, 104, 136)); 
        OrderAssignmentButton_SidePanel.setBackground(new Color(52, 104, 136));
        ExportButton_SidePanel1.setBackground(new Color(52, 104, 136));
        LogOutButton.setBackground(new Color(52, 104, 136)); 
    }//GEN-LAST:event_orderCancellationButton_SidePanelMouseClicked

    private void OrderAssignmentButton_SidePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderAssignmentButton_SidePanelMouseClicked
        // TODO add your handling code here:
        directoryLabel.setText("Order Assignments /");
        AssignOrderPanel aop = new AssignOrderPanel();
        bottomPanel.add(aop);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);
        OrderAssignmentButton_SidePanel.setBackground(new Color(122,166,194));
        orderCancellationButton_SidePanel.setBackground(new Color(52, 104, 136));
        ManageEmployeeButton_SidePanel.setBackground(new Color(52, 104, 136));  
        ExportButton_SidePanel1.setBackground(new Color(52, 104, 136));
        LogOutButton.setBackground(new Color(52, 104, 136)); 
    }//GEN-LAST:event_OrderAssignmentButton_SidePanelMouseClicked

    private void ExportButton_SidePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportButton_SidePanel1MouseClicked
        // TODO add your handling code here:
        directoryLabel.setText("Exports /");
        ExportData_View ed = new ExportData_View();
        bottomPanel.add(ed);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);
        ExportButton_SidePanel1.setBackground(new Color(122,166,194));
        OrderAssignmentButton_SidePanel.setBackground(new Color(52, 104, 136));
        orderCancellationButton_SidePanel.setBackground(new Color(52, 104, 136));
        ManageEmployeeButton_SidePanel.setBackground(new Color(52, 104, 136)); 
        LogOutButton.setBackground(new Color(52, 104, 136)); 
    }//GEN-LAST:event_ExportButton_SidePanel1MouseClicked

    private void LogOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButtonMouseClicked
        // TODO add your handling code here:
        directoryLabel.setText("Logout /");
        LogoutPanel ed = new LogoutPanel(this);
        bottomPanel.add(ed);
        CardLayout lay = (CardLayout)bottomPanel.getLayout();
        lay.next(bottomPanel);        
        ExportButton_SidePanel1.setBackground(new Color(52, 104, 136));
        OrderAssignmentButton_SidePanel.setBackground(new Color(52, 104, 136));
        orderCancellationButton_SidePanel.setBackground(new Color(52, 104, 136));
        ManageEmployeeButton_SidePanel.setBackground(new Color(52, 104, 136)); 
        LogOutButton.setBackground(new Color(122,166,194)); 
    }//GEN-LAST:event_LogOutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(UPS_admin_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPS_admin_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPS_admin_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPS_admin_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPS_admin_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExportButton_SidePanel1;
    private javax.swing.JLabel ExportLabel_SidePanel1;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JPanel LogOutButton;
    private javax.swing.JLabel LogOutLabelSidePanel;
    private javax.swing.JPanel ManageEmployeeButton_SidePanel;
    private javax.swing.JPanel OrderAssignmentButton_SidePanel;
    private javax.swing.JLabel OrderAssignmentLabel_SidePanel;
    private javax.swing.JSeparator Seperator_1;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel directoryLabel;
    private javax.swing.JLabel manageEmployeeButton_SidePanel;
    private javax.swing.JPanel orderCancellationButton_SidePanel;
    private javax.swing.JLabel orderCancellationLabel_SidePanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JSplitPane viewSplitPane;
    // End of variables declaration//GEN-END:variables
}
