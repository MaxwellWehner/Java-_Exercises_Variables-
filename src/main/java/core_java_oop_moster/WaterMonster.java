package core_java_oop_moster;

public class WaterMonster extends Monster{
	public WaterMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String attack() {
		String str = "Attack with water!";
		return str;
	}
}
