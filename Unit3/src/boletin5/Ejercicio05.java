package boletin5;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String palabra = "";
		String frase = "";

		// Decirle al usuario que introduzca una palabra
		System.out.println("Introduce una palabra: ");
		palabra = sc.nextLine();

		// Bucle para añadir las palabras
		while (!palabra.equalsIgnoreCase("fin")) {
			if (!frase.isEmpty()) {
				frase += " ";
			}
			frase += palabra;
			// Decirle al usuario que introduzca una palabra
			System.out.println("Introduce una palabra: ");
			palabra = sc.nextLine();
		}
		// Mostrar frase
		System.out.println(frase);
		// Cerrar scanner
		sc.close();
	}

}
