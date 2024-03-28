package behaviors;

import interfaces.iattackbehavior;

public class lodo implements iattackbehavior{
	private String name="💩 Lodo 💩";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
