public class Personaje{
	private String nombre;
	private int edad = 0;
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120) {
			this.edad = edad;
			return true;
		}
		return false;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO "+ nombre);
	}
}