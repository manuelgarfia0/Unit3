package boletin1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[8];
		int num;
		// Bucle para recorrer y rellenar el array
		for (int i = 0; i < numeros.length; i++) {
			// Preguntar los números al usuario
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			// Introduce los números insertados en el array
			numeros[i] = num;
		}
		// Bucle para recorrer el array y mostrar el array señalando los números pares e
		// impares
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print("Par-> " + numeros[i] + " ");
			} else {
				System.out.print("Impar-> " + numeros[i] + " ");
			}
		}
		// Cerrar scanner
		sc.close();
	}

}
