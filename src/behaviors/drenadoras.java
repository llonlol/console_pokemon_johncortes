package behaviors;
import interfaces.iattackbehavior;

public class drenadoras implements iattackbehavior {
	private String name="💧 Drenadoras 💧";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
