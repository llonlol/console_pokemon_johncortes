package behaviors;

import interfaces.iattackbehavior;

public class tornado implements iattackbehavior{
	private String name="🌪 Tornado 🌪";
	private int val=60;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}