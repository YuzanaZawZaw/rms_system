/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yuzana Zaw Zaw
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

public class Employee {

	/**
	 * @param args
	 *            the command line arguments
	 */
	DatabaseUtils conn = new DatabaseUtils();
	PreparedStatement pst = null;
	ResultSet rst = null;

	private String firstName, lastName, userName, password, fatherName,
			phoneNo, nrc, gender, address, email, qualification, uniName,
			securityQuest;
	private Date dob;

	public Employee() {

	}

	public Employee(String firstName, String lastName, String userName,
			String password, String fatherName, String phoneNo, Date birthDate,
			String nrc, String gender, String address, String email,
			String qualification, String universityName, String securityQuest) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.dob = birthDate;
		this.nrc = nrc;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.qualification = qualification;
		this.uniName = universityName;
		this.securityQuest = securityQuest;

	}

	public Employee(String firstName, String lastName, String nrc, Date dob,
			String gender, String sec, String phoneNo, String email,
			String address, String username, String password) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.nrc = nrc;
		this.dob = dob;
		this.gender = gender;
		this.securityQuest = sec;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.userName = username;
		this.password = password;
	}

	public boolean verifySecurityQ(String username, String securityQuestion)

	{
		boolean flag = false;

		try {
			conn.OpenConnection();
			String sql = "Select username,security_qest from Employee where username = '"
					+ username
					+ "' and security_qest = '"
					+ securityQuestion
					+ "'";
			System.out.println(sql);
			rst = conn.GetData(sql);
			if (rst.next()) {
				flag = true;
			} else
				flag = false;
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n Verify SecurityQ Employee Error");
		}
		System.out.println(flag);
		return flag;
	}

	public void changePassword(String username, String newPassword) {
		int flag;

		try {
			conn.OpenConnection();
			String sql = "UPDATE Employee SET password = '" + newPassword
					+ "' where username = '" + username + "'";

			flag = conn.InsertUpdateDelete(sql);
			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"YOUR PASSWORD HAS BEEN CHANGED  ");
			} else {
				JOptionPane.showMessageDialog(null,
						"YOUR PASSWORD COULDn't BE CHANGED");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "UpdatePassword Query Failed");
		}

	}

	public boolean chkPassPass(String id, String pass) {
		boolean flag = false;
		System.out.println("id :" + id + "\n" + "Pass:" + pass);
		try {
			conn.OpenConnection();
			String sql = "Select username,password "
					+ "from Employee where username = '" + id
					+ "' and password = '" + pass + "'";
			rst = conn.GetData(sql);
			System.out.println("sql"+sql);
			if (rst.next()) {
				flag = true;

			} else
				flag = false;
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\nCheckLogin ChkEmployeePass Error");
		}
		return flag;
	}

	public String getEmployeeName(String username) {
		String ass = null;
		String firstName;
		String lastName;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select first_name,last_name from Employee where username = '"
					+ username + "'";
			rst = conn.GetData(sql);

			while (rst.next()) {
				firstName = rst.getString("first_name");
				lastName = rst.getString("last_name");
				ass = firstName + " " + lastName;
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getEmployeeName  Error");
		}

		return ass;
	}

	public void addEmployeePass() {
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Insert into Employee (employee_id,first_name, last_name, username,password,phone_no, email, "
					+ "birth_date,gender,nrc,address,security_qest) values"
					+ "(" + "null," + "'"
					+ getFirstName()
					+ "','"
					+ getLastName()
					+ "','"
					+ getUserName()
					+ "','"
					+ getPassword()
					+ "','"
					+ getPhoneNo()
					+ "','"
					+ getEmail()
					+ "','"
					+ getDob()
					+ "','"
					+ getGender()
					+ "','"
					+ getNrc()
					+ "','"
					+ getAddress() + "','" 
					+ getSecurityQuest() + "'" + ")";
			System.out.println("SQL::"+sql);
			int flag = conn.InsertUpdateDelete(sql);

			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"You Are Now Successfully Registered As Employee");
			} else {
				JOptionPane.showMessageDialog(null, "Insertion Failed");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public int addEmployee() {
		int employeeId = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			Connection con = conn.OpenConnection();
			PreparedStatement ps = null;

			ps = con.prepareStatement(
					"Insert into Employee (first_name, last_name, username,password,father_name,phone_no, email, "
							+ "birth_date,gender,address,qualification,university_name,nrc,security_qest) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, getFirstName());
			ps.setString(2, getLastName());
			ps.setString(3, getUserName());
			ps.setString(4, getPassword());
			ps.setString(5, getFatherName());
			ps.setString(6, getPhoneNo());
			ps.setString(7, getEmail());
			ps.setDate(8, getDob());
			ps.setString(9, getGender());
			ps.setString(10, getAddress());
			ps.setString(11, getQualification());
			ps.setString(12, getUniName());
			ps.setString(13, getNrc());
			ps.setString(14, getSecurityQuest());
			ps.executeUpdate();
			ResultSet generatedKeys = ps.getGeneratedKeys();
			if (generatedKeys.next()) {
				employeeId = generatedKeys.getInt(1);
				// System.out.println("UserId is- " + employeeId);
				JOptionPane.showMessageDialog(null,
						"Successfully Registered As Employee");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return employeeId;
	}

	public int getEmployeeIdByUserName(String userName) {
		int employeeId = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select employee_id from Employee where username = '"
					+ userName + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				employeeId = rst.getInt("employee_id");
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeByUsername  Error");
		}
		return employeeId;
	}

	public String getEmployeeNameById(int id) {
		String name = null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select first_name,last_name from Employee where employee_id = '"
					+ id + "'";
			rst = conn.GetData(sql);
			String fName = null;
			String lName = null;
			while (rst.next()) {
				fName = rst.getString("first_name");
				lName = rst.getString("last_name");
				name = fName + " " + lName;
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeNameById  Error");
		}
		return name;
	}

	public String getEmployeeByUserName(String userName) {
		String employeeId = null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select employee_id from Employee where username = '"
					+ userName + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				employeeId = rst.getString("employee_id");
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeByUsername  Error");
		}
		return employeeId;
	}

	public String getEmployeeUserNameById(int employeeId) {
		String username = null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select username from Employee where employee_id = '"
					+ employeeId + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				username = rst.getString("username");
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeUserNameById  Error");
		}
		return username;
	}

	public void updateEmployeeProfile(int employee_id) {
		int flag;
		System.out.println("EMPLOYEE ID:::" + employee_id);
		try {
			conn.OpenConnection();
			String sql = "update Employee set " + "first_name='" + firstName
					+ "',last_name='" + lastName + "',username='" + userName
					+ "',password='" + password + "',father_name='"
					+ fatherName + "',phone_no='" + phoneNo + "',email='"
					+ email + "',birth_date='" + dob + "',nrc='" + nrc
					+ "',gender='" + gender + "',address='" + address
					+ "',qualification='" + qualification
					+ "',university_name='" + uniName + "',security_qest='"
					+ securityQuest + "'where employee_id=" + employee_id + "";
			System.out.println("SQL:::" + sql);
			flag = conn.InsertUpdateDelete(sql);
			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"YOUR PROFILE HAVE BEEN UPDATED  ");
			} else {
				JOptionPane.showMessageDialog(null,
						"YOUR PROFILE COULDn't BE CHANGED");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"UpdateEmployeeProfile Query Failed");
		}

	}

	public void deleteEmployee(String employeeId) {
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "delete from Employee where employee_id = '"
					+ employeeId + "'";
			int flag = conn.InsertUpdateDelete(sql);
			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"EMPLOYEE ID  "+employeeId+" HAVE BEEN DELETE");
			} else {
				JOptionPane.showMessageDialog(null,
						"EMPLOYEE ID COULDn't BE DELETE");
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n deleteEmployee  Error");
		}
	}

	public DatabaseUtils getConn() {
		return conn;
	}

	public void setConn(DatabaseUtils conn) {
		this.conn = conn;
	}

	public PreparedStatement getPst() {
		return pst;
	}

	public void setPst(PreparedStatement pst) {
		this.pst = pst;
	}

	public ResultSet getRst() {
		return rst;
	}

	public void setRst(ResultSet rst) {
		this.rst = rst;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getSecurityQuest() {
		return securityQuest;
	}

	public void setSecurityQuest(String securityQuest) {
		this.securityQuest = securityQuest;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date birthDate) {
		this.dob = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
