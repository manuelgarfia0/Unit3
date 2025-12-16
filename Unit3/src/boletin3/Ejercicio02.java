package boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		int[][] notas = new int[4][5];
		int max = 0;
		int min = 0;
		double media = 0;
		// Bucle para rellenar el array
		for (int i = 0; i < notas.length; i++) {
			// Muestro el alumno
			System.out.print("Alumno " + (i + 1));
			System.out.println();
			for (int j = 0; j < notas[i].length; j++) {
				// El usuario introduce las notas
				notas[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		// Bucle para mostrar el array
		for (int i = 0; i < notas.length; i++) {
			// Muestro el alumno
			System.out.print("Alumno " + (i + 1) + "->\t");
			// Inicializo el máximo y el mínimo a la primera nota
			max = notas[i][0];
			min = notas[i][0];
			for (int j = 0; j < notas[i].length; j++) {
				// Sumo a media cada nota del alumno
				media += notas[i][j];
				// Si la nota es menor al mínimo se sobrescribe
				if (notas[i][j] < min) {
					min = notas[i][j];
				}
				// Si la nota es mayor al máximo se sobrescribe
				if (notas[i][j] > max) {
					max = notas[i][j];
				}
				// Muestro las notas del alumnos
				System.out.print(notas[i][j] + "\t");
			}
			// Calculo la media del alumno
			media = media / notas[i].length;
			// Muestro la media el mínimo y el máximo
			System.out.print("Media: " + media + "\t");
			System.out.print("Mínimo: " + min + "\t");
			System.out.print("Máximo: " + max);
			// Inicializo la media a 0
			media = 0;
			System.out.println();
		}
	}
}
