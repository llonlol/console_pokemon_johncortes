package behaviors;

import interfaces.iattackbehavior;

public class rayo implements iattackbehavior{
	private String name="⚡ Rayo ⚡";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
