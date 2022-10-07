package pagina3;

import java.util.Scanner;

public class ejercicio21 {
	/*Programa que lea numero entero altura
	 * y cree una escalera invertida con 
	 * esa altura.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int Filas;
        System.out.print("Introducir el número de filas: ");
        Filas = sc.nextInt();
 
        for(int i=1; i<=Filas; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
		

	}

}
