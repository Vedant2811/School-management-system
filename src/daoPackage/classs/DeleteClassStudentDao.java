package daoPackage.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;

public class DeleteClassStudentDao {

	
	public void deleteClass(int ClassCode) {
		try {
			
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("truncate table studentdata");
			int x= stmt.executeUpdate();
			System.out.println(x+" query updated");
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	
}
