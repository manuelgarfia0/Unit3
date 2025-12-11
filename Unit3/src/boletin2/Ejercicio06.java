package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Crear random
		Random rd = new Random();
		// Declarar variables
		int[] primitiva = new int[6];
		int[] ganador = new int[6];
		int cont = 0;
		// Bucle para rellenar el array con valores aleatorios
		for (int i = 0; i < primitiva.length; i++) {
			ganador[i] = rd.nextInt(1, 50);
			primitiva[i] = rd.nextInt(1, 50);
		}
		// Ordenar array ganador
		Arrays.sort(ganador);
		// Bucle para recorrer el array primitiva
		for (int i = 0; i < primitiva.length; i++) {
			// Si en el array ganador está un valor que hay en primitiva suma al contador
			if (Arrays.binarySearch(ganador, primitiva[i]) >= 0) {
				cont++;
			}
		}
		// Mostrar arrays para comprobar
		System.out.println(Arrays.toString(primitiva));
		System.out.println(Arrays.toString(ganador));
		// Mostrar cuantos numeros coinciden
		System.out.println("Coinciden " + cont + " números");
	}

}
