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
	public String getDetalle(){
		return super.getDetalle() + "\t" + ataque;
	}
	public void decVida(){
		if (getAtaque() == false) {
			super.vida -= 3;
		} else {
			super.vida -= 2;
		}
	}
	public void decVida(int decrementoVida){
		if (getAtaque() == false) {
			super.decVida((decrementoVida)*3);
		} else {
			super.decVida((decrementoVida)*2);
		}
	}

	public void addVida(){
		if (getAtaque() == true) {
			super.vida += 3;
		}
	}
	public void addVida(int decrementoVida){
		if (getAtaque() == true) {
			super.addVida((decrementoVida)*3);
		}
	}
}