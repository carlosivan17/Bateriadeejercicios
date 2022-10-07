package pagina4;

import java.util.Scanner;

public class ejercicio25 {
	/*Crear un programa que convierta de °C a °F o viceversa una 
temperatura ingresada por el usuario. De antemano, se le debe 
preguntar al usuario de qué sistema a qué sistema desea convertir.
*/

	public static void main(String[] args) {
		float celsius;
		byte n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al programa de transformacion.");
        System.out.println("Que sistema desea convertir?");
        System.out.println("1.De celsius a fahrenheit ");
        System.out.println("2.De fahrenheit a celsius");
        n=sc.nextByte();
        
        if(n==1) {
        System.out.println("Ingresa los grados celsius: ");
        celsius = sc.nextFloat();
        // Calcular
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(+celsius+" grados celsius son " +fahrenheit+ " grados fahrenheit");
        }else {
        	
        	System.out.println("Ingresa los grados Fahrenheit: ");
            float fahrenheit = sc.nextFloat();
            // Calcular
            float celsius1 = fahrenheitACelsius(fahrenheit);
            System.out.println(+fahrenheit+" grados Fahrenheit son " +celsius1+ " grados celsius");
        	
        	
        }
        
        System.out.println("Fin del programa.");
    }

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;

        
        
	}

}


