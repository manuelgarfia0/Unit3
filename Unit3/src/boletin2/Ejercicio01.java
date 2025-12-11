package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int tamaño;
		int valor;
		int[] numeros;
		// Pedir datos al usuario
		System.out.println("Introduce el tamaño del array: ");
		tamaño = sc.nextInt();
		numeros = new int[tamaño];
		System.out.println("Introduce el valor que quieres introducir en el array: ");
		valor = sc.nextInt();
		// Rellena el array con el valor dado por el usuario
		Arrays.fill(numeros, valor);
		// Mostrar array
		System.out.println(Arrays.toString(numeros));
		// Cerrar scanner
		sc.close();
	}

}
