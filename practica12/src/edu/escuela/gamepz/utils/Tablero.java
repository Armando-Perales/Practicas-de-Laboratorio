package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.PersException;
public class Tablero{
	public static final int MAX_SIZE=10;
	public static Personaje[] personajes = new Personaje[MAX_SIZE];
	private Tablero(){}
	public static void mostrar(){
		int indice = 0;
		System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
		for (Personaje tmp : personajes ) {
			if (tmp == null) {
				System.out.println(indice+" - - - ");
			}else{
				System.out.println(indice+" "+tmp);
			}
			indice += 1;
		}
		System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
	}
	public static void insertar(Personaje p, int pos) throws PersException{
		if (pos < 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
		}
		personajes[pos] = p;
	}
	public static void borrar(int pos) throws PersException{
		if (pos < 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
		}
		if (personajes[pos] == null) {
			throw new PersException("Si personaje para borrar",pos);
		}
		personajes[pos] = null;
	}
}