package pagina3;

import java.util.Scanner;

public class ejercicio22 {
	/*Programa que dado un año,
	 * nos diga si es bisiesto o no.*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int año;
		System.out.println("Ingrese el año: ");
		año = sc.nextInt();
		
		if(año % 4== 0) {
			System.out.println("El año es bisiesto.");
		}
		else if(año % 100!=0) {
			System.out.println("El año no es bisiesto.");
		}
		if(año % 400 == 0) {
			System.out.println("El año es bisiesto.");
		}
	   

	}

}
