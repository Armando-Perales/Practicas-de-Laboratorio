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
	
}