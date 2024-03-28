package behaviors;
import interfaces.iattackbehavior;

public class impactrueno implements iattackbehavior{
	private String name="⚡ Impactrueno ⚡";
	private int val=60;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
