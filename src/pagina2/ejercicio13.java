package pagina2;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,contador,suma;
		
		System.out.println("Ingrese el numero: ");
		numero=sc.nextInt();
		
		contador = 0;
		suma=0;
		int limite = numero;
		while(contador < limite){
			if(numero % 2==0) {
				suma = numero + suma;
				contador= contador + 1;
				
			}
			numero= numero+1;
		}
		System.out.println("La suma es " + suma);

		System.out.println("Fin del programa.");

	}

}
