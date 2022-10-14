package mx.desasof.inmobiliaria.casas;
public class Campo extends Casa{
	private float[] pisina = new float[2];
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo,hab,costo);
		pisina[0]=ancho;
		pisina[1]=largo;
	}
	public Campo(String tipo, float ancho, float largo){
		this(tipo,2,2000000f,ancho,largo);
	}
	public int hashCode(){
		return ((int)((super.hashCode()*((int)pisina[0])*((int)pisina[1]))/5));
	}
	public boolean equals(Object o){
		return super.equals(o) && o instanceof Campo;
	}
	public String toString(){
		return super.toString() + " " + pisina[0] + " " + pisina[1];
	}
}