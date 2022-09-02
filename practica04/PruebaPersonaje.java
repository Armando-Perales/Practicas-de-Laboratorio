public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje alumno = new Personaje("Kal El");
		alumno.saludar();
		System.out.println("Nombre: " + alumno.getNombre() + "Edad: " + alumno.getEdad());
		System.out.println("Modificando edad en 130");
		
	}
}