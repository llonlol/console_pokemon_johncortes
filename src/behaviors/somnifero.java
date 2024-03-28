package behaviors;

import interfaces.iattackbehavior;

public class somnifero implements iattackbehavior{
	private String name="😴 Somnifero 😴";
	private int val=10;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}