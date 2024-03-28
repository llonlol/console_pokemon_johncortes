package pokemones;
import abstracts.pokemon;
import behaviors.*;

public class muk extends pokemon {
	private int hp=300;
	private String name="muk";
	private String image="⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛🏻🏻🏻🏻⬛⬛⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟪🏻🏻🏻🏻🏻🏻🏻🏻⬛⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🏻🟪🏻🏻🏻🏻🏻🏻🏻🏻⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🏻🏻🏻🏻🟪🟪🏻🏻🏻⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🏻🏻⬛⬛🏻🏻🟪🏻🏻⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬛⬛⬜⬛🏻🏻🏻🏻🏻⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬛⬛🏻🏻🏻🏻⬛⬜⬜⬜⬛🟪🏻🏻🟪🟪🟪⬛⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬛🏻🏻🏻🏻🏻🏻🏻⬛⬛⬜⬜⬛🟪🟪🟪🟪🏻⬛⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬛🏻🏻🏻🏻🏻🏻🏻🏻🟪🟪⬛⬛⬛🏻🏻🏻🏻🏻🟪⬛⬜⬜⬜\r\n"
			+ "⬜⬛🟪🏻🏻🏻🟪🏻🏻🟪⬛🟪🟪🏻🟪🟪⬛🏻🏻🏻🟪🟪⬛⬜⬜⬜\r\n"
			+ "⬜⬛🟪🟪🏻⬛🏻🟪⬛⬜🟪🟪🏻🏻🟪🟪⬛🟪🟪🟪🟪🏻⬛⬜⬜⬜\r\n"
			+ "⬛🏻🏻🟪🟪⬛⬛⬛⬜⬜🟪🏻🏻🟪🟪🟪⬛🟪🏻🏻🏻⬛⬜⬜⬜⬜\r\n"
			+ "⬛🟪🏻🏻🏻🏻🏻🏻🏻🏻🏻🟪⬛🟪🟪⬛🟪🟪🟪🟪🟪⬛⬛⬜⬜⬜\r\n"
			+ "⬜⬛🟪🏻🏻🏻🟪⬛⬛🟪🟪🟪⬛⬛🟪⬛🟪🟪🟪🟪🟪⬛🟪⬛⬛⬜\r\n"
			+ "⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛🏻⬛⬛🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪⬛\r\n"
			+ "⬜⬛🏻🟪⬛⬛⬛🌫️🌫️⬛🟪⬛⬛🏻🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪⬛⬛\r\n"
			+ "⬛🏻🏻⬛⬛⬛🌫️🌫️⬛⬛🏻🟪🏻🏻🟪🟪⬛⬛🟪🟪🟪⬛🟪⬛⬛⬜\r\n"
			+ "⬛🟪🏻🏻⬛⬛⬛⬛🟪🏻🏻🏻🏻🏻🟪⬛🟪🟪🟪🟪🟪🟪⬛⬜⬜⬜\r\n"
			+ "⬜⬛⬛🏻🏻🏻🏻🏻🏻⬛⬛🏻🏻🟪🟪🟪🟪🟪🟪⬛🟪🟪🟪⬛⬜⬜\r\n"
			+ "⬜⬛🏻⬛⬛⬛🏻🏻⬛🟪🟪⬛🟪🟪🟪⬛⬛⬛⬛🟪🟪🟪⬛⬛⬜⬜\r\n"
			+ "⬜⬜⬛⬛🟪🟪⬛⬛🟪🟪🟪🟪🟪🟪⬛⬛🟪🟪⬛⬛⬛⬛⬛⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬛⬛🟪🟪⬛⬛⬛🟪⬛⬛⬛🟪🟪⬛⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬛🟪🟪🟪⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜";
	public muk() {
		attackbehavior1=new lodo();
		attackbehavior2=new bomba_lodo();
		attackbehavior3=new ataque_acido();
		attackbehavior4=new infortunio();
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
