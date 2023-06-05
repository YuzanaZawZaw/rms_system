package view.recruiter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.CVFormDownload;
import model.Employee;
import model.SkillType;
import dao.DatabaseUtils;
import view.myapp.LoginMain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuzana Zaw Zaw
 */
public class EmployeeDetailsForRecruiterHome extends javax.swing.JFrame {

	/**
	 * Creates new form EmployeeDetailsForRecruiterHome
	 */
	private String username;
	String[] columnNames = { "Employee Id", "Name", "Gender", "Qualification",
			"Address" };
	DefaultTableModel model = new DefaultTableModel();
	// Variables declaration - do not modify
		private javax.swing.JPanel addButton;
		private javax.swing.JLabel addLbl;
		private javax.swing.JLabel changePasswordLbl;
		private javax.swing.JPanel changePasswordPanel;
		private javax.swing.JLabel checkEmplDetailsLbk;
		private javax.swing.JPanel checkEmployeeDetailsPanel;
		private javax.swing.JLabel downEmplCvLbl;
		private javax.swing.JPanel downEmplCvPanel;
		private javax.swing.JLabel jLabel10;
		private javax.swing.JLabel jLabel19;
		private javax.swing.JLabel jLabel30;
		private javax.swing.JLabel jLabel5;
		private javax.swing.JLabel jLabel7;
		private javax.swing.JLabel jLabel8;
		private javax.swing.JPanel jPanel1;
		private javax.swing.JPanel jPanel2;
		private javax.swing.JScrollPane jScrollPane4;
		private javax.swing.JSeparator jSeparator1;
		private javax.swing.JSeparator jSeparator3;
		private javax.swing.JTable jTable;
		private javax.swing.JPanel logOutButton;
		private javax.swing.JLabel logoutLbl;
		private javax.swing.JComboBox<String> searchEmplSkill;
		private javax.swing.JTextField searchName;
		private javax.swing.JTextField searchQualification;
		private javax.swing.JPanel subMainPanel;
		private javax.swing.JLabel title;
		private javax.swing.JLabel titleLbl;
		private javax.swing.JLabel updateProfileLbl;
		private javax.swing.JPanel updateRecruiterProfilePanel;
		private javax.swing.JPanel xpanel;
		private javax.swing.JPanel xyPanel;
		private javax.swing.JPanel ypanel;
		// End of variables declaration
	public EmployeeDetailsForRecruiterHome() {
		initComponents();
	}

