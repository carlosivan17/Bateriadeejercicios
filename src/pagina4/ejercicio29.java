package pagina4;

import java.util.Scanner;

public class ejercicio29 {
	/*Dados 3 numeros
	 * determinar si la suma de dos de ellos
	 * es igual al 3 numero*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, resultado = 0;
		System.out.println("Ingrese el numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese el numero 2: ");
		num2 = sc.nextInt();
		System.out.println("Ingrese el numero 3: ");
		num3 = sc.nextInt();
		
		resultado = num1 + num2;
		if(resultado == num3) {
			System.out.println("La suma de los primeros numeros y el numero 3 son iguales.");
		}else {
			System.out.println("Son numeros distintos.");
		}
		
		

	}

}
