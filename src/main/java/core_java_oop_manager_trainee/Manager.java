package core_java_oop_manager_trainee;

public class Manager extends Employee {

	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = .15 * basicSalary;
		System.out.println(transportAllowance);
	}
}
