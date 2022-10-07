package Pagina1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		double PruebaA;
		System.out.println("**Bienvenidos**");
		System.out.println("Para acceder necesitas titulo de bachider. Tienes titulo de bachider? ");
		System.out.println("1.Si tengo! ");
		System.out.println("2.No tengo! ");
		entrada = sc.nextInt();
		
		switch(entrada){
		case 1:
			System.out.println("Puedes cursar el ciclo formativo de grado superior. Bienvenido");
			break;
		case 2:
			System.out.println("Si no tiene, puede acceder si paso la prueba de admision ");
			System.out.println("Cuanto saco en la prueba de admision? ");
			PruebaA = sc.nextDouble();
			
			if(PruebaA > 60) {
				System.out.println("Puedes cursar el grado superior. Bienvenido");
			}else {
				System.out.println("Lo lamento,  no puedes cursar el grado.");
			}
		}

	}

}
