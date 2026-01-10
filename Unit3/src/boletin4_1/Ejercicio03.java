package boletin4_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		// Declaramos las variables
		int longitud;
		int ultimoNumero;
		// Pedimos al usuario que introduzca la longitud del array
		System.out.println("Introduce la longitud del array de números: ");
		longitud = sc.nextInt();
		// Pedimos al usuario que introduzca el número en el que el array debe terminar
		System.out.println("¿Hasta que número quieres que llegue el array?");
		ultimoNumero = sc.nextInt();
		// Imprimimos la
		System.out.println(Arrays.toString(rellenaPares(longitud, ultimoNumero)));
	}

	static int[] rellenaPares(int longitud, int fin) {
		// Creamos el random
		Random rd = new Random();
		// Declaramos las variables
		int[] numerosPares = new int[longitud];
		int numeroRandom;
		// Bucle para rellenar el array
		for (int i = 0; i < numerosPares.length; i++) {
			// Bucle para asegurar que solo se introducen numero pares
			do {
				numeroRandom = rd.nextInt(2, fin + 1);
			} while (numeroRandom % 2 != 0);
			// ASignar el numero en el array
			numerosPares[i] = numeroRandom;
		}
		// Ordenar el array
		Arrays.sort(numerosPares);
		// Devuelve el array
		return numerosPares;
	}

}
