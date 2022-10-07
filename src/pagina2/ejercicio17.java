package pagina2;

import java.util.Scanner;

public class ejercicio17 {
	/*Programa que muestre la cuenta de los numeros
	 * que son multiplos de 2 o 3 que hay
	 * entre 1 y 100*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int numero, contador, multiplo;
		
		System.out.println("Ingrese cantidad de multiplo: ");
		multiplo = sc.nextInt();
		System.out.print("¿Hasta qué número quieres la lista?: ");
		 numero = sc.nextInt();
		
		for(contador = 1; contador <= numero; contador++) {
			if(contador % multiplo == 0) 
				System.out.println(contador);
		}
		

	}

}
