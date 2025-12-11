package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[] puntuaciones = new int[8];
		int puntuacion;
		// Bucle para rellenar el array
		for (int i = 0; i < puntuaciones.length; i++) {
			System.out.println("Introduce la puntuacion: ");
			puntuacion = sc.nextInt();
			puntuaciones[i] = puntuacion;
		}
		// Ordeno el array
		Arrays.sort(puntuaciones);
		// Muestro el array inverso
		for (int i = puntuaciones.length - 1; i >= 0; i--) {
			System.out.print(puntuaciones[i] + " ");
		}
		// Cierro scanner
		sc.close();

	}

}
