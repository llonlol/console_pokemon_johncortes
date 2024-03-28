package behaviors;

import interfaces.iattackbehavior;

public class hidropulso implements iattackbehavior{
	private String name="🌊 Hidropulso 🌊";
	private int val=50;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
