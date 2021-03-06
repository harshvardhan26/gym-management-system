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
public class TrainerHome extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeHome
     */
    
    private int employeeId;
        
    public TrainerHome() {
        initComponents();
    }

    public TrainerHome(int employeeId) {
        this();
        this.employeeId = employeeId;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        trainerMenuBar = new javax.swing.JMenuBar();
        prepareWorkoutMenu = new javax.swing.JMenu();
        listMyWorkoutsMenu = new javax.swing.JMenu();
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
            .addGap(0, 1042, Short.MAX_VALUE)
        );

        prepareWorkoutMenu.setText("Prepare Workout        ");
        prepareWorkoutMenu.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        prepareWorkoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prepareWorkoutMenuMouseClicked(evt);
            }
        });
        trainerMenuBar.add(prepareWorkoutMenu);

        listMyWorkoutsMenu.setText("List My Workouts        ");
        listMyWorkoutsMenu.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        listMyWorkoutsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMyWorkoutsMenuMouseClicked(evt);
            }
        });
        trainerMenuBar.add(listMyWorkoutsMenu);

        logoutMenu.setText("Logout        ");
        logoutMenu.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        trainerMenuBar.add(logoutMenu);

        setJMenuBar(trainerMenuBar);

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

    private void prepareWorkoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prepareWorkoutMenuMouseClicked
        // TODO add your handling code here:
        PrepareWorkout prepareWorkout = new PrepareWorkout(employeeId);
        prepareWorkout.setVisible(true);
    }//GEN-LAST:event_prepareWorkoutMenuMouseClicked

    private void listMyWorkoutsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMyWorkoutsMenuMouseClicked
        // TODO add your handling code here:
        ListWorkouts listWorkout = new ListWorkouts(employeeId);
        listWorkout.setVisible(true); 
    }//GEN-LAST:event_listMyWorkoutsMenuMouseClicked

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
            java.util.logging.Logger.getLogger(TrainerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu listMyWorkoutsMenu;
    private javax.swing.JMenu logoutMenu;
    private javax.swing.JMenu prepareWorkoutMenu;
    private javax.swing.JMenuBar trainerMenuBar;
    // End of variables declaration//GEN-END:variables
}
