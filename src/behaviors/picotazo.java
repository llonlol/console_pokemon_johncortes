package behaviors;

import interfaces.iattackbehavior;

public class picotazo implements iattackbehavior{
	private String name="🐦 Picotazo 🐦";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
