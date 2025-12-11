package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int num;
		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];
		// Bucle para pedir al usuario los valores e introducirlos en el array 1
		for (int i = 0; i < numeros1.length; i++) {
			System.out.println("Introduce un número en el array: ");
			num = sc.nextInt();
			numeros1[i] = num;
		}
		// Bucle para pedir al usuario los valores e introducirlos en el array 1
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Introduce un número en el array: ");
			num = sc.nextInt();
			numeros2[i] = num;
		}
		// Comparar arrays
		System.out.println("¿Son iguales?");
		System.out.println(Arrays.equals(numeros1, numeros2));
		// Cerrar scanner
		sc.close();
	}

}
