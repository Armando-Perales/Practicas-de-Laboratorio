package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.utilerias.*;
import mx.gob.zacatecas.enumerados.equipos.*;
public class PruebaComputadora{
	public static void main(String[] args) {
		Computadora compu1 = new Computadora("DELL",Memoria.DDR,Tipo.SERVER);
		Computadora compu2 = new Computadora("GYGABYTE",Memoria.DDR2,Tipo.WORKSTATION);
		Computadora compu3 = new Smallfactor("HP",Memoria.DDR3,Tipo.DESKTOP,true);
		Computadora compu4 = new Smallfactor("DELL",Memoria.DDR4,Tipo.LAPTOP,false);

		Computadora[] computadoras = {compu1,compu2,compu3,compu4};
		for (Computadora tmp : computadoras ) {
			System.out.println(tmp);
		}
	}
}