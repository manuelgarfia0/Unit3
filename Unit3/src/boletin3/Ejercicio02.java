package boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[][] notas = new int[4][5];
		// Bucle para rellenar el array
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Alumno " + (i + 1));
			System.out.println();
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		// Bucle para mostrar el array
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Alumno " + (i + 1) + "-> ");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
