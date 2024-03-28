package behaviors;

import interfaces.iattackbehavior;

public class rayo_burbuja implements iattackbehavior{
	private String name="💧 Rayo Burbuja 💧";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
