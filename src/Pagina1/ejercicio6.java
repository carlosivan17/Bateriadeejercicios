package Pagina1;

import java.util.Scanner;

public class ejercicio6 {
	/*Programa que me pide el porcentaje de
	 * niños y niñas que hay en el curso actual. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalniños, totalniñas, totalalumnos;
		int porcentajeniños  = 0, porcentajeniñas = 0;
		
		System.out.println("Inngrese la cantidad de niños: ");
		totalniños = sc.nextInt();
		System.out.println("Ingrese la cantidad de niñas: ");
		totalniñas = sc.nextInt();
		
		totalalumnos = totalniños + totalniñas;
		System.out.println("Total de alumnos es de: " + totalalumnos);
		
		porcentajeniños = (totalniños * 100)/ totalalumnos;
		System.out.println("porcentajeniños = " + porcentajeniños + " % ");
		
		porcentajeniñas = (totalniñas * 100)/ totalalumnos;
		System.out.println("porcentajeniñas = " + porcentajeniñas + " % ");

	}

}
