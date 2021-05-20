import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// executing queries with 'statement.executeQuery'
public class JDBCDemo_Select {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "basketball8");
			
			// Create a SQL Statement Object to send to the database
			Statement statement = conn.createStatement();
			
			// Execute the Statement Object
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			
			// Process the result
			int salaryTotal = 0;
			String companyEmployees = "";
			while (resultSet.next()) {
				salaryTotal += resultSet.getInt("salary");
				companyEmployees += resultSet.getString("name") + ", ";
			}
			System.out.println("Total Salary: $" + salaryTotal);
			System.out.println("Company Employees: " + companyEmployees.substring(0, companyEmployees.length() - 2));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
