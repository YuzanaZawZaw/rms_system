package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import utilits.MyConstant;
/**
*
* @author Yuzana Zaw Zaw
*/
public class DatabaseUtils {
	private static Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rst = null;

	public Connection OpenConnection() {
		try {
			Class.forName(MyConstant.dirver);
			String url = MyConstant.url;
			String username = MyConstant.username;
			String password = MyConstant.password;
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return connection;
	}

	public ResultSet GetData(String Sql)// this method is used for Select
										// Statement
	{
		try {
			pst = connection.prepareStatement(Sql);
			rst = pst.executeQuery();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex
					+ "\nDbConnection GetData Error");
		}
		return rst;
	}

	public int InsertUpdateDelete(String Sql)// this method is used for
												// InsertUpdateDelete Statement
	{
		int flag = 0;
		try {
			pst = connection.prepareStatement(Sql);
			flag = pst.executeUpdate();
		} catch (SQLException ex) {

		}
		return flag;
	}

	public void CloseConnection() {

		if (rst != null) {
			try {
				rst.close();
			} catch (SQLException e) { /* ignored */
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) { /* ignored */
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) { /* ignored */
			}
		}

	}

	
}
