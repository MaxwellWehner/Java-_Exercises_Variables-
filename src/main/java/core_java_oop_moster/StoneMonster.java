package core_java_oop_moster;

public class StoneMonster extends Monster{
	public StoneMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String attack() {
		String str = "Attack with stones!";
		return str;
	}
}
