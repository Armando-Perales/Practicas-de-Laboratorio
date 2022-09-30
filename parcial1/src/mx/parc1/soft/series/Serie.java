package mx.parc1.soft.series;
public class Serie{
	private int inicio;
	private int limite;
	private int fibonachi;

	public int fiboN(int limite){
		this.limite = limite;
		inicio=1;
		fibonachi = 0;
		for (int i = 0; i < limite ; i++ ) {
			inicio += fibonachi;
			fibonachi = inicio - fibonachi; 
		}
		return inicio;
	}
}