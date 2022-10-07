package pagina4;

import java.util.Scanner;

public class ejercicio26 {
	/*Programa que calcule el producto
	 * de N numeros ingresados por el usuario*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int num1 =1,num2=1,producto=0;
		
		while(num1 != 0) {
			System.out.println("Si desea terminar ponga un cero.");
			System.out.print("Ingrese un numero:");
			num1 = sc.nextInt();
			
			if(num1 != 0) {
				num2 = num2*num1;
				producto = num2;
			}
			
		}
		System.out.println("El producto de los numeros es: " + producto);
		

	}

}
