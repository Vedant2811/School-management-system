package daoPackage.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;



public class DeleteStudentDao {

	public void deleteStudent(int scholar) {
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("delete from studentdata where ScholarNumber=?");
			stmt.setInt(1, scholar);
			int x= stmt.executeUpdate();
			System.out.println(x+" updated");
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void deleteStudentClassCode(int ClassCode) {
		
		try {
		
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("delete from studentdata where ClassCode=?");
			stmt.setInt(1, ClassCode);
			int x= stmt.executeUpdate();
			System.out.println(x+" updated");
			con.close();
		
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		
		}

	}
	
	
}
