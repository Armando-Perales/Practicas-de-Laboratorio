package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
package edu.escuela.gamepz.utils.Muerto;
public class Zombie extends Personaje implements Muerto{
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
			super.setVida(vida - 3);
		} else {
			super.setVida(vida - 2);
		}
	}
	public void decVida(int decrementoVida){
		if (ataque == false) {
			super.setVida(vida - (decrementoVida*3));
		} else {
			super.setVida(vida - (decrementoVida*2));
		}
	}

	public void addVida(){
		if (ataque == true) {
			super.setVida(vida + 3);
		}
	}
	public void addVida(int decrementoVida){
		if (ataque == true) {
			super.setVida(vida +(decrementoVida*3));
		}
	}
}