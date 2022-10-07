package pagina3;

import java.util.Scanner;

public class ejercicio20 {
	/*Programa que lea numero entero lado
	 * y a partir de el cree un cuadrado de 
	 * asteriscos con ese tamaño.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		System.out.println("Ingrese numero: ");
		lado = sc.nextInt();
		
		for(int fila = 1; fila <= lado; fila++) {
			for(int columna = 1; columna <= lado; columna++)
				System.out.println("*");
			
			System.out.println();
		}
		

	}

}
