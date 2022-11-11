package edu.escuela.gamepz.utils;
import java.util.Comparator;
import edu.escuela.gamepz.personajes.Personaje;
public class ByVida implements Comparator<Personaje>{
	public int compare(Personaje p1, Personaje p2){
		int valor=0;
		if (p1.getVida() > p2.getVida()) {
			valor = 1;
		}else{
			valor = -1;
		}
		if (p1.getVida() == p2.getVida()) {
			if (p1.getNombre().compareTo(p2.getNombre()) != 0) {
				valor = p1.getNombre().compareTo(p2.getNombre());
			}
			valor = (p1.getSize() > p2.getSize()) ? -1 : 1;
		}
		return valor;
	}
}