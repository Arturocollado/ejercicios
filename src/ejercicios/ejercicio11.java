package ejercicios;
import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salario=JOptionPane.showInputDialog("ingrese salario");
		int sueldo=Integer.parseInt(salario);
		float incremento=sueldo*0.25f;
		float neto=sueldo+incremento;
		
		float seguro=neto*0.05f;
		System.out.println("Aumento: "+incremento);
		System.out.println("sueldo Neto: "+neto);
		System.out.println("seguro: "+seguro);

	}

}
