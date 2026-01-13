package boletin4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 4, 9, 10 };
		int[] tablaIndices;
		int numero;
		// Pedir un número al usuario
		System.out.println("Introduce una número para ver en que posiciones se encuentra: ");
		numero = sc.nextInt();
		// Asigno la función a una tabla para mostrarla
		tablaIndices = buscarTodos(tabla, numero);
		// Muestro la tabla
		System.out.println(Arrays.toString(tablaIndices));
	}

	static int[] buscarTodos(int[] t, int valor) {
		// Inicializo una tabla con la longitud de la tabla por parametro
		int[] tabla = new int[t.length];
		// Inicializo un contador a 0
		int contador = 0;
		// Bucle para recorrer el array
		for (int i = 0; i < t.length; i++) {
			// Si un número de la tabla coincide con el valor ingresado
			if (t[i] == valor) {
				// Se añade a la otra tabla el índice en el que se encuentra, en las primeras
				// posiciones del array
				tabla[contador] = i;
				contador += 1;
			}
		}
		// Retorno una copia de la tabla pero con el tamaño de cuantos índices estuviera
		// el número ingresado
		return Arrays.copyOf(tabla, contador);
	}

}