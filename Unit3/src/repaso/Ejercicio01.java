package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String frase;
		// Pedir al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		// Mostramos le array de palabras
		System.out.println(Arrays.toString(obtenerPalabras(frase)));
		// Mostrar cuantas palabras tiene el array
		System.out.println("La frase tiene " + numeroPalabras((obtenerPalabras(frase))) + " palabras");
		// Mostrar cuantas palabras tienen 5 o más letras
		System.out
				.println("Hay " + contarPalabrasLargas(obtenerPalabras(frase), 5) + " palabra con más de 5 caracteres");
		// Mostrar la palabra más larga encontrada
		System.out.println("La palabra más larga es " + palabraMasLarga(obtenerPalabras(frase)));

	}

	static String[] obtenerPalabras(String frase) {
		// Creamos el array palabras donde introducir las palabras de la frase
		String[] palabras;
		// Eliminamos los espacios finales e iniciales
		frase = frase.trim();
		// Convertimos la frase a minúscula
		frase = frase.toLowerCase();
		// Dividimos la frase en un array de palabras
		palabras = frase.split(" ");
		// Devolvemos le array
		return palabras;
	}

	static int contarPalabrasLargas(String[] palabras, int longitudMinima) {
		// Variable para contar cuantas palabras tienen más caracteres que
		// longitudMinima
		int mayor = 0;
		// Bucle que recorre el array
		for (int i = 0; i < palabras.length; i++) {
			// Bucle para recorrer la palabra dentro del array
			for (int j = 1; j <= palabras[i].length(); j++) {
				// Si hay más caracteres que longitudMinima se suma uno a mayor
				if (j == longitudMinima + 1) {
					mayor++;
				}
			}
		}
		// Devolvemos mayor
		return mayor;
	}

	static String palabraMasLarga(String[] palabras) {
		String palabra = "";
		int longitud = 0;
		int indice = 0;

		// Bucle que recorre el array
		for (int i = 0; i < palabras.length; i++) {
			// Bucle para recorrer la palabra dentro del array
			for (int j = 0; j < palabras[i].length(); j++) {
				// Si hay más caracteres que longitudMinima se suma uno a mayor
				if (j > longitud) {
					longitud = j;
					indice = i;
				}
			}
			palabra = palabras[indice];
		}

		return palabra;
	}

	static int numeroPalabras(String[] frase) {
		int palabras = 0;

		for (int i = 0; i < frase.length; i++) {
			palabras++;
		}

		return palabras;
	}

}
