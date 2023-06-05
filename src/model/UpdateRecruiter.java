package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class UpdateRecruiter {

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

	public UpdateRecruiter() {

	}

	public UpdateRecruiter(String firstName, String lastName, String userName,
			String companyName, String password, String phoneNo, String email,
			Date birthDate, String nrc, String gender, String address,
			String securtiyQest) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.companyName = companyName;
		this.password = password;
		this.birthDate=birthDate;
		this.phoneNo = phoneNo;
		this.email = email;
		this.nrc = nrc;
		this.gender = gender;
		this.address = address;
		this.securityQuest = securtiyQest;
	}
	public int getRecruiterIdByUserName(String userName) {
		int recruiterId=0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select recruiter_id from Recruiters where username = '"
					+ userName + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				recruiterId = rst.getInt("recruiter_id");
			}
			conn.CloseConnection();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getRecruiterById  Error");
		}
		return recruiterId;
	}

	public void updateRecruiterProfile(int recruiter_id) {
		int flag;
		System.out.println("RECRUITER ID:::"+recruiter_id);
		System.out.println("birth_date:::"+birthDate);
		try {
			conn.OpenConnection();
			String sql="update Recruiters set "
					+ "first_name='"+firstName
					+"',last_name='"+lastName
					+"',username='"+userName
					+"',company_name='"+companyName
					+"',password='"+password
					+"',phone_no='"+phoneNo
					+"',email='"+email
					+"',birth_date='"+birthDate
					+"',nrc='"+nrc
					+"',gender='"+gender
					+"',address='"+address
					+"',security_qest='"+securityQuest
					+"'where recruiter_id="+
					recruiter_id+"";
			System.out.println("SQL:::"+sql);
			flag = conn.InsertUpdateDelete(sql);
			if (flag == 1) {
				JOptionPane.showMessageDialog(null,
						"YOUR PROFILE HAVE BEEN UPDATED  ");
			} else {
				JOptionPane.showMessageDialog(null,
						"YOUR PROFILE COULDn't BE CHANGED");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "UpdateRecruiterProfile Query Failed");
		}
		
	}

}
