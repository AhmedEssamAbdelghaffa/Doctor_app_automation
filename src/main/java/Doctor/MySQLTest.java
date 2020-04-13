package Doctor;

import java.sql.*;

public class MySQLTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = DriverManager.getConnection("jdbc:mysql://46.165.222.177:3306/verification", "root" , "Cv5cLuIxncz7POAs");
			System.out.println("Database connection successful!\n");
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select *from verification_code order by id DESC LIMIT 1,1;");
			System.out.println(myRs.getString("code"));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}


}
