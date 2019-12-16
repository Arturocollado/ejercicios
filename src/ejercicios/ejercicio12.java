package ejercicios;
import javax.swing.JOptionPane;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num=JOptionPane.showInputDialog("ingrese numero");
		int numero=Integer.parseInt(num);
		System.out.println("El numero ingresado es  "+numero);
		System.out.println("El doble del numero ingresado es  "+(numero*2));
		System.out.println("El triple del numero ingresado es  "+(numero*3));
		System.out.println("El cuadruple delnumero ingresado es  "+(numero*4));
		

	}

}
