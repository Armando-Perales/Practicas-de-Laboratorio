package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
import edu.escuela.gamepz.utils.PersException;
public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] datos={
			new Planta("David",100),
			new Zombie("Bianca"),
			new Planta("Fabian",10,Escudo.MEDIO),
			new Planta("Almendra",50),
			new Planta("Ricardo",Escudo.BAJO),
			new Planta("Silvia"),
			new Zombie("Armando",80,false),
			new Zombie("Josseline",true),
			new Zombie("Eduardo")
		};
		for (Personaje p : datos ) {
			int pos =(int) (Math.random()*20-5);
			try{
				Tablero.insertar(p,pos);
			}catch(PersException pe){
				System.err.println(pe.getMessage()+" "+pe.getPos());
			}
		}
		Tablero.mostrar();
		for (int i=0;i<Tablero.MAX_SIZE ;i++ ) {
			int pos = (int) (Math.random()*20-5);
			try{
				Tablero.borrar(pos);
			}catch(PersException pe){
				System.err.println(pe.getMessage()+" "+pe.getPos());
			}
		}
		Tablero.mostrar();
	}
}