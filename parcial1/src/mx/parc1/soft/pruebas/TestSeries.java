package mx.parc1.soft.pruebas;
import mx.parc1.soft.series.Serie;
public class TestSeries {
    private int n;
    public static void main(String[] args) {
        Serie s = new Serie();
        /*
        int m = s.genNumero(100);
        s.primos(m);
        
        int o = s.primoN(m/10);
        System.out.println(o);
        
        int n = s.genNumero(100);
        s.fibo(n);
        */
        int p = s.fiboN(3);
        System.out.println(p);
    }
    public int genNumero(int x){
        if (x < 10) {
            n = 100
            return n;
        }
        n = (int) (Math.random()*x*10);
    }
}