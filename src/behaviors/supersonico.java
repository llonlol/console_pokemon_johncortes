package behaviors;
import interfaces.iattackbehavior;

public class supersonico implements iattackbehavior{
	private String name="👂 SuperSonico 👂";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}