package boletin4_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos el scanner y el random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// Declaramos las variables
		int clave;
		int[] numeros = new int[10];
		// Bucle para rellena el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(0, 11);
		}
		// Preguntamos al usuario el numero que quiere buscar
		System.out.println("¿Qué número quieres buscar?");
		clave = sc.nextInt();
		// Mostramos el array
		System.out.println(Arrays.toString(numeros));
		// Llamamos a la función
		System.out.println(buscar(numeros, clave));
	}

	static int buscar(int[] tabla, int clave) {
		// Declaramos la variable para saber si hemos encontrado el número
		int encontrado = -1;
		// Bucle para buscar el numero clave
		for (int i = 0; i < tabla.length && encontrado == -1; i++) {
			if (tabla[i] == clave) {
				encontrado = i;
			}
		}
		// Devolvemos el indice del numero o -1 si no lo encontramos
		return encontrado;
	}

}
