package behaviors;

import interfaces.iattackbehavior;

public class golpe_cabeza implements iattackbehavior{
	private String name="👊 Golpe Cabeza 👊";
	private int val=30;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}
