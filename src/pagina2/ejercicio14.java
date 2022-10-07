package pagina2;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b=0,num=5;
        double suma=0;
        
        
        System.out.println("Para salir ingresa -1");
        while(num!=-1){
          System.out.println("Ingresa un numero");
          num=sc.nextInt();
          suma=suma+num;
          b++;
      }
       System.out.println("La media aritmetica de los numeros ingresados es de: "+suma/(b-1));
       System.out.println("Fin del programa.");
		
	}

}
