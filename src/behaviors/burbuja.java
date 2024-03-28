package behaviors;

import interfaces.iattackbehavior;

public class burbuja implements iattackbehavior{
	private String name="💧 Burbuja 💧";
	private int val=10;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
