/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WaterSupplierRole;

import Business.EcoSystem;
import Business.Organization.Municipal.WaterOrganization;
import Business.UserAccount.UserAccount;
import Business.Utility.Helper;
import Business.WorkeQueue.WaterSupplyWorkRequest;
import Business.WorkeQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ConstructionRole.ConstructionWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class WaterWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private WaterOrganization organization;
    //private VaccineDirectory vaacineDirectory;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public WaterWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, WaterOrganization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;
 
        populateTable();
        populatePublicRequestTable();
//        populateTable1();
    }
    
//    public void populateTable1(){
//        DefaultTableModel model = (DefaultTableModel)tblVaccineInventory.getModel();
//        
//        model.setRowCount(0);
//        //System.out.println("Check");
//        for(Vaccine vaccine : electricityOrganization.getVaccineDirectory().getVaccineList()){
//            Object[] row = new Object[2];
//            row[0] = vaccine;
//            row[1] = vaccine.getQuantity();
//            
//            model.addRow(row);
//        }
//    }
    
    
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getFirstName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getFirstName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }

    public void populatePublicRequestTable(){
        DefaultTableModel model = (DefaultTableModel)publicWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getFirstName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getFirstName();
            row[3] = request.getStatus();
            row[4]= request.getGroupId() == null ? null : request.getGroupId();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        publicWorkRequestJTable = new javax.swing.JTable();
        processJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(51, 51, 51));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area Name", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(20);
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 680, 180));

        assignJButton.setBackground(new java.awt.Color(51, 51, 51));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 40));

        processJButton.setBackground(new java.awt.Color(51, 51, 51));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 100, 40));

        refreshJButton.setBackground(new java.awt.Color(51, 51, 51));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Request List");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Assigned Public Area Requests:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 260, -1));

        publicWorkRequestJTable.setBackground(new java.awt.Color(51, 51, 51));
        publicWorkRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        publicWorkRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        publicWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Area Name", "Sender", "Receiver", "Status", "GroupId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        publicWorkRequestJTable.setRowHeight(20);
        jScrollPane2.setViewportView(publicWorkRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 680, 170));

        processJButton1.setBackground(new java.awt.Color(51, 51, 51));
        processJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processJButton1.setForeground(new java.awt.Color(255, 255, 255));
        processJButton1.setText("Process");
        processJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButton1ActionPerformed(evt);
            }
        });
        add(processJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Individual Citizen Requests:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 240, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(!Helper.valiDateAssignment(request)){
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else{
            JOptionPane.showMessageDialog(null,"The Request has already been assigned to someone else", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WaterSupplyWorkRequest request = (WaterSupplyWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
      if(Helper.valiDateCompleted(request)){
         JOptionPane.showMessageDialog(null,"The Request has already been completed already", "Warning", JOptionPane.INFORMATION_MESSAGE);
     } else {
        request.setStatus("Processing");
        
        WaterPocessWorkRequestJPanel processWorkRequestJPanel = new WaterPocessWorkRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//        populateTable1();
      }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButton1ActionPerformed

        int selectedRow = publicWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
       
        WaterSupplyWorkRequest request = (WaterSupplyWorkRequest)publicWorkRequestJTable.getValueAt(selectedRow, 0);
        if(Helper.valiDateCompleted(request)){
         JOptionPane.showMessageDialog(null,"The Request has already been completed already", "Warning", JOptionPane.INFORMATION_MESSAGE);
     } else {
        request.setStatus("Processing");
        try {
                Helper.updateCitizenQueueProcessing(business,request.getGroupId());
            } catch (IOException ex) {
                Logger.getLogger(ConstructionWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        WaterPocessWorkRequestJPanel processWorkRequestJPanel = new WaterPocessWorkRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("WaterPocessWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        //        populateTable1();
        }
    }//GEN-LAST:event_processJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton processJButton1;
    private javax.swing.JTable publicWorkRequestJTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
