package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
public class Planta extends Personaje{
	private char escudo;
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
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
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;

	}
	public void decVida(){
		if (getEscudo() == 'A') {
			super.decVida();
		} else {
			super.decVida(2);
		}
	}
	public void decVida(int decrementoVida){
		if (getEscudo() == 'A') {
			super.decVida(decrementoVida);
		} else {
			super.decVida((decrementoVida)*2);
		}
	}

	public void addVida(){
		if (getEscudo() == 'A') {
			super.addVida();
		} else {
			super.addVida(2);
		}
	}
	public void addVida(int incrementoVida){
		if (getEscudo() == 'A') {
			super.addVida(incrementoVida);
		} else {
			super.addVida((incrementoVida)*2);
		}
	}
}