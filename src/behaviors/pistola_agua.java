package behaviors;

import interfaces.iattackbehavior;

public class pistola_agua implements iattackbehavior{
	private String name="💦 Pistola Agua 💦";
	private int val=10;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
