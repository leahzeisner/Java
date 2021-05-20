import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//executing queries & updating data with 'statement.executeUpdate' to INSERT data
public class JDBCDemo_Insert {

	public static void main(String[] args) {
		
String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		int rowsAffected;
		
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "basketball8");
			
			// Create a SQL Statement Object to send to the database
			Statement statement = conn.createStatement();
			
			// Execute the Statement Object
			rowsAffected = statement.executeUpdate("insert into employees_tbl (id, name, dept, salary) "
					+ "values (1000, 'Leah', 'IT', 6000);");
			
			// Process the result
			System.out.println("Executed an 'Insert' statement - Rows Affected: " + rowsAffected);
			
		} catch (SQLException e) {
			System.out.println("Error while attempting insertion.");
		}
		


	}

}
