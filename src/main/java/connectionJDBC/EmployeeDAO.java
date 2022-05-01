package connectionJDBC;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet resultSet = null;

	public EmployeeDAO() {

	}

	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = FactoryConnection.getInstance().getConnection();
		return conn;
	}

	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel employee = new EmployeeModel();

		try {

			String queryString = " SELECT * FROM employees";
			connection = getConnection();
			ps = connection.prepareStatement(queryString);

			resultSet = ps.executeQuery();

			while (resultSet.next()) {
				System.out.println("EmployeeNumber: " + resultSet.getInt("employeeNumber") + " First name "
						+ resultSet.getString("firstName") + " Last name " + resultSet.getString("lastName")
						+ " Job title " + resultSet.getString("jobTitle"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;

	}

	public void instertEmployee(EmployeeModel employee) {

		try {

			String queryString = "INSERT INTO employees(employeeNumber, lastName, firstName, extension, jobTitle, email, officeCode)"
					+ "VALUES(?,?,?,?,?,?,?);";
			connection = getConnection();
			ps = connection.prepareStatement(queryString);
			ps.setInt(1, employee.getEmployeeNumber());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getFirstName());
			ps.setString(4, employee.getExtention());
			ps.setString(5, employee.getJobTitle());
			ps.setString(6, employee.getEmail());
			ps.setString(7, employee.getOfficeCode());

			ps.execute();

			System.out.format("Added %s with id: %d\n", employee.getFirstName(), employee.getEmployeeNumber());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
