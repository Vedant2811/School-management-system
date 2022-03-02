package daoPackage.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;

public class DeleteClassDao {

	public int deleteClass(int ClassCode) {
		try {
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("delete from classdata where ClassCode=?");
			stmt.setInt(1, ClassCode);
			int x= stmt.executeUpdate();
			System.out.println(x+" query updated");
			con.close();
			return 0;
		}
		catch (Exception e) {
			System.out.println("Something is going on...");
			return 1;
		}
	
	}

	
}
