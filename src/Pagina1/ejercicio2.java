package Pagina1;

import java.util.Scanner;

public class ejercicio2 {
	/*Programa que nos diga cual es
	 * el mayor de dos numeros
	 * o bien son iguales.*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("*BIENVENIDO AL PROGRAMA*");
		System.out.println("Escriba su primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Escriba su segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(+ num1 + " es mayor que " + num2);
		}else if(num1 < num2) {
			System.out.println(+ num2 + " es mayor que " + num1);
			}
		if(num1 == num2) {
			System.out.println("Los numeros son iguales.");
		}
		
     System.out.println("Fin del programa.");
		

	}

}
