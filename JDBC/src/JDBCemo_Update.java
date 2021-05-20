import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//executing queries & updating data with 'statement.executeUpdate' to UPDATE existing data
public class JDBCemo_Update {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

		int rowsAffected;

		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "basketball8");

			// Create a SQL Statement Object to send to the database
			Statement statement = conn.createStatement();

			// Execute the Statement Object
			rowsAffected = statement.executeUpdate("update employees_tbl set salary=5900 where id=700");

			// Process the result
			System.out.println("Executed an 'Update' statement - Rows Affected: " + rowsAffected);

		} catch (SQLException e) {
			System.out.println("Error while attempting to update.");
		}

	}

}
