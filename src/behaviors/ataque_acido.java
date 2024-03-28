package behaviors;

import interfaces.iattackbehavior;

public class ataque_acido implements iattackbehavior{
	private String name="☣ Ataque Acido ☣";
	private int val=40;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
