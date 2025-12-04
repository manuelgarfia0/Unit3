package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[5];
		int num;
		// Bucle para introducir los número que se le van a preguntar al usuario
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			numeros[i] = num;
		}
		// Mostrar el array
		System.out.println(Arrays.toString(numeros));
		// Cerrar scanner
		sc.close();
	}

}
