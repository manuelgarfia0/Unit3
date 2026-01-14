package boletin4_2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear random
		Random rd = new Random();
		// Declaro variables
		int[][] numeros = new int[6][10];
		// Bucle para introducir los números en el array
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = rd.nextInt(1, 1001);
			}
		}
		// Bucle para mostrar el array
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Mínimo y máximo");
		// Llamo a la función para mostrar el máximo y el mínimo
		System.out.println(Arrays.toString(minimoMaximo(numeros)));
	}

	static int[] minimoMaximo(int[][] t) {
		// Inicializo las variables para tener un número de referencia en el que
		// comparar
		int max = t[0][0];
		int min = t[0][0];

		// Bucle para recorrer el array
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Si el numero en el que se encuentra es mayor a max se sobreescribe max
				if (t[i][j] > max) {
					max = t[i][j];
				}
				// Si el numero en el que se encuentra es menor a min se sobreescribe min
				if (t[i][j] < min) {
					min = t[i][j];
				}
			}
		}

		// Inicializo el array a min y max
		int[] limites = { min, max };
		// Devuelvo el array
		return limites;
	}

}
