package pokemones;
import abstracts.pokemon;
import behaviors.*;

public class krabby extends pokemon {
	private int hp=300;
	private String image="🦀";
	private String name="krabby";
	public krabby() {
		attackbehavior1=new burbuja();
		attackbehavior2=new rayo_burbuja();
		attackbehavior3=new placaje();
		attackbehavior4=new tajo_cruzado();
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
