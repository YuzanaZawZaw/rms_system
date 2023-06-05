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

public class Recruiter {

	/**
	 * @param args
	 *            the command line arguments
	 */
	DatabaseUtils conn = new DatabaseUtils();
	PreparedStatement pst = null;
	ResultSet rst = null;

	private String firstName, lastName, userName, companyName, password,
			phoneNo, email, nrc, gender, address, securityQuest;
	private Date birthDate;

	public Recruiter() {

	}

	public Recruiter(String firstName, String lastName, String userName,
			String companyName, String password, String phoneNo, String email,
			Date birthDate, String nrc, String gender, String address,
			String securityQuest) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.companyName = companyName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.email = email;
		this.birthDate = birthDate;
		this.nrc = nrc;
		this.gender = gender;
		this.address = address;
		this.securityQuest = securityQuest;

	}

	public Recruiter(String firstName, String lastName, String nrc, Date dob,
			String gender, String sec, String phno, String email,
			String address, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nrc = nrc;
		this.birthDate = dob;
		this.gender = gender;
		this.securityQuest = sec;
		this.phoneNo = phno;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public boolean verifySecurityQ(String username, String securityQuestion)

	{
		boolean flag = false;

		try {
			conn.OpenConnection();
			String sql = "Select username,security_qest from Recruiters where username = '"
					+ username
					+ "' and security_qest = '"
					+ securityQuestion
					+ "'";

			rst = conn.GetData(sql);
			if (rst.next()) {
				flag = true;
			}

			else
				flag = false;
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n Verify SecurityQ Recruiters Error");
		}
		return flag;
	}

	public void changePassword(String username, String newPassword) {
		int flag;

		try {
			conn.OpenConnection();
			String sql = "UPDATE Recruiters SET password = '" + newPassword
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

	public boolean chkRecruiterPass(String id, String pass) {
		boolean flag = false;
		System.out.println("id :" + id + "\n" + "Pass:" + pass);
		try {
			conn.OpenConnection();
			String sql = "Select username,password "
					+ "from Recruiters where username = '" + id
					+ "' and password = '" + pass + "'";
			rst = conn.GetData(sql);
			if (rst.next()) {
				flag = true;

			} else
				flag = false;
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\nCheckLogin ChkRecruiterPass Error");
		}
		return flag;
	}

	public String getRecruiterName(String username) {
		String ass = null;
		String firstName;
		String lastName;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select first_name,last_name from Recruiters where username = '"
					+ username + "'";
			rst = conn.GetData(sql);

			while (rst.next()) {
				firstName = rst.getString("first_name");
				lastName = rst.getString("last_name");
				ass = firstName + " " + lastName;
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getRecruiterName  Error");
		}

		return ass;
	}

	public void addRecruiterPass() {
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Insert into Recruiters (recruiter_id, first_name, last_name,username,password, phone_no,email,birth_date,nrc,gender,address,security_qest) values"
					+ "("
					+ "null,"+ "'"
					+ getFirstName()+ "','"
					+ getLastName()+ "','"
					+ getUserName()+ "','"
					+ getPassword()+ "','"
					+ getPhoneNo()+ "','"
					+ getEmail()+ "','"
					+ getBirthDate()+"','"
					+ getNrc() + "','" 
					+ getGender() + "','" 
					+ getAddress() + "','" 
					+ getSecurityQuest() + "'" 
					+ ")";
			System.out.println("Sql++"+sql);
			int flag = conn.InsertUpdateDelete(sql);

			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"You Are Now Successfully Registered As Recruiter");
			} else {
				JOptionPane.showMessageDialog(null, "Insertion Failed");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void addRecruiters() {
		int recruiterId=0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			Connection con=conn.OpenConnection();
			PreparedStatement ps=null;
			
			ps = con.prepareStatement("Insert into Recruiters (first_name, last_name,username,company_name, password, phone_no,email,birth_date,nrc,gender,address,security_qest) values(?,?,?,?,?,?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,getFirstName());
			ps.setString(2, getLastName());
			ps.setString(3, getUserName());
			ps.setString(4,getCompanyName());
			ps.setString(5,getPassword());
			ps.setString(6,getPhoneNo());
			ps.setString(7, getEmail());
			ps.setDate(8, getBirthDate());
			ps.setString(9, getNrc());
			ps.setString(10,getGender());
			ps.setString(11,getAddress());
			ps.setString(12, getSecurityQuest());
			ps.executeUpdate();
			ResultSet generatedKeys = ps.getGeneratedKeys();
			if (generatedKeys.next()) {
				recruiterId = generatedKeys.getInt(1);
		        System.out.println("UserId is- " + recruiterId);
		        JOptionPane.showMessageDialog(null,
						"Successfully Registered As Recruiter");
		    }
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
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

	public String getSecurityQuest() {
		return securityQuest;
	}

	public void setSecurityQuest(String securityQuest) {
		this.securityQuest = securityQuest;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
