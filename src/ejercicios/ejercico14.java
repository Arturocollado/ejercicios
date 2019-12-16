package ejercicios;

import javax.swing.JOptionPane;

public class ejercico14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monto=JOptionPane.showInputDialog("ingrese el monto de compra");
		float compra=Float.parseFloat(monto);
		if(compra>=2000)
		{
			System.out.println("su compra es de  "+compra+" soles");
			System.out.println("su descuento es:  "+compra*0.30+"  soles");
			System.out.println("su total  a pagar  es:  "+(compra+(compra*0.30))+"  soles");
		}
		else
		{
			System.out.println("su compra es de  "+compra+" soles");
			System.out.println("su descuento es:  "+compra*0.20+"  soles");
			System.out.println("su total  a pagar  es:  "+(compra+(compra*0.30))+"  soles");
		}
		
		

	}

}
