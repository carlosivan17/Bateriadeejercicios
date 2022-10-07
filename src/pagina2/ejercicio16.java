package pagina2;

import java.util.Scanner;

public class ejercicio16 {
	/*Programa que me lea numeros enteros
	 * hasta que teclear 0 y nos muestre
	 * el maximo, el minimo y la media de ellos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, contador = 0, suma = 0;
		int maximo, minimo, media;
		System.out.println("Ingrese el numero: ");
		numero = sc.nextInt();
		maximo = numero;
		minimo = numero;
		media = numero;
		
		while((numero!=0)) {
			if((numero > maximo)) {
				maximo = numero;
			}
			if((numero < minimo)) {
				minimo = numero;
			}
			suma = suma + numero;
			contador = contador + 1;
			numero = sc.nextInt();
		}
		media = suma/(contador);
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
		System.out.println("La media es: " + media);

	}

}
