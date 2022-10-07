package Pagina1;

import java.util.Scanner;

public class ejercicio1 {
	/*Programa que intercambie los valores
	 * de ambas variables y  muestre cuanto
	 * vale cada una.*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int A, B;
		System.out.println("Ingrese el valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Ingrese el valor de B: ");
		B = sc.nextInt();
		
		System.out.println("El valor de a es de: " + B);
		System.out.println("El valor de b es de: " + A);
		
		System.out.println("Fin del programa.");
		

	}

}
