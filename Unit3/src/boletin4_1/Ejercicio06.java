package boletin4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = { 10, 1, 5, 8, 9, 2 };
		int[] resultados;
		int numero;
		// Pedir al usuario que introduzca un número de elementos
		System.out.println("¿De cuantos números quieres las sumas?");
		numero = sc.nextInt();
		resultados = suma(numeros, numero);
		System.out.println(Arrays.toString(resultados));

	}

	static int[] suma(int[] t, int numElementos) {
		int tamaño = t.length - numElementos + 1;
		int[] resultados = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			int suma = 0;
			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}
			resultados[i] = suma;
		}
		return resultados;
	}

}
