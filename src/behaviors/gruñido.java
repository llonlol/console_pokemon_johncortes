package behaviors;

import interfaces.iattackbehavior;

public class gruñido implements iattackbehavior{
	private String name="🦷 Gruñido 🦷";
	private int val=10;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
