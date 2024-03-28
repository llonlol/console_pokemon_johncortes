package behaviors;
import interfaces.iattackbehavior;

public class remolino implements iattackbehavior{
	private String name="🌪 Remolino 🌪";
	private int val=50;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}