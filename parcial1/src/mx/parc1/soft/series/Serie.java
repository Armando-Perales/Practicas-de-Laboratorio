package mx.parc1.soft.series;
public class Serie{
	private int inicio;
	private int limite;
	private int fibonachi;
	private int n;
	
	public int genNumero(int x){
		if (x < 10) {
			x=100;
			return x;
		} else {
			n = (int) (Math.random()*x*10);
			while (n < x){
				n = (int) (Math.random()*x*10);
			}
			return n;
		}
    }
    
	public int fiboN(int limite){
		this.limite = limite;
		inicio=1;
		fibonachi = 0;
		for (int i = 0; i < limite-1 ; i++ ) {
			inicio += fibonachi;
			fibonachi = inicio - fibonachi; 
		}
		return inicio;
	}
}