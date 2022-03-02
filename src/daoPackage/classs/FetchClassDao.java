package daoPackage.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import genericPackage.GenericPackage;
import modelPackage.Student;



public class FetchClassDao {

	public List<Student> getStudentByClassCode(int classCode) {
		
		List<Student> list=new ArrayList<Student>();
		
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("select * from studentdata where CLASSCODE=?");
			stmt.setInt(1, classCode);
			ResultSet rst=stmt.executeQuery();
			while (rst.next()) {
				
				Student s=new Student();
				s.setScholarNumber(rst.getInt(1));
				s.setStudentName(rst.getString(2));
				s.setFatherName(rst.getString(3));
				s.setMotherName(rst.getString(4));
				s.setMobileNumber(rst.getString(5));
				s.setAadhar(rst.getString(6));
				s.setAddress(rst.getString(7));
				s.setClassCode(rst.getInt(8));
				
			
				
				
				list.add(s);
				
				/*
				 * System.out.print(rst.getString(1)); System.out.print(rst.getString(2));
				 * System.out.print(rst.getString(3)); System.out.print(rst.getString(4));
				 * System.out.print(rst.getString(5)); System.out.print(rst.getString(6));
				 * System.out.print(rst.getString(7)); System.out.print(rst.getString(8));
				 * System.out.print("\n");
				 */

			}
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
}
