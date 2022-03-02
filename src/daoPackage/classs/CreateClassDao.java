package daoPackage.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;
import modelPackage.Class;


public class CreateClassDao {

	public void createClass(Class c) {
		int code=c.getClassCode();
		String className=c.getClassName();
		String section=c.getSection();
		String classTeacher=c.getClassTeacher();
		String coClassTeacher=c.getCoClassTeacher();
		int sCode=c.getSchoolCode();
		
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("insert into classData values(?,?,?,?,?,?)");
			stmt.setInt(1,code);
			stmt.setString(2,className);
			stmt.setString(3,section);
			stmt.setString(4,classTeacher);
			stmt.setString(5,coClassTeacher);
			stmt.setInt(6,sCode);
			
			int x=stmt.executeUpdate(); 
			System.out.println(x+"updated");
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
