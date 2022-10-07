package pagina2;

import java.util.Scanner;

public class ejercicio18 {
	/*Programa que me denoten la fecha, dia y mes
	 * si no es valida que imprima error*/

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int dia, mes, año;
		System.out.println("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.println("Ingrese año: ");
		año = sc.nextInt();
		
		if(dia <= 31) {
		}else {
			System.out.println("No es valido");
		}
		if(mes <= 12) {
		}else {
			System.out.println("ERROR");
		}
		if(año > 0) {
			System.out.println();
		  }
		switch(mes) {
		case 1:
			System.out.println(+ dia +" de Enero del " + año);
			break;
		case 2:
			System.out.println( + dia + " de Febrero del " + año);
			break;
		case 3:
			System.out.println( + dia +" de Marzo del " + año);
			break;
		case 4:
			System.out.println( + dia +" de Abril del " + año);
			break;
		case 5:
			System.out.println( + dia +" de Mayo del " + año);
			break;
		case 6:
			System.out.println( + dia +" de Junio del " + año);
			break;
		case 7:
			System.out.println( + dia +" de Julio del " + año);
			break;
		case 8:
			System.out.println( + dia +" de Agosto del " + año);
			break;
		case 9:
			System.out.println( + dia +" de Septiembre del " + año);
			break;
		case 10:
			System.out.println( + dia +" de Octubre del " + año);
			break;
		case 11:
			System.out.println( + dia +" de Noviembre del " + año);
			break;
		case 12:
			System.out.println( + dia +" de Diciembre del " + año);
			break;
		}
		System.out.println("Fin del programa.");

     }
}
