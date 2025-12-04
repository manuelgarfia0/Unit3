package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] numeros = new int[10];
		int num;
		int suma;
		int max;
		int min;
		// Pregunta número al usuario
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		numeros[0] = num;
		// Inicializo el maximo y el minimo al primer número
		max = numeros[0];
		min = numeros[0];
		suma = numeros[0];
		// Bucle para pedir los números para el array
		for (int i = 1; i < numeros.length; i++) {
			// Pregunta número al usuario
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			// Introducimos los números introducidos en el array
			numeros[i] = num;
			// Sumamos los números introducidos al array
			suma += numeros[i];
			// Sacamos el número máximo y el mínimo del array
			if (numeros[i] > max) {
				max = numeros[i];
			}
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		// Mostrar resultados
		System.out.println(Arrays.toString(numeros));
		System.out.println("Suma = " + suma);
		System.out.println("Máximo = " + max);
		System.out.println("Mínimo = " + min);

		// Cerrar scanner
		sc.close();
	}

}
