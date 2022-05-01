package connectionJDBC;

public class Main {

	public static void main(String[] args) {
		EmployeeDAO employeeOne = new EmployeeDAO();
		EmployeeModel employeeModelOne = new EmployeeModel(55566, "Max", "Wehner", "software dev", "x6100", "max@gmail.com", "1");

//		System.out.println(employeeOne.getEmployeeById(1));
		employeeOne.instertEmployee(employeeModelOne);
		employeeOne.getEmployeeById(1);
	}

}
