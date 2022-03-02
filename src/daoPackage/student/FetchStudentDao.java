 package daoPackage.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import genericPackage.GenericPackage;
import modelPackage.Student;



public class FetchStudentDao {

	public Student getStudentByScholarNumber(int scholarNumber) {
		
		Student s=new Student();
		
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("select * from studentdata where ScholarNumber=?");
			stmt.setInt(1, scholarNumber);
			ResultSet rst=stmt.executeQuery();
			while (rst.next()) {

			
			
			s.setScholarNumber(rst.getInt(1));
			s.setStudentName(rst.getString(2));
			s.setFatherName(rst.getString(3));
			s.setMotherName(rst.getString(4));
			s.setMobileNumber(rst.getString(5));
			s.setAadhar(rst.getString(6));
			s.setAddress(rst.getString(7));
			s.setClassCode(rst.getInt(8));
			
		
			
			
			
				
			}
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}
	
}
