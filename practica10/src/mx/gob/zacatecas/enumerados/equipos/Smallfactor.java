package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Smallfactor extends Computadora{
	private boolean nvram;
	public Smallfactor(String marca, Memoria memo, Tipo tipo, boolean nvram){
		super(marca,memo,tipo);
		this.nvram = nvram;
	}
	public boolean getNvram(){
		return nvram;
	}
	public String toString(){
		return super.toString() + '\t' + nvram;
	}
}