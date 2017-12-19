/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userinterface.AdministrativeRoleAll;

import Business.EcoSystem;
import Business.Enterprise.CitizenEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MonitoringEnterprise;
import Business.Network.Network;
import Business.Organization.Municipal.CitizenOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkeQueue.ElectricityWorkRequest;
import Business.WorkeQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    EcoSystem system;
    int penidingStatusCount;
    int completedStatusCount;
    int othersCount;
    int sentCount;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization =  organization;
        this.system=system;
        valueLabel.setText(enterprise.getName());
        if(enterprise instanceof MonitoringEnterprise || enterprise instanceof CitizenEnterprise){
            requestSummaryBtn.setEnabled(false);
            escalatedRequestsBtn1.setEnabled(false);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        updateUserJButton = new javax.swing.JButton();
        requestSummaryBtn = new javax.swing.JButton();
        escalatedRequestsBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(6, 28));
        setMinimumSize(new java.awt.Dimension(6, 28));
        setPreferredSize(new java.awt.Dimension(6, 28));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Administrative Role Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        userJButton.setBackground(new java.awt.Color(51, 51, 51));
        userJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Manage User");
        userJButton.setMaximumSize(new java.awt.Dimension(6, 28));
        userJButton.setMinimumSize(new java.awt.Dimension(6, 28));
        userJButton.setPreferredSize(new java.awt.Dimension(6, 28));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 310, 40));

        manageEmployeeJButton.setBackground(new java.awt.Color(51, 51, 51));
        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setMaximumSize(new java.awt.Dimension(6, 28));
        manageEmployeeJButton.setMinimumSize(new java.awt.Dimension(6, 28));
        manageEmployeeJButton.setPreferredSize(new java.awt.Dimension(6, 28));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 310, 40));

        manageOrganizationJButton.setBackground(new java.awt.Color(51, 51, 51));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setMaximumSize(new java.awt.Dimension(6, 28));
        manageOrganizationJButton.setMinimumSize(new java.awt.Dimension(6, 28));
        manageOrganizationJButton.setPreferredSize(new java.awt.Dimension(6, 28));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 310, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 130, 30));

        updateUserJButton.setBackground(new java.awt.Color(51, 51, 51));
        updateUserJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        updateUserJButton.setText("Update Employee");
        updateUserJButton.setMaximumSize(new java.awt.Dimension(6, 28));
        updateUserJButton.setMinimumSize(new java.awt.Dimension(6, 28));
        updateUserJButton.setPreferredSize(new java.awt.Dimension(6, 28));
        updateUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserJButtonActionPerformed(evt);
            }
        });
        add(updateUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 310, 40));

        requestSummaryBtn.setBackground(new java.awt.Color(51, 51, 51));
        requestSummaryBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestSummaryBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestSummaryBtn.setText("Request By Status");
        requestSummaryBtn.setMaximumSize(new java.awt.Dimension(6, 28));
        requestSummaryBtn.setMinimumSize(new java.awt.Dimension(6, 28));
        requestSummaryBtn.setPreferredSize(new java.awt.Dimension(6, 28));
        requestSummaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSummaryBtnActionPerformed(evt);
            }
        });
        add(requestSummaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 310, 40));

        escalatedRequestsBtn1.setBackground(new java.awt.Color(51, 51, 51));
        escalatedRequestsBtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        escalatedRequestsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        escalatedRequestsBtn1.setText("View Escalated Requests");
        escalatedRequestsBtn1.setMaximumSize(new java.awt.Dimension(6, 28));
        escalatedRequestsBtn1.setMinimumSize(new java.awt.Dimension(6, 28));
        escalatedRequestsBtn1.setPreferredSize(new java.awt.Dimension(6, 28));
        escalatedRequestsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escalatedRequestsBtn1ActionPerformed(evt);
            }
        });
        add(escalatedRequestsBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 310, 40));
    }// </editor-fold>//GEN-END:initComponents

      public void populateTable(JPanel dataJPanel) {
       for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof CitizenEnterprise){
        for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof CitizenOrganization){
            for(UserAccount account:o.getUserAccountDirectory().getUserAccountList()) {
            for(WorkRequest request:account.getWorkQueue().getWorkRequestList()){
                if(request.getRequestType().equalsIgnoreCase(ElectricityWorkRequest.WorkRequestType.ElectricityWorkRequest.getValue()))
                if(request.getStatus().equalsIgnoreCase("Pending")){
                    penidingStatusCount++;
                } else if(request.getStatus().equalsIgnoreCase("Completed")){
                    completedStatusCount++;
                } else if(request.getStatus().equalsIgnoreCase("Processing")){
                    othersCount++;
                } else if(request.getStatus().equalsIgnoreCase("Sent")){
                    sentCount++;
                }
            }
            } 
        }
        }
                }
            }
       }
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      dataset.setValue(penidingStatusCount,"Count","Penidng" );
      dataset.setValue(completedStatusCount,"Count","Completed" );
      dataset.setValue(othersCount,"Count","Pending" );
      dataset.setValue(sentCount,"Count","Sent" );

      JFreeChart chart = ChartFactory.createBarChart("Requets Count By Status", "Status", "Count", dataset);
        
         
