package com.patito.poo1pract.prueba;
import com.patito.poo1pract.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {
		/*
		Personaje alumno = new Personaje("Kal El");
		alumno.saludar();
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
		System.out.println("Modificando el nombre " + alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.saludar();
		if (!alumno.setEdad(30)) {
			System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if (!alumno.setEdad(130)) {
			System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
		*/
		Personaje per01 = new Personaje("Almendra",200);
		Personaje per02 = new Personaje("Ricardo",10);
		Personaje per03 = new Personaje("Bianca",1);
		Personaje per04 = new Personaje("Leonel",-10);
		Personaje per05 = new Personaje("Hector",500);
		System.out.println(per01.getDetalle());
	}
}