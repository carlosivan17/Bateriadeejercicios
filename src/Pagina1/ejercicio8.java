package Pagina1;

import java.util.Scanner;

public class ejercicio8 {
	/*Programa que dado un numero entero
	 * me imprima si es par o impar, en 
	 * caso de ser 0 me dice que ni es
	 * ninguno de los dos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese numero: ");
		numero = sc.nextInt();
		
		if(numero == 0) {
			System.out.println("EL NUMERO NO ES PAR Ni IMPAR. ");
		}
		else if((numero % 2 )== 0) {
			System.out.println(+ numero + " ES PAR.  ");
		}else {
			System.out.println(+ numero + " ES IMPAR.  ");
		}
		while(numero <=0) {
			System.out.println("Lo siento, no se pudo resolver, intente de nuevo.");
			System.out.println("Ingrese numero: ");
			numero = sc.nextInt();
			if(numero == 0) {
				System.out.println("EL NUMERO NO ES PAR Ni IMPAR. ");
			}
			else if((numero % 2 )== 0) {
				System.out.println(+ numero + " ES PAR.  ");
			}else {
				System.out.println(+ numero + " ES IMPAR.  ");
			}
		}
		
		System.out.println("Fin del programa");
		

	}

}
