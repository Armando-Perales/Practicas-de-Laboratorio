package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static final int MAX_SIZE=10;
	Personaje[] personajes = new Personaje[MAX_SIZE];
	private Tablero(){}
	public void mostrar(){
		System.out.println("\nInicio * * *Contenido del arreglo en Tablero");
		for (Personaje tmp : personajes ) {
			if (tmp == null) {
				System.out.println(pos+" - - - ");
			}
			System.out.println(pos+" "+tmp);
		}
		System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
	}
	public static void insertar(Personaje p, int pos) throws PersException{
		if (pos < 0 || pos > MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
		}
		personajes[pos] = p;
	}
}