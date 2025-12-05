package boletin1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declare variable
		String[] nombreMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int[] temperaturas = new int[nombreMeses.length];
		int temperatura;
		// Bucle para recorrer el array y rellenarlo
		for (int i = 0; i < temperaturas.length; i++) {
			// Preguntar al usuario la temperatura del mes
			System.out.println("Que temperatura medía hacía en el mes " + nombreMeses[i]);
			temperatura = sc.nextInt();
			// Ingresar la temperatura en el array
			temperaturas[i] = temperatura;
		}
		// Bucle para mostrar los meses y sus temperaturas
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(nombreMeses[i] + ": ");
			// Si la temperatura es positiva imprimimos asteriscos
			if (temperaturas[i] > 0) {
				for (int j = 0; j < temperaturas[i]; j++) {
					System.out.print("*");
				}
				// Si la temperatura es negativa imprimimos guiones
			} else {
				for (int j = 0; j > temperaturas[i]; j--) {
					System.out.print("-");
				}
			}
			// Salto de línea
			System.out.println();
		}
		// Cerrar escaner
		sc.close();
	}

}
