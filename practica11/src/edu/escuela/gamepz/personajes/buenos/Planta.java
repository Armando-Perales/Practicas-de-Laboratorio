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
	public Planta(String nombre){
		this(nombre,3,Escudo.NULO);
	}
	public Escudo getEscudo(){
		return escudo;
	}
	public String toString(){
		return super.toString() + "\t" + escudo;

	}
	public void decVida(){
		super.setVida(vida - escudo.getNivel());
	}
	public void decVida(int decrementoVida){
		super.setVida(vida - (escudo.getNivel()*decrementoVida));
	}

	public void addVida(){
		super.setVida(vida + escudo.getNivel());
	}
	public void addVida(int incrementoVida){
		super.setVida(vida + (escudo.getNivel()*incrementoVida));
	}
}