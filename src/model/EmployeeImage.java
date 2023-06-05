package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class EmployeeImage {
	/**
	 * @param args
	 *            the command line arguments
	 */
	DatabaseUtils conn = new DatabaseUtils();
	PreparedStatement pst = null;
	ResultSet rst = null;

	private int employeeId;
	private String imageName, imagePath;
	private InputStream imageFile;

	public EmployeeImage() {

	}

	public EmployeeImage(int employeeId, String imageName, String imagePath,
			InputStream imageFile) {
		this.employeeId = employeeId;
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.imageFile = imageFile;
	}
	
	public void insertImageIntoDatabase(File f) {
		DatabaseUtils conn = new DatabaseUtils();
		Connection con=conn.OpenConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into employee_image (employee_id,image_name,image_path,image_file) values(?,?,?,?)");
			ps.setInt(1,getEmployeeId());
			ps.setString(2, getImageName());
			ps.setString(3, getImagePath());
			ps.setBinaryStream(4,getImageFile(),(int)f.length());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.CloseConnection();

	}

	public void deleteEmployeeImage(int id) {
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "DELETE from employee_image WHERE employee_id = '"
					+ id + "'";
			int flagg = conn.InsertUpdateDelete(sql);
			if (flagg == 1) {
				JOptionPane.showMessageDialog(null, "Image Deleted");
			} else {
				JOptionPane.showMessageDialog(null,
						"Please Enter A Valid employee_id");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public int getEmployeeImageById(int id) {
		int ass = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select employee_id from employee_image where employee_id = '"
					+ id + "'";
			rst = conn.GetData(sql);

			while (rst.next()) {
				ass = rst.getInt("employee_id");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getEmployeeImageById  Error");
		}
		return ass;
	}
	public byte[] getImageFileById(int id) {
		byte[] ass = null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select image_file from employee_image where employee_id = '"
					+ id + "'";
			rst = conn.GetData(sql);

			while (rst.next()) {
				ass = rst.getBytes("image_file");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getEmployeeImageById  Error");
		}
		return ass;
	}
	public String getImagePathById(int employee_id) {
		String ass = null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select image_path from employee_image where employee_id = '"
					+ employee_id + "'";
			rst = conn.GetData(sql);

			while (rst.next()) {
				ass = rst.getString("image_path");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getEmployeeImageById  Error");
		}
		return ass;
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

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public InputStream getImageFile() {
		return imageFile;
	}

	public void setImageFile(InputStream imageFile) {
		this.imageFile = imageFile;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	

	

	
}
