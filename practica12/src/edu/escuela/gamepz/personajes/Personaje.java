package edu.escuela.gamepz.personajes;
public abstract class Personaje{
	private String nombre;
	protected int vida;
	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		if (setVida(vida)) {
			this.vida = vida;
		}
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25) {
			this.nombre = nombre;
		}
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public boolean setVida(int vida){
		boolean resultadoVida = false;
		if (vida >= 0 && vida <= 99) {
			resultadoVida =  true;
			this.vida = vida;
		}
		return resultadoVida;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO "+ nombre);
	}
	public String toString(){
		String detalle = nombre + "\t"+ vida;
		return detalle;
	}
	public abstract void decVida();
	public abstract void decVida(int decrementoVida);
	public abstract void addVida();
	public abstract void addVida(int incrementoVida);
}