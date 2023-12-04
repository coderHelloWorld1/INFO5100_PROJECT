/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.ManageEmployeeData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmpTable;

/**
 *
 * @author Purvam Sheth
 */
public class ManageEmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeePanel
     */
    EmpTable et;
    ArrayList<EmpTable> ets;
    public ManageEmployeePanel() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        EmpData_Table = new javax.swing.JTable();
        TotalEmployeeCountLabel = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JPanel();
        addEmployeeLabel = new javax.swing.JLabel();
        addEmployeeForm = new javax.swing.JPanel();
        employeeIDLable = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        companyNameLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        employeeIDTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JPanel();
        submitButtonVariable = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        companyNameComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JPanel();
        deleteButtonLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(943, 600));
        setMinimumSize(new java.awt.Dimension(943, 600));
        setPreferredSize(new java.awt.Dimension(943, 600));

        EmpData_Table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EmpData_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"45678", "PAVAN", "12-45-56"},
                {"56789", "KUMAR", "34-43-4567"},
                {"87634", "TANUJ", null}
            },
            new String [] {
                "EID", "Employee Name", "Date Joined"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(EmpData_Table);

        TotalEmployeeCountLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TotalEmployeeCountLabel.setText("Total Employee: ");

        addEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMouseClicked(evt);
            }
        });

        addEmployeeLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        addEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addEmployeeLabel.setText("Add New Employee");

        javax.swing.GroupLayout addEmployeeButtonLayout = new javax.swing.GroupLayout(addEmployeeButton);
        addEmployeeButton.setLayout(addEmployeeButtonLayout);
        addEmployeeButtonLayout.setHorizontalGroup(
            addEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addEmployeeButtonLayout.setVerticalGroup(
            addEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        addEmployeeForm.setBackground(new java.awt.Color(255, 255, 255));
        addEmployeeForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        employeeIDLable.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        employeeIDLable.setText("Employee ID");

        nameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nameLabel.setText("Name");

        companyNameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        companyNameLabel.setText("Company Name");

        roleLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        roleLabel.setText("Role");

        passwordLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        passwordLabel.setText("Password");

        employeeIDTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        submitButton.setBackground(new java.awt.Color(255, 255, 255));
        submitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        submitButtonVariable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitButtonVariable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitButtonVariable.setText("SUBMIT");

        javax.swing.GroupLayout submitButtonLayout = new javax.swing.GroupLayout(submitButton);
        submitButton.setLayout(submitButtonLayout);
        submitButtonLayout.setHorizontalGroup(
            submitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitButtonVariable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        submitButtonLayout.setVerticalGroup(
            submitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitButtonVariable, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        roleComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Associate", "Manager" }));
        roleComboBox.setSelectedIndex(-1);

        companyNameComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        companyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPS", "Amazon" }));
        companyNameComboBox.setSelectedIndex(-1);

        javax.swing.GroupLayout addEmployeeFormLayout = new javax.swing.GroupLayout(addEmployeeForm);
        addEmployeeForm.setLayout(addEmployeeFormLayout);
        addEmployeeFormLayout.setHorizontalGroup(
            addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(employeeIDLable, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(companyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(13, 21, Short.MAX_VALUE)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEmployeeFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        addEmployeeFormLayout.setVerticalGroup(
            addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeeFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLable)
                    .addComponent(employeeIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameLabel)
                    .addComponent(companyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLabel)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addEmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        deleteButtonLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deleteButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButtonLabel.setText("Delete Employee");

        javax.swing.GroupLayout deleteButtonLayout = new javax.swing.GroupLayout(deleteButton);
        deleteButton.setLayout(deleteButtonLayout);
        deleteButtonLayout.setHorizontalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        deleteButtonLayout.setVerticalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalEmployeeCountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addComponent(addEmployeeForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalEmployeeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(addEmployeeForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        int selectedIndex = EmpData_Table.getSelectedRow();
        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Please, first select an employee", "Cannot perform action", HEIGHT);
        }
        EmpTable selectedData = ets.get(selectedIndex);
        System.out.println("Selected id is: "+ selectedData.getEID());
        ManageEmployeeData.deleteEmployeeStatus(selectedData.getEID());
        populateTable();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void addEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseClicked
        // TODO add your handling code here:
        addEmployeeForm.setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonMouseClicked

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        demo();
    }//GEN-LAST:event_submitButtonMouseClicked
   
   private void demo(){
       int employeeID;
       try{employeeID = Integer.parseInt(employeeIDTextField.getText());
            System.out.println("Data is "+ employeeID);
            if(ManageEmployeeData.isEIDUnique(employeeID)){
            }
       }catch(Exception e){
           employeeID = 0;
           System.out.println("Enter valid number");
       }

        String[] C= new String[5];
        int[] i = {0,0,0,0,0};
        if(employeeID == 0){
            C[0]="Emplyee ID ";
            i[0]=1;
            JOptionPane.showMessageDialog(this, " Enter Unique EID", "Error!", HEIGHT);
            employeeIDTextField.setText("");
        }
        if(nameTextField.getText().length()<2){
            C[1]="Name of Employee ";
            i[1]=1;
            JOptionPane.showMessageDialog(this, " Enter Valid Name (atleast two alphabet!)", "Error!", HEIGHT);
            nameTextField.setText("");
        }
        String Company = (String) companyNameComboBox.getSelectedItem();        
        if(Company == null){
            C[2]="Company Name ";
            i[2]=1;
        }
        String Role = (String) roleComboBox.getSelectedItem();        
        if(Role == null){
            C[3]="Role ";
            i[3]=1;
        }
        if(passwordTextField.getText().length()<5){
            C[4]="Password ";
            i[4]=1;
            JOptionPane.showMessageDialog(this, " Enter Valid Password (min length 5)", "Error!", HEIGHT);
            nameTextField.setText("");
        }        
        int z;
        String st= "";
        for(z=0; z<5; z++){
            if(i[z]==1){
                st += C[z];
                if(z < C.length - 1) {
                    st += ", ";
                }
            }
        }
        System.out.println(st);
        if(st.length()==0){
            JOptionPane.showMessageDialog(this, "Hurray, Employee Added! ", "Form Submitted", HEIGHT);
            System.out.println("Data is "+employeeID+ " " + nameTextField.getText() + " "+ Company + " " + Role + " " + passwordTextField.getText());
            ManageEmployeeData.addUser(employeeID, nameTextField.getText(), Company, Role, passwordTextField.getText());
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Fill Out Remaning Values: "+st, "Enter All Values", HEIGHT);
        }   
   }
   
    private void populateTable(){
        System.out.println("Hello world from View Panel - manageEmployee! ");
        try{
            TotalEmployeeCountLabel.setText("Total Employee : "+ManageEmployeeData.totalEmplyee());
            this.ets = ManageEmployeeData.getAllUsers();
            DefaultTableModel table = (DefaultTableModel) EmpData_Table.getModel();
            table.setRowCount(0);
            for(EmpTable u: ets){
                Object[] row = new Object[5];
                row[0] = u.getEID();
                row[1] = u.getEmployeeName();
                row[2] = u.getDataJoined();
                table.addRow(row);
            }
            addEmployeeForm.setVisible(false);
        }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Exception occoured!", "Cannot update user", HEIGHT);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpData_Table;
    private javax.swing.JLabel TotalEmployeeCountLabel;
    private javax.swing.JPanel addEmployeeButton;
    private javax.swing.JPanel addEmployeeForm;
    private javax.swing.JLabel addEmployeeLabel;
    private javax.swing.JComboBox<String> companyNameComboBox;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JPanel deleteButton;
    private javax.swing.JLabel deleteButtonLabel;
    private javax.swing.JLabel employeeIDLable;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JPanel submitButton;
    private javax.swing.JLabel submitButtonVariable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
