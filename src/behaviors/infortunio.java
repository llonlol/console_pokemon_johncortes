package behaviors;

import interfaces.iattackbehavior;

public class infortunio implements iattackbehavior{
	private String name="🛐 Infortunio 🛐";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
