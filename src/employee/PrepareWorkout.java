/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.List;
import javax.swing.JOptionPane;
import common.EmailUtil;
import member.MemberDAO;

/**
 *
 * @author Harshvardhan Kale
 */
public class PrepareWorkout extends javax.swing.JFrame {

    /**
     * Creates new form PrepareWorkout
     */
    private int employeeId;
    private int memberId;
    private int gymId;
    private String email;
    
    public PrepareWorkout() {
        initComponents();
    }
    
    public PrepareWorkout(int employeeId) {
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
        prepareWorkoutLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        bodyFatLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        advancePaidLabel = new javax.swing.JLabel();
        heightTF = new javax.swing.JTextField();
        weightTF = new javax.swing.JTextField();
        bodyFatTF = new javax.swing.JTextField();
        workoutPlanLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workoutPlanTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        injuryTA = new javax.swing.JTextArea();
        findMemberButton = new javax.swing.JButton();
        addWorkoutButton = new javax.swing.JButton();
        durationLabel = new javax.swing.JLabel();
        durationTF = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        searchTermsLabel = new javax.swing.JLabel();
        correspondingDetailsLabel = new javax.swing.JLabel();
        dietDetailsLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(60, 120));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        prepareWorkoutLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        prepareWorkoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prepare workout.jpg"))); // NOI18N
        prepareWorkoutLabel.setText("Prepare a Workout");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        firstNameTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setText("Email-ID");

        emailTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        heightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heightLabel.setText("Height (cm)");

        bodyFatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bodyFatLabel.setText("Body Fat (%)");

        weightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weightLabel.setText("Weight (kg)");

        advancePaidLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        advancePaidLabel.setText("Injury");

        heightTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        weightTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        bodyFatTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        workoutPlanLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workoutPlanLabel.setText("Workout Plan");

        workoutPlanTA.setColumns(20);
        workoutPlanTA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        workoutPlanTA.setRows(5);
        jScrollPane1.setViewportView(workoutPlanTA);

        injuryTA.setColumns(20);
        injuryTA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        injuryTA.setRows(5);
        jScrollPane2.setViewportView(injuryTA);

        findMemberButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        findMemberButton.setText("Find Member");
        findMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findMemberButtonActionPerformed(evt);
            }
        });

        addWorkoutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addWorkoutButton.setText("Add Workout");
        addWorkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWorkoutButtonActionPerformed(evt);
            }
        });

        durationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        durationLabel.setText("Duration (mo)");

        durationTF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        searchTermsLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        searchTermsLabel.setText("Search Terms");

        correspondingDetailsLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        correspondingDetailsLabel.setText("Corresponding Details");

        dietDetailsLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        dietDetailsLabel.setText("Workout Details");

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(prepareWorkoutLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 685, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dietDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(durationLabel)
                                            .addGap(64, 64, 64)
                                            .addComponent(durationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(148, 148, 148)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workoutPlanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(clearButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addWorkoutButton))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(findMemberButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(emailLabel))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(emailTF)))
                            .addComponent(searchTermsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightLabel)
                            .addComponent(bodyFatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(advancePaidLabel))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(correspondingDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(heightTF, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(weightTF)
                                    .addComponent(bodyFatTF))))
                        .addContainerGap(653, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prepareWorkoutLabel)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTermsLabel)
                    .addComponent(correspondingDetailsLabel)
                    .addComponent(dietDetailsLabel))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLabel)
                    .addComponent(heightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationLabel)
                    .addComponent(durationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel)
                            .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workoutPlanLabel))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bodyFatLabel)
                            .addComponent(bodyFatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(advancePaidLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addWorkoutButton)
                    .addComponent(findMemberButton)
                    .addComponent(clearButton))
                .addContainerGap(65, Short.MAX_VALUE))
        );

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

    private void findMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findMemberButtonActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameTF.getText();
        email = emailTF.getText();
        MemberDAO memberDAO = new MemberDAO();
        List<String> fetchedValues = memberDAO.findMember(firstName, email);

        if(fetchedValues != null) {

            memberId = Integer.parseInt(fetchedValues.get(0));
            gymId = Integer.parseInt(fetchedValues.get(1));

            heightTF.setText(fetchedValues.get(9));
            weightTF.setText(fetchedValues.get(5));
            bodyFatTF.setText(fetchedValues.get(6));
            injuryTA.setText(fetchedValues.get(7));
        }

        else
        JOptionPane.showMessageDialog(null, "Member Not Found");
    }//GEN-LAST:event_findMemberButtonActionPerformed

    private void addWorkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWorkoutButtonActionPerformed
        // TODO add your handling code here:
        String workout = workoutPlanTA.getText();
        int duration = Integer.parseInt(durationTF.getText());

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.addWorkout(employeeId, memberId, workout, duration);
        
        EmailUtil.sendEmail(email, workout, duration, "Trainer");
    }//GEN-LAST:event_addWorkoutButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        firstNameTF.setText("");
        emailTF.setText("");
        heightTF.setText("");
        weightTF.setText("");
        bodyFatTF.setText("");
        injuryTA.setText("");
        durationTF.setText("");
        workoutPlanTA.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrepareWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrepareWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrepareWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrepareWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepareWorkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWorkoutButton;
    private javax.swing.JLabel advancePaidLabel;
    private javax.swing.JLabel bodyFatLabel;
    private javax.swing.JTextField bodyFatTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel correspondingDetailsLabel;
    private javax.swing.JLabel dietDetailsLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTF;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton findMemberButton;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTF;
    private javax.swing.JTextArea injuryTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prepareWorkoutLabel;
    private javax.swing.JLabel searchTermsLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTF;
    private javax.swing.JLabel workoutPlanLabel;
    private javax.swing.JTextArea workoutPlanTA;
    // End of variables declaration//GEN-END:variables
}
