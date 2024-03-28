package behaviors;
import interfaces.iattackbehavior;

public class ataque_rapido implements iattackbehavior {
	private String name="👊 Ataque Rapido 👊";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
