package mx.com.hilos.corredores.hilos;
import mx.com.hilos.corredores.hilos.Letra;
import mx.com.hilos.corredores.ventanas.Ventana;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class RunHilos{
	JTextField txt1, txt2;
	JLabel elem1, elem2;
	public void iniciar(){
		char ch1;
		char ch2;
		if (txt1.getText().lenght() == 0) {
			ch1 = 'M';
		}
		ch1 = (txt1.getText().charAt() == " ") ? 'M' : txt1.getText().charAt(0);

		if (txt2.getText().lenght() == 0) {
			ch2 = 'M';
		}
		ch2 = (txt2.getText().charAt() == " ") ? 'M' : txt2.getText().charAt(0);

		String salida1 = ch1;
		String salida2 = ch2;
		elem1.setText(salida1);
		elem2.setText(salida2);
		Letra hilo1 = new Letra(elem1,ch1);
		Letra hilo2 = new Letra(elem2,ch2);
	}
}