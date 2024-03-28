package pokemones;
import abstracts.pokemon;
import behaviors.*;

public class kingler extends pokemon {
	private int hp=230;
	private String image="🦀";
	private String name="kingler";
	public kingler() {
		attackbehavior1=new hidropulso();
		attackbehavior2=new rayo_burbuja();
		attackbehavior3=new rayo();
		attackbehavior4=new placaje();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	public int hp(int dmg) {
		if (hp <= 0){
			return 0;
		}
		else {
			hp=hp-dmg;
			return hp;
		}
	}
	
	public String image() {
		return image;
	}
	public String name() {
		return name;
	}
}
