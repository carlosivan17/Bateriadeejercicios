package Pagina1;

import java.util.Scanner;

public class ejercicio5 {
	/*Programa que lea por teclado un numero
	 * en caso de ser 0 me imprime error
	 * y si es mayor que 0 me calcula
	 * su potecia y su raiz*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero; double resultado = 0;
		System.out.println("Ingrese el numero: ");
		numero = sc.nextInt();
		
		if(numero <= 0) {
			System.out.println("Error en el sistema.");
		}
		else if(numero > 0) {
			//cuadrado y raiz del numero
			System.out.println("Del numero " +numero);
			resultado = numero * numero;
			System.out.println("su potencia es: " + resultado);
			resultado = Math.sqrt(numero);
			System.out.println("su raiz es: " + resultado);
		}

	}

}
