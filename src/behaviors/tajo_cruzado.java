package behaviors;

import interfaces.iattackbehavior;

public class tajo_cruzado implements iattackbehavior{
	private String name="👐 Tajo Cruzado 👐";
	private int val=40;
	public int attack() {
		return val;
	}
	public String getname() {
		return name;
	}
}