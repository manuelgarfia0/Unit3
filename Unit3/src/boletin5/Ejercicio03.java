package boletin5;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String frase;
		int espacios;
		// Preguntar al usuario que introduzca una frase
		System.out.println("Introduce una frase para contrar los espacios en blanco que tiene: ");
		frase = sc.nextLine();
		// Llamar a la función para ver cuantos espacios en blanco tiene
		espacios = espaciosBlancos(frase);
		// Mostrar los espacios en blanco
		System.out.println("La frase tiene " + espacios + " espacios en blanco.");
		// Cierro scanner
		sc.close();
	}

	static int espaciosBlancos(String frase) {
		// Variable para almacenar los espacios en blanco
		int espacios = 0;
		// Bucle para recorrer la frase
		for (int i = 0; i < frase.length(); i++) {
			// Si en el indice indicado la frase tiene un espacio se suma uno a la variable
			// espacios
			if (frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		// Devolvemos los espacios
		return espacios;
	}

}