//      int width = 250;   /* Width of the image */
//      int height = 300;  /* Height of the image */ 
//      File pieChart = new File( "PieChart.jpeg" ); 
//        try {
//            ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
//        } catch (IOException ex) {
//            Logger.getLogger(ManageRequestDataJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
       // Plot pa=chart.getPlot();
        CategoryPlot pa =  chart.getCategoryPlot();
      //  pa.setRangeGridlinePaint(Color.black);
//      PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
//            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
//        pa.setLabelGenerator(gen);
        ChartFrame frame = new ChartFrame("Request By Status", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
        
//        ChartPanel CP = new ChartPanel(chart);
//        ChartPanel chartPanel=new ChartPanel(chart);
//        //CP.setSize(200, 200);
//        BorderLayout absoluteLayout=new BorderLayout();
//        JButton b=new JButton();
//        //b.setLayout(absoluteLayout);
////        b.add(b,BorderLayout.EAST);
//        //CP.add(createBack());
//        Color c=new Color(33, 33, 33);
//        b.setBackground(c);
//        Image img=null;
//        try {
//             img = ImageIO.read(getClass().getResource("/userinterface/Pictures/1417743630_go-previous-24.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(SystemAdminWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Icon i=new ImageIcon(img);
//        b.setIcon(i);
//        CP.setLayout(new BoxLayout(CP, BoxLayout.PAGE_AXIS));
//        CP.add(b);
//        //add(CP,BorderLayout.WEST);
//        dataJPanel.setLayout(absoluteLayout);
//        dataJPanel.add(CP);
//        dataJPanel.add(chartPanel);
//        dataJPanel.validate();
//         b.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//            userProcessContainer.remove(CP);
//            userProcessContainer.remove(dataJPanel);
//            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
//            cardLayout.previous(userProcessContainer);
//              penidingStatusCount=0;
//              completedStatusCount=0;
//              othersCount=0;
//
//               // using previous to get to previous(left)panel
//            }
//        });
    }

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        Network networkEmp =  null;
        for(Network network : system.getNetworkList()){
            for(Enterprise enterpriseCheck : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterpriseCheck == enterprise){
                    networkEmp = network;
                }
            }
        }
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),networkEmp);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void updateUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserJButtonActionPerformed
        UpdateEmployeeJPanel updateUserAccountJPanel = new UpdateEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("UpdateUserAccountJPanel", updateUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateUserJButtonActionPerformed

    private void requestSummaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSummaryBtnActionPerformed
        ViewRequestsByStatusJPanel requestsByStatusJPanel = new ViewRequestsByStatusJPanel();
        populateTable(requestsByStatusJPanel);
    }//GEN-LAST:event_requestSummaryBtnActionPerformed

    private void escalatedRequestsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escalatedRequestsBtn1ActionPerformed
        // TODO add your handling code here:
        ViewEscalatedRequestsJPanel viewEscalatedRequestsJPanel = new ViewEscalatedRequestsJPanel(userProcessContainer, enterprise.getOrganizationDirectory() ,enterprise);
        userProcessContainer.add("ViewEscalatedRequestsJPanel", viewEscalatedRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_escalatedRequestsBtn1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton escalatedRequestsBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton requestSummaryBtn;
    private javax.swing.JButton updateUserJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
