package view.myapp;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import view.admin.AdminHome;
import view.admin.ForgotPasswordForm;
import view.admin.RegistrationForm;
import view.employee.EmployeeHome;
import view.recruiter.RecruiterHome;
import model.Admin;
import model.Employee;
import model.Recruiter;

/**
 *
 * @author Yuzana Zaw Zaw
 */
public class LoginMain extends JFrame {
	/*
	 * Creates new form LoginMain
	 */
	// variable declaration
	// Variables declaration - do not modify
	private javax.swing.JComboBox LoginAsCombo;
	private javax.swing.JPanel LoginButton;
	private javax.swing.JPanel SignUpButton;
	private javax.swing.JLabel copyRightLabel;
	private javax.swing.JLabel copyRightLogoLabel;
	private javax.swing.JLabel forgotButtonLabel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;
	private javax.swing.JSeparator jSeparator7;
	private keeptoo.KGradientPanel kGradientPanel1;
	private javax.swing.JLabel loginAsLabel;
	private javax.swing.JLabel loginButtonLabel;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JLabel noAccLabel;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JLabel signUpButtonLabel;
	private javax.swing.JLabel subTitleLabel,jLabel10;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUserName;
	private javax.swing.JLabel usernameLabel;
	private javax.swing.JPanel xpanel;
	private javax.swing.JPanel ypanel;
	private JLabel jLabelMinimize;
	private JLabel jLabelClose;

	// End of variables declaration

	public LoginMain() {
		initComponents();
	}

	private void initComponents() {

       // jFormattedTextField1 = new javax.swing.JFormattedTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        subTitleLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        loginAsLabel = new javax.swing.JLabel();
        LoginAsCombo = new javax.swing.JComboBox();
        passwordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        LoginButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        loginButtonLabel = new javax.swing.JLabel();
        forgotButtonLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        noAccLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        SignUpButton = new javax.swing.JPanel();
        signUpButtonLabel = new javax.swing.JLabel();
        copyRightLogoLabel = new javax.swing.JLabel();
        copyRightLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(null);

        subTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subTitleLabel.setForeground(new java.awt.Color(255, 255, 51));
        subTitleLabel.setText("Easy to placement");
        kGradientPanel1.add(subTitleLabel);
        subTitleLabel.setBounds(100, 170, 250, 40);

        logoLabel.setFont(new java.awt.Font("Century Gothic", 0, 56)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("Recruitment Management SYS");
        logoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoLabel.setPreferredSize(new java.awt.Dimension(400, 80));
        kGradientPanel1.add(logoLabel);
        logoLabel.setBounds(50, 50, 900, 120);

        loginAsLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginAsLabel.setForeground(new java.awt.Color(204, 204, 204));
        loginAsLabel.setText("LOGIN AS:");
        kGradientPanel1.add(loginAsLabel);
        loginAsLabel.setBounds(280, 250, 69, 19);

        LoginAsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Employee", "Recruiter"}));
        kGradientPanel1.add(LoginAsCombo);
        LoginAsCombo.setBounds(390, 250, 110, 22);

        passwordLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setText("PASSWORD");
        kGradientPanel1.add(passwordLabel);
        passwordLabel.setBounds(280, 370, 75, 19);

        txtPassword.setBackground(new java.awt.Color(102, 0, 153));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPassword.setSelectionColor(new java.awt.Color(102, 0, 153));
        
        kGradientPanel1.add(txtPassword);
        txtPassword.setBounds(390, 360, 270, 30);

        usernameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        usernameLabel.setText("USERNAME");
        kGradientPanel1.add(usernameLabel);
        usernameLabel.setBounds(280, 320, 90, 19);

        txtUserName.setBackground(new java.awt.Color(102, 0, 153));
        txtUserName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setBorder(null);
        txtUserName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        
        
        kGradientPanel1.add(txtUserName);
        txtUserName.setBounds(390, 310, 270, 30);

        LoginButton.setBackground(new java.awt.Color(0, 0, 51));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            
        });
        LoginButton.setLayout(new FlowLayout());

       
        loginButtonLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        loginButtonLabel.setText("SignIn");
        loginButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.add(loginButtonLabel);

        kGradientPanel1.add(LoginButton);
        LoginButton.setBounds(280, 440, 150, 40);

        forgotButtonLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        forgotButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        forgotButtonLabel.setText("Forgot Password?");
        forgotButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotButtonLabelMouseClicked(evt);
            }
        });
        kGradientPanel1.add(forgotButtonLabel);
        forgotButtonLabel.setBounds(480, 450, 104, 16);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator2);
        jSeparator2.setBounds(390, 340, 270, 20);

        noAccLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        noAccLabel.setForeground(new java.awt.Color(204, 204, 204));
        noAccLabel.setText("Don't have an account?");
        kGradientPanel1.add(noAccLabel);
        noAccLabel.setBounds(110, 540, 230, 16);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator7);
        jSeparator7.setBounds(110, 560, 150, 10);

        SignUpButton.setBackground(new java.awt.Color(0, 0, 51));
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
            
        });
        SignUpButton.setLayout(new FlowLayout());

        signUpButtonLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        signUpButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        signUpButtonLabel.setText("SignUp");
        signUpButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
        });
        SignUpButton.add(signUpButtonLabel);

        kGradientPanel1.add(SignUpButton);
        SignUpButton.setBounds(110, 580, 140, 40);

        copyRightLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Copyright.png"))); // NOI18N
        kGradientPanel1.add(copyRightLogoLabel);
        copyRightLogoLabel.setBounds(800, 610, 34, 30);

        copyRightLabel.setForeground(new java.awt.Color(204, 204, 204));
        copyRightLabel.setText("All rights reserved GIC");
        kGradientPanel1.add(copyRightLabel);
        copyRightLabel.setBounds(830, 620, 200, 16);

        jPanel1.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(0, 0, 51));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
        });

        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelClose.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(0, 0, 51));
		ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
        });

        jLabelMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("_");
        jLabelMinimize.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ypanelLayout.createSequentialGroup()
                .addComponent(jLabelMinimize)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(890, 10, 118, 30);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator4);
        jSeparator4.setBounds(480, 470, 110, 3);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator5);
        jSeparator5.setBounds(390, 390, 270, 10);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator6);
        jSeparator6.setBounds(390, 290, 110, 3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1001, 686));
        setLocationRelativeTo(null);
    }       

	private void xpanelMouseClicked(MouseEvent evt) {
		System.exit(0);
	}

	private void ypanelMouseClicked(MouseEvent evt) {
		setState(LoginMain.ICONIFIED);
	}

	protected void SignUpButtonMouseClicked(MouseEvent evt) {
		this.setVisible(false);
		RegistrationForm reg = new RegistrationForm();
		reg.setVisible(true);
	}

	private void forgotButtonLabelMouseClicked(MouseEvent evt) {
		// TODO add your handling code here:
		this.setVisible(false);
		ForgotPasswordForm fp = new ForgotPasswordForm();
		fp.setVisible(true);
	}

	protected void LoginButtonMouseClicked(MouseEvent evt) {

		if (txtUserName.getText().equals("")
				|| txtPassword.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please fill User Name and Password Fields");
		} else {
			String LoginAs = String.valueOf(LoginAsCombo.getSelectedItem());
			Admin a = new Admin();
			Employee employee = new Employee();
			Recruiter recruiter = new Recruiter();

			String userName = txtUserName.getText();
			String pass = txtPassword.getText();
			if (LoginAs == "Admin") {
				if (a.chkAdminPass(userName, pass)) {
					AdminHome ah = new AdminHome(userName);
					this.setVisible(false);
					ah.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"Invalid UserID or Password");
				}

			}
			else if(LoginAs=="Employee")
            {
                if(employee.chkPassPass(userName, pass))
                {
                    this.setVisible(false);
                    String employeeName=employee.getEmployeeName(userName);
                    EmployeeHome eh=new EmployeeHome(userName,employeeName);
                    System.out.println("Employee Home"+eh);
                    eh.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid UserID or Password");
                }

            }
			else if(LoginAs=="Recruiter")
            {
                if(recruiter.chkRecruiterPass(userName, pass))
                {
                    this.setVisible(false);
                    String employeeName=recruiter.getRecruiterName(userName);
                    RecruiterHome eh=new RecruiterHome(userName,employeeName);
                    System.out.println("Recruiter Home"+eh);
                    eh.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid UserID or Password");
                }

            }

		}

	}

	public static void main(String[] args) {
		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginMain().setVisible(true);
			}
		});
	}

}
