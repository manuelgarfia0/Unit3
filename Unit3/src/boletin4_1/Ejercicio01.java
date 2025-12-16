package boletin4_1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[10];
		// Rellenar array
		for (int i = 0; i < numeros.length; i++) {
			// Pide un número para introducir en el array al usuario
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		// Muestra el resultado
		System.out.println("La suma de todos los valores de la tabla es " + sumaTabla(numeros));
		// Cerrar scanner
		sc.close();
	}

	// Función para sumar todos los valores del array
	static int sumaTabla(int[] numeros) {
		// Inicializa la variable a 0
		int suma = 0;
		// Recorre el array
		for (int i = 0; i < numeros.length; i++) {
			// Suma a la variable suma cada número por cada índice que recorre
			suma += numeros[i];
		}
		// Devuelve al variable suma
		return suma;
	}

}
