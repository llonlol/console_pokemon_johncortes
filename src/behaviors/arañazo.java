package behaviors;

import interfaces.iattackbehavior;

public class arañazo implements iattackbehavior{
	private String name="💢 Arañazo 💢";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
