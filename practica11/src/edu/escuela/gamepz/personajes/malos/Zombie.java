package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje{
	private boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	public boolean getAtaque(){
		return ataque;
	}
	public String toString(){
		return super.toString() + "\t" + ataque;
	}
	public void decVida(){
		if (ataque == false) {
			super.decVida(3);
		} else {
			super.decVida(2);
		}
	}
	public void decVida(int decrementoVida){
		if (ataque == false) {
			super.decVida((decrementoVida)*3);
		} else {
			super.decVida((decrementoVida)*2);
		}
	}

	public void addVida(){
		if (ataque == true) {
			super.addVida(3);
		}
	}
	public void addVida(int decrementoVida){
		if (ataque == true) {
			super.addVida((decrementoVida)*3);
		}
	}
}