package behaviors;

import interfaces.iattackbehavior;

public class latigo_cepa implements iattackbehavior{
	private String name="🌿 Latigo Cepa 🌿";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
