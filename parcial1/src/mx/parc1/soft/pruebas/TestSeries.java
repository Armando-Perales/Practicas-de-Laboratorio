package mx.parc1.soft.pruebas;
import mx.parc1.soft.series.Serie;
public class TestSeries {
    public static void main(String[] args) {
        Serie s = new Serie();
        
        int m = s.genNumero();
        System.out.println(m);
        /*
        s.primos(m);
        
        int o = s.primoN(m/10);
        System.out.println(o);
        
        int n = s.genNumero(100);
        s.fibo(n);
        */
        int p = s.fiboN(14);
        System.out.println(p);
    }
}