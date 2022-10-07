public class Planta extends Personaje{
	private char escudo;
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}
	public char getEscudo(){
		return escudo;
	}
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;

	}
	public void decVida(){
		if (getEscudo() == 'A') {
			vida -= 2;
			return vida
		}
	}
}