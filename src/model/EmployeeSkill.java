package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class EmployeeSkill {
	DatabaseUtils conn = new DatabaseUtils();
	PreparedStatement pst = null;
	ResultSet rst = null;

	private int employeeId, skillTypeId;
	private String skillLevel;

	public EmployeeSkill() {

	}

	public EmployeeSkill(int emplId, int skillTId, String skillL) {
		this.employeeId = emplId;
		this.skillLevel = skillL;
		this.skillTypeId = skillTId;
	}

	public int addEmployeeSkill() {
		int flag = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Insert into employee_skill (employee_id,skill_type_id, skill_level) values"
					+ "("
					+ "'"
					+ getEmployeeId()
					+ "','"
					+ getSkillTypeId()
					+ "','" + getSkillLevel() + "'" + ")";
			flag = conn.InsertUpdateDelete(sql);

			if (flag == 1) {
				JOptionPane.showMessageDialog(null, "Successfully created");
			} else {
				JOptionPane.showMessageDialog(null, "YOU ALREADY CREATED");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return flag;
	}

	public int getEmployeeSkillByEmployeeId(int id) {
		int employee_id = 0;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select employee_id from employee_skill where employee_id = '"
					+ id + "'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				employee_id = rst.getInt("employee_id");
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeSkillByEmployeeId  Error");
		}
		return employee_id;
	}
	
	public boolean getEmployeeSkills(int employeeId,int skillTypeId) {
		boolean flag=false;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select * from employee_skill where employee_id = '"
					+ employeeId + "'"+"and skill_type_id='"+skillTypeId+"'";
			rst = conn.GetData(sql);
			while (rst.next()) {
				flag=true;
			}
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeSkillByEmployeeId  Error");
		}
		return flag;
	}

	public void deleteEmployeeSkill(int id) {
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "DELETE from employee_skill WHERE employee_id = '"
					+ id + "'";
			int flagg = conn.InsertUpdateDelete(sql);
			if (flagg == 1) {
				JOptionPane.showMessageDialog(null, "employee skill is Deleted");
			} else {
				JOptionPane.showMessageDialog(null,
						"Please Enter A Valid employee_id");
			}
			conn.CloseConnection();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public List<ArrayList<EmployeeSkill>> getEmployeeSkillById(int employeeId) {
		// TODO Auto-generated method stub
		List<ArrayList<EmployeeSkill>> mainList=new ArrayList<ArrayList<EmployeeSkill>>();		;
		ArrayList<EmployeeSkill> list=null;
		int employee_Id=0;
		int skill_type_id=0;
		String skill_level=null;
		try {
			DatabaseUtils conn = new DatabaseUtils();
			conn.OpenConnection();
			String sql = "Select * from employee_skill where employee_id = '"
					+ employeeId + "'";
			System.out.println(sql);
			rst = conn.GetData(sql);
			//int rowcount=0;
			while (rst.next()) {
				//rowcount=rst.getRow();
				employee_Id = rst.getInt("employee_id");
				skill_type_id=rst.getInt("skill_type_id");
				skill_level=rst.getString("skill_level");
				list=new ArrayList<EmployeeSkill>();
				EmployeeSkill empl_skill=new EmployeeSkill();
				empl_skill.setEmployeeId(employee_Id);
				empl_skill.setSkillTypeId(skill_type_id);
				empl_skill.setSkillLevel(skill_level);
				list.add(empl_skill);
				mainList.add(list);
			}
			//System.out.println("main list"+mainList.size());
			//System.out.println("ROW COUNT:"+rowcount);
			conn.CloseConnection();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e
					+ "\n getEmployeeSkillByEmployeeId  Error");
		}
		return mainList;
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

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSkillTypeId() {
		return skillTypeId;
	}

	public void setSkillTypeId(int skillTypeId) {
		this.skillTypeId = skillTypeId;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	

}
