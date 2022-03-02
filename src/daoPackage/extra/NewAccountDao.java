package daoPackage.extra;

import java.sql.Connection;
import java.sql.PreparedStatement;

import genericPackage.GenericPackage;
import modelPackage.NewAccount;

public class NewAccountDao {
	
	public void createNewAccount(NewAccount a) throws ClassNotFoundException {
		String username=a.getUsername();
		String password=a.getPassword();
		String name=a.getName();
		String mobile=a.getMobieNumber();
		
		 try {
			
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("insert into username_password values(?,?,?,?)");
			stmt.setString(1,username);
			stmt.setString(2,password);
			stmt.setString(3,name);
			stmt.setString(4,mobile);
			
			int x=stmt.executeUpdate(); 
			System.out.println(x+"updated");
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
