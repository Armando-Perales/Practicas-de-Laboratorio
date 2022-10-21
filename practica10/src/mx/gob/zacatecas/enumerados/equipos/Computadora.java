package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Computadora{
	private String marca;
	private Tipo tipo;
	private Memoria memo;

	public Computadora(String marca, Memoria memo, Tipo tipo){
		this.marca = marca;
		this.memo = memo;
		this.tipo = tipo;
	}

	public String toString(){
		return marca + '\t' + memo.getTipo() + '\t'+ memo.getVel() + '\t'+ memo.getPines() + '\t' + tipo.getType();
	}
}