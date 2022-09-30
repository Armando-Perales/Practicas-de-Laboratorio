public class Serie{
	private int inicio;
	private int posicion;
	private int limite;

	public int fiboN(int posicion, int limite){
		this.posicion = posicion;
		this.limite = limite;
		inicio=1;
		for (int i = 0; i < limite ; i++ ) {
			inicio += inicio; 
		}
	}
}