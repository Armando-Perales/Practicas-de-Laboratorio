package mx.desasof.inmobiliaria.casas;
public class Campo extends Casa{
	private float[] pisina = new float[2];//2 elementos
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo,hab,costo);
		pisina[0]=ancho;
		pisina[1]=largo;
	}
}