package Pagina1;

import java.util.Scanner;

public class ejercicio3 {
	/*Programa que nos lea tres numeros y
	 * nos diga cual es el mayor.*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Ingrese el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("El mayor es: " + num1);
			}else {
				System.out.println("El mayor es: " + num3);
			}
		}else if(num2 > num3) {
			System.out.println("El mayor es: " + num2);
		}else {
			System.out.println("El mayor es: " + num3);
		}

	}

}
