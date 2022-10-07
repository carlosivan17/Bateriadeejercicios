package pagina2;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int conta=0,ban=0;
		String contrasena="tuani",intento="";
		
		
		do {
		System.out.println("Escribe la contrasena: ");
		intento = sc.nextLine();
		
		if (contrasena.equals (intento)) {
			System.out.println("La contrasena es correcta!");
			System.out.println("Bienvenido ");
			ban=1;
		}else {
			System.out.println("La contrasena es incorrecta. Intentelo nuevamente");
			conta++;
			
				
				if(conta==3) {
					System.out.println("Ha acabado sus tres intentos");
					
				}
		}
	} while ((conta!=3)&& ban==0);


	System.out.println("Fin del programa.");

	}

}
