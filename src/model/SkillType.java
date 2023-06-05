package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class SkillType {
	DatabaseUtils conn = new DatabaseUtils();
	PreparedStatement pst = null;
	ResultSet rst = null;

	private int skillTypeId;
	private String description;
	public SkillType(){
		
	}
	public SkillType(int skillTId,String desc){
		this.skillTypeId=skillTId;
		this.description=desc;
	}
	public SkillType(String desc){
		this.description=desc;
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
	public int getSkillTypeId() {
		return skillTypeId;
	}
	public void setSkillTypeId(int skillTypeId) {
		this.skillTypeId = skillTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSkillTypeIdByName(String name) {
		int id=0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select skill_type_id from skill_type where description = '"
					+ name + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				id = rst.getInt("skill_type_id");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getSkillTypeIdByName  Error");
		}
		return id;
	}
	public String getSkillTypeNameById(int id) {
		String name=null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select description from skill_type where skill_type_id = '"
					+ id + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				name = rst.getString("description");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(null, e + "\n getSkillTypeNameById  Error");
		}
		return name;
	}
	public int saveSkillType() {
		int skillTypeId = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			Connection con = conn.OpenConnection();
			PreparedStatement ps = null;

			ps = con.prepareStatement(
					"Insert into skill_type (description) values(?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, getDescription());
			ps.executeUpdate();
			ResultSet generatedKeys = ps.getGeneratedKeys();
			if (generatedKeys.next()) {
				skillTypeId = generatedKeys.getInt(1);
				//System.out.println("skillTypeId is- " + skillTypeId);
				JOptionPane.showMessageDialog(null,
						"New Skill Type is successfully created");
			}else{
				JOptionPane.showMessageDialog(null, "Insertion Failed");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return skillTypeId;
	}
}
