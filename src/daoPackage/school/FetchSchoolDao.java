package daoPackage.school;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import genericPackage.GenericPackage;
import modelPackage.Class;

public class FetchSchoolDao {

	public List<Class> getClassBySchoolCode(int schoolCode) {
		
		List<Class> list=new ArrayList<Class>();
		
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("select * from Classdata where SchoolCode=?");
			stmt.setInt(1, schoolCode);
			ResultSet rst=stmt.executeQuery();
			while (rst.next()) {
				
				Class c=new Class();
				
				c.setClassCode(rst.getInt(1));
				c.setClassName(rst.getString(2));
				c.setSection(rst.getString(3));
				c.setClassTeacher(rst.getString(4));
				c.setCoClassTeacher(rst.getString(5));
				c.setSchoolCode(rst.getInt(6));
				
				
				
				list.add(c);
				
				/*
				 * System.out.print(rst.getString(1)); System.out.print(rst.getString(2));
				 * System.out.print(rst.getString(3)); System.out.print(rst.getString(4));
				 * System.out.print(rst.getString(5)); System.out.print(rst.getString(6));
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
