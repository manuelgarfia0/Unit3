package boletin2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// Declarar variables
		int[] numeros = new int[1000];
		int num;
		int cont = 0;
		// Bucle para rellenar el array con valores aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(0, 100);
		}
		// Ordenamor el array
		Arrays.sort(numeros);
		// Pedimos al usuario que introduzca un valor
		System.out.println("Introduce un valor: ");
		num = sc.nextInt();
		// Buscamos el valor pedido
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				cont++;
			}
		}
		// Mostrar resultados
		if (cont == 0) {
			System.out.println("No se encontró el número: ");
		} else {
			System.out.println(num + " aparece " + cont + " veces.");
		}
		// Cerrar scanner
		sc.close();

	}

}
