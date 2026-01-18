package boletin5;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String frase;
		// Indicar al usuario que introduzca una frase
		System.out.println("Introduce una frase (sin tildes): ");
		frase = sc.nextLine();
		// Llamada a la función para comprobar si es palindroma
		System.out.println(palindroma(frase) ? "La frase es palíndroma" : "La frase no es palíndroma");
		// Cerrar scanner
		sc.close();
	}

	static boolean palindroma(String frase) {
		// Inicializo palindroma a false
		boolean palindroma = false;
		String[] fraseSinEspacios;
		// Declaro una variables fraseInvertida
		String fraseInvertida = "";
		// Le quito los espacios a frase
		fraseSinEspacios = frase.split(" ");
		frase = String.join("", fraseSinEspacios);
		// Bucle para recorrer la frase al reves
		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida += frase.charAt(i);
		}
		// Di las frases coinciden palindroma es true
		if (frase.equalsIgnoreCase(fraseInvertida)) {
			palindroma = true;
		}
		// Devolvemos el booleano indicando si es palindroma o no
		return palindroma;
	}

}
