package pokemones;
import abstracts.pokemon;
import behaviors.*;

public class charmander extends pokemon {
	private int hp=200;
	private String name="charmander";
	private String image="⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠤⠤⠤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⣤⠞⠉⠀⠀⠀⠀⠀⠀⠈⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢀⣿⠰⣦⠀⠀⠀⠀⠀⠀⢀⣼⢡⠾⣷⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢸⣿⢷⠛⠀⠀⠀⠀⠀⠀⠀⠉⢸⡀⢸⣇⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢸⣿⣾⡆⠀⠀⠀⠀⠀⠀⠀⠀⢸⠿⣿⢹⡀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢸⣏⢉⡇⠀⠀⠀⠀⠀⠀⠀⠀⠸⣦⡤⠞⠃⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⢠⡟⡈⠉⠀⠀⡀⠀⠀⠀⡀⠀⠀⠀⠀⢀⣠⠄⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣤⣀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠸⣇⠙⢶⢤⣄⣁⣀⣀⣈⣁⣤⠤⠔⢾⣽⠁⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⢠⣄⡿⢿⣿⡆⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠙⠦⣜⠛⠳⣄⡀⢀⡼⠟⠛⠛⣶⠞⠁⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⡇⠈⠁⡇⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠈⠙⠒⠤⣭⡟⢒⣒⠒⣋⠁⠀⠀⢸⣅⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡞⠙⠀⠀⠀⣧⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⢀⣠⠴⠚⢩⡇⣠⠿⠛⠧⣄⠀⠀⠀⠀⠀⠉⠙⠲⢤⣀⡀⠀⣀⡀⠀⠀⠀⢠⡾⠁⠀⠀⠀⠀⢸⠀⠀\r\n"
			+ "⢠⣴⣶⣾⠶⠚⠁⠀⠀⠀⢸⡼⠁⠀⠀⠀⠈⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠉⠋⢻⣷⡶⠀⠀⡟⠀⠀⠀⠀⠀⣠⣿⣇⡀\r\n"
			+ "⠈⠻⢿⡀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⢠⣿⣆⣨⣿⡆⠀⠀⢻⡄⠀⠀⠀⠀⠈⠛⣹⠁\r\n"
			+ "⠀⠀⢾⠽⠒⠒⠒⠒⠒⠒⡇⠀⠀⠀⠀⠀⠀⠀⠀⠸⡍⠓⠒⢶⡒⠒⠒⠚⠉⠁⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⣠⠞⠉⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣳⠶⡞⠃⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⢠⡇⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⣠⠾⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡷⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⣼⠁⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⣴⠋⠁⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠏⠀⠀⠀⠀⠀⠘⣧⣤⣤⣤⠴⠚⠉⠀⢀⣾⡏⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⢀⡴⢫⡞⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠙⠶⣄⡀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⡇⢀⣀⡤⠖⢋⡴⠋⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠘⣆⡀⠀⠀⠀⠀⢀⣤⡤⠟⠓⠒⠲⠤⠤⢿⣄⠀⠀⠀⠀⠀⠀⣏⣩⡤⠴⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⢠⣴⣿⣍⣻⠀⠀⠀⠀⣨⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠻⠿⢵⡿⠽⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⡤⢤⡶⢿⡽⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⡀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣙⣳⣿⣛⣙⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
	
	public charmander() {
		attackbehavior1=new lanzallamas();
		attackbehavior2=new gruñido();
		attackbehavior3=new arañazo();
		attackbehavior4=new ascuas();
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
