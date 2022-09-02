package com.patito.poo1pract.personajes;
public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		boolean resultadoEdad = false;
		if (edad > 0 && edad < 120) {
			resultadoEdad =  true;
			this.edad = edad;
		}
		return resultadoEdad;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO "+ nombre);
	}
}