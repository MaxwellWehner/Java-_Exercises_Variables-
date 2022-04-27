package core_java_oop_moster;

public class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String attack() {
		String str = "Attack with fire!";
		return str;
	}
}