	public EmployeeDetailsForRecruiterHome(String username) {
		this.username = username;
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
		subMainPanel = new javax.swing.JPanel();
		jSeparator3 = new javax.swing.JSeparator();
		titleLbl = new javax.swing.JLabel();
		updateRecruiterProfilePanel = new javax.swing.JPanel();
		updateProfileLbl = new javax.swing.JLabel();
		checkEmployeeDetailsPanel = new javax.swing.JPanel();
		checkEmplDetailsLbk = new javax.swing.JLabel();
		downEmplCvPanel = new javax.swing.JPanel();
		downEmplCvLbl = new javax.swing.JLabel();
		changePasswordPanel = new javax.swing.JPanel();
		changePasswordLbl = new javax.swing.JLabel();
		logOutButton = new javax.swing.JPanel();
		logoutLbl = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		addButton = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		addLbl = new javax.swing.JLabel();
		title = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		searchName = new javax.swing.JTextField();
		searchEmplSkill = new javax.swing.JComboBox<>();
		searchQualification = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel2.setBackground(new java.awt.Color(153, 0, 204));
		jPanel2.setForeground(new java.awt.Color(255, 255, 255));
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

		javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(
				xpanel);
		xpanel.setLayout(xpanelLayout);
		xpanelLayout.setHorizontalGroup(xpanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				xpanelLayout
						.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addComponent(jLabel7)
						.addContainerGap()));
		xpanelLayout.setVerticalGroup(xpanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel7, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

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

		javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(
				ypanel);
		ypanel.setLayout(ypanelLayout);
		ypanelLayout.setHorizontalGroup(ypanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				ypanelLayout
						.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addComponent(jLabel8)
						.addContainerGap()));
		ypanelLayout.setVerticalGroup(ypanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				ypanelLayout.createSequentialGroup()
						.addGap(0, 1, Short.MAX_VALUE).addComponent(jLabel8)));

		javax.swing.GroupLayout xyPanelLayout = new javax.swing.GroupLayout(
				xyPanel);
		xyPanel.setLayout(xyPanelLayout);
		xyPanelLayout.setHorizontalGroup(xyPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				xyPanelLayout
						.createSequentialGroup()
						.addGap(0, 37, Short.MAX_VALUE)
						.addComponent(ypanel,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)
						.addComponent(xpanel,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		xyPanelLayout.setVerticalGroup(xyPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jPanel2.add(xyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(
				940, 0, -1, -1));

		subMainPanel.setBackground(new java.awt.Color(102, 0, 153));

		titleLbl.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
		titleLbl.setForeground(new java.awt.Color(204, 204, 204));
		titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		titleLbl.setText("RM SYS");
		titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		updateRecruiterProfilePanel.setBackground(new java.awt.Color(0, 0, 51));
		updateRecruiterProfilePanel
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						updateRecruiterProfilePanelMouseClicked(evt);
					}
				});
		updateRecruiterProfilePanel
				.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		updateProfileLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
		updateProfileLbl.setForeground(new java.awt.Color(240, 240, 240));
		updateProfileLbl
				.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		updateProfileLbl.setText("Update Profile");
		updateRecruiterProfilePanel.add(updateProfileLbl,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310,
						30));

		checkEmployeeDetailsPanel.setBackground(new java.awt.Color(0, 0, 51));
		checkEmployeeDetailsPanel
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						checkEmployeeDetailsPanelMouseClicked(evt);
					}
				});
		checkEmployeeDetailsPanel
				.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		checkEmplDetailsLbk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
		checkEmplDetailsLbk.setForeground(new java.awt.Color(240, 240, 240));
		checkEmplDetailsLbk
				.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		checkEmplDetailsLbk.setText("Check Employee Detail");
		checkEmployeeDetailsPanel.add(checkEmplDetailsLbk,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320,
						30));

		downEmplCvPanel.setBackground(new java.awt.Color(0, 0, 51));
		downEmplCvPanel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				downEmplCvPanelMouseClicked(evt);
			}
		});
		downEmplCvPanel
				.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		downEmplCvLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
		downEmplCvLbl.setForeground(new java.awt.Color(240, 240, 240));
		downEmplCvLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		downEmplCvLbl.setText("Download Employee CV");
		downEmplCvPanel.add(downEmplCvLbl,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 310,
						30));
		downEmplCvPanel.setVisible(false);
		changePasswordPanel.setBackground(new java.awt.Color(0, 0, 51));
		changePasswordPanel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				changePasswordPanelMouseClicked(evt);
			}
		});
		changePasswordPanel
				.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		changePasswordLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
		changePasswordLbl.setForeground(new java.awt.Color(240, 240, 240));
		changePasswordLbl
				.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		changePasswordLbl.setText("Change Password");
		changePasswordPanel.add(changePasswordLbl,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310,
						30));

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
		logOutButton.add(logoutLbl,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1,
						30));

		javax.swing.GroupLayout subMainPanelLayout = new javax.swing.GroupLayout(
				subMainPanel);
		subMainPanel.setLayout(subMainPanelLayout);
		subMainPanelLayout
				.setHorizontalGroup(subMainPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								subMainPanelLayout
										.createSequentialGroup()
										.addGroup(
												subMainPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																subMainPanelLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				subMainPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								changePasswordPanel,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								331,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								logOutButton,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								331,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								subMainPanelLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												checkEmployeeDetailsPanel,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												downEmplCvPanel,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												331,
																												Short.MAX_VALUE)
																										.addComponent(
																												updateRecruiterProfilePanel,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))))
														.addGroup(
																subMainPanelLayout
																		.createSequentialGroup()
																		.addGap(46,
																				46,
																				46)
																		.addGroup(
																				subMainPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								titleLbl,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								257,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jSeparator3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								268,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		subMainPanelLayout
				.setVerticalGroup(subMainPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								subMainPanelLayout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addComponent(titleLbl)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(129, 129, 129)
										.addComponent(
												updateRecruiterProfilePanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												checkEmployeeDetailsPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												downEmplCvPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												changePasswordPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												134, Short.MAX_VALUE)
										.addComponent(
												logOutButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(66, 66, 66)));

		jPanel2.add(
				subMainPanel,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setForeground(new java.awt.Color(204, 204, 204));
		jPanel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N

		jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
		jLabel19.setForeground(new java.awt.Color(102, 102, 102));
		jLabel19.setText("Search By Name: ");

		jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
		jLabel30.setForeground(new java.awt.Color(102, 102, 102));
		jLabel30.setText("Search By Employee Skill ");

		addButton.setBackground(new java.awt.Color(0, 0, 51));
		addButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				addButtonMouseClicked(evt);
			}
		});
		addButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(204, 204, 204));
		jLabel10.setText("EMAIL");
		addButton.add(jLabel10,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1,
						-1));

		addLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
		addLbl.setForeground(new java.awt.Color(204, 204, 204));
		addLbl.setText("Search");

		addButton.add(addLbl,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1,
						-1));

		title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		title.setText("Employee Details");

		jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(102, 102, 102));
		jLabel5.setText("Search By Qualification");

		searchName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		searchName.setForeground(new java.awt.Color(102, 102, 102));
		searchName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0,
				2, 0, new java.awt.Color(12, 91, 160)));

		/*
		 * searchEmplSkill.setModel(new javax.swing.DefaultComboBoxModel<>( new
		 * String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		 */

		DatabaseUtils conn = new DatabaseUtils();
		conn.OpenConnection();
		String sql = "Select * from skill_type";
		ResultSet rst = conn.GetData(sql);
		searchEmplSkill.addItem(" ");
		try {
			while (rst.next()) {
				String name = rst.getString("description");
				if (name.equals("")) {
					searchEmplSkill.addItem(" ");
					searchEmplSkill.setVisible(true);
				} else {
					searchEmplSkill.addItem(rst.getString("description"));
					searchEmplSkill.setVisible(true);
				}
			}
			conn.CloseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		searchQualification.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		searchQualification.setForeground(new java.awt.Color(102, 102, 102));
		searchQualification
				.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2,
						0, new java.awt.Color(12, 91, 160)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(65,
																				65,
																				65)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel30)
																						.addComponent(
																								jLabel19)
																						.addComponent(
																								jLabel5))
																		.addGap(41,
																				41,
																				41)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								searchName,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								146,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								searchEmplSkill,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								146,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								searchQualification,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								146,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(75,
																				75,
																				75)
																		.addComponent(
																				title,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				245,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(118,
																				118,
																				118)
																		.addComponent(
																				addButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				150,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(138,
																				138,
																				138)
																		.addComponent(
																				jSeparator1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				119,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(37, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(21, 21, 21)
										.addComponent(title)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												15,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																searchName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel19))
										.addGap(14, 14, 14)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																searchEmplSkill,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel30))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																searchQualification,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												31, Short.MAX_VALUE)
										.addComponent(
												addButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(22, 22, 22)));

		jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(
				470, 40, 400, -1));

		jTable.setForeground(new java.awt.Color(153, 0, 204));
		model.setColumnIdentifiers(columnNames);
		jTable.setModel(model);
		jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		jTable.setFillsViewportHeight(true);
		jTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				processTableClick();
			}
		});
		jScrollPane4.setViewportView(jTable);

		jPanel2.add(jScrollPane4,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1,
						270));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(9, Short.MAX_VALUE)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 632,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(14, 14, 14)));

		setSize(new java.awt.Dimension(1082, 655));
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		setState(EmployeeDetailsForRecruiterHome.ICONIFIED);
	}

	private void updateRecruiterProfilePanelMouseClicked(
			java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		UpdateRecruiterHome av = new UpdateRecruiterHome(username);
		this.setVisible(false);
		av.setVisible(true);
	}

	private void checkEmployeeDetailsPanelMouseClicked(
			java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		EmployeeDetailsForRecruiterHome ed = new EmployeeDetailsForRecruiterHome(
				username);
		this.setVisible(false);
		ed.setVisible(true);
	}

	private void downEmplCvPanelMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		/*
		 * RidesHistory rh=new RidesHistory(username); this.setVisible(false);
		 * rh.setVisible(true);
		 */
	}

	private void changePasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		RecruiterSettings as = new RecruiterSettings(username);
		this.setVisible(false);
		as.setVisible(true);
	}

	private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		LoginMain lm = new LoginMain();
		this.setVisible(false);
		lm.setVisible(true);
	}

	private void processTableClick() {
		String employeeId = null;
		if (jTable.getValueAt(jTable.getSelectedRow(), 0) != null) {
			employeeId = jTable.getValueAt(jTable.getSelectedRow(), 0)
					.toString();
		}
		String opt[] = new String[] { "DownloadCV", "Cancle" };
		int choice = JOptionPane.showOptionDialog(null,
				"Which operate do you want?", "Operation",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				opt, opt[1]);
		switch (opt[choice]) {
		case "DownloadCV":
			new CVFormDownload(Integer.parseInt(employeeId));
			break;
		case "Cancle":
			processCancle(employeeId);
			break;
		}
	}

	private void processCancle(String employeeId) {

	}

	private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {
		model.setRowCount(0);
		String searchNameData = searchName.getText();
		String searchQual = searchQualification.getText();
		String searchSkill = (String) searchEmplSkill.getSelectedItem();

		String name = "";
		String firstName = "";
		String lastName = "";
		String gender = "";
		String qualification = "";
		String address = "";
		String showEmplName = "";

		String skillSql = null;
		String qualSql = null;
		String nameSqlForEmployee = null;
		String nameSqlForSkill = null;
		String nameSqlForQual = null;

		try {
			SkillType st = new SkillType();
			int skill_type_id = st.getSkillTypeIdByName(searchSkill);

			String employeeSql = "Select * " + "from Employee ";

			if (!searchNameData.equals("")) {
				nameSqlForEmployee = "where first_name LIKE UPPER('%"
						+ searchNameData + "%') "
						+ "or last_name LIKE UPPER('%" + searchNameData
						+ "%') ";
				nameSqlForSkill = "and e.first_name LIKE UPPER('%"
						+ searchNameData + "%') "
						+ "or e.last_name LIKE UPPER('%" + searchNameData
						+ "%') ";
			}
			if (!searchQual.equals("")) {
				qualSql = "where qualification LIKE UPPER('%" + searchQual
						+ "%') ";
				nameSqlForQual = "and e.qualification LIKE UPPER('%"
						+ searchQual + "%') ";
			}
			if (skill_type_id != 0) {
				skillSql = "and t.skill_type_id='" + skill_type_id + "' ";
			}

			String forSkillsql = "select e.*,s.*,t.* "
					+ "from employee e,employee_skill s ,skill_type t "
					+ "where e.employee_id=s.employee_id "
					+ "and s.skill_type_id=t.skill_type_id ";

			if (skillSql != null
					|| (skillSql != null && (nameSqlForSkill != null || nameSqlForQual != null))) {
				if (skillSql != null) {
					forSkillsql += skillSql;
				}
				if (nameSqlForSkill != null) {
					forSkillsql += nameSqlForSkill;
				}
				if (nameSqlForQual != null) {
					forSkillsql += nameSqlForQual;
				}
				System.out.println("SQL1:::" + forSkillsql);
				DatabaseUtils conn2 = new DatabaseUtils();
				conn2.OpenConnection();
				ResultSet rs2 = conn2.GetData(forSkillsql);
				int i = 0;
				while (rs2.next()) {
					showEmplName = rs2.getString("employee_id");
					firstName = rs2.getString("first_name");
					lastName = rs2.getString("last_name");
					name = firstName + " " + lastName;
					gender = rs2.getString("gender");
					qualification = rs2.getString("qualification");
					address = rs2.getString("address");
					model.addRow(new Object[] { showEmplName, name, gender,
							qualification, address });
					searchName.setText("");
					searchEmplSkill.setSelectedIndex(0);
					searchQualification.setText("");
					i++;
				}
				if (i < 1) {
					JOptionPane.showMessageDialog(null, "No Record Found",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (i == 1) {
					System.out.println(i + " Record Found");
				} else {
					System.out.println(i + " Records Found");
				}
				conn2.CloseConnection();
			} else if (nameSqlForEmployee != null && qualSql != null) {

				employeeSql += "where first_name LIKE UPPER('%"
						+ searchNameData + "%') "
						+ "or last_name LIKE UPPER('%" + searchNameData
						+ "%') ";
				employeeSql += "and qualification LIKE UPPER('%" + searchQual
						+ "%') ";

				System.out.println("SQL:::" + employeeSql);
				DatabaseUtils conn = new DatabaseUtils();
				conn.OpenConnection();
				ResultSet rs1 = conn.GetData(employeeSql);
				int i = 0;
				while (rs1.next()) {
					showEmplName = rs1.getString("employee_id");
					firstName = rs1.getString("first_name");
					lastName = rs1.getString("last_name");
					name = firstName + " " + lastName;
					gender = rs1.getString("gender");
					qualification = rs1.getString("qualification");
					address = rs1.getString("address");
					model.addRow(new Object[] { showEmplName, name, gender,
							qualification, address });
					searchName.setText("");
					searchEmplSkill.setSelectedIndex(0);
					searchQualification.setText("");
					i++;
				}
				if (i < 1) {
					JOptionPane.showMessageDialog(null, "No Record Found",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (i == 1) {
					System.out.println(i + " Record Found");
				} else {
					System.out.println(i + " Records Found");
				}
				conn.CloseConnection();
			} else if (nameSqlForEmployee != null || qualSql != null) {
				if (nameSqlForEmployee != null) {
					employeeSql += nameSqlForEmployee;
				} else if (qualSql != null) {
					employeeSql += qualSql;
				}

				System.out.println("SQL:::" + employeeSql);
				DatabaseUtils conn = new DatabaseUtils();
				conn.OpenConnection();
				ResultSet rs1 = conn.GetData(employeeSql);
				int i = 0;
				while (rs1.next()) {
					showEmplName = rs1.getString("employee_id");
					firstName = rs1.getString("first_name");
					lastName = rs1.getString("last_name");
					name = firstName + " " + lastName;
					gender = rs1.getString("gender");
					qualification = rs1.getString("qualification");
					address = rs1.getString("address");
					model.addRow(new Object[] { showEmplName, name, gender,
							qualification, address });
					searchName.setText("");
					searchEmplSkill.setSelectedIndex(0);
					searchQualification.setText("");
					i++;
				}
				if (i < 1) {
					JOptionPane.showMessageDialog(null, "No Record Found",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (i == 1) {
					System.out.println(i + " Record Found");
				} else {
					System.out.println(i + " Records Found");
				}
				conn.CloseConnection();
			} else if (nameSqlForEmployee == null && nameSqlForSkill == null
					&& nameSqlForQual == null) {
				// System.out.println("NOOOOOOOOO");
				String mainSql = "Select * " + "from employee ";
				// System.out.println("main sql" + mainSql);
				DatabaseUtils mainconn = new DatabaseUtils();
				mainconn.OpenConnection();
				ResultSet mainRs = mainconn.GetData(mainSql);
				int i = 0;
				try {
					while (mainRs.next()) {
						showEmplName = mainRs.getString("employee_id");
						firstName = mainRs.getString("first_name");
						lastName = mainRs.getString("last_name");
						name = firstName + " " + lastName;
						gender = mainRs.getString("gender");
						qualification = mainRs.getString("qualification");
						address = mainRs.getString("address");
						model.addRow(new Object[] { showEmplName, name, gender,
								qualification, address });
						searchName.setText("");
						searchEmplSkill.setSelectedIndex(0);
						searchQualification.setText("");
						i++;
					}
					mainconn.CloseConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i < 1) {
					JOptionPane.showMessageDialog(null, "No Record Found",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (i == 1) {
					System.out.println(i + " Record Found");
				} else {
					System.out.println(i + " Records Found");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(
					EmployeeDetailsForRecruiterHome.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					EmployeeDetailsForRecruiterHome.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					EmployeeDetailsForRecruiterHome.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					EmployeeDetailsForRecruiterHome.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EmployeeDetailsForRecruiterHome().setVisible(true);
			}
		});
	}

	
}
