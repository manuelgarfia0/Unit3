package boletin1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[4];
		int num;
		// Bucle para pedir los números
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			numeros[i] = num;
		}
		// Bucle para mostrar el array al revés
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}

}
