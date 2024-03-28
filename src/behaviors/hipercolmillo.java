package behaviors;

import interfaces.iattackbehavior;

public class hipercolmillo implements iattackbehavior{
	private String name="🦷 HiperColmillo 🦷";
	private int val=40;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
