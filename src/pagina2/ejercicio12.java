package pagina2;

import java.util.Scanner;

public class ejercicio12 {
	/*Programa que calcule la suma de N numeros
	 * naturales leidos por teclado.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, N1, resultado = 0;
		System.out.println("Ingrese la cantidad de numeros: ");
		N = sc.nextInt();
		
		System.out.println("Ingrese numeros: ");
		for(int i = 0; i < N; i++) {
			N1 = sc.nextInt();
			resultado = N1 + resultado;
		}
		System.out.println("La suma es de: " + resultado);

	}

}
