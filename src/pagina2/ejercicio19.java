package pagina2;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		String alumno;

		double notafinal;

		double nprac;

		double npro;

		double nteo;

		System.out.println("Introduce el nombre del alumno");

		alumno=SC.next();

		while (!alumno.equals("")) {

		System.out.println("Introduce la nota practica");

		nprac=SC.nextDouble();

		System.out.println("Introduce la nota de problemas");

		npro=SC.nextDouble();

		System.out.println("Introduce la nota de teoria");

		nteo=SC.nextDouble();

		if ((nprac<=10 && nprac>=0) && (npro<=10 && npro>=0) && (nteo<=10 && nteo>=0)) {

		System.out.println("El alumno "+alumno);

		System.out.println("La nota practica es "+nprac);

		System.out.println("La nota de problemas es "+npro);

		System.out.println("La nota de teoria es "+nteo);

		nprac=nprac*0.1;

		npro=npro*0.5;

		nteo=nteo*0.4;

		notafinal=nprac+npro+nteo;

		System.out.println("La nota final es "+notafinal);

		} else {

		System.out.println("Has escrito una nota incorrecta, vuelve a intentarlo");

		}

		System.out.println("Introduce el nombre de otro alumno");

		alumno=SC.next();

		}
         System.out.println("Fin del programa.");

	}

}
