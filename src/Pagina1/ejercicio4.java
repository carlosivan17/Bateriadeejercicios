package Pagina1;

import java.util.Scanner;

public class ejercicio4 {
	/*Programa que pida tres numeros por teclado
	 * si el primero es negativo, me imprime el
	 * producto de los tres y si no me imprime
	 * la suma.*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, resultado = 0;
		System.out.println("Ingrese el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		num3 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println(+num1+ " , " +num2+ " y " +num3);
		}else {
			resultado = num1 + num2 + num3;
			System.out.println("La suma es: " + resultado);
		}
		

	}

}
