package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hr?&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		//
		try {
			Class.forName(driver);
			String query = "SELECT * FROM employees INNER JOIN departments ON employees.department_id = departments.department_id;";
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query)) {
				int colNum = getColumnNames(rs);
				if (colNum > 0)
					while (rs.next()) {
						for (int i = 0; i < colNum; i++) {
							if (i + 1 == colNum) {
								System.out.println(rs.getString(i + 1));
							} else {
								System.out.print(rs.getString(i + 1) + ", ");
							}
						}
					}
			} catch (SQLException e) {
				System.out.println(e);
			} // end try catch
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static int getColumnNames(ResultSet rs) throws SQLException {
		int numberOfColumns = 0;
		if (rs != null) {
			// vytvo�� objekt na z�klad� metadat v�sledkov� sady
			ResultSetMetaData rsMetaData = rs.getMetaData();
			// Pomoc� metody getColumn z�sk�te po�et vr�cen�ch sloupc�
			numberOfColumns = rsMetaData.getColumnCount();
			// d� a vyp�e n�zvy sloupc�, indexy sloupc� za��naj�c� od 1
			for (int i = 1; i < numberOfColumns + 1; i++) {
				String columnName = rsMetaData.getColumnName(i);
				System.out.print(columnName + ", ");
			}
		}
		// Um�st� kurzor na nov� ��dek v konzoli
		System.out.println();
		return numberOfColumns;
	}

}
