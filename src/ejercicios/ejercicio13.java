package ejercicios;

import javax.swing.JOptionPane;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monto=JOptionPane.showInputDialog("ingrese el monto en soles");
		float soles=Float.parseFloat(monto);
		String tipo=JOptionPane.showInputDialog("ingrese el tipo de cambio en euros");
		float tipo1=Float.parseFloat(tipo);
		float euros=soles*tipo1;
		System.out.println("Monto en soles "+soles);
		System.out.println("Tipo de cambio "+tipo1);
		System.out.println("Monto en euros "+euros);

	}

}
