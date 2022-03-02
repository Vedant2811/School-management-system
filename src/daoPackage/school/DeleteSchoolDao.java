package daoPackage.school;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;

public class DeleteSchoolDao {

	public void deleteSchool(int schoolCode) {
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("delete from schooldata where SchoolCode=?");
			stmt.setInt(1, schoolCode);
			int x= stmt.executeUpdate();
			System.out.println(x+" updated");
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
