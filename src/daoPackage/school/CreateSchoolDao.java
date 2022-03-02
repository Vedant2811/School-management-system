package daoPackage.school;

import java.sql.Connection;
import java.sql.PreparedStatement;


import genericPackage.GenericPackage;
import modelPackage.School;

public class CreateSchoolDao {

	public void createSchool(School s) {
		int code=s.getSchoolCode();
		String schoolName=s.getSchoolName();
		String principal=s.getPrincipalName();
		String vicePrincipal=s.getVicePrincipalName();
		
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("insert into schooldata values(?,?,?,?)");
			stmt.setInt(1,code);
			stmt.setString(2,schoolName);
			stmt.setString(3,principal);
			stmt.setString(4,vicePrincipal);
			
			int x=stmt.executeUpdate(); 
			System.out.println(x+"updated");
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
