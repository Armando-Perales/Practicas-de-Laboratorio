public class Serie{
	private int inicio;
	private int limite;

	public int fiboN(int limite){
		this.limite = limite;
		inicio=1;
		for (int i = 0; i < limite ; i++ ) {
			inicio += inicio; 
		}
		return inicio;
	}
}