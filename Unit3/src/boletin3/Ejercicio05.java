package boletin3;

import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear random
		Random rd = new Random();
		// Declarar variables
		int[][] numeros = new int[4][5];
		int sumaFila = 0;
		int[] sumaColumna = new int[5];
		int sumaTotal = 0;
		// Bucle para rellenar el array
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = rd.nextInt(100, 1000);
			}
		}
		// Bucle para mostrar el array
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + "\t\t\t");
				sumaTotal += numeros[i][j];
				sumaColumna[j] += numeros[i][j];
				sumaFila += numeros[i][j];
			}

			System.out.print("Suma fila: " + sumaFila);
			sumaFila = 0;
			System.out.println();
		}
		// Bucle para mostrar los totales de las columnas y el total de todo
		for (int i = 0; i < sumaColumna.length; i++) {
			System.out.print("Suma columna: " + sumaColumna[i] + "\t");
		}
		// Total de todo
		System.out.print("Total: " + sumaTotal);

	}

}
