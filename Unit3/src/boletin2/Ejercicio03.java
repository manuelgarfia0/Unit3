package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear random
		Random rd = new Random();
		// Declarar variables
		int[] numeros = new int[30];
		// Bucle para rellenar el array de números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(0, 10);
		}
		// Se ordena el array
		Arrays.sort(numeros);
		// Se muestra el array
		System.out.println(Arrays.toString(numeros));
	}

}
