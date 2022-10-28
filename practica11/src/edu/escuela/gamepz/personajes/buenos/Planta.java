package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;
public class Planta extends Personaje{
	private Escudo escudo;
	public Planta(String nombre, int vida, Escudo escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, Escudo escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}
	public char getEscudo(){
		return escudo;
	}
	public String toString(){
		return super.toString() + "\t" + escudo;

	}
	public void decVida(){
		if (escudo == 'A') {
			super.decVida(2);
		} else {
			super.decVida();
		}
	}
	public void decVida(int decrementoVida){
		if (escudo == 'A') {
			super.decVida((decrementoVida)*2);
		} else {
			super.decVida(decrementoVida);
		}
	}

	public void addVida(){
		if (escudo == 'A') {
			super.addVida(2);
		} else {
			super.addVida();
		}
	}
	public void addVida(int incrementoVida){
		if (escudo == 'A') {
			super.addVida((incrementoVida)*2);
		} else {
			super.addVida(incrementoVida);
		}
	}
}