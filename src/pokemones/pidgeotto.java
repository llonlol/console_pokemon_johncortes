package pokemones;
import abstracts.pokemon;
import behaviors.*;

public class pidgeotto extends pokemon {
	private int hp=200;
	private String name="pidgeotto";
	private String image="⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛⬛⬛⬛🟥🟥🟥🟥🟥⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬛🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬛🟥🟥🟥🟥🟥🟥⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬛⬜⬜⬜⬛🟥🟥🟥🟥⬛⬛🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬛🟥⬛⬜⬛🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥⬛⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬛🟥⬛⬛🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬜⬜⬜⬜\r\n"
			+ "⬛🟥🟥⬛⬛🟥🟥🟥⬛🟥🟥🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥⬛⬜⬜⬜\r\n"
			+ "⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥🟥⬛⬛🟥🟥🟥🟥🟥🟥🟥🟥⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛🟥🟥🟥⬛⬜⬜\r\n"
			+ "⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥🟥🟥⬛⬛🏽🏽🏽🏽🏽🏽🏽🏽🏽⬛⬜⬜⬛⬛🟥🟥⬛⬜\r\n"
			+ "⬛🟥🟥⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥🟥🟥🟥⬛⬛⬛🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽⬛⬜⬜⬜⬛🟥🟥⬛\r\n"
			+ "⬛🟥⬛🟥🟥🟥⬛🟥🟥⬛🟥🟥🟥🟥🟥🟥⬛⬛⬛🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽🏽⬛⬜⬜⬜⬛🟥⬛\r\n"
			+ "⬛🟥⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥🟥🟥⬛⬛⬛⬛⬛⬛⬛🏽🏽🏽🏽🏽🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜⬛⬜\r\n"
			+ "⬛🟥⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥🟥⬛🌫️⬛⬛⬛⬛⬛⬛⬛⬛🏽🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜⬜\r\n"
			+ "⬛🟥⬛🟥🟥⬛🟥🟥⬛🟥🟥🟥🟥⬛🌫️🌫️⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜⬜\r\n"
			+ "⬛⬛🟥🟥⬛🟥🟥🟥⬛🟥🟥🟥⬛🌫️🌫️⬛⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜\r\n"
			+ "⬛⬛🟥🟥⬛🟥🟥⬛🟥🟥🟥🟥⬛🌫️⬛⬛⬛⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜\r\n"
			+ "⬛⬛🟥🟥⬛🟥🟥⬛🟥🟥🟥⬛🌫️🌫️⬛⬛⬜⬛⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜\r\n"
			+ "⬛⬛🟥🟥⬛🟥⬛🟥🟥🟥🟥⬛🌫️🌫️⬛⬛⬜⬜⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼⬛⬜⬜⬜\r\n"
			+ "⬛⬛🟥⬛🟥🟥⬛🟥🟥🟥⬛🌫️🌫️🌫️⬛⬛⬜⬜⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼🏼⬛⬜⬜\r\n"
			+ "⬜⬛🟥⬛🟥🟥⬛🟥🟥🟥⬛🌫️🌫️⬜⬜⬛⬛⬜⬛⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏼⬛⬜⬜\r\n"
			+ "⬜⬛🟥⬛🟥🟥⬛🟥🟥⬛🌫️🌫️⬜⬜⬜⬛⬛⬜⬛⬛🏻🏻🏻⬛⬛⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏼🏽⬛⬜⬜\r\n"
			+ "⬜⬜⬛⬛⬛⬛⬛🟥🟥⬛🌫️🌫️⬜⬜⬜⬜⬛⬛🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛⬛⬛⬛🏼🏼🏼🏽🏽⬛⬜⬜\r\n"
			+ "⬜⬜⬜⬛🏼🏼⬛⬛⬛🏻⬛⬜⬜⬜⬜⬛⬛🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛⬛⬛⬛🏼🏼🏽🏽🏽⬛⬜⬜\r\n"
			+ "⬜⬜⬜⬛🏼🏼🏼🏼⬛⬛🏻⬛⬜⬜⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛⬛🏼🏼🏽🏽🏽⬛⬜⬜⬜\r\n"
			+ "⬜⬜⬛🏼🏼🏼🏼🏼🏼🏼⬛🏻⬛⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛⬛🏼🏽🏽🏽🏽⬛⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛⬛🏼🏽🏽🏽⬛⬜⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛🏼🏽🏽🏽🏽⬛⬜⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛🏽🏽🏽🏽⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬛🏽🏽🏽🏽⬛⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼🏼🏼⬛⬛⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛🏽🏽🏽🏽⬛⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬛🏼🏼🏼🏼🏼🏼🏼🏼⬛⬛🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛🏽🏽🏽⬛⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬛🏼🏼🏼🏼🏼⬛⬛🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛🏽🏽🏽⬛⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬛🏼🏼🏼🏼⬛🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛🏽🏽🏽⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬛🏼🏼🏼⬛🏼🏼🏼🏼🏼🏼⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛🏽🏽🏽⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬛🏼🏼⬛⬛⬛⬛⬛⬛⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛🏽🏽⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬛🏼⬛⬜⬜⬜⬛🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻🏻⬛🏽⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬜⬜⬛⬛🏻🏻🏻🏻🏻🏻🏻🏻⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜\r\n"
			+ "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜";
	public pidgeotto() {
		attackbehavior1=new picotazo();
		attackbehavior2=new remolino();
		attackbehavior3=new tornado();
		attackbehavior4=new ataque_rapido();
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