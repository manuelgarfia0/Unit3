package boletin5;

import java.util.Scanner;

public class Ejercicio02Avanzado {

	public static void main(String[] args) {
		// Crear scanner
		Scanner sc = new Scanner(System.in);
		// Declarar variables
		String contraseña;
		String adivinar;
		// Preguntar al primer jugador que introduzca la contraseña
		System.out.println("Introduce la contraseña a adivinar: ");
		contraseña = sc.nextLine();
		// Bucle para advinar la contraseña
		while (!adivinar.equals(contraseña)) {
			System.out.println("Pista: ");
			for (int i = 0; i < contraseña.length(); i++) {
				if (adivinar.charAt(i) == contraseña.charAt(i)) {
					System.out.print(contraseña.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			System.out.println("Introduce un contraseña: ");

		}
		// Si sale del bucle es porque ha adivinado la contraseña
		System.out.println("Felicidades, has adivinado la contraseña");
		// Cerrar scanner
		sc.close();
	}
}
