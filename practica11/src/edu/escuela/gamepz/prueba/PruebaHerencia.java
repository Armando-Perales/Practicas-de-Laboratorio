package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("David",100);
		Personaje per02 = new Personaje("Bianca");
		Planta plan01 = new Planta("Fabian",10,'B');
		Planta plan02 = new Planta("Almendra",50);
		Planta plan03 = new Planta("Ricardo",'C');
		Planta plan04 = new Planta("Silvia");
		Zombie zom01 = new Zombie("Armando",80,false);
		Zombie zom02 = new Zombie("Josseline",true);
		Zombie zom03 = new Zombie("Eduardo");

		Personaje[] personajes = new Personaje[9];
		personajes[0] = per01;
		personajes[1] = per02;
		personajes[2] = plan01;
		personajes[3] = plan02;
		personajes[4] = plan03;
		personajes[5] = plan04;
		personajes[6] = zom01;
		personajes[7] = zom02;
		personajes[8] = zom03;

		int cont = 0;
		for (Personaje tmp : personajes ) {
			cont += 1;
			System.out.println(tmp);
			int numAle = (int) (Math.random()*100);
			if (tmp instanceof Planta) {
				System.out.println("Soy planta " + ((Planta)tmp).getEscudo());
				((Planta)tmp).addVida(numAle);
			}
			if (tmp instanceof Zombie) {
				System.out.println("Soy zombie " + ((Zombie)tmp).getAtaque());
				((Zombie)tmp).decVida(numAle);
			}
			System.out.println(numAle);
			System.out.println(tmp);
			System.out.println("***** Objeto " + cont + " *****");
		}
	}
}