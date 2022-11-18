package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
import edu.escuela.gamepz.utils.ByVida;
import edu.escuela.gamepz.utils.BySize;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;
public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida()),
		};
		TreeSet<Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<>();
		for (Personaje tmp : datos ) {
			arbol.add(tmp);
			lista.add(tmp);
		}
		
		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		System.out.print("Escribe el nombre del archivo: ");
		Scanner s = new Scanner(System.in);
		String fname = s.nextLine();
		path += fname;

		File f = new File(path);
		if (f.exists()) {
			if (f.isFile()) {
				System.out.println("Ya existe");
				System.exit(0);
			}else {
				mostrarDirectorio(f);
				System.exit(0);
			}
		}else {
			//guardarObjetos(f,arbol);
		}

		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p : arbol) {
			System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p : lista ) {
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr,new BySize());
		for (Personaje p : arr ) {
			System.out.println(p);
		}
	}

	private static void mostrarDirectorio(File file){
		try {
			FileInputStream input = new FileInputStream(file);
			BufferedInputStream bufInput = new BufferedInputStream(input);
			try {
				FileOutputStream output = new FileOutputStream(file);
				BufferedOutputStream bufOutput= new BufferedOutputStream(output);
				try {
					byte[] line = new byte[128];
					int bytesRead;
					bytesRead = input.read(line);
					while ( bytesRead != -1 ) {
						output.write(line, 0, bytesRead);
						bytesRead = input.read(line);
					}
				} finally {
					bufOutput.close();
				}
			} finally {
				bufInput.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}/*
	private static void guardarObjetos(File f, TreeSet<Personaje> a){
		
	}*/
}
