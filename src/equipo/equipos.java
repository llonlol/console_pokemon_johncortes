package equipo;

import java.util.ArrayList;
import java.util.List;
import abstracts.pokemon;

public class equipos {
	private List<pokemon> equipo = new ArrayList<>();	
	
	public void attachpokemon(pokemon lacriatura) {
		this.equipo.add(lacriatura);
	}
	public void detachpokemon(pokemon lacriatura) {
		this.equipo.remove(lacriatura);
	}
	public int countpokemon() {
		return this.equipo.size();
	}
	public void emptypokemon() {
		this.equipo.clear();
	}
	
	public pokemon get(int r) {
		pokemon p=equipo.get(r);
		return p;
	}
	
	public void notifyequipo(String message) {
		for(pokemon lacriatura: this.equipo) {
			lacriatura.update(lacriatura.name()+message);
		}
	}
	
	public void notifyhp() {
		for(pokemon lacriatura: this.equipo) {
			lacriatura.update(lacriatura.name()+" tiene "+lacriatura.hp(0)+" puntos de vida ");
		}
	}
	
	
}