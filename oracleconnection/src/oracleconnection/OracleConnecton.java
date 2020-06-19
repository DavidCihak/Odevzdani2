package oracleconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class OracleConnecton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleDataSource ods;
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:orcluser/jdbcuser@localhost:1521/xepdb1");
			Connection conn = ods.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("Select last_name, first_name from employees");
			// Iterate through the result and print the employee last and first names
			while (rset.next()) {
				System.out.println(rset.getString(1) + "-" + rset.getString(2));
			} // end while
			rset.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
