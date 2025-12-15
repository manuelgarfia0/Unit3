package boletin4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[10];
		int max;
		// Bucle para rellenar el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		// Inicializar la variable a la llamada de la función
		max = numeroMaximo(numeros);
		// Mostrar resultado
		System.out.println("El número máximo de la tabla es " + max);
		// Cerrar scanner
		sc.close();
	}

	// Función para sacar el número máximo de un array
	static int numeroMaximo(int[] numeros) {
		// Inicializar la variable al primer número del array
		int max = numeros[0];
		// Bucle para recorrer el array
		for (int i = 1; i < numeros.length; i++) {
			// Si el número que está en el índice es mayor a max, sobrescribe max por el
			// número en el índice
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		// Devuelve la variable max
		return max;
	}

}
