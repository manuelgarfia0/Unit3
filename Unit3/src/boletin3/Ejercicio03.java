package boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variable
		int[][] tabla;
		int filas;
		int columnas;
		// Preguntar al usuario filas y columnas
		System.out.println("Introduce las filas y columnas que quieres que tenga tu array: ");
		filas = sc.nextInt();
		columnas = sc.nextInt();
		tabla = new int[filas][columnas];
		// Bucle para rellenar el array
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}
		// Bucle para mostrar el array
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		// Cerrar scanner
		sc.close();
	}

}
