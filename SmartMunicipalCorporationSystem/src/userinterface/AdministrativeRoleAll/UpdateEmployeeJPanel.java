/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRoleAll;

import Business.Address.Address;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Utility.Validation;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amogh
 */
public class UpdateEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateEmployeeJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    UpdateEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise) {
     initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        
//        nameJTextField.setEditable(false);
        
        popOrganizationComboBox();
        employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Person person : organization.getPersonDirectory().getPersonList()){
            employeeJComboBox.addItem(person);
        }
    }
    
//    private void populateRoleComboBox(Organization organization){
//        roleJComboBox.removeAllItems();
//        for (Role role : organization.getSupportedRole()){
//            roleJComboBox.addItem(role);
//        }
//    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
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

        modifyJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        zipCode = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modifyJButton.setBackground(new java.awt.Color(51, 51, 51));
        modifyJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modifyJButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Pictures/1417678138_list-add-user.png"))); // NOI18N
        modifyJButton.setText("Update");
        modifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyJButtonActionPerformed(evt);
            }
        });
        add(modifyJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 170, 40));

        userJTable.setBackground(new java.awt.Color(51, 51, 51));
        userJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userJTable.setForeground(new java.awt.Color(255, 255, 255));
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setRowHeight(20);
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 60, 610, 179));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, 30));

        employeeJComboBox.setBackground(new java.awt.Color(51, 51, 51));
        employeeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboBoxActionPerformed(evt);
            }
        });
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 260, 40));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Pictures/1417743630_go-previous-24.png"))); // NOI18N
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, 30));

        organizationJComboBox.setBackground(new java.awt.Color(51, 51, 51));
        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 260, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Assigned Area zip Code");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 190, 30));

        zipCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zipCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        zipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipCodeKeyTyped(evt);
            }
        });
        add(zipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 260, 40));

        phoneTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        phoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneTxtKeyTyped(evt);
            }
        });
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 260, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Contact Number");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Employee List");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 940, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void modifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyJButtonActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Person employee = (Person) employeeJComboBox.getSelectedItem();
        Address add = new Address();
        
        if(Validation.validateTextFieldsForNonEmpty(zipCode) && Validation.validateTextFieldsForNonEmpty(phoneTxt) && zipCode.getText().length() == 5
                && phoneTxt.getText().length() == 10){
            add.setZipCode(Integer.parseInt(zipCode.getText()));
            employee.setPhone(phoneTxt.getText());
            
            employee.setAddress(add);
        JOptionPane.showMessageDialog(null, "Employee information updated successfully.");
        phoneTxt.setText("");
        zipCode.setText("");
        
        popData();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please dont keep any field empty or with improper details!", "Incomplete Input", JOptionPane.WARNING_MESSAGE);
        }
                
    }//GEN-LAST:event_modifyJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
//            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void employeeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJComboBoxActionPerformed

    }//GEN-LAST:event_employeeJComboBoxActionPerformed

    private void zipCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipCodeKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_zipCodeKeyTyped

    private void phoneTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!(Character.isDigit(character) || character == KeyEvent.VK_BACK_SPACE || character == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_phoneTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyJButton;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTable userJTable;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
