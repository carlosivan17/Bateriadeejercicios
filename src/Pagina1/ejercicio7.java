package Pagina1;

import java.util.Scanner;

public class ejercicio7 {
	/*Programa de una tienda me pide el
	 * monto que se debe dar al cliente
	 * por el descuento que ofrece la tienda.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double importe,  total;
		String mes;
		
		System.out.println("Ingrese el importe de la compra: ");
		importe = sc.nextDouble();
		System.out.println("Ingrese el mes: ");
		mes = sc.next();
		if((mes.equals("Febrero"))) {
			total = importe*0.15;
		}else {
			total = importe;
		}
		System.out.println("El total de la compra es de: " + total);
		

	}

}
