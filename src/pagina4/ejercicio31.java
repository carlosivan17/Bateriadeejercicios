package pagina4;

import java.util.Scanner;

public class ejercicio31 {
	/*Dado un numero entero
	 * encuentre sus divisores*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos al programa de divisores. ");
		 System.out.println ("Introduzca un Numero: ");
	        int n = sc.nextInt();
	        
	        System.out.println("Sus divesores son: ");
	 
	        for (int i = 1 ; i <= n ; i++)
	            if (n % i == 0)
	                System.out.println (i);

	}

}
