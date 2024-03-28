package behaviors;

import interfaces.iattackbehavior;

public class tacleada implements iattackbehavior{
	private String name="👊 Tacleada 👊";
	private int val=20;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}