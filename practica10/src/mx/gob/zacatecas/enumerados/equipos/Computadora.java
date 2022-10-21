package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Computadora{
	private String marca;
	private Tipo tipo;

	public Computadora(String marca, Tipo tipo){
		this.marca = marca;
		this.tipo = tipo;
	}

	public String toString(){
		return marca + '\t' + Memoria.getTipo() + '\t'+ Memoria.getVel() + '\t'+ Memoria.getPines() + '\t' + tipo.getType();
	}
}