package daoPackage.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;
import modelPackage.Student;

public class CreateStudentDao {

	public void createStudent(Student s) throws ClassNotFoundException {
		int scholar=s.getScholarNumber();
		String studentName=s.getStudentName();
		String fatherName=s.getFatherName();
		String motherName=s.getMotherName();
		String mobileNumber=s.getMobileNumber();
		String aadharNumber=s.getAadhar();
		String address=s.getAddress();
		int code=s.getClassCode();
		
		 try {
			
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("insert into studentData values(?,?,?,?,?,?,?,?)");
			stmt.setInt(1,scholar);
			stmt.setString(2,studentName);
			stmt.setString(3,fatherName);
			stmt.setString(4,motherName);
			stmt.setString(5,mobileNumber);
			stmt.setString(6,aadharNumber);
			stmt.setString(7,address);
			stmt.setInt(8, code);
			
			int x=stmt.executeUpdate(); 
			System.out.println(x+"updated");
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
