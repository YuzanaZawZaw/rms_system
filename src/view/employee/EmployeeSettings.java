package view.employee;

import javax.swing.JOptionPane;

import view.myapp.LoginMain;
import model.Admin;
import model.Employee;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuzana Zaw Zaw
 */
public class EmployeeSettings extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeSettings
     */
    private String username;
 // Variables declaration - do not modify                     
    private javax.swing.JPanel addEmployeeSkill;
    private javax.swing.JLabel addEmployeeSkillLbl;
    private javax.swing.JPanel checkRecruiterDetails;
    private javax.swing.JLabel checkRecruiterLbl;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JLabel logoutLbl;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JPasswordField oldPasswordText;
    private javax.swing.JPanel saveButton;
    private javax.swing.JPanel settingsButton;
    private javax.swing.JLabel settingsLbl;
    private javax.swing.JPanel subMainPanel;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel updateEmployeeButton;
    private javax.swing.JLabel updateEmployeeProfile;
    private javax.swing.JPanel verifyButton;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel xyPanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration  
    public EmployeeSettings()
    {
    	initComponents();
    }
    public EmployeeSettings(String username) {
        this.username=username;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        xyPanel = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        confirmPasswordLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        verifyButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oldPasswordText = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        newPasswordText = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        confirmPasswordText = new javax.swing.JPasswordField();
        jSeparator10 = new javax.swing.JSeparator();
        subMainPanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        titleLbl = new javax.swing.JLabel();
        updateEmployeeButton = new javax.swing.JPanel();
        updateEmployeeProfile = new javax.swing.JLabel();
        checkRecruiterDetails = new javax.swing.JPanel();
        checkRecruiterLbl = new javax.swing.JLabel();
        addEmployeeSkill = new javax.swing.JPanel();
        addEmployeeSkillLbl = new javax.swing.JLabel();
        settingsButton = new javax.swing.JPanel();
        settingsLbl = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        logoutLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xyPanel.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(255, 255, 255));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
            
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(255, 255, 255));
        ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
           
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout xyPanelLayout = new javax.swing.GroupLayout(xyPanel);
        xyPanel.setLayout(xyPanelLayout);
        xyPanelLayout.setHorizontalGroup(
            xyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xyPanelLayout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        xyPanelLayout.setVerticalGroup(
            xyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(xyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("   X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("-");
        

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setText("Change Password");

        confirmPasswordLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(102, 102, 102));
        confirmPasswordLabel.setText("Confirm Password");

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Old Password");

        newPasswordLabel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(102, 102, 102));
        newPasswordLabel.setText("New Password");

        saveButton.setBackground(new java.awt.Color(0, 0, 51));
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Save Changes");
        
        javax.swing.GroupLayout saveButtonLayout = new javax.swing.GroupLayout(saveButton);
        saveButton.setLayout(saveButtonLayout);
        saveButtonLayout.setHorizontalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        saveButtonLayout.setVerticalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        verifyButton.setBackground(new java.awt.Color(0, 0, 51));
        verifyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        verifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyButtonMouseClicked(evt);
            }

        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Verify");
   

        javax.swing.GroupLayout verifyButtonLayout = new javax.swing.GroupLayout(verifyButton);
        verifyButton.setLayout(verifyButtonLayout);
        verifyButtonLayout.setHorizontalGroup(
            verifyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyButtonLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        verifyButtonLayout.setVerticalGroup(
            verifyButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verifyButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        oldPasswordText.setForeground(new java.awt.Color(51, 0, 204));
        oldPasswordText.setBorder(null);
 

        jSeparator6.setForeground(new java.awt.Color(0, 51, 153));

        newPasswordText.setForeground(new java.awt.Color(51, 0, 204));
        newPasswordText.setBorder(null);


        jSeparator7.setForeground(new java.awt.Color(0, 51, 153));

        confirmPasswordText.setForeground(new java.awt.Color(51, 0, 204));
        confirmPasswordText.setBorder(null);
  

        jSeparator10.setForeground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(943, 943, 943)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmPasswordLabel)
                            .addComponent(newPasswordLabel))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(oldPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(newPasswordLabel)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(confirmPasswordLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 730, 602));

        subMainPanel.setBackground(new java.awt.Color(102, 0, 153));

        titleLbl.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(204, 204, 204));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("RM SYS");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        updateEmployeeButton.setBackground(new java.awt.Color(0, 0, 51));
        updateEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEmployeeButtonMouseClicked(evt);
            }
           
        });
        updateEmployeeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateEmployeeProfile.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        updateEmployeeProfile.setForeground(new java.awt.Color(240, 240, 240));
        updateEmployeeProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateEmployeeProfile.setText("Update Profile");
        updateEmployeeButton.add(updateEmployeeProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        checkRecruiterDetails.setBackground(new java.awt.Color(0, 0, 51));
        checkRecruiterDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRecruiterDetailsMouseClicked(evt);
            }
           
        });
        checkRecruiterDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkRecruiterLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkRecruiterLbl.setForeground(new java.awt.Color(240, 240, 240));
        checkRecruiterLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkRecruiterLbl.setText("Check Recruiter Detail");
        checkRecruiterDetails.add(checkRecruiterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 30));

        addEmployeeSkill.setBackground(new java.awt.Color(0, 0, 51));
        addEmployeeSkill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeSkillMouseClicked(evt);
            }
           
        });
        addEmployeeSkill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEmployeeSkillLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addEmployeeSkillLbl.setForeground(new java.awt.Color(240, 240, 240));
        addEmployeeSkillLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addEmployeeSkillLbl.setText("Add Employee Skill");
        addEmployeeSkill.add(addEmployeeSkillLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 310, 30));

        settingsButton.setBackground(new java.awt.Color(0, 0, 51));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        settingsLbl.setForeground(new java.awt.Color(240, 240, 240));
        settingsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsLbl.setText("Settings");
        settingsButton.add(settingsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        logOutButton.setBackground(new java.awt.Color(0, 0, 51));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            
        });
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        logoutLbl.setForeground(new java.awt.Color(240, 240, 240));
        logoutLbl.setText("Log Out");
        logOutButton.add(logoutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        javax.swing.GroupLayout subMainPanelLayout = new javax.swing.GroupLayout(subMainPanel);
        subMainPanel.setLayout(subMainPanelLayout);
        subMainPanelLayout.setHorizontalGroup(
            subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMainPanelLayout.createSequentialGroup()
                .addGroup(subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(checkRecruiterDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addEmployeeSkill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                .addComponent(updateEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(subMainPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subMainPanelLayout.setVerticalGroup(
            subMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(updateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkRecruiterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addEmployeeSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel2.add(subMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        setSize(new java.awt.Dimension(1083, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        System.exit(0);
    }                                   
                                 
    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        setState(EmployeeSettings.ICONIFIED);
    }                                                                                                                                        
    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:

        Employee ad=new Employee();
        String newPassword=newPasswordText.getText();
        String confirmPassword=confirmPasswordText.getText();
        newPasswordText.setText("");
        confirmPasswordText.setText("");
        if(newPassword.equals(confirmPassword))
        {
            JOptionPane.showMessageDialog(null,"Your both passwords matched");
            ad.changePassword(username,newPassword);
            oldPasswordText.setText("");
            newPasswordText.setText("");
            confirmPasswordText.setText("");

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Your passwords didn't matched");
            newPasswordText.setText("");
            confirmPasswordText.setText("");

        }
    }                                       
    private void verifyButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        Employee employee=new Employee();
        String oldPassword=oldPasswordText.getText();
        oldPasswordText.setText("");
        if(employee.chkPassPass(username, oldPassword))
        {
            JOptionPane.showMessageDialog(null,"Old Password Verified");
            newPasswordText.setVisible(true);
            confirmPasswordText.setVisible(true);
            saveButton.setVisible(true);
            newPasswordLabel.setVisible(true);
            confirmPasswordLabel.setVisible(true);

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Old Password Not Verified");
        }
    }                                         

                                                                                        

    private void updateEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        // TODO add your handling code here:
    	UpdateEmployeeHome av = new UpdateEmployeeHome(username);
		this.setVisible(false);
		av.setVisible(true);
    }                                                                                               
    private void checkRecruiterDetailsMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        // TODO add your handling code here:
    	RecruiterDetailsHome ed=new RecruiterDetailsHome(username);
        this.setVisible(false);
        ed.setVisible(true);
    }                                                                                                    
    private void addEmployeeSkillMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        AddEmployeeSkill rh=new AddEmployeeSkill(username);
        this.setVisible(false);
        rh.setVisible(true);
    }                                                                                           
    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        EmployeeSettings as=new EmployeeSettings(username);
        this.setVisible(false);
        as.setVisible(true);
    }                                                                                    
    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }                                         
                                      
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
            java.util.logging.Logger.getLogger(EmployeeSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSettings().setVisible(true);
            }
        });
    }

                     
}
