package pagina3;

import java.util.Scanner;

public class ejercicio23 {
	/*Programa basado en un restaurante 
	 * que me pida la cantidad de comida consumida
	 * y calcule la cuenta total.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double bocadillodejamon = 1.5;
		double refresco = 1.05;
		double cerveza = 0.75;
		double resultado1 = 0, resultado2 = 0, resultado3 = 0, resultadofinal = 0;
		int cantconsumida;
		
		System.out.println("*MENU*");
		System.out.println("Bocadillo de jamon: " + bocadillodejamon);
		System.out.println("Refresco: "  + refresco);
		System.out.println("Cerveza: "  + cerveza);
		System.out.println("Cantidad de bocadillos de jamon consumida: ");
		cantconsumida = sc.nextInt();
		resultado1 = cantconsumida*bocadillodejamon;
		System.out.println("total de bocadillo: " + resultado1 );
		System.out.println("Cantidad de refresco consumida: ");
		cantconsumida = sc.nextInt();
		resultado2 = cantconsumida*refresco;
		System.out.println("total de resfresco: " + resultado2);
		System.out.println("Cantidad de cerveza consumida: ");
		cantconsumida = sc.nextInt();
		resultado3 = cantconsumida*cerveza;
		System.out.println("total de cerveza: " + resultado3);
		
		resultadofinal = resultado1 + resultado2 + resultado3;
		System.out.println("Su cuenta es de: " + resultadofinal);
		

	}

}
