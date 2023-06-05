package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;

import dao.DatabaseUtils;

/**
*
* @author Yuzana Zaw Zaw
*/
public class CVFormDownload {
	private int employee_id;
	public CVFormDownload(int employeeId) {
		this.employee_id = employeeId;
		initComponents();
	}

	public CVFormDownload() {
		initComponents();
	}

	private void initComponents() {
		// Blank Document
		XWPFDocument document = new XWPFDocument();
		// ------------output file--------//
		XWPFParagraph paragraph2 = document.createParagraph();
		XWPFRun run2 = paragraph2.createRun();
		paragraph2.setAlignment(ParagraphAlignment.RIGHT);

		// create Paragraph
		XWPFParagraph paragraph1 = document.createParagraph();
		paragraph1.setAlignment(ParagraphAlignment.RIGHT);
		XWPFRun run1 = paragraph1.createRun();
		run1.setText("Profile Photo");

		// ------------for employee profile image---------//
		String image_Path = null;
		EmployeeImage emplImage = new EmployeeImage();

		System.out.println("EMPLOYEE ID:::+" + employee_id);
		image_Path = emplImage.getImagePathById(employee_id);
		File image = new File(image_Path);
		FileInputStream imageData;
		try {
			imageData = new FileInputStream(image);
			int imageType = XWPFDocument.PICTURE_TYPE_JPEG;
			String imageFileName = image.getName();
			int width = 100;
			int height = 100;
			run2.addPicture(imageData, imageType, imageFileName,
					Units.toEMU(width), Units.toEMU(height));

		} catch (InvalidFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		DatabaseUtils conn = new DatabaseUtils();
		conn.OpenConnection();
		String mainSql = "Select * from employee where employee_id = '"
				+ employee_id + "'";
		ResultSet rst = conn.GetData(mainSql);
		String name = null;
		String firstName = null;
		String lastName = null;
		String fatherName = null;
		String phoneNo = null;
		String email = null;
		String birthDate = null;
		String nrc = null;
		String gender = null;
		String address = null;
		String qualification = null;
		String uniName = null;
		try {
			while (rst.next()) {
				firstName = rst.getString("first_name");
				lastName = rst.getString("last_name");
				name = firstName + " " + lastName;
				fatherName = rst.getString("father_name");
				phoneNo = rst.getString("phone_no");
				email = rst.getString("email");
				birthDate = rst.getString("birth_date");
				nrc = rst.getString("nrc");
				gender = rst.getString("gender");
				address = rst.getString("address");
				qualification = rst.getString("qualification");
				uniName = rst.getString("university_name");
			}
			conn.CloseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream out;
		try {
			out = new FileOutputStream("output/" + name + "_" + "CVForm"
					+ ".docx");
			XWPFTable table = document.createTable();
			// table.setWidth(100);
			table.setCellMargins(10, 10, 10, 10);
			table.setTableAlignment(TableRowAlign.CENTER);

			XWPFTableRow tableRowZero = table.getRow(0);
			tableRowZero.getCell(0).setText("");
			tableRowZero.addNewTableCell().setText("Employee Information");
			tableRowZero.setHeight(10);

			XWPFTableRow tableRowOne = table.createRow();
			tableRowOne.getCell(0).setText("Name");
			tableRowOne.addNewTableCell().setText(name);

			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText("Father Name");
			tableRowTwo.addNewTableCell().setText(fatherName);

			XWPFTableRow tableRowThree = table.createRow();
			tableRowThree.getCell(0).setText("Phone Number");
			tableRowThree.addNewTableCell().setText(phoneNo);

			XWPFTableRow tableRowFour = table.createRow();
			tableRowFour.getCell(0).setText("Email");
			tableRowFour.addNewTableCell().setText(email);

			XWPFTableRow tableRowFive = table.createRow();
			tableRowFive.getCell(0).setText("Birth Date");
			tableRowFive.addNewTableCell().setText(birthDate);

			XWPFTableRow tableRowSix = table.createRow();
			tableRowSix.getCell(0).setText("NRC");
			tableRowSix.addNewTableCell().setText(nrc);

			XWPFTableRow tableRowSeven = table.createRow();
			tableRowSeven.getCell(0).setText("GENDER");
			tableRowSeven.addNewTableCell().setText(gender);

			XWPFTableRow tableRowEight = table.createRow();
			tableRowEight.getCell(0).setText("Address");
			tableRowEight.addNewTableCell().setText(address);

			XWPFTableRow tableRowNine = table.createRow();
			tableRowNine.getCell(0).setText("Qualification");
			tableRowNine.addNewTableCell().setText(qualification);

			XWPFTableRow tableRowTen = table.createRow();
			tableRowTen.getCell(0).setText("University Name");
			tableRowTen.addNewTableCell().setText(uniName);

			// ----------for employee skill---------//
			ArrayList<String> skillType = new ArrayList<String>();
			// Write the Document in file system
			DatabaseUtils conn1 = new DatabaseUtils();
			conn1.OpenConnection();
			String sql = "select e.*,s.*,t.* "
					+ "from employee e,employee_skill s ,skill_type t "
					+ "where e.employee_id=s.employee_id "
					+ "and s.skill_type_id=t.skill_type_id "
					+ "and e.employee_id='" + employee_id + "'";
			ResultSet rest = conn.GetData(sql);
			String skill_type = null;

			XWPFTableRow tableSkill = table.createRow();
			tableSkill.getCell(0).setText("Skills");

			try {
				while (rest.next()) {
					skill_type = rest.getString("description");
					skillType.add(skill_type);
				}
				conn1.CloseConnection();
				// create table row
				tableSkill.addNewTableCell().setText(skillType.toString());
				document.write(out);
				out.close();
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("create_table.docx written successully");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		new CVFormDownload();
	}
}
