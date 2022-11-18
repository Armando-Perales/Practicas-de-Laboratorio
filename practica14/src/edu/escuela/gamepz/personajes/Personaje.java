package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;
public abstract class Personaje implements Comparable<Personaje>{
	private String nombre;
	protected int vida;
	private float size;
	public Personaje(String nombre, int vida, float size){
		this.nombre = nombre;
		if (setVida(vida)) {
			this.vida = vida;
		}
		if (size == 0.0f) {
			this.size = genSize();
		}else{
			this.size = Math.round(size)/100;
		}
	}
	public Personaje(String nombre){
		this(nombre,3,0.0f);
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
	public float getSize(){
		return size;
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
		String detalle = nombre + "\t"+ vida + "\t" + size;
		return detalle;
	}
	public abstract void decVida();
	public abstract void decVida(int decrementoVida);
	public abstract void addVida();
	public abstract void addVida(int incrementoVida);
	public float genSize(){
		float size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}
	public int compareTo(Personaje p){
		if (this.nombre.compareTo(p.nombre) != 0) {
			return this.nombre.compareTo(p.nombre);
		}
		if (this.vida != p.vida) {
			return p.vida - this.vida;
		}
		if (this.size == p.size) {
			return 0;
		}
		return (this.size > p.size) ? 1 : -1;
	}
}