package behaviors;
import interfaces.iattackbehavior;

public class placaje implements iattackbehavior{
	private String name="👊 Placaje 👊";
	private int val=40;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
