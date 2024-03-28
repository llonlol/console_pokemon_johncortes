package abstracts;
import interfaces.iattackbehavior;

public abstract class pokemon {
	public iattackbehavior attackbehavior1;
	public iattackbehavior attackbehavior2;
	public iattackbehavior attackbehavior3;
	public iattackbehavior attackbehavior4;
	public pokemon() {}
	public abstract void display();
	public abstract int hp(int dmg);
	public abstract String image();
	public abstract String name();
	private int val;
	
	public int performattack1(){
		val=attackbehavior1.attack();
		return val;
	}
	public int performattack2(){
		val=attackbehavior2.attack();
		return val;
	}
	public int performattack3(){
		val=attackbehavior3.attack();
		return val;
	}
	public int performattack4(){
		val=attackbehavior4.attack();
		return val;
	}
	
	public void update(String message) {
		System.out.println(message);
	}
	
	
}