/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import javax.swing.JOptionPane;
import common.LoginHome;

/**
 *
 * @author Harshvardhan Kale
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminMenuBar = new javax.swing.JMenuBar();
        addEmployeeMenu = new javax.swing.JMenu();
        editEmployeeMenu = new javax.swing.JMenu();
        listEmployeesMenu = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );

        addEmployeeMenu.setText("Add Employee        ");
        addEmployeeMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addEmployeeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeMenuMouseClicked(evt);
            }
        });
        adminMenuBar.add(addEmployeeMenu);

        editEmployeeMenu.setText("Edit Employee        ");
        editEmployeeMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editEmployeeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmployeeMenuMouseClicked(evt);
            }
        });
        adminMenuBar.add(editEmployeeMenu);

        listEmployeesMenu.setText("List Employees        ");
        listEmployeesMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listEmployeesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEmployeesMenuMouseClicked(evt);
            }
        });
        adminMenuBar.add(listEmployeesMenu);

        logoutMenu.setText("Logout        ");
        logoutMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        adminMenuBar.add(logoutMenu);

        setJMenuBar(adminMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        // TODO add your handling code here:
        int yesOrNo = JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        
        if(yesOrNo == 0) {
            this.dispose();
            new LoginHome().setVisible(true);
        }
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void addEmployeeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeMenuMouseClicked
        // TODO add your handling code here:
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_addEmployeeMenuMouseClicked

    private void listEmployeesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmployeesMenuMouseClicked
        // TODO add your handling code here:
        new ListEmployees().setVisible(true);
    }//GEN-LAST:event_listEmployeesMenuMouseClicked

    private void editEmployeeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeMenuMouseClicked
        // TODO add your handling code here:
        new EditEmployee().setVisible(true);
    }//GEN-LAST:event_editEmployeeMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addEmployeeMenu;
    private javax.swing.JMenuBar adminMenuBar;
    private javax.swing.JMenu editEmployeeMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu listEmployeesMenu;
    private javax.swing.JMenu logoutMenu;
    // End of variables declaration//GEN-END:variables
}
