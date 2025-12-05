package boletin1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Create scanner y random
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[100];
		int num;
		boolean encontrado = false;
		// Bucle para rellenar el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(1, 11);
		}
		// Preguntar al usuario el número que quiere buscar
		System.out.println("Introduce un número para ver cuantas veces sale en el array: ");
		num = sc.nextInt();
		// Bucle para recorrer el array y contar las veces que sale el número
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				encontrado = true;
				System.out.println(num + " está en la posición " + i);
			}
		}
		// Si el número no está se muestra un mensaje
		if (encontrado == false) {
			System.out.println(num + " no aparece en el array");
		}
		// Salto de línea
		System.out.println();
		// Mostrar array
		System.out.println(Arrays.toString(numeros));
		// Cerrar escaner
		sc.close();
	}

}
