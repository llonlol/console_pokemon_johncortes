package behaviors;

import interfaces.iattackbehavior;

public class ascuas implements iattackbehavior{
	private String name="💢 Ascuas 💢";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
