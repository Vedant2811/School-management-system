package daoPackage.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;
import modelPackage.Student;

public class UpdateStudentDao {

	public void updateStudent(Student s) throws ClassNotFoundException {
		
		
		 try {
			
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("update studentData set STUDENTNAME=?,FATHERNAME=?,MOTHERNAME=?,MOBILENUMBER=?,AADHAR=?,ADDRESS=?,CLASSCODE=? where SCHOLARNUMBER");
			
			stmt.setString(1,s.getStudentName());
			stmt.setString(2,s.getFatherName());
			stmt.setString(3,s.getMotherName());
			stmt.setString(4,s.getMobileNumber());
			stmt.setString(5,s.getAadhar());
			stmt.setString(6,s.getAddress());
			stmt.setInt(7, s.getClassCode());
			stmt.setInt(8,s.getScholarNumber());
			
			stmt.executeUpdate();
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
