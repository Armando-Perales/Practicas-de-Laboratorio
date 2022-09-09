package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Almendra");
		Personaje per02 = new Personaje("Ricardo");
		Personaje per03 = new Personaje("Bianca");
		Personaje per04 = new Personaje("Leonel");
		Personaje per05 = new Personaje("Hector");
		per01.setEdad(200);
		per02.setEdad(10);
		per03.setEdad(1);
		per04.setEdad(-10);
		per05.setEdad(500);

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		per06.setNombre("Francisco Xavier Zepeda Flores");
		per08.setNombre("Dayan");
		per10.setNombre("Alex Fabian Eduardo David");

		per07.setEdad((int)(Math.random()*100));
		per09.setEdad((int)(Math.random()*100));
		System.out.println("___");
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
	}
}