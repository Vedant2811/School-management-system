package daoPackage.extra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import genericPackage.GenericPackage;
import modelPackage.NewAccount;

public class ForgotCredentialDao {

	public List<NewAccount> getDataByMobileNumber(String mobile) {
		
		List<NewAccount> list=new ArrayList<NewAccount>();
		
		try {
			
			Connection con=GenericPackage.getConnectionData();
			PreparedStatement stmt = con.prepareStatement("select * from username_password where mobile_number=?");
			stmt.setString(1, mobile);
			ResultSet rst=stmt.executeQuery();
			while (rst.next()) {
				String s1=rst.getString(1);
				String s2=rst.getString(2);
				String s3=rst.getString(3);
				String s4=rst.getString(4);
				
				NewAccount a=new NewAccount();
				
				a.setUsername(s1);
				a.setPassword(s2);
				a.setName(s3);
				a.setMobieNumber(s4);
				
				list.add(a);
				
				/*
				 * System.out.print(s1+"  "); System.out.print(s2+"  ");
				 * System.out.print(s3+"  "); System.out.print(s4+"  "); System.out.print("\n");
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
