package behaviors;

import interfaces.iattackbehavior;

public class bomba_lodo implements iattackbehavior{
	private String name="💩 Bomba Lodo 💩";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
