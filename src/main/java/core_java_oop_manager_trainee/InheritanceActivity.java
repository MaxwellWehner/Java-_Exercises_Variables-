package core_java_oop_manager_trainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		Employee manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		manager1.calculateSalary();
		manager1.calculateTransportAllowance();
		
		Employee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trainee1.calculateSalary();
		trainee1.calculateTransportAllowance();
	}

}
