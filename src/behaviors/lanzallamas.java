package behaviors;

import interfaces.iattackbehavior;

public class lanzallamas implements iattackbehavior{
	private String name="🔥 Lanzallamas 🔥";
	private int val=60;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
