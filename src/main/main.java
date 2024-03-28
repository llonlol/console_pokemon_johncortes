package main;

import java.util.Iterator;
import java.util.Scanner;
import abstracts.pokemon;
import pokemones.*;
import equipo.*;

public class main {
	public static Scanner scanner = new Scanner(System.in); 
	public static int select = -1;
	public static int mode=0;
	public static int cant=0;

	public static pokemon bulbasaur=new bulbasaur();
	public static pokemon caterpie=new caterpie();
	public static pokemon charmander=new charmander();
	public static pokemon kingler=new kingler();
	public static pokemon krabby=new krabby();
	public static pokemon muk=new muk();
	public static pokemon pidgeotto=new pidgeotto();
	public static pokemon pikachu=new pikachu();
	public static pokemon raticate=new raticate();
	public static pokemon squirtle=new squirtle();

	public static equipos equipo1=new equipos();
	public static equipos equipo2=new equipos();
	public static equipos todos=new equipos();

	public static int size1,size2;

	public static int hp1=1,hp2=1,hp3=1,hp4=1,hp5=1,hp6=1;
	public static int hpt1,hpt2;

	public static void main(String[] args) {
		
		/////////////////1. declaracion de variables y creacion de objetos////////////
		todos.attachpokemon(bulbasaur);
		todos.attachpokemon(caterpie);
		todos.attachpokemon(charmander);
		todos.attachpokemon(kingler);
		todos.attachpokemon(krabby);
		todos.attachpokemon(muk);
		todos.attachpokemon(pidgeotto);
		todos.attachpokemon(pikachu);
		todos.attachpokemon(raticate);
		todos.attachpokemon(squirtle);

		/////////////////2. menu de seleccion contra jugador/maquina////////////

		while(select != 0){
			System.out.println("POKEMON DE CONSOLA: "); 
			System.out.println("bienvenido al glorioso torneo pokemon ");
			System.out.println("¿que deseas hacer?:\n1.- luchar contra otro jugador" +
					"\n2.-luchar contra la maquina\n" +
					"0.- salir");

			select = Integer.parseInt(scanner.nextLine()); 
			switch(select){
			case 1: 
				mode=1;
				select=0;
				break;
			case 2: 
				mode=2;
				select=0;
				break;
			case 0: 
				System.out.println("adios ten unas buenas poketardes!");
				System.exit(0);
			default:
				System.out.println("número no reconocido");
				break;
			}
		}

		/////////////////3. menu de seleccion de pokemones jugador 1////////////

		select=-1;
		while(select != 0 && cant<3){
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("grandioso! la arena es el crisol de fuego donde los verdaderos entrenadores son forjados");
			System.out.println("elige tu equipo JUGADOR 1:\n1.- bulbasaur" +
					"\n2.-caterpie" +
					"\n3.-charmander" +
					"\n4.-kingler" +
					"\n5.-krabby" +
					"\n6.-muk" +
					"\n7.-pidgeotto" +
					"\n8.-pikachu" +
					"\n9.-raticate" +
					"\n10.-squirtle" +
					"\n11.-pokemon aleatorio");
			System.out.println("vas "+equipo1.countpokemon()+" pokemones, necesitas 3 para pelear");
			System.out.println("-----------------------------------------------------------------------");

			select = Integer.parseInt(scanner.nextLine()); 
			switch(select){
			case 1: 
				equipo1.attachpokemon(bulbasaur);
				cant+=1;
				break;
			case 2: 
				equipo1.attachpokemon(caterpie);
				cant+=1;
				break;
			case 3: 
				equipo1.attachpokemon(charmander);
				cant+=1;
				break;
			case 4: 
				equipo1.attachpokemon(kingler);
				cant+=1;
				break;
			case 5: 
				equipo1.attachpokemon(krabby);
				cant+=1;
				break;
			case 6: 
				equipo1.attachpokemon(muk);
				cant+=1;
				break;
			case 7: 
				equipo1.attachpokemon(pidgeotto);
				cant+=1;
				break;
			case 8: 
				equipo1.attachpokemon(pikachu);
				cant+=1;
				break;
			case 9: 
				equipo1.attachpokemon(raticate);
				cant+=1;
				break;
			case 10: 
				equipo1.attachpokemon(squirtle);
				cant+=1;
				break;
			case 11: 
				int r=(int)Math.floor(Math.random()*10);
				equipo1.attachpokemon(todos.get(r));
				cant+=1;
				break;
			default:
				System.out.println("número no reconocido");
				break;
			}
		}

		/////////////////4. menu de seleccion de pokemones jugador 2 o maquina////////////

		select=-1;
		cant=0;
		if(mode==1) {
			while(select != 0 && cant<3){
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("la arena es la gran redentora, el unico lugar donde todos comparten el mismo rango");
				System.out.println("JUGADOR 2, elige tu equipo:\n1.- bulbasaur" +
						"\n2.-caterpie" +
						"\n3.-charmander" +
						"\n4.-kingler" +
						"\n5.-krabby" +
						"\n6.-muk" +
						"\n7.-pidgeotto" +
						"\n8.-pikachu" +
						"\n9.-raticate" +
						"\n10.-squirtle" +
						"\n11.-pokemon aleatorio");

				System.out.println("vas "+equipo2.countpokemon()+" pokemones, necesitas 3 para pelear");
				System.out.println("-----------------------------------------------------------------------");

				select = Integer.parseInt(scanner.nextLine()); 
				switch(select){
				case 1: 
					equipo2.attachpokemon(bulbasaur);
					cant+=1;
					break;
				case 2: 
					equipo2.attachpokemon(caterpie);
					cant+=1;
					break;
				case 3: 
					equipo2.attachpokemon(charmander);
					cant+=1;
					break;
				case 4: 
					equipo2.attachpokemon(kingler);
					cant+=1;
					break;
				case 5: 
					equipo2.attachpokemon(krabby);
					cant+=1;
					break;
				case 6: 
					equipo2.attachpokemon(muk);
					cant+=1;
					break;
				case 7: 
					equipo2.attachpokemon(pidgeotto);
					cant+=1;
					break;
				case 8: 
					equipo2.attachpokemon(pikachu);
					cant+=1;
					break;
				case 9: 
					equipo2.attachpokemon(raticate);
					cant+=1;
					break;
				case 10: 
					equipo2.attachpokemon(squirtle);
					cant+=1;
					break;
				case 11: 
					int r=(int)Math.floor(Math.random()*10);
					equipo2.attachpokemon(todos.get(r));
					cant+=1;
					break;
				default:
					System.out.println("número no reconocido");
					break;
				}
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("EQUIPO 1:");
			equipo1.notifyequipo(" está listo para la batalla");
			System.out.println("vs");
			System.out.println("EQUIPO 2:");
			equipo2.notifyequipo(" está listo para la batalla");
			System.out.println("-----------------------------------------------------------------------");

		}

		if(mode==2) {
			int r=(int)Math.floor(Math.random()*10);
			equipo2.attachpokemon(todos.get(r));
			int r2=(int)Math.floor(Math.random()*10);
			equipo2.attachpokemon(todos.get(r2));
			int r3=(int)Math.floor(Math.random()*10);
			equipo2.attachpokemon(todos.get(r3));

			System.out.println("-----------------------------------------------------------------------");
			System.out.println("EQUIPO 1:");
			equipo1.notifyequipo(" está listo para la batalla");
			System.out.println("vs");
			System.out.println("EQUIPO 2:");
			equipo2.notifyequipo(" está listo para la batalla");
			System.out.println("-----------------------------------------------------------------------");

		}

		/////////////////5. inicializar vida de los pokemones////////////

		size1=equipo1.countpokemon();
		size2=equipo2.countpokemon();
		inicializarhp();

		/////////////////6. sistema de pelea////////////

		select=-1;
		int turno=1; 
		int daño=0;
		int p=-1;
		String name=" ";
		int wtf=1;
		while((hp1+hp2+hp3>=0) && (hp4+hp5+hp6>=0)) {
			if (turno%2==1) {

				////////6.1. elegir ataque a usar////////

				System.out.println("-----------------------------------------------------------------------");
				System.out.println("JUGADOR 1:");
				System.out.println("¿que pokemon enviarás a morir?:");
				for (int i = 0; i < size1; i++) {
					System.out.println(i+1+" - "+equipo1.get(i).name());
				}
				System.out.println("-----------------------------------------------------------------------");

				try {
					select = Integer.parseInt(scanner.nextLine()); 
					System.out.println("elegiste a "+equipo1.get(select-1).name()+" gran elección!");
					p=select;
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("¿que ataque jugarás?:");
					System.out.println("1 - "+equipo1.get(select-1).attackbehavior1.getname());
					System.out.println("2 - "+equipo1.get(select-1).attackbehavior2.getname());
					System.out.println("3 - "+equipo1.get(select-1).attackbehavior3.getname());
					System.out.println("4 - "+equipo1.get(select-1).attackbehavior4.getname());
					System.out.println("-----------------------------------------------------------------------");
					select = Integer.parseInt(scanner.nextLine()); 
					switch(select){
					case 1: 
						daño=equipo1.get(p-1).attackbehavior1.attack();
						name=equipo1.get(p-1).attackbehavior1.getname();
						System.out.println("el daño de ese ataque es de: "+daño);
						break;
					case 2: 
						daño=equipo1.get(p-1).attackbehavior2.attack();
						name=equipo1.get(p-1).attackbehavior2.getname();
						System.out.println("el daño de ese ataque es de: "+daño);
						break;
					case 3: 
						daño=equipo1.get(p-1).attackbehavior3.attack();
						name=equipo1.get(p-1).attackbehavior3.getname();
						System.out.println("el daño de ese ataque es de: "+daño);
						break;
					case 4: 
						daño=equipo1.get(p-1).attackbehavior4.attack();
						name=equipo1.get(p-1).attackbehavior4.getname();
						System.out.println("el daño de ese ataque es de: "+daño);
						break;
					default:
						System.out.println("número no reconocido");
						wtf=-1;
						break;
					}

				}
				catch(IndexOutOfBoundsException err) {
					System.out.println("que raro, no pudimos encontrar ese pokemon en tu equipo");
					wtf=-1;
				}
				catch(NumberFormatException err) {
					System.out.println("por favor, elige un numero, no otra cosa");
				}

				////////6.2. elegir quien recibe///////

				while (wtf!=-1) {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("¿a que pokemon enemigo quieres dirigir ese ataque?:");
					for (int i = 0; i < size2; i++) {
						System.out.println(i+1+" - "+equipo2.get(i).name());
					}
					System.out.println("-----------------------------------------------------------------------");
					try {
						select = Integer.parseInt(scanner.nextLine()); 
						System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
						System.out.println(equipo1.get(p-1).image());
						System.out.println(" ");
						System.out.println("tu "+equipo1.get(p-1).name()+" usó "+name+" y ocasióno "+daño+" puntos de daño");
						System.out.println(" ");
						System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
						equipo2.get(select-1).hp(daño);
						System.out.println(" ");
						System.out.println("vida del "+equipo2.get(select-1).name()+" enemigo bajó a: ---> "+equipo2.get(select-1).hp(0));
						System.out.println(" ");

						switch(select){
						case 1: 
							if (hp4-daño <= 0){
								hp4=0;
							}
							else {
								hp4=hp4-daño;
							}
							break;
						case 2: 
							if (hp5-daño <= 0){
								hp5=0;
							}
							else {
								hp5=hp5-daño;
							}
							break;
						case 3: 
							if (hp6-daño <= 0){
								hp6=0;
							}
							else {
								hp6=hp6-daño;
							}
							break;
						}
						break;
					}
					catch(IndexOutOfBoundsException err) {
						System.out.println("que raro, no pudimos encontrar ese pokemon en el equipo contrario");
					}
					catch(NumberFormatException err) {
						System.out.println("por favor, elige un numero, no otra cosa");
					}
				}
				notifyt1();
				notifyt2();
				if (hp1+hp2+hp3<=0){
					System.out.println("EL EQUIPO 2 GANA ESTA BATALLAAA!!!!");
					System.exit(0);

				}
				else if (hp4+hp5+hp6<=0){
					System.out.println("EL EQUIPO 1 GANA ESTA BATALLAAA!!!!");
					System.exit(0);
				}
				else {
					turno+=1;
				}
			}
			if (turno%2==0) {
				if (mode==1) {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("JUGADOR 2:");
					System.out.println("¿que pokemon enviarás a morir?:");
					for (int i = 0; i < size2; i++) {
						System.out.println(i+1+" - "+equipo2.get(i).name());
					}
					System.out.println("-----------------------------------------------------------------------");
					try {
						select = Integer.parseInt(scanner.nextLine()); 
						System.out.println("elegiste a "+equipo2.get(select-1).name()+" gran elección!");
						p=select;
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("¿que ataque jugarás?:");
						System.out.println("1 - "+equipo2.get(select-1).attackbehavior1.getname());
						System.out.println("2 - "+equipo2.get(select-1).attackbehavior2.getname());
						System.out.println("3 - "+equipo2.get(select-1).attackbehavior3.getname());
						System.out.println("4 - "+equipo2.get(select-1).attackbehavior4.getname());
						System.out.println("-----------------------------------------------------------------------");
						select = Integer.parseInt(scanner.nextLine()); 
						switch(select){
						case 1: 
							daño=equipo2.get(p-1).attackbehavior1.attack();
							name=equipo2.get(p-1).attackbehavior1.getname();
							System.out.println("el daño de ese ataque es de: "+daño);
							break;
						case 2: 
							daño=equipo2.get(p-1).attackbehavior2.attack();
							name=equipo2.get(p-1).attackbehavior2.getname();
							System.out.println("el daño de ese ataque es de: "+daño);
							break;
						case 3: 
							daño=equipo2.get(p-1).attackbehavior3.attack();
							name=equipo2.get(p-1).attackbehavior3.getname();
							System.out.println("el daño de ese ataque es de: "+daño);
							break;
						case 4: 
							daño=equipo2.get(p-1).attackbehavior4.attack();
							name=equipo2.get(p-1).attackbehavior4.getname();
							System.out.println("el daño de ese ataque es de: "+daño);
							break;
						default:
							System.out.println("número no reconocido");
							wtf=-1;
							break;
						}

					}
					catch(IndexOutOfBoundsException err) {
						System.out.println("que raro, no pudimos encontrar ese pokemon en tu equipo");
						wtf=-1;
					}
					catch(NumberFormatException err) {
						System.out.println("por favor, elige un numero, no otra cosa");
					}

					////////6.2. elegir quien recibe///////

					while (wtf!=-1) {
						System.out.println("-----------------------------------------------------------------------");

						System.out.println("¿a que pokemon enemigo quieres dirigir ese ataque?:");
						for (int i = 0; i < size1; i++) {
							System.out.println(i+1+" - "+equipo1.get(i).name());
						}
						System.out.println("-----------------------------------------------------------------------");
						try {
							select = Integer.parseInt(scanner.nextLine()); 
							System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
							System.out.println(equipo2.get(p-1).image());
							System.out.println(" ");
							System.out.println("tu "+equipo2.get(p-1).name()+" usó "+name+" y ocasióno "+daño+" puntos de daño");
							System.out.println(" ");
							System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
							equipo2.get(select-1).hp(daño);
							System.out.println(" ");
							System.out.println("vida del "+equipo1.get(select-1).name()+" enemigo bajó a: ---> "+equipo1.get(select-1).hp(0));
							System.out.println(" ");

							switch(select){
							case 1: 
								if (hp1-daño<= 0){
									hp1=0;
								}
								else {
									hp1=hp1-daño;
								}
								break;
							case 2: 
								if (hp2-daño <= 0){
									hp2=0;
								}
								else {
									hp2=hp2-daño;
								}
								break;
							case 3: 
								if (hp3-daño <= 0){
									hp3=0;
								}
								else {
									hp3=hp3-daño;
								}
								break;
							}
							break;
						}
						catch(IndexOutOfBoundsException err) {
							System.out.println("que raro, no pudimos encontrar ese pokemon en el equipo contrario");
						}
						catch(NumberFormatException err) {
							System.out.println("por favor, elige un numero, no otra cosa");
						}
					}
					notifyt1();
					notifyt2();
				}
				if (mode==2){
					System.out.println("LA MAQUINA:");
					int r=(int)Math.floor(Math.random()*2);
					daño=equipo2.get(r).attackbehavior3.attack();
					name=equipo2.get(r).attackbehavior3.getname();
					int r2=(int)Math.floor(Math.random()*2);
					System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
					System.out.println(equipo2.get(r).image());
					System.out.println(" ");
					System.out.println("el "+equipo2.get(r).name()+" de la maquina usó "+name+" y ocasióno "+daño+" puntos de daño");
					System.out.println(" ");
					System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////");
					equipo1.get(r).hp(daño);
					System.out.println(" ");
					System.out.println("la vida de tu "+equipo1.get(r2).name()+" bajó a: ---> "+equipo1.get(r2).hp(0));
					System.out.println(" ");
					switch(r2+1){
					case 1: 
						if (hp1-daño <= 0){
							hp1=0;
						}
						else {
							hp1=hp1-daño;
						}
						break;
					case 2: 
						if (hp2-daño <= 0){
							hp2=0;
						}
						else {
							hp2=hp2-daño;
						}
						break;
					case 3: 
						if (hp3 -daño<= 0){
							hp3=0;
						}
						else {
							hp3=hp3-daño;
						}
						break;
					}
					notifyt1();
					notifyt2();
				}
				if (hp1+hp2+hp3<=0){
					System.out.println("EL EQUIPO 2 GANA ESTA BATALLAAA!!!!");
					System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⣀⠀⢀⣶⣿⡛⠛⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠛⢛⣿⣶⡄⠀⣀⠀⠀\r\n"
							+ "⠀⠀⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⣿⠀⠀\r\n"
							+ "⠀⠀⣿⡏⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⢹⣿⠀⠀\r\n"
							+ "⠀⠀⢻⣧⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⣼⡏⠀⠀\r\n"
							+ "⠀⠀⠘⣿⡄⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⢰⣿⠃⠀⠀\r\n"
							+ "⠀⠀⠀⠹⣷⡀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⢠⣿⡏⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⢻⣿⣄⢀⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⣠⣿⡟⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠙⣿⣾⡿⠋⠻⣿⣿⣿⣿⣿⣿⣿⣿⠟⠙⢿⣿⣿⠏⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠈⠻⠟⠀⠀⠀⢹⣿⣿⣿⣿⡏⠀⠀⠀⠻⠟⠁⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⡟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠛⠛⠛⠛⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀");
					System.exit(0);

				}
				else if (hp4+hp5+hp6<=0){
					System.out.println("EL EQUIPO 1 GANA ESTA BATALLAAA!!!!");
					System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⣀⠀⢀⣶⣿⡛⠛⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠛⢛⣿⣶⡄⠀⣀⠀⠀\r\n"
							+ "⠀⠀⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⣿⠀⠀\r\n"
							+ "⠀⠀⣿⡏⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⢹⣿⠀⠀\r\n"
							+ "⠀⠀⢻⣧⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⣼⡏⠀⠀\r\n"
							+ "⠀⠀⠘⣿⡄⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⢰⣿⠃⠀⠀\r\n"
							+ "⠀⠀⠀⠹⣷⡀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⢠⣿⡏⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⢻⣿⣄⢀⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⣠⣿⡟⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠙⣿⣾⡿⠋⠻⣿⣿⣿⣿⣿⣿⣿⣿⠟⠙⢿⣿⣿⠏⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠈⠻⠟⠀⠀⠀⢹⣿⣿⣿⣿⡏⠀⠀⠀⠻⠟⠁⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⡟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠛⠛⠛⠛⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀");
					if (mode==2) {
						System.out.println("RABIA CONTRA TODAS LAS MAQUINAS!!");
					}
					System.exit(0);
				}
				else {
					turno+=1;
				}
			}
		}

	}

	public static void inicializarhp() {
		hp1=equipo1.get(0).hp(0);
		hp2=equipo1.get(1).hp(0);
		hp3=equipo1.get(2).hp(0);
		hp4=equipo2.get(0).hp(0);
		hp5=equipo2.get(1).hp(0);
		hp6=equipo2.get(2).hp(0);
	}


	public static void notifyt1() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("SALUD DEL EQUIPO 1:");
		System.out.println(equipo1.get(0).name()+" tiene "+hp1+" puntos de vida"); 
		System.out.println(equipo1.get(1).name()+" tiene "+hp2+" puntos de vida"); 
		System.out.println(equipo1.get(2).name()+" tiene "+hp3+" puntos de vida"); 

	}

	public static void notifyt2() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("SALUD DEL EQUIPO 2:");
		System.out.println(equipo2.get(0).name()+" tiene "+hp4+" puntos de vida"); 
		System.out.println(equipo2.get(1).name()+" tiene "+hp5+" puntos de vida"); 
		System.out.println(equipo2.get(2).name()+" tiene "+hp6+" puntos de vida"); 
		System.out.println("-----------------------------------------------------------------------");

	}



}
